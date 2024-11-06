package com.fontanella.exercicio13.mapper;

import com.fontanella.exercicio13.dto.JogadorDTO;
import com.fontanella.exercicio13.model.Jogador;

public class JogadorMapper {
    public static Jogador toEntity(JogadorDTO dto) {
        Jogador jogador = new Jogador();
        jogador.setNome(dto.getNome());
        jogador.setApelido(dto.getApelido());
        return jogador;
    }

    public static JogadorDTO toDTO(Jogador jogador) {
        JogadorDTO dto = new JogadorDTO();
        dto.setNome(jogador.getNome());
        dto.setApelido(jogador.getApelido());
        return dto;
    }
}
