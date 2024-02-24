package com.sukar.appl.service;

import com.sukar.appl.entity.TaskEntity;
import com.sukar.appl.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService {

    @Autowired
    TaskRepository taskRepository;

    public List<TaskEntity> listAllTasks() {
        List<TaskEntity> taskList = new ArrayList<>();
        taskRepository.findAll().forEach(t -> taskList.add(t));
        return taskList;
    }

    public TaskEntity getTaskById(Integer taskId) {
        return taskRepository.findById(taskId).orElse(null);
    }

    public void addNewTask(TaskEntity task) {
        taskRepository.save(task);
    }

    public void updateTask(TaskEntity task) {
        taskRepository.findById(task.getId()).orElseThrow();
        taskRepository.save(task);
    }

    public void deleteTask(Integer taskId) {
        TaskEntity taskEntity = taskRepository.findById(taskId).orElseThrow();
        taskRepository.delete(taskEntity);
    }
}
