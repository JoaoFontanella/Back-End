package com.fontanella.exercicio11.Service;

import com.fontanella.exercicio11.Conta;
import com.fontanella.exercicio11.Transacao;

import java.util.ArrayList;
import java.util.List;

public class TransacaoService {

    private List<Conta> contas;

    public TransacaoService() {
        contas = new ArrayList<>();
        contas.add(new Conta("500-1","Fulano"));
        contas.add(new Conta("320-2","Cliclano"));
    }

    public Transacao gerarTransacao(String origemCodigo, String destinoCodigo, Double valor) {
        Conta origem = contas.stream()
                .filter(conta -> conta.getCodigo().equals(origemCodigo))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Conta de origem não encontrada"));

        Conta destino = contas.stream()
                .filter(conta -> conta.getCodigo().equals(destinoCodigo))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Conta de destino não encontrada"));

        return new Transacao(origem, destino, valor);
    }

    public List<Conta> getContas() {
        return contas;
    }
}
