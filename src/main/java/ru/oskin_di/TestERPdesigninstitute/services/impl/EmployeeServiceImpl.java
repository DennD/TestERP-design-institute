package ru.oskin_di.TestERPdesigninstitute.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.oskin_di.TestERPdesigninstitute.models.Employee;
import ru.oskin_di.TestERPdesigninstitute.repositories.EmployeeRepository;
import ru.oskin_di.TestERPdesigninstitute.services.EmployeeService;
import ru.oskin_di.TestERPdesigninstitute.services.WorkTaskService;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final WorkTaskService workTaskService;


    @Override
    public Employee findById(int idEmployee) {
        Optional<Employee> employeeOptional = employeeRepository.findById(idEmployee);
        return employeeOptional.get();
        /* Пока оставил без проверки*/
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public void saveTask(int idEmployee, String nameWorkTask) {
        Employee employee = findById(idEmployee);

    }

    @Override
    public void updateTask(int idEmployee, int idWorkTask) {

    }
}
