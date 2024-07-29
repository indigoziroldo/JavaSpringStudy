package com.indigo.spring_hydra.api.domain.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "STUDENT")
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "adress_id", referencedColumnName = "id")
    private AdressEntity adress;

    @ManyToMany
    @JoinTable(     name = "student_course",
                    joinColumns = @JoinColumn(name = "student_id"),
                    inverseJoinColumns = @JoinColumn(name = "course_id"))
    Set<CourseEntity> courses;
}
