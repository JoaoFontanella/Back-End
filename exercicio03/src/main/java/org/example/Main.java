package org.example;

public class Main {
    public static void main(String[] args) {
        Barco[] barcos = new Barco[6];
        PortoGrande portoGrande = new PortoGrande();
        PortoPequeno portoPequeno = new PortoPequeno();

        barcos[1] = new Barco("Barco 1", 2);
        barcos[2] = new Barco("Barco 2", 5);
        barcos[3] = new Barco("Barco 3", 7);
        barcos[4] = new Barco("Barco 4", 12);
        barcos[5] = new Barco("Barco 5", 20);

        for (int i = 1; i < barcos.length; i++) {
            Barco barco = barcos[i];
            portoPequeno.atracarbarco(barco);
            portoGrande.atracarbarco(barco);
        }

    }
}