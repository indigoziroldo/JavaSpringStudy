package com.indigo.spring_hydra.api.domain.entity.embeddable;

import jakarta.persistence.Embeddable;
import lombok.Getter;

@Getter
@Embeddable
public class CityEmbeddable {

    private String cityName;

}
