package com.fribolli.votacao.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "livro")
@Entity
public class Livro {

	@Id
	@GeneratedValue
	private Long id;
	private String titulo;
	private String foto;
	private String nome;
	private String autor;
	private String ano;
	private String genero;
	private String sinopse;
	private String facebook;
	private String site;
	private String youtube;
	private String citacao;
	private String autorCitacao;

	public String getFoto() {
		return foto;
	}

	public String getNome() {
		return nome;
	}

	public String getAutor() {
		return autor;
	}

	public String getAno() {
		return ano;
	}

	public String getGenero() {
		return genero;
	}

	public String getSinopse() {
		return sinopse;
	}

	public String getFacebook() {
		return facebook;
	}

	public String getSite() {
		return site;
	}

	public String getYoutube() {
		return youtube;
	}

	public String getAutorCitacao() {
		return autorCitacao;
	}

	public void setAutorCitacao(String autorCitacao) {
		this.autorCitacao = autorCitacao;
	}

	public String getCitacao() {
		return citacao;
	}

	public void setCitacao(String citacao) {
		this.citacao = citacao;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

}