package com.fribolli.votacao.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fribolli.votacao.dao.LivroDao;

@Transactional
@Controller
public class PersistenceController {

	private final LivroDao dao;

	@Autowired
	public PersistenceController(LivroDao dao) {
		this.dao = dao;
	}

	@RequestMapping("1997")
	public String hPotter(HttpSession session) {
		dao.adiciona1(1);

		return "redirect:votos";

	}

	@RequestMapping("2002")
	public String srDosAneis() {

		dao.adiciona1(2);

		return "redirect:votos";

	}

	@RequestMapping("2010")
	public String deitel(HttpSession session) {

		dao.adiciona1(3);

		return "redirect:votos";

	}

	@RequestMapping("2005")
	public String useACabeca(HttpSession session) {

		dao.adiciona1(4);

		return "redirect:votos";

	}

	@RequestMapping("2008")
	public String cleanCode(HttpSession session) {

		dao.adiciona1(5);

		return "redirect:votos";

	}

}
