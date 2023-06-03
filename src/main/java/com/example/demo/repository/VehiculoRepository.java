package com.example.demo.repository;

import com.example.demo.repository.modelo.Vehiculo;

public interface VehiculoRepository {
	
	public void crearVehi( Vehiculo vehiculo);
	public void actualizarVehi(Vehiculo vehiculo);
    public Vehiculo buscarVehi(String placa);
	public void eliminarVehi(String placa);

}
