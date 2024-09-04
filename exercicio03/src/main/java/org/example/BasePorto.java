package org.example;

import java.util.ArrayList;
import java.util.List;

public class BasePorto {
    String nome;
    List<Barco> barcosatracados = new ArrayList<>();

    public void atracarbarco(Barco barco) {
    barcosatracados.add(barco);
    }

    public void desatracarbarco(Barco barco){
    barcosatracados.remove(barco);
    }
    
}
