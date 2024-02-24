package com.sukar.appl.controller;

import com.sukar.appl.entity.TaskEntity;
import com.sukar.appl.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/task")
public class TaskController {
    @Autowired
    TaskService taskService;

    @GetMapping(path = "/list")
    public List<TaskEntity> getAllTasks() {
        return taskService.listAllTasks();
    }

    @GetMapping(path = "/{id}")
    public TaskEntity getTaskBYId(@PathVariable("id") Integer tasksId) {
        return taskService.getTaskById(tasksId);
    }

    @PostMapping(path = "/add")
    public void getTaskBYId(@RequestBody TaskEntity task) {
        taskService.addNewTask(task);
    }

    @PutMapping(path = "/update")
    public void updateTask(@RequestBody TaskEntity task) {
        taskService.updateTask(task);
    }

    @DeleteMapping(path = "/delete/{id}")
    public void deleteTask(@PathVariable("id") Integer taskId) {
        taskService.deleteTask(taskId);
    }

}
