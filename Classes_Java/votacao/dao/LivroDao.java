package com.fribolli.votacao.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.fribolli.votacao.modelo.Livro;
import com.fribolli.votacao.modelo.Pontuacao;
import com.fribolli.votacao.modelo.User;

@Repository
public class LivroDao {

	@PersistenceContext
	private EntityManager manager;

	public void adiciona1(long instancia) {

		Pontuacao pontuacao = manager.find(Pontuacao.class, instancia);
		pontuacao.setPontos((pontuacao.getPontos() + 1));
		manager.merge(pontuacao);

	}

	public Livro buscaPorId(long instancia) {
		return manager.find(Livro.class, instancia);
	}

	public void adicionaUsuario(User user) {
		manager.persist(user);

	}

}
