package com.fontanella.exercicio12.Mapper;

import com.fontanella.exercicio12.Dto.ContaDTO;
import com.fontanella.exercicio12.Conta;

public class ContaMapper {
    public static ContaDTO toDto(Conta conta) {
        return new ContaDTO(conta.getCodigo(), conta.getCliente());
    }
}
