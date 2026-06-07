import entidades.Banco;
import entidades.ContaBancaria;

public class Aplicacao{
	public static void main(String[] args) {
		ContaBancaria cliente1 = new ContaBancaria("Gustavo", 1500.00, 1000.00);

		Banco conta1 = new Banco();

		System.out.println(cliente1.obterInfo());

		conta1.aumentarLimite(cliente1, 3000.00);

		System.out.println(cliente1.obterInfo());

		cliente1.saldo += 500.00;

		System.out.println(cliente1.obterInfo());

	}
}