package com.jwerEmpresa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jwerEmpresa.entities.Curso;

public interface CursoRepository  extends JpaRepository<Curso, Long> {
	
}
