package br.edu.insper.desagil.VaiMalte;

public class Produto {
	private int codigo;
	private String nome;
	private float preco;
	
	public Produto(int codigo, String nome, float preco) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;			
	}

	public int getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public float getPreco() {
		return preco;
	}

}
