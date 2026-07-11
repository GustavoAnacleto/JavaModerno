abstract class Carro { 

	abstract void acelerar();  //método abstrato

	void frear() { //método concreto
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
//Regra 2
/* O objeto instanciado pode chamar tanto os métodos concretos herdados da classe abstrata 
quanto os métodos abstratos implementados na subclasse. A implementação dos métodos abstratos 
é obrigatória (senão o código não compila), enquanto usar ou não o método concreto herdado 
é uma escolha de quem programa, não uma exigência do compilador. */