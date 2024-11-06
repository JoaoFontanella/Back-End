package com.fontanella.exercicio13.service;

import com.fontanella.exercicio13.dto.JogadorDTO;
import com.fontanella.exercicio13.mapper.JogadorMapper;
import com.fontanella.exercicio13.model.Jogador;
import com.fontanella.exercicio13.JogadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class JogadorService {

    @Autowired
    private JogadorRepository jogadorRepository;

    public JogadorDTO criarJogador(JogadorDTO dto) {
        Jogador jogador = JogadorMapper.toEntity(dto);
        jogador = jogadorRepository.save(jogador);
        return JogadorMapper.toDTO(jogador);
    }

    public List<JogadorDTO> listarJogadores() {
        return jogadorRepository.findAll().stream()
                .map(JogadorMapper::toDTO)
                .collect(Collectors.toList());
    }
}