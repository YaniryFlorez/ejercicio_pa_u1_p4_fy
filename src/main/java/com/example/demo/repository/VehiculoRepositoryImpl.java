package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Vehiculo;

@Repository
public class VehiculoRepositoryImpl implements VehiculoRepository{
	
	private static List<Vehiculo> dataBase= new ArrayList<>();
	

	@Override
	public void crearVehi(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		dataBase.add(vehiculo);
		
	}

	@Override
	public void actualizarVehi(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Vehiculo buscarVehi(String placa) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminarVehi(String placa) {
		// TODO Auto-generated method stub
		
	}

}
