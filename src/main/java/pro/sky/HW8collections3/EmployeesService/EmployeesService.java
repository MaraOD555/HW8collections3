package pro.sky.HW8collections3.EmployeesService;

import org.springframework.stereotype.Service;
import pro.sky.HW8collections3.Employees.Employees;
import pro.sky.HW8collections3.Exceptions.EmployeeAlreadyAddedException;
import pro.sky.HW8collections3.Exceptions.EmployeeNotFoundException;
import pro.sky.HW8collections3.Exceptions.EmployeeStorageIsFullException;

import java.util.HashMap;
import java.util.Map;

@Service
public class EmployeesService {
    Map<String, Employees> employees = new HashMap<>(Map.of(
            "00001", new Employees("Иван Иванович", "Иванов", "00001"),
            "00002", new Employees("Иван Петрович", "Иванов", "00002"),
            "00003", new Employees("Иван Иванович", "Сидоров", "00003"),
            "00004", new Employees("Михаил Иванович", "Зверев", "00004"),
            "00005", new Employees("Людмила Петровна", "Клюева", "00005"),
            "00006", new Employees("Егор Александрович", "Иванов", "00006"),
            "00007", new Employees("Сергей Сергеевич", "Кузнецов", "00007"),
            "00008", new Employees("Сергей Валерьевич", "Клоков", "00008"),
            "00009", new Employees("Светлана Игоревна", "Куркова", "00009"),
            "00010", new Employees("Елена Александровна", "Михалева", "00010")
    ));
    public Employees addEmployee(Employees employee) {
        String key = employee.getId();
       if (employees.containsKey(key)){
        throw new EmployeeAlreadyAddedException();
        }
        if (employees.size() < 11){
            employees.put(employee.getId(), employee);
            return employee;
        }
        throw new EmployeeStorageIsFullException();
    }
    public Employees removeEmployee(Employees employee) {
        String key = employee.getId();
        if (!employees.containsKey(key)){
            throw new EmployeeNotFoundException();
        }
        return employees.remove(key);
    }
   // public String findEmployeeById(String id) {
     //   String key = employee.getId();
      //      if (employee.getId().equals(id)){
        //    return String.valueOf(employee);
        //    }
      //  }
     //   throw new EmployeeNotFoundException();
  // }
   public Employees findEmployee(Employees employee) {
       String key = employee.getId();
     if (!employees.containsKey(key)){
          throw new EmployeeNotFoundException();
       }
        return employee;
    }
    public String getAll() {
        return String.valueOf(employees.values());
    }

}
