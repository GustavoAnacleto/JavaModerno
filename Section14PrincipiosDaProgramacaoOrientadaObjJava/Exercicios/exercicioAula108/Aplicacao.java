import entidades.Carro;

public class Aplicacao{

	public static void main(String[] args) {
		
		Carro c1 = new Carro();
		Carro c2 = new Carro("Toyota", "Corolla");
		Carro c3 = new Carro("Fiat", "Siena", 2014);


		c1.exibirDetalhes();
		c2.exibirDetalhes();
		c3.exibirDetalhes();
	}
}