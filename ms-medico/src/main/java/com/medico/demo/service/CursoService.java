package com.curso.demo.service;

public interface CursoService {
    void registrarCurso(CursoRequest request);
    Iterable<CursoResponse> obtenerCursos();
    boolean verificarApertura(String codigoCurso, String ciclo);
}