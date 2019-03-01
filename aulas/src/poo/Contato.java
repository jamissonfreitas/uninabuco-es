package poo;

public class Contato {
	
	private String nome;
	private int telefone;
	
	
	public Contato(String nome, int telefone) {
		this.setNome(nome);
		this.setTelefone(telefone);
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public int getTelefone() {
		return this.telefone;
	}
	
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}

	public void setTelefone(int novoTelefone) {
		this.telefone = novoTelefone;
	}
}
