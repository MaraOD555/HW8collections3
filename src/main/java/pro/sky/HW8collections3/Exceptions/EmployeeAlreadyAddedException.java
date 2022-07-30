package pro.sky.HW8collections3.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Сотрудник уже добавлен")
public class EmployeeAlreadyAddedException extends RuntimeException {
}
