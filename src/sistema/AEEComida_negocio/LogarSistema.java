package sistema.AEEComida_negocio;

import java.util.Scanner;

public class LogarSistema {
    public LogarSistema(){
		
	}
	Scanner input = new Scanner(System.in);
	//Menu meuM = new Menu();
	BuscarCep buscar = new BuscarCep();
	public void logarAcesso(){
		System.out.println("Digite seu login: ");
		String login = input.next();
		System.out.println("Digite sua senha: ");
		String senha = input.next();
		if(senha != null && login !=null && login != ""){
			System.out.println("Logado com sucesso!");
		}
		buscar.BuscarCEP(0);
		
		//meuM.meuMenu();
	}
}

