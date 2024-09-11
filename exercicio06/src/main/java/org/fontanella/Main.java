package org.fontanella;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cinema cinema = new Cinema();

        while (true) {
            try {
                System.out.println("Que filme você deseja assistir?");
                String nomeFilme = scanner.nextLine();

                System.out.println("Qual assento você deseja? (de A1 a F5)");
                String assento = scanner.nextLine();

                System.out.println("Qual o seu nome?");
                String nomeCliente = scanner.nextLine();

                System.out.println("Qual a sua idade?");
                Integer idadeCliente = scanner.nextInt();
                scanner.nextLine();

                Cliente cliente = new Cliente(nomeCliente, idadeCliente);

                cinema.venderIngresso(cliente, nomeFilme, assento);

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            System.out.println("Deseja realizar outra venda? (s/n)");
            String continuar = scanner.nextLine();
            if (!continuar.equalsIgnoreCase("s")) {
                break;
            }
        }

        scanner.close();
    }
}
