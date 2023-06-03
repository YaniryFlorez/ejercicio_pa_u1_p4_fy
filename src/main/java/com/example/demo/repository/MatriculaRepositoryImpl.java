package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Matricula;

@Repository
public class MatriculaRepositoryImpl implements MatriculaRepository{
	
	private static List<Matricula> dataBase= new ArrayList<>();


	@Override
	public void crear(Matricula matricula) {
		// TODO Auto-generated method stub
		dataBase.add(matricula);
		
	}

	@Override
	public void matricularvehiculo(String identificacion, String placa) {
		// TODO Auto-generated method stub
		
	}

}
