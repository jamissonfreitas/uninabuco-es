package poo;

public class Agenda {
	
	private Contato[] contatos;
	private int indexCurrent = 0;
	
	public Agenda() {
		this.contatos = new Contato[10];
	}
	
	public void addContato(Contato c) {
		//if (this.indexCurrent < this.contatos.length) {
			this.contatos[this.indexCurrent] = c;
			this.indexCurrent +=1;
		//}else {
		//	System.out.println("Agenda cheia.");
		//}
	}
	
	public void print() {
		for(int i = 0; i < this.contatos.length; i++) {
			System.out.println(i + " - " + this.contatos[i]);
		}
	}
}
