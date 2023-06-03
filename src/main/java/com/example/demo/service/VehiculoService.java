package com.example.demo.service;

import com.example.demo.repository.modelo.Vehiculo;

public interface VehiculoService {

	public void crear(Vehiculo vehiculo);
	public void actualizarVehi(Vehiculo vehiculo);
    public Vehiculo buscarVehi(String placa);
	public void borrarVehi(String placa);

}
