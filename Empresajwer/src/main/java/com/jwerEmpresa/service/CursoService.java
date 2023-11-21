package com.jwerEmpresa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jwerEmpresa.entities.Curso;
import com.jwerEmpresa.repository.CursoRepository;


@Service
public class CursoService {
	private final CursoRepository cursoRepository;
	
	@Autowired
	public CursoService(CursoRepository cursoRepository) {
		this.cursoRepository = cursoRepository;
	}
	
	public List<Curso> buscaTodasCurso(){
		return cursoRepository.findAll();
	}
	
	public Curso buscaCursoId (Long id) {
		Optional <Curso> curso = cursoRepository.findById(id);
		return curso.orElse(null);			
	}
	
	public Curso salvaCurso(Curso curso) {
		return cursoRepository.save(curso);
	}
	
	public Curso alterarCurso (Long id, Curso alterarCurso) {
		Optional <Curso> existeCurso = cursoRepository.findById(id);
		if (existeCurso.isPresent()) {
			alterarCurso.setId(id);
			return cursoRepository.save(alterarCurso);
		}
		return null;
	}
	
	public boolean apagarTarefa(Long id) {
		Optional <Curso> existeCurso = cursoRepository.findById(id);
		if (existeCurso.isPresent()) {
			cursoRepository.deleteById(id);
			return true;
		}
		return false;
	}

	public static boolean ApagarCurso(Long id) {
		// TODO Auto-generated method stub
		return false;
	}
}
