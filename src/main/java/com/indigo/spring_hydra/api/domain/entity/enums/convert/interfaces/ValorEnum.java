package com.indigo.spring_hydra.api.domain.entity.enums.convert.interfaces;

import com.fasterxml.jackson.annotation.JsonValue;


public interface ValorEnum<T> {


    @JsonValue
    T getValor();
}