package ru.oskin_di.TestERPdesigninstitute.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.oskin_di.TestERPdesigninstitute.models.Employee;
import ru.oskin_di.TestERPdesigninstitute.models.WorkTask;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {

    private int id;

    private String name;

    private List<WorkTaskDto> listOfCreatedTasks;

    private List<WorkTaskDto> listOfExecutedTasks;

}
