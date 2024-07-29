package com.indigo.spring_hydra.api.domain.entity;

import com.indigo.spring_hydra.api.domain.entity.embeddable.CityEmbeddable;
import jakarta.persistence.*;

@Entity
@Table(name = "ADDRESS")
public class AddressEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private CityEmbeddable city;

    @Column(name = "address")
    private Long studedId;

    @OneToOne(mappedBy = "address")
    private StudentEntity student;
}
