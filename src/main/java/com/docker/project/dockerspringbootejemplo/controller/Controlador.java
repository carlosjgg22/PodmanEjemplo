package com.docker.project.dockerspringbootejemplo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controlador {


		
		@GetMapping (value ="/saludo")
		public String saludar() {
		
			return "Hola Pepito! Como Estas????";
	
		
	}
}
