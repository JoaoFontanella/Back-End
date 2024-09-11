package org.fontanella;

import java.util.ArrayList;
import java.util.Scanner;

public class Cinema {
    private ArrayList<Filme> filmesDisponiveis = new ArrayList<>();
    private ArrayList<Ingresso> ingressosVendidos = new ArrayList<>();
    private ArrayList<String> assentosDisponiveis = new ArrayList<>();

    public Cinema() {
        filmesDisponiveis.add(new Filme("Oppenheimer", 30, 18));
        filmesDisponiveis.add(new Filme("Harry Potter", 50, 12));
        filmesDisponiveis.add(new Filme("Interstellar", 20, 12));
        filmesDisponiveis.add(new Filme("Velozes e Furiosos", 40, 17));
        filmesDisponiveis.add(new Filme("Matrix", 35, 16));

        char[] fileiras = {'A', 'B', 'C', 'D', 'E', 'F'};
        for (char fileira : fileiras) {
            for (int i = 1; i <= 5; i++) {
                assentosDisponiveis.add(fileira + String.valueOf(i));
            }
        }
    }

    public void venderIngresso(Cliente cliente, String nomeFilme, String assento) throws Exception {
        if (!assentosDisponiveis.contains(assento)) {
            throw new Exception("O ingresso não pode ser vendido pois o assento " + assento + " não está mais disponível!");
        }

        Filme filmeEscolhido = null;
        for (Filme filme : filmesDisponiveis) {
            if (filme.getNome().equalsIgnoreCase(nomeFilme)) {
                filmeEscolhido = filme;
                if (cliente.getIdade() < filme.getIdadeMinima()) {
                    throw new Exception("O ingresso não pode ser vendido pois sua idade não permite! ");
                }
                break;
            }
        }

        if (filmeEscolhido == null) {
            throw new Exception("Filme não encontrado!");
        }

        Ingresso ingresso = new Ingresso(cliente, filmeEscolhido, assento);
        ingressosVendidos.add(ingresso);
        assentosDisponiveis.remove(assento);
        System.out.println(ingresso);
    }
}

