package sistema.AEEComida_negocio;

import java.util.Scanner;
import javax.swing.JOptionPane;
import sistema.AEEComida_dados.*;

public class LogarSistema {
    public LogarSistema(){
		
	}
	Scanner input = new Scanner(System.in);
	BuscarCep buscar = new BuscarCep();
	
	
	public void logarAcesso(){
		int opcaoAcesso ;

		opcaoAcesso = Integer.parseInt(JOptionPane.showInputDialog("Digite sua opção:\n"
				+" 1 - Logar como Usuario \n"
				+" 2 - Logar como Empresa\n"));
		switch(opcaoAcesso){
		
		case 1: 
			
			String cpf = JOptionPane.showInputDialog("Digite seu CPF: ");
			String senha = JOptionPane.showInputDialog("Digite sua senha: ");
			break;
			//RepositorioUsuario repUser =  new RepositorioUsuario();
			
		case 2:
			String cnpj = JOptionPane.showInputDialog("Digite seu CNPJ: ");
			senha = JOptionPane.showInputDialog("Digite sua senha: ");
			break;
		
		}

		
	//	if(senha != null && cpf !=null && cpf != ""){
			buscar.buscarCEP();
		}
		
		
		
	}


