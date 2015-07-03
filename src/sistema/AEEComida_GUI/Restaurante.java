package sistema.AEEComida_GUI;

import java.util.ArrayList;

public class Restaurante {
	private String nome;
	private String rua;
	private String cidade;
	private String bairro;
	private String cep;
	private String tipo; // especialidade da casa
	private ArrayList<Prato> cardapio;
	private double avaliacao;
	private double contAvaliacao;
	
	
	public Restaurante(String nome, String rua, String cidade, 
									String bairro ,String cep, String tipo){
		
		this.nome = nome;
		this.rua = rua;
		this.cidade = cidade;
		this.bairro = bairro;
		this.cep = cep;
		this.tipo = tipo;
		this.cardapio = new ArrayList<Prato>();
		this.avaliacao = 0;
		this.contAvaliacao = 0;
		
	}
	
	public String getNome() 
	{
		return nome;
	}
	
	public void setNome(String nome) 
	{
		this.nome = nome;
	}
	
	public String getRua() 
	{
		return rua;
	}
	
	public void setEndereco(String rua) 
	{
		this.rua = rua;
	}
	
	public String getCep() 
	{
		return cep;
	}
	
	public void setCep(String cep) 
	{
		this.cep = cep;
	}

	public String getTipo() 
	{
		return tipo;
	}

	public void setTipo(String tipo) 
	{
		this.tipo = tipo;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	public void avaliaRestaurante(int num){
		
		this.contAvaliacao = this.contAvaliacao + 1;
		this.avaliacao = num/this.contAvaliacao;
		
	}
	
	public void adcionarPrato(Prato prato){
		
		if(prato != null){
			
			(this.cardapio).add(prato);
			
		}
			
		
	}
	
	public String toString(){
		
		return this.nome + "\t" + this.rua + "\t" + this.cidade + "\n" +
		this.bairro + "\t" + this.cep + "\t" + this.tipo;
	}
	
	
}
