package ru.oskin_di.TestERPdesigninstitute.utils;

import org.springframework.stereotype.Component;
import ru.oskin_di.TestERPdesigninstitute.dtos.EmployeeDto;
import ru.oskin_di.TestERPdesigninstitute.dtos.WorkTaskDto;
import ru.oskin_di.TestERPdesigninstitute.models.Employee;
import ru.oskin_di.TestERPdesigninstitute.models.WorkTask;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class Converter {
    public EmployeeDto employeeToDto(Employee employee) {
        List<WorkTaskDto> workTasksCreated = employee.getListOfCreatedTasks().stream().map(WorkTaskDto::new).collect(Collectors.toList());
        List<WorkTaskDto> workTasksExecuted = employee.getListOfExecutedTasks().stream().map(WorkTaskDto::new).collect(Collectors.toList());
        return new EmployeeDto(employee.getId(), employee.getName(), workTasksCreated, workTasksExecuted);
    }
}
