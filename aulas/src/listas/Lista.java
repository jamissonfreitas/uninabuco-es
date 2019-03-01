package listas;

public class Lista {
	private NoLista head;
	private NoLista tail;
	
	public Lista() {
		
	}
	
	public boolean estaVazia() {
		return this.tail == null;
	}
	
	public void adicionar(int valor) {
		NoLista no = new NoLista(valor);
		
		if (!this.estaVazia()) {
			this.tail.setNext(no);
			this.tail = no;
		}else {
			this.head = no;
			this.tail = no;
		}
	}
	
	public void print() {
		if(!this.estaVazia()) {
			NoLista current;
			current = this.head;
	
			do {
				System.out.println(current.getValor());
				current = current.getNext();
			} while (current != null);
		}
	}
	
}
