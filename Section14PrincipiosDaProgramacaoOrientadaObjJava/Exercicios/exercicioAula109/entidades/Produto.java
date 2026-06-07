package entidades;

public class Produto{

	private String nome;
	private double preco;

	public Produto(String nomeInit, double precoInit){
		nome = nomeInit;
		preco = precoInit;
	}

	public String obterInfo(){
		return "Produto: " + nome + ", Preço: " + preco;
	}

	public void aplicarDesconto(double desconto){

		preco -= desconto;
		desconto += 500;

	}

}