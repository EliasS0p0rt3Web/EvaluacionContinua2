package com.matricula.demo.service;

public interface MatriculaService {
    void registrarMatricula(MatriculaRequest request);
    Iterable<MatriculaEntity> obtenerHistorico();
}