package br.com.fiap.bo;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.dao.AtletaDAO;
import br.com.fiap.dao.impl.AtletaDAOImpl;
import br.com.fiap.entity.Atleta;
import br.com.fiap.exception.DBException;
import br.com.fiap.exception.IdNotFoundException;
import br.com.fiap.factory.EntityManagerFactorySingleton;

public class AtletaBO {

	EntityManager em= EntityManagerFactorySingleton.getInstance().createEntityManager();

	private AtletaDAO dao = new AtletaDAOImpl(em);
	
	public void cadastrar(Atleta atleta) throws DBException{
		dao.cadastrar(atleta);
		dao.salvar();
	}
	
	public void alterar(Atleta atleta) throws DBException{
		dao.alterar(atleta);
		dao.salvar();
	}
	
	public void remover(Integer codigo) throws IdNotFoundException, DBException{
		dao.remover(codigo);
		dao.salvar();
	}
		
	public Atleta pesquisar(Integer codigo){
		return dao.pesquisar(codigo);
	}
	
	public List<Atleta> listar(){
		return dao.listar();
	}
}
