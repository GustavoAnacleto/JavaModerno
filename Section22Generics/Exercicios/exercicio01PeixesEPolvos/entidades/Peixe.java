package entidades;

public class Peixe {

	private String nome;
	private int tamanho;

	public Peixe(String nome, int tamanho) {
		this.nome = nome;
		this.tamanho = tamanho;
	}

	public String getNome(){
		return nome;
	}

	public Integer getTamanho(){
		return tamanho;
	}


}