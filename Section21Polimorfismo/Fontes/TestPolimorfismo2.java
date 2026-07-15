interface Veiculo{
	void acelerar();
}

class Carro implements Veiculo{
	@Override
	public void acelerar(){
		System.out.println("Carro acelerando!");
	}
}

class Moto implements Veiculo{
	@Override
	public void acelerar(){
		System.out.println("Moto acelerando!");
	}
}

public class TestPolimorfismo2 {
	public static void main(String[] args) {
		// Criando objetos polimórficos

		Veiculo carro = new Carro();
		Veiculo moto = new Moto();

		carro.acelerar();
		moto.acelerar();
		
	}
}