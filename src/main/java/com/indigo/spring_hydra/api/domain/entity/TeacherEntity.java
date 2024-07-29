package com.indigo.spring_hydra.api.domain.entity;

import jakarta.persistence.*;

import java.util.Set;

public class TeacherEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @OneToMany(mappedBy = "teacher")
    private Set<CourseEntity> courses;
}
