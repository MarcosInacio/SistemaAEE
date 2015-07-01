package sistema.AEEComida_negocio;

import java.util.ArrayList;
import java.util.Scanner;
import sistema.AEEComida_dados.*;

public class ListaRestaurante {
	public ListaRestaurante(){
		
	}
	public void ListRestaurante()
	{
		
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
