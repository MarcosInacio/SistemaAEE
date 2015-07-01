package sistema.AEEComida_negocio;

import java.util.Scanner;

public class MenuLojista {
	
	
	public void opcoes(){
		
		System.out.println(this);
		Scanner input = new Scanner(System.in);
        int var=0;
		
		System.out.println("Digite sua opção: ");
		var = input.nextInt();
		
		switch(var){
		
		case 1:
			cadastrarPrato();
			break;
		case 2:
			//cadastrarRestaurante(null);
			break;
		case 3: 
			alterarPrato();
			break;
		case 4:
			excluirPrato();
			break;
		default:
			opcoes();
		}
		
		input.close();
	}
	

	/*public void cadastrarRestaurante(Lojista loj){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o nome do restaurante");
		sc.next();
		loj.
		
		
	}*/
	public void cadastrarPrato(){
		String p;
		double c;
		Scanner input = new Scanner(System.in);
		Prato pr = new Prato();
		
		
		System.out.println("Nome do prato: ");
		p = input.nextLine();
		pr.setNome(p);
		System.out.println("Descrição: ");
		p = input.nextLine();
		pr.setDescricao(p);
		System.out.println("Preço do prato: ");
		c = input.nextDouble();
		pr.setPreco(c);
		
		
		System.out.println(pr);
		
		
		input.close();
	}
	
	
	
	public void alterarPrato(){
		
	}
	public void excluirPrato(){
		
	}
	
	@Override
	public String toString(){
		
		return "1- Cadastrar Prato\n" + "2- Cadastrar novo restaurante\n" +
				"3- Alterar Prato\n" + "4- Excluir Prato";
		
	}
	
	
	
}
