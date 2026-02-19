package com.amingharibi.tasktracker.repository;


import java.util.UUID;

import com.amingharibi.tasktracker.domain.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, UUID> {

}
