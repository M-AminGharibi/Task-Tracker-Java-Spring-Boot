package com.amingharibi.tasktracker.domain;


import com.amingharibi.tasktracker.domain.entity.TaskPriority;
import com.amingharibi.tasktracker.domain.entity.TaskStatus;

import java.time.LocalDate;

public record UpdateTaskRequest(
  String title,
  String description,
  LocalDate dueDate,
  TaskStatus status,
  TaskPriority priority
) {

}
