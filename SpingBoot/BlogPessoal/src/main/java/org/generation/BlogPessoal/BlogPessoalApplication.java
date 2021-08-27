package org.generation.BlogPessoal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RequestMapping("/")
@RestController

public class BlogPessoalApplication {
	
	@GetMapping("/")
	public String Home()
	{
		return "Bem vindo ao meu blog!";
	}

	public static void main(String[] args) {
		SpringApplication.run(BlogPessoalApplication.class, args);
	
	}

}
