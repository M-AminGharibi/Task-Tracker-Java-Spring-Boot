package com.amingharibi.tasktracker.domain.dto;


import com.amingharibi.tasktracker.domain.entity.TaskPriority;
import com.amingharibi.tasktracker.domain.entity.TaskStatus;

import java.time.LocalDate;
import java.util.UUID;

public record TaskDto(
  UUID id,
  String title,
  String description,
  LocalDate dueDate,
  TaskPriority priority,
  TaskStatus status
) {

}
