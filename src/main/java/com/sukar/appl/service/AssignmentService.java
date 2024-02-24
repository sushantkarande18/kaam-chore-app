package com.sukar.appl.service;

import com.sukar.appl.repository.AssignmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AssignmentService {

    @Autowired
    AssignmentRepository assignmentRepository;
}
