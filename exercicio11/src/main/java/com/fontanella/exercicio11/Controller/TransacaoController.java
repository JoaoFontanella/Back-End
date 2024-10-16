package com.fontanella.exercicio11.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/transacoes")
public class TransacaoController {
    @Autowired
    private TransacoesService transacoesService;

    @PostMapping
    public ResponseEntity<TransacaoResponseDTO> gerarTransacao(@RequestBody TransacaoRequestDTO request) {
        Transacao transacao = transacoesService.gerarTransacao(request.getOrigem(), request.getDestino(), request.getValor());
        TransacaoResponseDTO response = new TransacaoResponseDTO(
                ContaMapper.toDTO(transacao.getOrigem()),
                ContaMapper.toDTO(transacao.getDestino()),
                transacao.getValor()
        );
        return ResponseEntity.ok(response);
    }
}

//{
//  "origem": "500-1",
//  "destino": "320-2",
//  "valor": 100
//}

//{
//  "origem": { "codigo": "500-1", "cliente": "Fulano" },
//  "destino": { "codigo": "320-2", "cliente": "Ciclano" },
//  "valor": 100
//}
