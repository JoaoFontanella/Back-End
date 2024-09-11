package org.fontanella;

public class Cliente {
    String nome;
    Integer idade;

    public Cliente(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }
}
