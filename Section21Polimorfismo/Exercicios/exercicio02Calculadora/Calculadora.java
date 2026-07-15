import entidades.*;

public class Calculadora {
	public static void main(String[] args) {

		Operacao soma = new Soma();
		Operacao subtracao = new Subtracao();
		Operacao multiplicacao = new Multiplicacao();
		Operacao divisao = new Divisao();

		System.out.println("Soma: " + soma.calcular(1.5, 6.5));
		System.out.println("Subtracao: " + subtracao.calcular(3.5, 7.5));
		System.out.println("Multiplicacao: " + multiplicacao.calcular(60, 15));
		System.out.println("Divisão: " + divisao.calcular(150, 30));

	}

}