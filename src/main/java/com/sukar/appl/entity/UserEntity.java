package com.sukar.appl.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table
@Data
public class UserEntity {

    @Id
    @Column
    private int id;

    @Column
    private String name;

    @Column
    private int age;

    @OneToMany
    private List<AssignmentEntity> assignmentList ;


}
