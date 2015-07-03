package sistema.AEEComida_negocio;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

import sistema.AEEComida_dados.*;

public class ListaRestaurante {
	public ListaRestaurante(){
		
	}
	public void ListRestaurante()
	{
		
		RepositorioLojista repp = new RepositorioLojista();
		Lojista lojista1 = new Lojista("1223","Galvão");
		Lojista lojista2 = new Lojista("9199", "Grafitte");
		Restaurante aee = new Restaurante("Restaurante Recife\n", "Rua Armindo Morais\n", "Cidade Palmares\n",
				"Bairro Paratibe\n", "Telefone: 53355326\n", "Culinaria: comida francesa\n");
		Restaurante aeea = new Restaurante("Restaurante Solbrasa\n", "Rua Recife\n", "Cidade Belem\n",
			    "Bairro Joao Candido\n", "Telefone: 76674523\n", "Culinaria: comida italiana\n");
		lojista1.addRestaurante(aee);
		lojista2.addRestaurante(aeea);
		repp.salvaCadastroLojista(lojista1);
		repp.salvaCadastroLojista(lojista2);
		
		for(Lojista loj : repp.getArrayLojista()){
			for(int j = 0; j < loj.getRestaurante().size(); j++){
				JOptionPane.showInputDialog(loj.getRestaurante());
			}
		
		}
		Menu menu = new Menu();
	    menu.meuMenu();	
	        
	        
	}
}
