package com.formacion.service;

import java.util.List;

import com.formacion.model.Curso;

public interface CursosService {

	List<Curso> buscarCursosTema(String tema);

}