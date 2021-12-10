package ru.oskin_di.TestERPdesigninstitute.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.oskin_di.TestERPdesigninstitute.models.Employee;
import ru.oskin_di.TestERPdesigninstitute.models.WorkTask;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WorkTaskDto {

    private int id;

    private String name;

    private boolean inProgress;

    private Employee employee_creator;

    private Employee employee_executor;

    public WorkTaskDto(WorkTask workTask) {
        this.id = workTask.getId();
        this.name = workTask.getName();
        this.inProgress = workTask.isInProgress();
        this.employee_creator = workTask.getEmployeeCreator();
        this.employee_executor = workTask.getEmployeeExecutor();
    }
}
