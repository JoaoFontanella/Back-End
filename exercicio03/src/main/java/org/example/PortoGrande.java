package org.example;

public class PortoGrande extends BasePorto {
    @Override
    public void atracarbarco(Barco barco) {
        if(barco.tamanho >= 10) {
            barcosatracados.add(barco);
            System.out.println(barco.nome + " atracado no porto grande.");
        }
    }
}
