package com.example.demo.service;

import com.example.demo.repository.modelo.Matricula;

public interface MatriculaService {
    public void crear(Matricula matricula);
    public void matricularvehiculo(String identificacion, String placa);

}
