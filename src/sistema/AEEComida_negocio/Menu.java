package sistema.AEEComida_negocio;

import java.util.Scanner;
import sistema.AEEComida_dados.*;

public class Menu {
public Menu(){
		
	}
	public void meuMenu(){
		RepositorioUsuario repo = new RepositorioUsuario();
		Usuario user = new Usuario();
		Lojista loj = new Lojista();
		BuscarCep cep = new BuscarCep();
		LogarSistema logar = new LogarSistema();
		ExitSistema saida = new ExitSistema();
	/*	System.out.println("\tAEE! COMIDA\n");
		System.out.println("1- Cadastrar usuário");
		System.out.println("2- Cadastrar Lojista");
		System.out.println("3- Buscar por CEP");
		System.out.println("4- Logar no sistema");
		System.out.println("5- Exit do sistema"); */
		System.out.println(this); 
		int var;
		Scanner input = new Scanner(System.in);
		System.out.println("Digite sua opção: ");
		var = input.nextInt();
		
		while(var < 1 || var > 5)
		{
			System.out.println("Numero invalido!");
			System.out.println("Digite o numero novamente: ");
			var = input.nextInt();
		}
		switch(var)
		{
		
		case 1 :
			user.cadastrarUsuario();
			
			repo.salvarCadastroUsuario(user);
			break;
	
		case 2:
		
			loj.cadastraLojista();
			break;
			
		case 3:
			cep.BuscarCep(var);
			break;
			
		case 4:
			logar.logarAcesso();
			break;
		
		case 5:
			saida.ExitSaida();
	    }
		
		input.close();
	}
	
	public String toString(){   // toString para o menu
		return "\tAEE! COMIDA\n" + "\n1- Cadastrar usuário" +
				"\n2- Cadastrar Lojista" + "\n3- Buscar por CEP" + "\n4- Logar no sistema" +
				"\n5- Exit do sistema";
				
	}
}

