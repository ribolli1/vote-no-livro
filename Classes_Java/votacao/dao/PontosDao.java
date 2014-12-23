package com.fribolli.votacao.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.fribolli.tarefas.ConnectionFactory;
import com.fribolli.votacao.modelo.Pontuacao;

public class PontosDao {
	private final Connection connection;

	public PontosDao() {
		try {
			this.connection = new ConnectionFactory().getConnection();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public List<Pontuacao> lista() {
		try {
			List<Pontuacao> pontuacoes = new ArrayList<Pontuacao>();
			PreparedStatement stmt = this.connection
					.prepareStatement("select * from pontuacao order by pontos desc");
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				// adiciona a tarefa na lista
				pontuacoes.add(populaPontos(rs));
			}
			rs.close();
			stmt.close();
			connection.close();
			return pontuacoes;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	private Pontuacao populaPontos(ResultSet rs) throws SQLException {
		Pontuacao pontuacao = new Pontuacao();

		// popula o objeto pontos
		pontuacao.setId(rs.getLong("id"));
		pontuacao.setNome(rs.getString("nome"));
		pontuacao.setPontos(rs.getLong("pontos"));

		return pontuacao;
	}

}