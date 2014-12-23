package com.fribolli.votacao.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class InstanciadorInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object controller) throws Exception {
		
		String uri = request.getRequestURI(); //integra com sistema de tarefas 
		
		if (uri.endsWith("loginForm") || uri.endsWith("efetuaLogin")
				|| uri.contains("resources") || uri.endsWith("adicionaUsuario")
				|| uri.contains("vote-no-livro")|| uri.contains("adicionaUser")
				|| uri.contains("1997")|| uri.contains("listaTarefas")
				|| uri.contains("novaTarefa")|| uri.contains("adicionaTarefa")
				|| uri.contains("removeTarefa")|| uri.contains("mostraTarefa")
				|| uri.contains("logout")|| uri.contains("cadastroForm")  
				|| uri.contains("2002") || uri.contains("2010")
				|| uri.contains("2005") || uri.contains("2008")
				|| uri.endsWith("cadastroForm")|| uri.endsWith("alteraTarefa")) {
			return true;
		}
		if (request.getSession().getAttribute("contador") != null) {
			return true;
		}
		response.sendRedirect("vote-no-livro");
		return false;
	}

}
