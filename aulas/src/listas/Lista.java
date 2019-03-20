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
