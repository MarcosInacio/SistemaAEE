package sistema.AEEComida_GUI;

import java.util.Scanner;

import sistema.AEEComida_negocio.Lojista;
import sistema.AEEComida_negocio.Usuario;

import javax.swing.JOptionPane;

import sistema.AEEComida_dados.*;

public class LogarSistema {
    public LogarSistema(){
		
	}
	Scanner input = new Scanner(System.in);
	BuscarCep buscar = new BuscarCep();
	
	
	public void logarAcesso(Controlador controler){
		int opcaoAcesso ;

		opcaoAcesso = Integer.parseInt(JOptionPane.showInputDialog("Digite sua opção:\n"
				+" 1 - Logar como Usuario \n"
				+" 2 - Logar como Empresa\n"));
		switch(opcaoAcesso){
		
		case 1: 
			
			String cpf = JOptionPane.showInputDialog("Digite seu CPF: ");
			String senha = JOptionPane.showInputDialog("Digite sua senha: ");
			
			for(Usuario us : controler.getRepositorioUsuarios().getUsuarios()){
				
				if(cpf.equals(us.getCpf())== true && senha.equals(us.getPassword())== true)
						JOptionPane.showMessageDialog(null, "Logado com sucesso!");
				else
					JOptionPane.showMessageDialog(null, "Erro!");
			}
			buscar.buscarCEP();
			break;
			//RepositorioUsuario repUser =  new RepositorioUsuario();
			
						
		case 2:
			String cnpj = JOptionPane.showInputDialog("Digite seu CNPJ: ");
			senha = JOptionPane.showInputDialog("Digite sua senha: ");
			
			for(Lojista l : controler.getRepositorioLojistas().getArrayLojista() ){
				
				if(cnpj.equals(l.getCnpj())== true && senha.equals(l.getSenha())== true){
					
					JOptionPane.showMessageDialog(null, "Logado com sucesso!");
					
				}else{ 
					JOptionPane.showMessageDialog(null, "Erro!");
				}
				
			}
			buscar.buscarCEP();
			break;
		
		}

		
	//	if(senha != null && cpf !=null && cpf != ""){
		
		}
		
		
		
	}


