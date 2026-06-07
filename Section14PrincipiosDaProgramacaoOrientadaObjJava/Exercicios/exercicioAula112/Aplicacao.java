import util.CalculadoraFinanceira;

public class Aplicacao{

	public static void main(String[] args) {

	double precoOriginal = 150.00;

	double precoComDescontoFixo = CalculadoraFinanceira.aplicarDesconto(precoOriginal, 30.00);

	double precoComDescontoPercentual = CalculadoraFinanceira.aplicarDesconto(precoOriginal, 10);

	double precoComAcrescimo = CalculadoraFinanceira.aplicarAcrescimo(precoOriginal, 15);


	CalculadoraFinanceira.exibirValor("Preço original", precoOriginal);
	CalculadoraFinanceira.exibirValor("Preço com desconto fixo", precoComDescontoFixo);
	CalculadoraFinanceira.exibirValor("Preço com desconto percentual", precoComDescontoPercentual);
	CalculadoraFinanceira.exibirValor("Preço com acréscimo", precoComAcrescimo);
	CalculadoraFinanceira.aplicarDesconto(100d, 50d, 3);
		
	}
}