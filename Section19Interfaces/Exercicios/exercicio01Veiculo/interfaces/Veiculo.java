package interfaces;

public interface Veiculo {

	String iniciar(String mensagem);

	void parar();

	default void buzinar(){
		System.out.println("O veiculo buzinou!");
	}

}