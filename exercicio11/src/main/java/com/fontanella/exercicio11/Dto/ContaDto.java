package com.fontanella.exercicio11.Dto;

public class ContaDto {

    private String codigo;

    private String cliente;

    public ContaDto(String codigo, String cliente) {
        this.codigo = codigo;
        this.cliente = cliente;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getCliente() {
        return cliente;
    }
}
