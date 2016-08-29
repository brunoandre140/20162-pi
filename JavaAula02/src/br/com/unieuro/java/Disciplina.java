package br.com.unieuro.java;

public class Disciplina {
	private String nome = null;
	private String id = null;
	private Integer credito = 0;
	private String departamento = null;
	
	public Disciplina (String nome, String id,Integer credito,String departamento){
		super();
		this.nome = nome;
		this.id = id;
		this.credito = credito;
		this.departamento = departamento;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Integer getCredito() {
		return credito;
	}
	public void setCredito(Integer credito) {
		this.credito = credito;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	} 
}
