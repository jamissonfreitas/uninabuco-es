package listas;

public class NoLista {
	private int valor;
	private NoLista next;
	
	public NoLista(int valor) {
		this.valor = valor;
		this.next = null;
	}
	
	public int getValor() {
		return this.valor;
	}
	
	public NoLista getNext() {
		return this.next;
	}
	
	public void setValor(int novoValor) {
		this.valor = novoValor;
	}
	
	public void setNext(NoLista novoNext) {
		this.next = novoNext;
	}
}
