package listas;

public class Lista {
	private NoLista head;
	private NoLista tail;
	private int qdt;
	
	public Lista() {
		this.head = null;
		this.tail = null;
	}
	
	public boolean estaVazia() {
		return this.tail == null;
	}
	
	/* adiciona um valor na lista */
	public void adicionar(int valor) {
		NoLista new_node = new NoLista(valor);
		
		if (!this.estaVazia()) {
			this.tail.setNext(new_node);
			this.tail = new_node;
		}else {
			this.head = new_node;
			this.tail = new_node;
		}
	}
	
	// TODO
	public void adicionar(int valor, int posicao) {
		int pos = 0;
		if(!this.estaVazia()) {	
			NoLista current = this.head;
			do {
				current = current.getNext();
				pos += 1;
			} while (pos != posicao);
		}
	}
	
	// TODO
	/*
	 * Busca o @valor na lista e remove o NoLista correspondente.
	 * Remove apenas a primeira ocorrência do valor na lista
	 * */
	public void remove(int valor) {
		if(!this.estaVazia()) {
			NoLista current = this.head;
	
			do {
				if(current.getValor() == valor) {
					// No a ser removido
					break;
				}
				current = current.getNext();
			} while (current != null);
		}
	}
	
	// TODO
	/*
	 * Remove todas as ocorrência de @valor na lista
	 * */
	public void removeAll(int valor) {
		
	}
	
	// TODO
	public void remove_posicao(int posicao) {
		
	}
	
	public void print() {
		if(!this.estaVazia()) {
			NoLista current;
			current = this.head;
	
			do {
				System.out.print(current.getValor() + " --> ");
				current = current.getNext();
			} while (current != null);
		}
	}
	
}
