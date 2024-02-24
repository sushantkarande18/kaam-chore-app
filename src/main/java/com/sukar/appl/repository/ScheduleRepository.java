package com.sukar.appl.repository;

import com.sukar.appl.entity.AssignmentEntity;
import com.sukar.appl.entity.ScheduleEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScheduleRepository extends CrudRepository<ScheduleEntity, Integer> {
}
