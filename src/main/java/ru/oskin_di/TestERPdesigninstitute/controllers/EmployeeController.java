package ru.oskin_di.TestERPdesigninstitute.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.oskin_di.TestERPdesigninstitute.dtos.EmployeeDto;
import ru.oskin_di.TestERPdesigninstitute.models.Employee;
import ru.oskin_di.TestERPdesigninstitute.services.EmployeeService;
import ru.oskin_di.TestERPdesigninstitute.utils.Converter;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class EmployeeController {

    private final EmployeeService employeeService;
    private final Converter converter;

    @GetMapping("/{id}")
    public EmployeeDto getEmployeeInfo(@PathVariable int id) {
        return converter.employeeToDto(employeeService.findById(id));
    }

    @GetMapping("/all")
    public List<EmployeeDto> getAllEmployeesInfo() {
        return employeeService.findAll().stream().map(converter::employeeToDto).collect(Collectors.toList());
    }

    @PostMapping("/{id}")
    public ResponseEntity<String> addTask(@RequestParam String nameWorkTask, @PathVariable int idEmployee) {
        employeeService.saveTask(idEmployee, nameWorkTask);
        return new ResponseEntity<String>("Задача поставлена", HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> takeTask(@RequestParam int idWorkTask, @PathVariable int idEmployee) {
        employeeService.updateTask(idEmployee,idWorkTask);
        return new ResponseEntity<String>("Задача взята в работу", HttpStatus.OK);
    }


}
