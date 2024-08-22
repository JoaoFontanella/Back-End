package org.example;

public class Main {
    public static void main(String[] args) {
        Personagem jogador = new Personagem();
        jogador.nome = "Steve";
        jogador.vida = 5;

        Personagem inimigo = new Personagem();
        inimigo.nome = "Java";

        jogador.atacar(inimigo);

        
    }
}