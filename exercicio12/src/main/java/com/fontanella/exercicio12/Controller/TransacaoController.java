package com.fontanella.exercicio12.Controller;

import com.fontanella.exercicio12.Dto.TransacaoRequestDTO;
import com.fontanella.exercicio12.Dto.TransacaoResponseDTO;
import com.fontanella.exercicio12.Service.TransacoesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/transacoes")
public class TransacaoController {

    @Autowired
    private TransacoesService transacoesService;

    @PostMapping
    public ResponseEntity<TransacaoResponseDTO> gerarTransacao(@RequestBody TransacaoRequestDTO request) {
        TransacaoResponseDTO response = transacoesService.gerarTransacao(request);
        return ResponseEntity.ok(response);
    }
}
