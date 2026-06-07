package entidades;

public class Banco{

	public Banco(){
		
	}

	public void aumentarLimite(ContaBancaria conta, double novolimite){
		conta.limite = novolimite;
	}

}