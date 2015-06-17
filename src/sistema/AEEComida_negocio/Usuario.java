package sistema.AEEComida_negocio;

import java.util.Scanner;
import sistema.AEEComida_dados.*;

public class Usuario {
	private String nome;
	private String cpf;
	private String telefone;
	private String email;
	private String password;
	private int pontos;
	private String endereco;
	
	
	public Usuario(){}
	
	
	/*public Usuario(String nome, String cpf, String telefone, String email, 
						String password, int pontos, String endereco){
		
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.email = email;
		this.password = password;
		this.pontos = pontos;
		this.endereco = endereco;
		
		
	}*/
	
	public void setNome(String nome) 
	{
		this.nome = nome;
	}
	
	public void setCpf(String cpf) 
	{
		this.cpf = cpf;
	}

	public void setTelefone(String telefone)
	{
		this.telefone = telefone;
	}
	
	public void setEmail(String email) 
	{
		this.email = email;
	}

	public String getNome() 
	{
		return nome;
	}
	
	public void setPassword(String password)
	{
		
		this.password = password;
	}

	public int getPontos() 
	{
		return pontos;
		
	}

	public void setPontos(int pontos) 
	{
		this.pontos = pontos;
	}

	public String getEndereco() 
	{
		return endereco;
	}

	public void setEndereco(String endereco) 
	{
		this.endereco = endereco;
	}
	
	public String toString()
	{
		
		return "Nome: " + this.nome + "\nPontos: " + this.pontos + "\nEndereço: " + this.endereco
				+ "\nEmail: " + this.email + "\nTelefone: " + this.telefone;
		
		
	}
	public void cadastrarUsuario()
	{
		//Usuario usuario = new Usuario();
		//Busca buscar = new Busca();
		//int numero=0;
		
		String a;

		Scanner sc = new Scanner(System.in);
		System.out.print("Informe seu nome: ");
		a = sc.nextLine();
		this.setNome(a);
		System.out.println("Informe seu cpf: ");
		a = sc.nextLine();
		this.setCpf(a);
		System.out.println("Crie uma senha: ");
		a = sc.nextLine();
		this.setPassword(a);
		System.out.println("Informe seu endereco: ");
		a = sc.nextLine();
		this.setEndereco(a);
		System.out.println("Informe seu email: ");
		a = sc.nextLine();
		this.setEmail(a);
		System.out.println("Informe o seu telefone: ");
		a = sc.nextLine();
		this.setTelefone(a);
		
		
		//System.out.println(this);
		
		
//		Repositorio repo = new Repositorio(2);
	//	repo.salvarCadastroUsuario(this);
		
		
		/*ArrayList<Usuario> array = new ArrayList<Usuario>();
		
		array.add(usuario);
		
		*///buscar.BuscaCEP(numero);
		
		sc.close();
	}
	

}
