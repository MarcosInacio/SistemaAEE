package sistema.AEEComida_negocio;

import java.util.Scanner;
import sistema.AEEComida_dados.*;
import javax.swing.JOptionPane;
import java.lang.NumberFormatException;


public class Menu {
	public Menu(){
		
	}
	public void meuMenu() throws NumberFormatException{
		
		Scanner input = new Scanner(System.in);
		
		RepositorioUsuario repo = new RepositorioUsuario();
		Usuario user = new Usuario();
		Lojista loj = new Lojista();
		BuscarCep cep = new BuscarCep();
		LogarSistema logar = new LogarSistema();
		
		int var=0;
		
		try{
			var = Integer.parseInt(JOptionPane.showInputDialog(this.toString()));
		}catch(NumberFormatException ex){
			JOptionPane.showMessageDialog(null, "Erro \nApenas números são aceitos");
			
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

