package com.indigo.spring_hydra.api.domain.entity;

import com.indigo.spring_hydra.api.domain.entity.enums.SubjectsEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
@Entity
@Table(name = "COURSE")
public class CourseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private BigDecimal price;

    @Column
    private LocalDate startDate;

    @Column
    private LocalDateTime endDate;

    @Column
    private SubjectsEnum subject;

    @Column(name = "teacher_id")
    private Long teacherId;

    @ManyToOne
    @JoinColumn(name = "teacher_id", updatable = false, nullable = false)
    private TeacherEntity teacher;

    @ManyToMany(mappedBy = "courses")
    private Set<StudentEntity> students;

}
