package entidades;

public class FinalVariables {

	private final int numeroMaximo = 100;
	private final String mensagem = "Bem-vindo ao mundo da programação!";

	public int getNumeroMaximo(){
		return numeroMaximo;
	}

	public String getMensagem(){
		return mensagem;
	}

	public void setNumeroMaximo(int numeroMaximo){
		this.numeroMaximo = numeroMaximo;
	}

	public void setMensagem(String mensagem){
		this.mensagem = mensagem;
	}

	public void imprimeValoresFinais(){
		System.out.println(numeroMaximo);
		System.out.println(mensagem);
	}

}