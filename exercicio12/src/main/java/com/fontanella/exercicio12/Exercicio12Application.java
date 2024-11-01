package com.fontanella.exercicio12;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Exercicio12Application {

	public static void main(String[] args) {
		SpringApplication.run(Exercicio12Application.class, args);
	}

}


//URL:
//http://localhost:8080/api/transacoes
//Body JSON:
//{
//  "origem": "500-1",
//  "destino": "320-2",
//  "valor": 100
//}