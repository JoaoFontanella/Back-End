package com.fontanella.exercicio12.Service;

import com.fontanella.exercicio12.Dto.TransacaoRequestDTO;
import com.fontanella.exercicio12.Dto.TransacaoResponseDTO;
import com.fontanella.exercicio12.Mapper.ContaMapper;
import com.fontanella.exercicio12.Conta;
import com.fontanella.exercicio12.Transacao;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TransacoesService {
    private final List<Conta> contas;

    public TransacoesService() {
        this.contas = new ArrayList<>();
        contas.add(new Conta("500-1", "Fulano", 1000.0));
        contas.add(new Conta("320-2", "Ciclano", 500.0));
    }

    public TransacaoResponseDTO gerarTransacao(TransacaoRequestDTO request) {
        Conta origem = encontrarContaPorCodigo(request.origem());
        Conta destino = encontrarContaPorCodigo(request.destino());

        if (origem == null || destino == null || origem.getSaldo() < request.valor()) {
            throw new IllegalArgumentException("Transação inválida");
        }

        origem.setSaldo(origem.getSaldo() - request.valor());
        destino.setSaldo(destino.getSaldo() + request.valor());

        Transacao transacao = new Transacao(origem, destino, request.valor());
        return new TransacaoResponseDTO(
                ContaMapper.toDto(transacao.getOrigem()),
                ContaMapper.toDto(transacao.getDestino()),
                transacao.getValor()
        );
    }

    private Conta encontrarContaPorCodigo(String codigo) {
        return contas.stream().filter(c -> c.getCodigo().equals(codigo)).findFirst().orElse(null);
    }
}

