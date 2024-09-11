package org.fontanella;

public class Filme {
    String nome;
    Integer preco;
    Integer idadeMinima;

    public Filme(String nome, Integer preco, Integer idadeMinima) {
        this.nome = nome;
        this.preco = preco;
        this.idadeMinima = idadeMinima;
    }

    public String getNome() {
        return nome;
    }

    public Integer getPreco() {
        return preco;
    }

    public Integer getIdadeMinima() {
        return idadeMinima;
    }
}
