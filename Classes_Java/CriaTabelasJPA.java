package com.fribolli.tarefas;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CriaTabelasJPA {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("votacao");
		factory.close();
	}
}
