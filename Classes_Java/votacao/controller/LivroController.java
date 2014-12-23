package com.fribolli.votacao.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fribolli.votacao.dao.LivroDao;
import com.fribolli.votacao.dao.PontosDao;
import com.fribolli.votacao.modelo.Livro;
import com.fribolli.votacao.modelo.User;

@Transactional
@Controller
public class LivroController {

	
	private final LivroDao dao;

	
	@Autowired
	public LivroController(LivroDao dao) {
		this.dao = dao;
	}

	
	
	@RequestMapping("vote-no-livro")
	public String instacia(HttpSession session) {

		session.setAttribute("contador", 0);
		return "redirect:votos";
	}
	
	
	@RequestMapping("votos")
	public String testa(Livro livro, Model model, HttpSession session) {

		if ((int) session.getAttribute("contador") == 10) {
			return "votacao/boasvindas";
		}

		Livro encontrado = dao.buscaPorId(getInstancia(session));
		Livro encontradoDois = dao.buscaPorId(getInstancia2(session));
		model.addAttribute("livro", encontrado);
		model.addAttribute("livroDois", encontradoDois);

		return "votacao/livro";
	}

	
	@RequestMapping("adicionaUser")
	public String adicionaUser(User user) {

		dao.adicionaUsuario(user);
		
		return "redirect:listaPontos";
	}

	
	@RequestMapping("listaPontos")
	public String listaponto(Model model, User user) {
		
		PontosDao pontoDao = new PontosDao();
		model.addAttribute("pontuacao", pontoDao.lista());
		return "votacao/ranking";
	}

	
	private long getInstancia(HttpSession session) {
		int livros[] = { 0, 1, 3, 1, 2, 1, 3, 1, 4, 2, 2 };
		int x = (int) session.getAttribute("contador");
		x++;
		session.setAttribute("contador", x);
		return livros[x];
	}

	private long getInstancia2(HttpSession session) {
		int livros[] = { 0, 2, 4, 5, 3, 4, 5, 3, 5, 4, 5 };
		int x = (int) session.getAttribute("contador");
		System.out.println(x);
		return livros[x];
	}

}