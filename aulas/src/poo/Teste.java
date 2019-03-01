package poo;

public class Teste {

	public static void main(String[] args) {
		Contato c1, c2 = null;
		
		c1 = new Contato("james", 988776644);
		c2 = new Contato("james2", 899771122);
		//c1.setNome("Fuluno");
		
		//System.out.println(c1.getNome());
		//System.out.println(c1.getTelefone());
		
		Agenda agenda = new	Agenda();
		agenda.print();
		System.out.println("Depois...");
		for(int i =0; i< 12; i++) {
			agenda.addContato(c1);
		}
		//agenda.addContato(c1);
		//agenda.addContato(c2);
		agenda.print();

	}

}
