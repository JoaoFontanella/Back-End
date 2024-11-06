package com.fontanella.exercicio13.dto;

import jakarta.validation.constraints.NotBlank;

public class JogadorDTO {

    @NotBlank
    private String nome;

    @NotBlank
    private String apelido;

    // Getter para 'nome'
    public String getNome() {
        return nome;
    }

    // Setter para 'nome'
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter para 'apelido'
    public String getApelido() {
        return apelido;
    }

    // Setter para 'apelido'
    public void setApelido(String apelido) {
        this.apelido = apelido;
    }
}