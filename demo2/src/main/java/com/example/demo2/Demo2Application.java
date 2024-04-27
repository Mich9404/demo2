package com.example.demo2;

import org.springframework.boot.CommandLineRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Demo2Application implements CommandLineRunner {

	private static Logger log = LoggerFactory.getLogger(Demo2Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Demo2Application.class, args);
	}

	public void run(String... args) throws Exception {
		log.info("Hola mundo!!!");
	}

	@RestController
	public class MiControlador {
		@GetMapping("/saludo")
		public String saludo() {
			return "¡Hola mundo!";
		}
	}
}
