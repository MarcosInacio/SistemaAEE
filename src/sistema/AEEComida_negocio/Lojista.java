package sistema.AEEComida_negocio;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

import javax.swing.JOptionPane;

public class Lojista {
	private String cnpj;
	private String nome;
	private String senha;
	private ArrayList<Restaurante> restaurante;


	public Lojista(){}
	
	public Lojista(String cnpj, String nome)
	{
		
		this.cnpj = cnpj;
		this.nome = nome;
		restaurante = new ArrayList<Restaurante>();
		
		
	}
	
	
	
	public ArrayList<Restaurante> getRestaurante() {
		return restaurante;
	}



	MenuLojista menu = new MenuLojista();
	
	public String getCnpj() 
	{
		return cnpj;
	}

	public void setCnpj(String cnpj) 
	{
		this.cnpj = cnpj;
	}
	
	public String getNome() 
	{
		return nome;
	}
	
	public void setNome(String nome) 
	{
		this.nome = nome;
	}

	public String getSenha() 
	{
		return senha;
	}
	
	
	public void setSenha(String senha) 
	{
		this.senha = senha;
	}
  
	
	public void addRestaurante(Restaurante restaurante){
		
		(this.restaurante).add(restaurante);
		
	}
	
	
	public void cadastraLojista()
    {
		ArrayList<Lojista> loj = new ArrayList<Lojista>(); 
		
		String a;
		
		do{
			a = JOptionPane.showInputDialog("Informe seu CNPJ");
		}while(a.length()==0 || isCNPJ(a)== false);
			
		this.setCnpj(a);
		
		do{
			a = JOptionPane.showInputDialog("Informe o nome do restaurante");
		}while(a.length()==0);
		
		this.setNome(a);

		  a = JOptionPane.showInputDialog("Crie a senha: ");
		this.setSenha(a);
		loj.add(this);
		logar(loj);
		
	}
	
    public void logar(ArrayList<Lojista> arr)
    {
		
		
		Scanner scan = new Scanner(System.in);
		
		//System.out.println("Acesse o sistema: \n");
		//System.out.println("Digite o Nome Do Restaurante para logar: ");
		String a = JOptionPane.showInputDialog("Digite o nome do Restaurante para logar: ");
		String b = JOptionPane.showInputDialog("Senha: ");
		
		for(int i=0; i< arr.size(); i++)
		{
			
			if(a.equals(arr.get(i).getNome()) && b.equals(arr.get(i).getSenha()))
			{
				System.out.println("Bem-vindo! *logado como " + arr.get(i).getNome() + "*");
			}
			else
			{
				System.out.println("Dados incorretos");
				logar(arr);
			}
			
		}
		menu.opcoes();
		scan.close();
	}
    

    	  public static boolean isCNPJ(String CNPJ) {
    
    	    if (CNPJ.equals("00000000000000") || CNPJ.equals("11111111111111") ||
    	        CNPJ.equals("22222222222222") || CNPJ.equals("33333333333333") ||
    	        CNPJ.equals("44444444444444") || CNPJ.equals("55555555555555") ||
    	        CNPJ.equals("66666666666666") || CNPJ.equals("77777777777777") ||
    	        CNPJ.equals("88888888888888") || CNPJ.equals("99999999999999") ||
    	       (CNPJ.length() != 14))
    	       return(false);

    	    char dig13, dig14;
    	    int sm, i, r, num, peso;

    	      sm = 0;
    	      peso = 2;
    	      for (i=11; i>=0; i--) {
    	        num = (int)(CNPJ.charAt(i) - 48);
    	        sm = sm + (num * peso);
    	        peso = peso + 1;
    	        if (peso == 10)
    	           peso = 2;
    	      }

    	      r = sm % 11;
    	      if ((r == 0) || (r == 1))
    	         dig13 = '0';
    	      else dig13 = (char)((11-r) + 48);

    	      sm = 0;
    	      peso = 2;
    	      for (i=12; i>=0; i--) {
    	        num = (int)(CNPJ.charAt(i)- 48);
    	        sm = sm + (num * peso);
    	        peso = peso + 1;
    	        if (peso == 10)
    	           peso = 2;
    	      }

    	      r = sm % 11;
    	      if ((r == 0) || (r == 1))
    	         dig14 = '0';
    	      else dig14 = (char)((11-r) + 48);

    	      if ((dig13 == CNPJ.charAt(12)) && (dig14 == CNPJ.charAt(13)))
    	         return(true);
    	      else return(false);
    	  
    	  }

}

