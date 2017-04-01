package br.com.fiap.view;

import br.com.fiap.exception.WebServiceException;
import br.com.fiap.repository.ProdutoRepository;

public class Delete {
	public static void main(String[] args) {
		ProdutoRepository rep = new ProdutoRepository();
		
		try {
			rep.remover(4);
			System.out.println("SUCESSO");
		} catch (WebServiceException e) {
			e.printStackTrace();
		}
	}

}
