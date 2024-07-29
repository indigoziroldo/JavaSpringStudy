package com.indigo.spring_hydra.api.domain.entity;

import com.indigo.spring_hydra.api.domain.entity.embeddable.CityEmbeddable;
import jakarta.persistence.*;

@Entity
@Table(name = "ADRESS")
public class AddressEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private CityEmbeddable city;

    @OneToOne(mappedBy = "adress")
    private StudentEntity student;
}
