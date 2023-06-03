package com.example.demo.service;

import com.example.demo.repository.modelo.Propietario;

public interface PropietarioService {
	 public void crearPropi(Propietario propietario);
	 public Propietario buscarPropi(String identificacion);
	 public void borrarPropi(String identificacion);

}
