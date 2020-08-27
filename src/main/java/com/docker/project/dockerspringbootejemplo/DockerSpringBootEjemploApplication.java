package com.docker.project.dockerspringbootejemplo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.docker.project.dockerspringbootejemplo.controller"})
public class DockerSpringBootEjemploApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerSpringBootEjemploApplication.class, args);
	}

}
