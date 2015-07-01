package sistema.AEEComida_negocio;

import java.util.Scanner;
import sistema.AEEComida_dados.*;


public class Menu {
	public Menu(){
		
	}
	public void meuMenu(){
		
		Scanner input = new Scanner(System.in);
		
		RepositorioUsuario repo = new RepositorioUsuario();
		Usuario user = new Usuario();
		Lojista loj = new Lojista();
		BuscarCep cep = new BuscarCep();
		LogarSistema logar = new LogarSistema();
		
		System.out.println(this); 
		int var=0;
		
		System.out.println("Digite sua opção: ");
		var = input.nextInt();
		
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
			cep.BuscarCEP();
			break;
			
		case 4:
			logar.logarAcesso();
			break;
		
		case 5:
			
			break;
		default: 
			meuMenu();
	    }
		
		input.close();
	}
	
	public String toString(){   // toString para o menu
		return "\tAEE! COMIDA\n" + "\n1- Cadastrar usuário" +
				"\n2- Cadastrar Lojista" + "\n3- Buscar por CEP" + "\n4- Logar no sistema" +
				"\n5- Exit do sistema";
				
	}
}

