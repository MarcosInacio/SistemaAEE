package sistema.AEEComida_negocio;

public class Prato {
	
	private String nome;
	private double preco;
	private String descricao;
	private double avaliacao;
	private int contAvaliacoes;
	
	
	public Prato(){
		this.avaliacao = 0;
		this.contAvaliacoes = 0;
		
	}
	
	
	public Prato(String nome, double preco, String descricao){
		
		this.nome = nome;
		this.preco = preco;
		this.descricao = descricao;
		this.avaliacao = 0;
		this.contAvaliacoes = 0;
		
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public double getPreco() {
		return preco;
	}



	public void setPreco(double preco) {
		this.preco = preco;
	}



	public String getDescricao() {
		return descricao;
	}



	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}



	public double getAvaliacao() {
		return avaliacao;
	}



	public void setAvaliacao(double avaliacao) {
		this.avaliacao = avaliacao;
	}
	
	
	public int getContAvaliacoes() {
		return contAvaliacoes;
	}
		
	
	
	public void avaliaPrato(int num){
		
		this.contAvaliacoes = this.contAvaliacoes + 1;
		this.avaliacao = num/contAvaliacoes;
		
		
	}

	public String toString(){
		
		
		return this.nome + "\n" + this.descricao + "\n" + this.preco 
				+ "\n" + this.avaliacao +"\n"+ this.contAvaliacoes;
		
	}


	
	
	
}


