public class ProdutoAula107{

	private String nome;
	private double preco;
	private int quantidadeEstoque;

	public ProdutoAula107(String nomeInit, double precoInit, int quantidadeEstoqueInit){
		nome = nomeInit;
		preco = precoInit;
		quantidadeEstoque = quantidadeEstoqueInit;
	} //fiquei em duvida se o construtor era private ou public segui com public.

	public ProdutoAula107(){
		
	}


	public String getNome(){
		return nome;
	}

	public double getPreco(){
		return preco;
	} // nesse tambem fique em dúvida sobre usar o tipo primitivo double ou Double que é uma classe né?

	public int getQuantidadeEstoque(){
		return quantidadeEstoque;
	}

	public void setNome(String novoNome){
		nome = novoNome;
	}

	public void setPreco(double novopreco){
		preco = novopreco;
	}

	public void setQuantidadeEstoque(int novoQuantidadeEstoque){
		quantidadeEstoque = novoQuantidadeEstoque;
	}

	
}