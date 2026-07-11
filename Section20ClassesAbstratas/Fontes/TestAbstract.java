abstract class Carro {
	abstract void acelerar();

	void frear() {
		System.out.println("O veículo acionou o freio.");
	}
}

class CarroF1 extends Carro {
	@Override
	void acelerar(){
		System.out.println("O carro de fórmula 1 está acelerando muito rapidamente!");
	}
}

class Caminhao extends Carro {
	@Override
	void acelerar(){
		System.out.println("O Caminhão está acelerando muito Lentamente!");
	}
}

public class TestAbstract {
	public static void main(String[] args) {
		CarroF1 carroF1 = new CarroF1();
		Caminhao caminhao = new Caminhao();

		carroF1.acelerar();
		carroF1.frear();

		caminhao.acelerar();
		caminhao.frear();
	}
}