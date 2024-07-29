package com.indigo.spring_hydra.api.domain.entity.enums;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.indigo.spring_hydra.api.domain.entity.enums.convert.interfaces.ValorEnum;
import com.indigo.spring_hydra.api.domain.entity.enums.convert.service.DesserializadorEnum;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.data.annotation.AccessType;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@JsonDeserialize(using = DesserializadorEnum.class)
public enum SubjectsEnum implements ValorEnum<String> {

    History("H"),
    Science("S"),
    Chemistry("C");

    private String value;

    public String getValor() {
        return this.value;
    }


}
