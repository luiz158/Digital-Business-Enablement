package br.com.fiap.dao.impl;

import br.com.fiap.entity.Jogo;
import javax.persistence.EntityManager;
import br.com.fiap.dao.ClienteDAO;

public class JogoDAOImpl 
				extends GenericDAOImpl<Jogo, Integer> 
										implements ClienteDAO{

	public JogoDAOImpl(EntityManager em) {
		super(em);
	}

}