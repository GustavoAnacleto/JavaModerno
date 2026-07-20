package entidades;

public class Cesto<T> {

	private T conteudo;

	public void guardar(T conteudo) {
		this.conteudo = conteudo;
	}
	public T pegar() {
		return conteudo;
	}
}