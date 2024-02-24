package com.sukar.appl.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table
@Data
public class ScheduleEntity {
    @Id
    @Column
    private int id;

    @Column
    private LocalDateTime date;

    @Column
    @OneToMany
    private List<AssignmentEntity> assignmentList;

}
