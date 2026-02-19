package com.amingharibi.tasktracker.mapper.impl;


import com.amingharibi.tasktracker.domain.CreateTaskRequest;
import com.amingharibi.tasktracker.domain.UpdateTaskRequest;
import com.amingharibi.tasktracker.domain.dto.CreateTaskRequestDto;
import com.amingharibi.tasktracker.domain.dto.TaskDto;
import com.amingharibi.tasktracker.domain.dto.UpdateTaskRequestDto;
import com.amingharibi.tasktracker.domain.entity.Task;
import com.amingharibi.tasktracker.mapper.TaskMapper;
import org.springframework.stereotype.Component;

@Component
public class TaskMapperImpl implements TaskMapper {

  @Override
  public CreateTaskRequest fromDto(CreateTaskRequestDto dto) {
    return new CreateTaskRequest(
      dto.title(),
      dto.description(),
      dto.dueDate(),
      dto.priority()
    );
  }

  @Override
  public UpdateTaskRequest fromDto(UpdateTaskRequestDto dto) {
    return new UpdateTaskRequest(
      dto.title(),
      dto.description(),
      dto.dueDate(),
      dto.status(),
      dto.priority()
    );
  }

  @Override
  public TaskDto toDto(Task task) {
    return new TaskDto(
      task.getId(),
      task.getTitle(),
      task.getDescription(),
      task.getDueDate(),
      task.getPriority(),
      task.getStatus()
    );
  }

}
