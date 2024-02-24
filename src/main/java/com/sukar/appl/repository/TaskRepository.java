package com.sukar.appl.repository;

import com.sukar.appl.entity.ScheduleEntity;
import com.sukar.appl.entity.TaskEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends CrudRepository<TaskEntity, Integer> {
}
