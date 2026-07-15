import entidades.*;

public class GerenciadorVeiculos{
	public static void main(String[] args) {

		Veiculo onibus = new Onibus("ABC-1234", 1988, 48);
		Veiculo caminhao  = new Caminhao("ACC-4321", 1999, 4);

		onibus.exibirInformacoes();
		caminhao.exibirInformacoes();
		
	}
}