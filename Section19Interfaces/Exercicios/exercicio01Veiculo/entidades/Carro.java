package entidades;

import interfaces.Veiculo;

public class Carro implements Veiculo {

	@Override
	public String iniciar(String mensagem){
	    System.out.println(mensagem);
	    return mensagem;
	}

	@Override
	public void parar(){
		System.out.println("o carro parou!");
	}

	@Override
	public void buzinar(){
		System.out.println("O Carro buzinou!");
	}
}