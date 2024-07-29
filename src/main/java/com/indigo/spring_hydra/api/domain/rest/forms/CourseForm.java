package com.indigo.spring_hydra.api.domain.rest.forms;

import lombok.Getter;

import java.math.BigDecimal;

@Getter
public class CourseForm {
    private Long id;
    private String subjects;
    private BigDecimal price;
    private String startDate;
    private String endDate;
}
