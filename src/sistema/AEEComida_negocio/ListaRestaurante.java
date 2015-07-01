package sistema.AEEComida_negocio;

import java.util.ArrayList;
import java.util.Scanner;
import sistema.AEEComida_dados.*;

public class ListaRestaurante {
	public ListaRestaurante(){
		
	}
	public void ListRestaurante()
	{
		/*ArrayList <String> nomesRestaurante = new ArrayList<String>();
	    nomesRestaurante.add("RestauranteZe");
	    nomesRestaurante.add("RestauranteGoodPrice");
	    nomesRestaurante.add("ComedoriaJoaquina");
	    
	    Scanner input = new Scanner(System.in);
	        
	     for(String nome: nomesRestaurante )
	     {
	         System.out.println(nome);
	     }
	     System.out.print("\n");
	     System.out.println("Escolha o restaurante que quer o cardapio");
	        
	     String nomeRestaurante = input.next();
         boolean nomeRestaurante1=false;
	        
         for(int i=0; i<nomesRestaurante.size();i++)
	     {
        	 if(nomeRestaurante.equals(nomesRestaurante.get(i)))
	         {
        		 System.out.println("O nome do restaurante eh " +nomeRestaurante);
	             nomeRestaurante1 = true;//BuscaCEP(busca);
	            // meuM.meuMenu();
	         }
	           
	     }
        if(nomeRestaurante1 == false){
        	ListRestaurante();
	    }
	        */
		RepositorioLojista repp = new RepositorioLojista();
		Lojista lojista1 = new Lojista("1223","Galvão");
		Lojista lojista2 = new Lojista("9199", "Grafitte");
		Restaurante aee = new Restaurante("ruru", "rua armindo", "palmares", "paratibe",
				"53355326", "comida francesa");
		Restaurante aeea = new Restaurante("solbrasa", "rua recife", "belem", "jpessoa", 
				"76674523", "comida italiana");
		lojista1.addRestaurante(aee);
		lojista2.addRestaurante(aeea);
		repp.salvaCadastroLojista(lojista1);
		repp.salvaCadastroLojista(lojista2);
		
		for(Lojista loj : repp.getArrayLojista()){
			for(int j = 0; j < loj.getRestaurante().size(); j++){
				System.out.println(loj.getRestaurante());
			}
			
		}
			
	        
	        
	}
}
