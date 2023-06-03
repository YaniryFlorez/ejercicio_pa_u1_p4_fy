package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Propietario;

@Repository
public class PropietarioRepositoryImpl implements PropietarioRepository{
	
	private static List<Propietario> dataBase= new ArrayList<>();

	@Override
	public void crearPropi(Propietario propietario) {
		// TODO Auto-generated method stub
		dataBase.add(propietario);
		
	}

	@Override
	public Propietario buscarPropi(String identificacion) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminarPropi(String identificacion) {
		// TODO Auto-generated method stub
		
	}


}
