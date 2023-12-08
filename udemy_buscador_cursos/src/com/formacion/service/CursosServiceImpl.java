package com.formacion.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.formacion.model.Curso;

@Service
public class CursosServiceImpl implements CursosService {
	List<Curso> cursos;
	public CursosServiceImpl() {
		cursos=new ArrayList<>();
		cursos.add(new Curso("Java","Programaci�n",50));
		cursos.add(new Curso("Angular","Programaci�n",30));
		cursos.add(new Curso("Linux","Sistemas",40));
		cursos.add(new Curso("Big Data","Datos",30));
		cursos.add(new Curso("SQL","Datos",20));
	}
	
	@Override
	public List<Curso> buscarCursosTema(String tema){
		return cursos.stream()
				.filter(c->c.getTema().equals(tema))
				.collect(Collectors.toList());
		
	}
}
