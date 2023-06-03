package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.MatriculaRepository;
import com.example.demo.repository.modelo.Matricula;

@Service
public class MatriculaServiceImpl  implements MatriculaService{
	
	@Autowired
	private MatriculaRepository matriculaRepository;
	

	@Override
	public void crear(Matricula matricula) {
		// TODO Auto-generated method stub
		this.matriculaRepository.crear(matricula);
	}

	@Override
	public void matricularvehiculo(String identificacion, String placa) {
		// TODO Auto-generated method stub
		
		
		this.matriculaRepository.matricularvehiculo(identificacion, placa);
	}

}
