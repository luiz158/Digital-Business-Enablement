package br.com.fiap.view;

import br.com.fiap.exception.WebServiceException;
import br.com.fiap.repository.ProdutoRepository;
import br.com.fiap.to.ProdutoTO;

public class CadastroView {
	
	public static void main(String[] args) {
		ProdutoRepository rep = new ProdutoRepository();
		
		try{
			ProdutoTO produto = new ProdutoTO(0,"Arduino", 2500, 1);
			rep.cadastrar(produto);
		}catch(WebServiceException e){
			e.printStackTrace();
		}
		
	}

}
