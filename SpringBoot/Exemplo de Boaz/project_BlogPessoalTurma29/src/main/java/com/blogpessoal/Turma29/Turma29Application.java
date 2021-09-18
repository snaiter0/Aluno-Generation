package com.blogpessoal.Turma29;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class Turma29Application {
	
	@GetMapping
	public String helloBlogPessoal0() {
		return "Hellow, Blog Pessoal Turma 29 0."
			
				+ "	<br> Digite /mentalidade para visualizar as mentalidades usadas."
				+ " <br> Digite /habilidades para visualizar as habilidades usadas.";
	}
	
	@GetMapping("/mentalidade")
	public String helloBlogPessoal1() {
		return "A mentalidade foi a de crescimento, pesquisando novas formas para"
				+ "formatação do texto, por exemplo pular linhas em HTML.";
	}
	
	@GetMapping("/habilidade")
	public String helloBlogPessoal2() {
		return "A habilidade utilizada foi a de atenção aos detalhes, para notar "
				+ "<br> os erros durante a execução do programa, e conseguir sobressair"
				+ "<br> as minhas próprias expectativas sem me frustrar no caminho.";
	}

	public static void main(String[] args) {
		SpringApplication.run(Turma29Application.class, args);
	}

}
