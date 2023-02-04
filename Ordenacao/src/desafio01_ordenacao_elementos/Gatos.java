package desafio01_ordenacao_elementos;

public class Gatos implements Comparable<Gatos>{
	private String nome;
	private int idade;
	private String cor;
	
	public Gatos() {
		// construtor vazio
	}
	
	public Gatos(String nome, int idade, String cor) {
		this.nome = nome;
		this.idade = idade;
		this.cor = cor;
	}
	
	// getters
	public String getNome() {
		return nome;
	}
	public int getIdade() {
		return idade;
	}
	public String getCor() {
		return cor;
	}
	
	// setters
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	@Override
	public String toString() {
		String 	s = "";
				s+=	"{" + 
					"Nome: " + this.nome + " " +
					", Idade: " + this.idade + " " +
					", Cor: " + this.cor + " " +
					"}";
		return s;
	}

	@Override
	public int compareTo(Gatos gatos) {
		// TODO Auto-generated method stub
		return this.getNome().compareToIgnoreCase(gatos.getNome());
	}
}
