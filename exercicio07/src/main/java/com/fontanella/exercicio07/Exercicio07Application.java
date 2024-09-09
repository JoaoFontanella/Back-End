package com.fontanella.exercicio07;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Exercicio07Application {

	public static void main(String[] args) {
		SpringApplication.run(Exercicio07Application.class, args);
	}

	@GetMapping("/recomendacao")
	public String getRecommendation(@RequestParam("ambientacao") Integer opcaoAmbientacao,
									@RequestParam("genero") Integer opcaoGenero) {
		if (opcaoAmbientacao == 1 && opcaoGenero == 1) {
			return "Homens de Preto";
		}
		if (opcaoAmbientacao == 1 && opcaoGenero == 2) {
			return "Arrival";
		}
		if (opcaoAmbientacao == 2 && opcaoGenero == 1) {
			return "Shrek";
		}
		if (opcaoAmbientacao == 2 && opcaoGenero == 2) {
			return "Gladiador";
		}
		return "Opção inválida";
	}
}

//Url de teste:
//http://localhost:8080/recomendacao?ambientacao=1&genero=1
//http://localhost:8080/recomendacao?ambientacao=2&genero=1