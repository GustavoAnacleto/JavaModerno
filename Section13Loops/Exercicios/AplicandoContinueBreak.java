public class AplicandoContinueBreak{

	public static void main(String[] args) {
		
		int codigoSaida= 9;

		for(int codigoCarterinha = 1; codigoCarterinha <= 10; codigoCarterinha++){

			if (codigoCarterinha ==  codigoSaida){
				break;
			}else if(codigoCarterinha == 3 || codigoCarterinha == 7 || codigoCarterinha == 10) {
				System.out.println("Convênio aceito com sucesso cod = " + codigoCarterinha );
				continue;
			}else{
				System.out.println("Convênio não aceito cod = " + codigoCarterinha);
			}
		}

	}
}