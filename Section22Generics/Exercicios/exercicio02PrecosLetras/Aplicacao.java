import entidades.*;

public class Aplicacao {

	public static void main(String[] args) {

		Caixa<Double> precos = new Caixa<>(5);
		Caixa<Character> letras = new Caixa<>(5);

		precos.adicionar(1.59, 0);
		letras.adicionar('A', 0);

		System.out.println(precos.obter(0));
		System.out.println(letras.obter(0));
	}
}