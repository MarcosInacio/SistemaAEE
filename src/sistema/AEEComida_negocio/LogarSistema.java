package sistema.AEEComida_negocio;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class LogarSistema {
    public LogarSistema(){
		
	}
	Scanner input = new Scanner(System.in);
	BuscarCep buscar = new BuscarCep();
	public void logarAcesso(){
		String cpf = JOptionPane.showInputDialog("Digite seu CPF");
		String senha = JOptionPane.showInputDialog("Digite sua senha");
		
		if(senha != null && cpf !=null && cpf != ""){
			buscar.BuscarCEP();
		}
		
		
		
	}
}

