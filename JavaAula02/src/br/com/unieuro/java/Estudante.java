package br.com.unieuro.java;

public class Estudante {
	private String nome = null;
	private Int id;
	private String senioridade = null;
	private String graducao = null;

	public Estudante(String nome, Int id_estudante, String senioridade, String graducao) {
		super();
		this.nome = nome;
		this.id = id_estudante;
		this.senioridade = senioridade;
		this.graducao = graducao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Int getId() {
		return id;
	}

	public void setId(Int id) {
		this.id = id;
	}

	public String getSenioridade() {
		return senioridade;
	}

	public void setSenioridade(String senioridade) {
		this.senioridade = senioridade;
	}

	public String getGraducao() {
		return graducao;
	}

	public void setGraducao(String graducao) {
		this.graducao = graducao;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String resultado = "nome do estudante:" + nome + ":" + "id:" + id + ":" + "senioridade" + senioridade
				+ ":" + "Graduação" + graducao;

		return resultado;

	}

}
