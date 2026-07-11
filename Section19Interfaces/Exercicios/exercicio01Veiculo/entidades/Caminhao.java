package entidades;

import interfaces.Veiculo;

public class Caminhao implements Veiculo {

	@Override
	public String iniciar(String mensagem){
	    System.out.println(mensagem);
	    return mensagem;
	}
	
	@Override
	public void parar(){
		System.out.println("o Caminhao parou!");
	}

}