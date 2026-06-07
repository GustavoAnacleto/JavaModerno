package util;

public class CalculadoraFinanceira{

	public static double aplicarDesconto(double preco, double desconto){

		if(preco < 0){
			return preco = 0;
		}else if(desconto < 0){
			return preco;
		}else if(desconto > preco){
			return 0;
		}else{
			return preco - desconto;
		}
	}

	public static double aplicarDesconto(double preco, int porcentagem){

		if(preco < 0){
			return preco = 0;
		}else if(porcentagem < 0){
			return preco;
		}else if(porcentagem > 100){
			porcentagem = 100;
			return preco - (preco * porcentagem / 100);
		}else{
			return preco - (preco * porcentagem / 100);
		}
	}

	public static double aplicarAcrescimo(double preco, int porcentagem){
		if(preco < 0){
			return preco = 0;
		}else if(porcentagem <= 0){
			return preco;
		}else {
			return preco + (preco * porcentagem /100);
		}
	}

	public static void aplicarDesconto(double preco, double desconto, int quantidade) { 
	    System.out.println("Preço total: " + ((preco * quantidade) - desconto));
	}

	public static void exibirValor(String descricao, double valor){
		System.out.println(descricao + ": R$ " + valor);
	}




}