package com.sukar.appl.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table
@Data
public class AssignmentEntity {
    @Id
    @Column
    private int id;
    @Column
    private LocalDateTime date;

    @ManyToOne
    private TaskEntity task;

    @ManyToOne
    private UserEntity assignedUser;

    @Column
    private String status;


}
