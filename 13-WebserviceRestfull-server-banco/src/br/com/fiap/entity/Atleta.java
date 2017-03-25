package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TB_ATLETA")
@SequenceGenerator(name="seqAtleta", sequenceName="SQ_TB_ATLETA", allocationSize=1)
public class Atleta {
	
	@Id
	@GeneratedValue(generator="seqAtleta", strategy=GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name="NM_ATLETA")
	private String nome;
	
	@Column(name="NM_MODALIDADE")
	private String modalidade;
	
	@Column(name="NR_RANKING")
	private int ranking;

	/**
	 * 
	 */
	public Atleta() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param codigo
	 * @param nome
	 * @param modalidade
	 * @param ranking
	 */
	public Atleta(int codigo, String nome, String modalidade, int ranking) {
		this.codigo = codigo;
		this.nome = nome;
		this.modalidade = modalidade;
		this.ranking = ranking;
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
	 * @return the modalidade
	 */
	public String getModalidade() {
		return modalidade;
	}

	/**
	 * @param modalidade the modalidade to set
	 */
	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}

	/**
	 * @return the ranking
	 */
	public int getRanking() {
		return ranking;
	}

	/**
	 * @param ranking the ranking to set
	 */
	public void setRanking(int ranking) {
		this.ranking = ranking;
	}
	
	

}
