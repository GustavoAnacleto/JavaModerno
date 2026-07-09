import entidades.FinalVariables;

public class Aplicacao {
	public static void main(String[] args) {
		FinalVariables varFinal = new FinalVariables();

		varFinal.imprimeValoresFinais();

		varFinal.setNumeroMaximo(33);
		varFinal.setMensagem("Nova Mensagem!");

		varFinal.imprimeValoresFinais();
	}
}