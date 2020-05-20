package com.doti2c.vmperuser.app.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity                     
@Table(name = "tbl_maquina") 
public class Maquina {
	
	@Column(name = "id")                                 // especifico o nome da coluna
	@Id                                                  // digo que eh chave primaria
	@GeneratedValue(strategy = GenerationType.IDENTITY)  // eh um valor gerado pelo banco
	private int    id;
	
	@Column(name = "descricao", length = 100)
	private String descricao;
	
	@Column(name = "qntd_cpu")
	private int		qntd_cpu;
	
	@Column(name = "qntd_memoria")
	private int		qntd_memoria;
	
	@Column(name = "qntd_disco")
	private int		qntd_disco;
	
	@Column(name = "qntd_banda")
	private int		qntd_banda;
	
	@Column(name = "valorHora_cpu")
	private float	valorHora_cpu;
	
	@Column(name = "valorHora_memoria")
	private float	valorHora_memoria;
	
	@Column(name = "valorHora_discos")
	private float	valorHora_disco;
	
	@Column(name = "valorHora_banda")
	private float	valorHora_banda;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "num_solicitacao", referencedColumnName = "num_solicitacao" )
	private Solicitacao maquina;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQntd_cpu() {
		return qntd_cpu;
	}

	public void setQntd_cpu(int qntd_cpu) {
		this.qntd_cpu = qntd_cpu;
	}

	public int getQntd_memoria() {
		return qntd_memoria;
	}

	public void setQntd_memoria(int qntd_memoria) {
		this.qntd_memoria = qntd_memoria;
	}

	public int getQntd_disco() {
		return qntd_disco;
	}

	public void setQntd_disco(int qntd_disco) {
		this.qntd_disco = qntd_disco;
	}

	public int getQntd_banda() {
		return qntd_banda;
	}

	public void setQntd_banda(int qntd_banda) {
		this.qntd_banda = qntd_banda;
	}

	public float getValorHora_cpu() {
		return valorHora_cpu;
	}

	public void setValorHora_cpu(float valorHora_cpu) {
		this.valorHora_cpu = valorHora_cpu;
	}

	public float getValorHora_memoria() {
		return valorHora_memoria;
	}

	public void setValorHora_memoria(float valorHora_memoria) {
		this.valorHora_memoria = valorHora_memoria;
	}

	public float getValorHora_disco() {
		return valorHora_disco;
	}

	public void setValorHora_disco(float valorHora_disco) {
		this.valorHora_disco = valorHora_disco;
	}

	public float getValorHora_banda() {
		return valorHora_banda;
	}

	public void setValorHora_banda(float valorHora_banda) {
		this.valorHora_banda = valorHora_banda;
	}
	
	
	
}
