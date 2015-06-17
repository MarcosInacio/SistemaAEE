package sistema.AEEComida_negocio;

public class Restaurante {
	private String nome;
	private String endereco;
	private String cep;
	private String tipo; // especialidade da casa

	
	public Restaurante(String nome, String endereco, String cep, String tipo){
		
		this.nome = nome;
		this.endereco = endereco;
		this.cep = cep;
		this.tipo = tipo;
		
	}
	
	public String getNome() 
	{
		return nome;
	}
	
	public void setNome(String nome) 
	{
		System.out.println();
		this.nome = nome;
	}
	
	public String getEndereco() 
	{
		return endereco;
	}
	
	public void setEndereco(String endereco) 
	{
		this.endereco = endereco;
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
	
}
