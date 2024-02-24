package com.sukar.appl.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table
@Data
public class TaskEntity {

    @Id
    @Column
    private int id;

    @Column
    private String name;

    @Column
    private double duration;

    @Column
    private String effortLevel;

    @OneToMany
    private List<AssignmentEntity> assignmentList ;


}
