package com.snaiter.Turma29;

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
	public String getNewLine ()
	{
		return "Meu novo objetivo agora é me aprimorar ao máximo nesta matéria"
				+ "<br> em especifica, pois eu vejo ela sendo muito útil em todos"
				+ "<br> os quesitos, focando em formatação, formas de linkar bancos"
				+ "<br> de dados, e design.";
	
	}

	public static void main(String[] args) {
		SpringApplication.run(Turma29Application.class, args);
	}

}
