package entidades;

public class MinhaClasse{

	public int calcularSoma(int numeroA, int numeroB){

		return numeroA + numeroB;
	}

	@Deprecated
	public int calcularProduto(int numeroA, int numeroB){
		return numeroA * numeroB;
	}
}