package com.fribolli.tarefas.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class AutorizadorInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object controller) throws Exception {

		String uri = request.getRequestURI();
		if (uri.endsWith("loginForm") || uri.endsWith("efetuaLogin")
				|| uri.contains("resources") || uri.endsWith("adicionaUsuario")
				|| uri.contains("vote-no-livro") || uri.contains("votos")
				|| uri.contains("listaPontos") || uri.contains("1997")
				|| uri.contains("2002") || uri.contains("2010")
				|| uri.contains("2005") || uri.contains("2008")
				|| uri.endsWith("cadastroForm")|| uri.contains("adicionaUser")) {
			return true;
		}
		if (request.getSession().getAttribute("usuarioLogado") != null) {
			return true;
		}

		response.sendRedirect("loginForm");
		return false;

	}

}
