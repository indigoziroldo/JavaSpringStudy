package com.indigo.spring_hydra.api.domain.entity.enums.convert;

import com.indigo.spring_hydra.api.domain.entity.enums.SubjectsEnum;
import com.indigo.spring_hydra.api.domain.entity.enums.convert.interfaces.ConvertEnum;
import com.indigo.spring_hydra.api.domain.entity.enums.convert.service.ConvertEnumMaybeNull;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class SubjectsConvertion implements AttributeConverter<SubjectsEnum, String> {

    private ConvertEnum<SubjectsEnum, String> convertEnum = new ConvertEnumMaybeNull<>();

    public String convertToDatabaseColumn(SubjectsEnum subjectsEnum){
        return convertEnum.getRepresentacaoValorEnumParaBancoDeDados(subjectsEnum);
    }

    public SubjectsEnum convertToEntityAttribute(String dbData){
        return convertEnum.getEnum(SubjectsEnum.values(), dbData);
    }

}
