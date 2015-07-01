package sistema.AEEComida_negocio;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lojista {
	private String cnpj;
	private String nome;
	private String senha;
	private ArrayList<Restaurante> restaurante = new ArrayList<Restaurante>();
	private int saldo;
	
	
	public Lojista(){}
	
	public Lojista(String cnpj, String nome)
	{
		
		this.cnpj = cnpj;
		this.nome = nome;
		
		
	}
	
	MenuLojista menu = new MenuLojista();
	public String getCnpj() 
	{
		return cnpj;
	}
	
	public int getSaldo() 
	{
		System.out.println();
		Random g = new Random();
		return g.nextInt(1001);
		
	}


	public void setSaldo(int saldo) 
	{
		this.saldo = saldo;
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
		System.out.println("Informe o seu CNPJ: ");
		Lojista dono = new Lojista();
		
		Scanner sc = new Scanner(System.in);
		a = sc.nextLine();
		dono.setCnpj(a);
		System.out.println("Informe o nome do restaurante: ");
		a = sc.nextLine();
		dono.setNome(a);
		
		if(dono.getSaldo()> 50)
		{
			System.out.println("Teje cadastrado!");
			System.out.print("Crie sua senha: ");
			a = sc.nextLine();
			dono.setSenha(a);
			loj.add(dono);
			logar(loj);
		}
		else
		{
			System.out.println("Saldo menor que a constante do servico!!");
			//repositorioNomes();
			
		}
		sc.close();
	}
	
    public void logar(ArrayList<Lojista> arr)
    {
		
		String a;
		String b;
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Acesse o sistema: \n");
		System.out.println("Digite o Nome Do Restaurante para logar: ");
		a = scan.nextLine();
		System.out.println("Senha: ");
		b = scan.nextLine(); 
		
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
	
}
