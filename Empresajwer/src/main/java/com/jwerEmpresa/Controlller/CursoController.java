package com.jwerEmpresa.Controlller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jwerEmpresa.entities.Curso;
import com.jwerEmpresa.service.CursoService;

@RestController
@RequestMapping("/Curso")
public class CursoController {
	
		private final CursoService cursoService;

		@Autowired
		public CursoController(CursoService cursoService) {
			this.cursoService = cursoService;
		}
		@GetMapping ("/{id}")
		public ResponseEntity<Curso> buscaCursoIdControlId (@PathVariable Long id) {
			Curso curso = cursoService.buscaCursoId(id);
			if (curso != null) {
				return ResponseEntity.ok(curso);
			}
			else {
				return ResponseEntity.notFound().build();
			}
		}

		@GetMapping("/")
		public ResponseEntity<List<Curso>> buscaTodasCursoControl(){
			List<Curso> Curso = cursoService.buscaTodasCurso();
			return ResponseEntity.ok(Curso);
		}
		@PostMapping("/")
		public ResponseEntity<Curso> salvaCursoControl(@RequestBody Curso Curso){
			Curso salvaCurso = cursoService.salvaCurso(Curso);
			return ResponseEntity.status(HttpStatus.CREATED).body(salvaCurso);
		}
		@PutMapping("/{id}")
		public ResponseEntity<Curso> alterarCursoControl(@PathVariable Long id, @RequestBody Curso Curso){
			Curso alterarCurso = cursoService.alterarCurso(id, Curso);
			if(alterarCurso != null) {
				return ResponseEntity.ok(alterarCurso);
			}
			else {
				return ResponseEntity.notFound().build();
			}
		}
		
		@DeleteMapping("/{id}")
		public ResponseEntity<String> apagarCursoControl(@PathVariable Long id){
			boolean apagar = CursoService.ApagarCurso(id);
			if (apagar) {
				return ResponseEntity.ok().body("O Curso foi excluído com sucesso");
			}
			else {
				return ResponseEntity.notFound().build();
			}
		}
	}
	

