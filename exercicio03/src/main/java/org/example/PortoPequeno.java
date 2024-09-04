package org.example;

public class PortoPequeno extends BasePorto {
    @Override
    public void atracarbarco(Barco barco) {
        if(barco.tamanho <= 10) {
            barcosatracados.add(barco);
            System.out.println(barco.nome + " atracado no porto pequeno.");
        }
    }


}
