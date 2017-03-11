package com.fiap.loja;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fiap.loja.bo.EstoqueBO;
import com.fiap.loja.config.PropertySingleton;
import com.fiap.loja.to.ProdutoTO;

public class TerminalConsulta {
	
	private static Logger log = LoggerFactory.getLogger(TerminalConsulta.class);

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		log.warn("In�cio da aplica��o");
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		
		//Ler a configura��o para recuperar o nome da loja
		String loja = PropertySingleton
				.getInstance().getProperty("nome");
		
		System.out.println(loja + "         " +
					sdf.format(Calendar.getInstance().getTime()));
		System.out.println("***********************************");
		
		try {
			
			System.out.print("Digite o c�digo: ");
			int codigo = scanner.nextInt();
			
			EstoqueBO bo = new EstoqueBO();
			ProdutoTO produto = bo.consultarProduto(codigo);
			log.debug("Produto pesquisado - codigo: " + codigo);
			
			if (produto != null){
				System.out.println(produto.getDescricao());
				System.out.println(produto.getQuantidade());
				//Formatar o valor monet�rio
				DecimalFormat format = new DecimalFormat("R$ #,###.00");
				System.out.println(format.format(produto.getPreco()));
			}else{
				log.error("C�digo de produto inexistente");
				System.out.println("Produto n�o cadastrado!");
			}
		
		}catch(InputMismatchException e){
			System.out.println("C�digo inv�lido");
			log.error("C�digo inv�lido");
		}
		scanner.close();
		log.warn("Fim da aplica��o");
	}
	
}
