package com.amingharibi.tasktracker.service;


import com.amingharibi.tasktracker.domain.CreateTaskRequest;
import com.amingharibi.tasktracker.domain.UpdateTaskRequest;
import com.amingharibi.tasktracker.domain.entity.Task;

import java.util.List;
import java.util.UUID;

public interface TaskService {

  Task createTask(CreateTaskRequest request);

  List<Task> listTasks();

  Task updateTask(UUID taskId, UpdateTaskRequest request);

  void deleteTask(UUID taskId);

}
