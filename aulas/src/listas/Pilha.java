package listas;

public class Pilha {
	private int[] base;
	private int topo;
	
	public Pilha(int tamanho) {
		this.base = new int[tamanho];
		this.topo = -1;
	}
	
	public boolean estaVazia() {
		return this.topo < 0;
	}
	
	public boolean estaCheia() {
		return this.base.length == this.topo;
	}
	
	public void push(int valor) {
		if(!this.estaCheia()) {
			this.base[++topo] = valor;
		}
		System.out.println("Pilha cheia!");
	}
	
	public void pop() {
		if(!this.estaVazia()) {
			--this.topo;
		}
	}
}
