package com.fribolli.votacao.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "pontuacao")
@Entity
public class Pontuacao {

	@Id
	@GeneratedValue
	private long id;
	private long pontos;
	private String nome;

	public void setId(long id) {
		this.id = id;
	}

	public long getId(long id) {
		return this.id = id;
	}

	public long getPontos() {
		return pontos;
	}

	public void setPontos(long pontos) {
		this.pontos = pontos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}