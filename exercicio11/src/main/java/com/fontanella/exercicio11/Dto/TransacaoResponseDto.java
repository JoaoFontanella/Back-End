package com.fontanella.exercicio11.Dto;

public class TransacaoResponseDto {

    private ContaDto origem;
    private ContaDto destino;
    private Double valor;

    public TransacaoResponseDto(ContaDto origem, ContaDto destino, Double valor) {
        this.origem = origem;
        this.destino = destino;
        this.valor = valor;
    }

    public ContaDto getOrigem() {
        return origem;
    }

    public ContaDto getDestino() {
        return destino;
    }

    public Double getValor() {
        return valor;
    }
}
