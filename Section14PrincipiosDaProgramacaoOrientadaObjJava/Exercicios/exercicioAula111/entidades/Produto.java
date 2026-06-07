package entidades;

public class Produto{

	private String nome;
	private double preco;
	private int estoque;

	public Produto(String nomeInit, double precoInit, int estoqueInit){
		nome = nomeInit;
		preco = precoInit;
		estoque = estoqueInit;
	}

	public String getNome(){
		return nome;
	}

	public double getPreco(){
		return preco;
	}

	public int getEstoque(){
		return estoque;
	}

	public void setNome(String novoNome) {
	    if (novoNome != null && !novoNome.trim().isEmpty()) {
	        nome = novoNome;
	    } else {
	        System.out.println("Nome nulo ou vazio!");
	    }
	}

	public void setPreco(double novoPreco){
		if(novoPreco >= 0){
			preco = novoPreco;
		}else{
			System.out.println("Preço menor que zero não é permitido!");
		}
	}

	public void setEstoque(int novoEstoque){
		if(novoEstoque >= 0){
			estoque = novoEstoque;
		}else{
			System.out.println("Estoque menor que zero não permitido!");
		}
	}

	public void aplicarDesconto(double valor){
		preco -= valor;
	}

	public void aplicarDesconto(int porcentagem){
		preco -= preco * porcentagem / 100;
	}

	public void aplicarDesconto(int porcentagem, int quantidadeVendida){
		preco -= preco * porcentagem / 100;
		estoque -= quantidadeVendida;
	}

	public String obterInfo(){
		return "Produto: " + nome +
			"\nPreço: " + preco +
			"\nEstoque: " + estoque + "\n____________________________________\n";
	}
}