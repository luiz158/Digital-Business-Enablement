package br.com.fiap.to;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement // Transformar em JSON autom�ticamente
public class ProdutoTO {
	
	private int codigo;
	
	private String nome;
	
	private double preco;
	
	private int quantidade;

	/**
	 * 
	 */
	public ProdutoTO() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param codigo
	 * @param nome
	 * @param preco
	 * @param quantidade
	 */
	public ProdutoTO(int codigo, String nome, double preco, int quantidade) {
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the preco
	 */
	public double getPreco() {
		return preco;
	}

	/**
	 * @param preco the preco to set
	 */
	public void setPreco(double preco) {
		this.preco = preco;
	}

	/**
	 * @return the quantidade
	 */
	public int getQuantidade() {
		return quantidade;
	}

	/**
	 * @param quantidade the quantidade to set
	 */
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
	
}