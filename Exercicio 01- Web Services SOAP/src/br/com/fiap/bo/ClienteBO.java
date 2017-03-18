package br.com.fiap.bo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.apache.axis2.AxisFault;
import org.apache.axis2.engine.AxisError;

import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.dao.impl.ClienteDAOImpl;
import br.com.fiap.entity.Cliente;
import br.com.fiap.exception.DBException;
import br.com.fiap.singleton.EntityManagerFactorySingleton;


public class ClienteBO {

	private EntityManagerFactory fabrica = 
			EntityManagerFactorySingleton.getInstance();
	
	public void cadastrar(Cliente cliente) throws AxisFault{
		EntityManager em = fabrica.createEntityManager();
		ClienteDAO dao = new ClienteDAOImpl(em);
		try {
			dao.cadastrar(cliente);
			dao.salvar(); //commit
		} catch (DBException e) {
			e.printStackTrace();
			throw new AxisFault("Cadastro n�o realizado");
		} finally {
			em.close();
		}
	}
	
	public Cliente buscar(int id){
		EntityManager em = fabrica.createEntityManager();
		ClienteDAO dao = new ClienteDAOImpl(em);
		Cliente cliente = dao.pesquisar(id);
		em.close();
		return cliente;
	}
	
	//Atualizar e Remover
	public void atualizar(Cliente cliente) throws AxisFault {
		EntityManager em = fabrica.createEntityManager();
		ClienteDAO dao = new ClienteDAOImpl(em);
		try {
			dao.alterar(cliente);
			dao.salvar();
		} catch (DBException e) {
			e.printStackTrace();
			throw new AxisError("Erro ao atualizar");
		}finally {
			em.close();
		}
	}
	
	public void remover(int id) throws AxisFault {
		EntityManager em = fabrica.createEntityManager();
		ClienteDAO dao = new ClienteDAOImpl(em);
		try {
			dao.remover(id);
			dao.salvar();
		} catch (Exception e) {
			e.printStackTrace();
			throw new AxisError("Erro ao remover");
		} finally {
			em.close();
		}
	}
}