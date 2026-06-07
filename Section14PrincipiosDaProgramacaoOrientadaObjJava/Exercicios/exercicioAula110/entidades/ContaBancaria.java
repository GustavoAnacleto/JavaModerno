package entidades;

public class ContaBancaria{

	public String titular;
	public double saldo;
	public double limite;

	public ContaBancaria(String titularInit, double saldoInit, double limiteInit ){
		titular = titularInit;
		saldo = saldoInit;
		limite = limiteInit;
	}

	public String obterInfo(){
		return "Titular: " + titular + "\nSaldo: " + saldo + "\nLimite: " + limite + "\n";
			
	}

}