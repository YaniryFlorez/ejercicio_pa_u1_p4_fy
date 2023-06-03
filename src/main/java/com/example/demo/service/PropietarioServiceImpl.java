package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.PropietarioRepository;
import com.example.demo.repository.modelo.Propietario;

@Service
public class PropietarioServiceImpl implements PropietarioService{
	
	@Autowired
	private PropietarioRepository propietarioRepository;
	

	@Override
	public void crearPropi(Propietario propietario) {
		// TODO Auto-generated method stub
		this.propietarioRepository.crearPropi(propietario);
	}

	@Override
	public Propietario buscarPropi(String identificacion) {
		// TODO Auto-generated method stub
		return this.buscarPropi(identificacion);
	}

	@Override
	public void borrarPropi(String identificacion) {
		// TODO Auto-generated method stub
		this.propietarioRepository.eliminarPropi(identificacion);
	}

}
