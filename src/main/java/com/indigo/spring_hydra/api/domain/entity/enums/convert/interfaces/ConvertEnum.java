package com.indigo.spring_hydra.api.domain.entity.enums.convert.interfaces;

public interface ConvertEnum <E extends Enum<? extends ValorEnum<T>>, T> {
    T getRepresentacaoValorEnumParaBancoDeDados(E tipoEnum);
    E getEnum(E[] valoresEnum, T valorEnum);
}
