package ru.oskin_di.TestERPdesigninstitute.services;

import org.springframework.stereotype.Service;
import ru.oskin_di.TestERPdesigninstitute.models.Employee;

import java.util.List;

@Service
public interface EmployeeService {

    Employee findById(int idEmployee);

    List<Employee> findAll();

    void saveTask(int idEmployee, String nameWorkTask);

    void updateTask(int idEmployee, int idWorkTask);

}
