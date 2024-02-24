package com.sukar.appl.repository;

import com.sukar.appl.entity.AssignmentEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssignmentRepository extends CrudRepository<AssignmentEntity, Integer> {
}
