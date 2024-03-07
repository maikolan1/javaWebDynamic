package br.com.vemprafam.pojo;

import java.util.Date;

public class Funcionario {
	private int re;
	private String nome;
	private Date dataDemissao;
	private double salario;
	public Funcionario() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Funcionario(int re, String nome, Date dataDemissao, double salario) {
		super();
		this.re = re;
		this.nome = nome;
		this.dataDemissao = dataDemissao;
		this.salario = salario;
	}
	public int getRe() {
		return re;
	}
	public void setRe(int re) {
		this.re = re;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataDemissao() {
		return dataDemissao;
	}
	public void setDataDemissao(Date dataDemissao) {
		this.dataDemissao = dataDemissao;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	@Override
	public String toString() {
		return "Funcionario [re=" + re + ", nome=" + nome + ", dataDemissao=" + dataDemissao + ", salario=" + salario
				+ "]";
	}


}
