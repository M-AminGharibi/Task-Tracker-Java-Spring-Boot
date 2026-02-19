package com.amingharibi.tasktracker.mapper;


import com.amingharibi.tasktracker.domain.CreateTaskRequest;
import com.amingharibi.tasktracker.domain.UpdateTaskRequest;
import com.amingharibi.tasktracker.domain.dto.CreateTaskRequestDto;
import com.amingharibi.tasktracker.domain.dto.TaskDto;
import com.amingharibi.tasktracker.domain.dto.UpdateTaskRequestDto;
import com.amingharibi.tasktracker.domain.entity.Task;

public interface TaskMapper {

  CreateTaskRequest fromDto(CreateTaskRequestDto dto);

  UpdateTaskRequest fromDto(UpdateTaskRequestDto dto);

  TaskDto toDto(Task task);

}
