enum DiaDaSemana{
	SEGUNDA,TERCA,QUARTA,QUINTA,SEXTA,SABADO,DOMINGO
}

public class ExemploEnum {
	public static void main(String[] args) {
		
		DiaDaSemana dia = DiaDaSemana.SEGUNDA;

		System.out.println("Hoje é " + dia);
	}
}