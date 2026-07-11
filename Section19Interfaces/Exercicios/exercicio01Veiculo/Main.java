import entidades.*;


public class Main {
	public static void main(String[] args) {
		Carro carro = new Carro();
		Caminhao caminhao = new Caminhao();

		carro.iniciar("O carro ligou!");
		carro.parar();
		carro.buzinar();

		caminhao.iniciar("O Caminhao ligou!");
		caminhao.parar();
		caminhao.buzinar();
	}
}