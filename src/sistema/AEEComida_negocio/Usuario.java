package sistema.AEEComida_negocio;

import java.util.Scanner;
import java.io.Serializable;


import sistema.AEEComida_dados.*;

import javax.swing.JOptionPane;

import org.jsoup.*;
import org.jsoup.nodes.Document;

import java.net.SocketTimeoutException;
import java.io.IOException;

public class Usuario implements Serializable {
	
	private String nome;
	private String cpf;
	private String telefone;
	private String email;
	private String password;
	private int pontos;
	private String cep;
	private String cidade;
	private String bairro;
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
	
	
	
	public String getCep() {
		return cep;
	}


	public void setCep(String cep) {
		this.cep = cep;
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

	
	

	public String getPassword() {
		return password;
	}


	public String getCpf() {
		return cpf;
	}


	public String getTelefone() {
		return telefone;
	}


	public String getEmail() {
		return email;
	}


	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public void cadastrarUsuario()
	{
		
		String a;
		String b;
		boolean ver = false;

		Scanner sc = new Scanner(System.in);
		
		do{
			a = JOptionPane.showInputDialog("Informe seu nome");
			this.setNome(a);
		}while(a.length()==0);
		
		do{
			a = JOptionPane.showInputDialog("Informe seu cpf");
			this.setCpf(a);
		}while(a.length()==0 || isCPF(a) == false);
		
		do{
			a = JOptionPane.showInputDialog("Crie uma senha");
			b = JOptionPane.showInputDialog("Repita a senha");
			if(a.equals(b)){
				this.setPassword(a);
			}
		}while(a.length()==0 && b.length()==0 || a.equals(b)== false);
		
		do{
			a = JOptionPane.showInputDialog("Informe seu cep");
			try{
				Document doc = Jsoup.connect("http://www.qualocep.com/busca-cep/"+a)
						.timeout(120000)
						.get();
					ver = doc.getElementsByTag("td").get(2).text().isEmpty();
			}catch(IOException c){
			        	JOptionPane.showMessageDialog(null, "Não foi possivel efetuar a operação",
			        			"Erro!", JOptionPane.INFORMATION_MESSAGE);
			        }
				
			
		}while(a.length()==0 || ver == true );
		
		
		try{
			
			Document doc = Jsoup.connect("http://www.qualocep.com/busca-cep/"+a)
	                  .timeout(120000)
	                  .get();
			
			this.bairro = doc.getElementsByTag("td").get(2).text();
			this.cidade = doc.getElementsByAttributeValue("itemprop", "addressLocality").text();
			this.endereco =  doc.getElementsByAttributeValue("itemprop", "streetAddress").text();
			
			
			
		}catch (SocketTimeoutException e) {
        	JOptionPane.showMessageDialog(null, "Não foi possivel efetuar a operação",
        			"Erro!", JOptionPane.INFORMATION_MESSAGE);

        } catch (HttpStatusException w) {
        	JOptionPane.showMessageDialog(null, "Não foi possivel efetuar a operação",
        			"Erro!", JOptionPane.INFORMATION_MESSAGE);
			
        }catch(IOException c){
        	JOptionPane.showMessageDialog(null, "Não foi possivel efetuar a operação",
        			"Erro!", JOptionPane.INFORMATION_MESSAGE);
        }
		
		
		
		
		
		
		do{
			a = JOptionPane.showInputDialog("Informe seu email");
			b = JOptionPane.showInputDialog("Repita seu email");
			if(a.equals(b)){
				this.setEmail(a);
			}
			
		}while(a.length()==0 && b.length()==0 || a.equals(b)== false);
		
		do{
			a = JOptionPane.showInputDialog("Informe seu telefone");
			this.setTelefone(a);
		}while(a.length()==0);
	
		JOptionPane.showMessageDialog(null, this.toString());
		
		sc.close();
	}
	
	public static boolean isCPF(String CPF) {
		
		    if (CPF.equals("00000000000") || CPF.equals("11111111111") ||
		        CPF.equals("22222222222") || CPF.equals("33333333333") ||
		        CPF.equals("44444444444") || CPF.equals("55555555555") ||
		        CPF.equals("66666666666") || CPF.equals("77777777777") ||
		        CPF.equals("88888888888") || CPF.equals("99999999999") ||
		       (CPF.length() != 11))
		       return(false);

		    char dig10, dig11;
		    int sm, i, r, num, peso;

		      sm = 0;
		      peso = 10;
		      for (i=0; i<9; i++) {                      
		        num = (int)(CPF.charAt(i) - 48); 
		        sm = sm + (num * peso);
		        peso = peso - 1;
		      }

		      r = 11 - (sm % 11);
		      if ((r == 10) || (r == 11))
		         dig10 = '0';
		      else dig10 = (char)(r + 48); 

		      sm = 0;
		      peso = 11;
		      for(i=0; i<10; i++) {
		        num = (int)(CPF.charAt(i) - 48);
		        sm = sm + (num * peso);
		        peso = peso - 1;
		      }

		      r = 11 - (sm % 11);
		      if ((r == 10) || (r == 11))
		         dig11 = '0';
		      else dig11 = (char)(r + 48);

		      if ((dig10 == CPF.charAt(9)) && (dig11 == CPF.charAt(10)))
		         return(true);
		      else return(false);
		   
		  }
	
	public String toString()
	{
		
		return "Nome: " + this.nome + "\nPontos: " + this.pontos +"\nCidade: "+ this.cidade  + 
				"\nBairro: " + this.bairro +"\nEndereço: " + this.endereco
				+ "\nEmail: " + this.email + "\nTelefone: " + this.telefone;
		
		
	}

}
