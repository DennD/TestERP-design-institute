package ru.oskin_di.TestERPdesigninstitute.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.oskin_di.TestERPdesigninstitute.dtos.WorkTaskDto;
import ru.oskin_di.TestERPdesigninstitute.services.WorkTaskService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@RequestMapping("/work_tasks")
public class WorkTaskController {

    private final WorkTaskService workTaskService;

    @GetMapping()
    public List<WorkTaskDto> getAllWorkTasksInfo() {
        return workTaskService.findAll().stream().map(WorkTaskDto::new).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public WorkTaskDto getWorkTaskInfo(@PathVariable int id){
        return new WorkTaskDto(workTaskService.findById(id));
    }

    @GetMapping("/in_progress")
    public List<WorkTaskDto> getWorkTasksInfoInProgress() {
        return workTaskService.findAllInProgress().stream().map(WorkTaskDto::new).collect(Collectors.toList());
    }

    @GetMapping("/not_in_progress")
    public List<WorkTaskDto> getWorkTasksInfoNotInProgress() {
        return workTaskService.findAllNotInProgress().stream().map(WorkTaskDto::new).collect(Collectors.toList());
    }
}
