package com.example.demo.repository;

import com.example.demo.repository.modelo.Propietario;

     public interface PropietarioRepository {
	 public void crearPropi(Propietario propietario);
	 public Propietario buscarPropi(String identificacion);
	 public void eliminarPropi(String identificacion);

}
