package com.example.demo.repository;

import com.example.demo.repository.modelo.Matricula;

public interface MatriculaRepository {
    public void crear(Matricula matricula);
    public void matricularvehiculo(String identificacion, String placa);
    
}
