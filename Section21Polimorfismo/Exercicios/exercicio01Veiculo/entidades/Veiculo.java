package entidades;

public abstract class Veiculo {
	private String placa;
	private int ano;

	public Veiculo(String placa, int ano){
		this.placa = placa;
		this.ano = ano;
	}

	public void exibirInformacoes(){
		System.out.println("Placa carro: " + getPlaca() + "\nAno carro: " + getAno());
	}

	public String getPlaca(){
		return placa;
	}

	public int getAno(){
		return ano;
	}
}