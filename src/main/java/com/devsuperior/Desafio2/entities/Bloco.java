package com.devsuperior.Desafio2.entities;

import java.time.Instant;
import java.util.Objects;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_bloco")
public class Bloco {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private Instant inicio;
	private Instant fim;
	
	@ManyToOne 
	@JoinColumn(name = "atividade_id") 
	private Atividade atividade;
	
	public Bloco() {	
	}

	public Bloco(Integer id, Instant inicio, Instant fim, Atividade atividade) { 
		this.id = id;
		this.inicio = inicio;
		this.fim = fim;
		this.atividade = atividade;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Instant getInicio() {
		return inicio;
	}

	public void setInicio(Instant inicio) {
		this.inicio = inicio;
	}

	public Instant getFim() {
		return fim;
	}

	public void setFim(Instant fim) {
		this.fim = fim;
	}

	public Atividade getAtividade() { 
		return atividade;
	}

	public void setAtividade(Atividade atividade) { 
		this.atividade = atividade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bloco other = (Bloco) obj;
		return Objects.equals(id, other.id);
	}
}
