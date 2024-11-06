package com.fontanella.exercicio13;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Exercicio13Application {

	public static void main(String[] args) {
		SpringApplication.run(Exercicio13Application.class, args);
	}

}

//Metodo POST para salvar jogador
//{
//  "nome": "Jogador",
//  "apelido": "1"
//}
//Depois mandar uma requisição GET para listar usuarios
//
//OBS: Testei no Insomnia