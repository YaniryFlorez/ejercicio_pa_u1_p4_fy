package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.PropietarioRepository;
import com.example.demo.repository.modelo.Propietario;
import com.example.demo.service.MatriculaService;
import com.example.demo.service.PropietarioService;
import com.example.demo.service.VehiculoService;

@SpringBootApplication
public class EjercicioPaU1P4FyApplication implements CommandLineRunner{

	@Autowired
	private PropietarioService propietarioService;
	
	@Autowired
	private PropietarioRepository propietarioRepository;
	
	@Autowired
	private VehiculoService vehiculoService;
	
	@Autowired
	private MatriculaService matriculaService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(EjercicioPaU1P4FyApplication.class, args);
		
		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Propietario propi= new Propietario();

	
	    
		
	}

}
