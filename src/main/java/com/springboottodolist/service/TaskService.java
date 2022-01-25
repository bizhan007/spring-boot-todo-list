package com.springboottodolist.service;

import com.springboottodolist.model.Task;

import java.util.List;

public interface TaskService {

    Task findTaskById(Long id);
    List<Task> findAllTasks();
    Task createTask(Task task);
    Task updateTask(Task task);
    void deleteTaskById(Long id);

}
