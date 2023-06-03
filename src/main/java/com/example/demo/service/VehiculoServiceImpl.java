package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.VehiculoRepository;
import com.example.demo.repository.modelo.Vehiculo;

@Service
public class VehiculoServiceImpl implements VehiculoService{
	
	@Autowired
	private VehiculoRepository vehiculoRepository;

	@Override
	public void crear(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.vehiculoRepository.crearVehi(vehiculo);
	}

	@Override
	public void actualizarVehi(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.vehiculoRepository.actualizarVehi(vehiculo);
	}

	@Override
	public Vehiculo buscarVehi(String placa) {
		// TODO Auto-generated method stub
		return this.vehiculoRepository.buscarVehi(placa);
	}

	@Override
	public void borrarVehi(String placa) {
		// TODO Auto-generated method stub
		this.vehiculoRepository.eliminarVehi(placa);
	}

}
