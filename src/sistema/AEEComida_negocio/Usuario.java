package sistema.AEEComida_negocio;

import java.util.Scanner;
import sistema.AEEComida_dados.*;
import javax.swing.JOptionPane;

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
		
		String a;

		Scanner sc = new Scanner(System.in);
		
		do{
			a = JOptionPane.showInputDialog("Informe seu nome");
			this.setNome(a);
		}while(a.length()==0);
		
		do{
			a = JOptionPane.showInputDialog("Informe seu cpf");
			this.setCpf(a);
		}while(a.length()==0);
		
		do{
			a = JOptionPane.showInputDialog("Crie uma senha");
			this.setPassword(a);
		}while(a.length()==0);
		
		do{
			a = JOptionPane.showInputDialog("Informe seu endereço");
			this.setEndereco(a);
		}while(a.length()==0);
		
		do{
			a = JOptionPane.showInputDialog("Informe seu email");
			this.setEmail(a);
		}while(a.length()==0);
		
		do{
			a = JOptionPane.showInputDialog("Informe seu telefone");
			this.setTelefone(a);
		}while(a.length()==0);
		
		sc.close();
	}
	

}
