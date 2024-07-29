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

    @Column(name = "address_id")
    private Long addressId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private AddressEntity address;

//    @Column(name = "student_courses")
//    private Set<CourseEntity> studentCourses;

    @ManyToMany
    @JoinTable(     name = "student_courses",
                    joinColumns = @JoinColumn(name = "student_id"),
                    inverseJoinColumns = @JoinColumn(name = "course_id"))
    Set<CourseEntity> courses;
}
