package com.fontanella.exercicio11.Mapper;

import com.fontanella.exercicio11.Conta;
import com.fontanella.exercicio11.Dto.ContaDto;

public class ContaMapper {
    public static ContaDto toDTO(Conta conta) {
        return new ContaDto(conta.getCodigo(), conta.getCliente());
    }
}
