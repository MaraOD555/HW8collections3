package pro.sky.HW8collections3.EmployeesController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.HW8collections3.Employees.Employees;
import pro.sky.HW8collections3.EmployeesService.EmployeesService;

@RestController
@RequestMapping("/employee")
public class EmployeesController {
    private static EmployeesService employeesService;

    public EmployeesController(EmployeesService employeesService) {
        this.employeesService = employeesService;
    }
    @GetMapping("/add")
    public Employees addEmployee(@RequestParam("firstName") String firstName,
                                 @RequestParam ("lastName") String lastName,
                                 @RequestParam ("id") String id) {
            Employees employee = new Employees(firstName, lastName, id); //создаем объект внутри метода, передаем поля (конструктор)
            return employeesService.addEmployee(employee); // вызываем метод

    }
    @GetMapping("/remove")
    public Employees removeEmployee(@RequestParam ("firstName") String firstName,
                                    @RequestParam ("lastName") String lastName,
                                    @RequestParam ("id") String id){
           Employees employee = new Employees(firstName, lastName, id); //создаем объект внутри метода, передаем поля (конструктор)
           return employeesService.removeEmployee(employee); // вызываем метод

    }
    @GetMapping("/find")
   public Employees findEmployee(@RequestParam ("firstName") String firstName,
                            @RequestParam ("lastName") String lastName,
                          @RequestParam ("id") String id){
            Employees employee = new Employees(firstName, lastName, id); //создаем объект внутри метода, передаем поля (конструктор)
             return employeesService.findEmployee(employee); // вызываем метод

    //}
   // @GetMapping("/find")
    //public String findEmployeeById(@RequestParam ("id") String id) {
   //    return employeesService.findEmployeeById(id);
    }
    @GetMapping
    public String getAll(){ // список с методом
    return employeesService.getAll(); // вызываем метод контроллера
    }
}
