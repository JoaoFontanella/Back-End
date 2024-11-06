package com.fontanella.exercicio13.controller;

import com.fontanella.exercicio13.dto.JogadorDTO;
import com.fontanella.exercicio13.service.JogadorService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jogadores")
public class JogadorController {

    @Autowired
    private JogadorService jogadorService;

    @PostMapping
    public ResponseEntity<JogadorDTO> criarJogador(@RequestBody @Valid JogadorDTO dto) {
        JogadorDTO novoJogador = jogadorService.criarJogador(dto);
        return ResponseEntity.ok(novoJogador);
    }

    @GetMapping
    public ResponseEntity<List<JogadorDTO>> listarJogadores() {
        List<JogadorDTO> jogadores = jogadorService.listarJogadores();
        return ResponseEntity.ok(jogadores);
    }
}

