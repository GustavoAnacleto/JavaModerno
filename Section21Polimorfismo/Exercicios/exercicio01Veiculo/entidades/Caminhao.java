package entidades;

public class Caminhao extends Veiculo{

	public int eixos;

	public Caminhao(String placa, int ano, int eixos){
		super(placa, ano);
		this.eixos = eixos;
	}

	@Override
	public void exibirInformacoes(){
		System.out.println("Placa caminhão: " + getPlaca() + 
			"\nAno carro: " + getAno() + 
			"\nAcentos: " + eixos);
	}
}