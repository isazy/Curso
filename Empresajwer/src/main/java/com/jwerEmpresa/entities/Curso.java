package com.jwerEmpresa.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "Curso")
public class Curso {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		 
		
		@NotBlank
		@Column(name = "nome")
		private String nome;
		
		@NotBlank
		@Column(name = "CargaHoraria")
		private Double CargaHoraria;
		
		@NotBlank
		@Column(name = "ConteudoProgramatico")
		private String ConteudoProgramatico;
		
		@NotBlank
		@Column(name = "valor")
		private Double valor;
		
		@NotBlank
		@Column(name = "Professor")
		private String professor;
		
		
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getnome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public Double getCargaHoraria() {
			return CargaHoraria;
		}
		public void setCargaHoraria(Double CargaHoraria) {
			this.CargaHoraria = CargaHoraria;
		}
		
		public String getConteudoProgramatico() {
			return ConteudoProgramatico;
		}
		public void setConteudoProgramatico(String ConteudoProgramatico) {
			this.ConteudoProgramatico = ConteudoProgramatico;
		}
		public String getProfessor() {
			return professor;
		}
		public void setProfessor(String Professor) {
			this.professor = Professor;
		}
		
	}

