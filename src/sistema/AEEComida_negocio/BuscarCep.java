package sistema.AEEComida_negocio;

import java.util.ArrayList;
import java.util.Scanner;

public class BuscarCep {
	Scanner scanner = new Scanner(System.in);
	private int busca;
	public BuscarCep()
	{
		busca=0;
	}
	Menu meuM = new Menu();
	public void BuscarCEP(int numBusca)
	{
		System.out.println("\nDigite seu CEP com 8 numeros para sabermos sua localidade: ");
		numBusca = scanner.nextInt();
		busca = numBusca;
		if(busca>=0 && busca<99999999)
		{
			System.out.println("CEP localizado com sucesso!");
			ListRestaurante();
		}
		else
		{
			BuscarCEP(busca);
		}
	}
	public void ListRestaurante()
	{
		ArrayList <String> nomesRestaurante = new ArrayList<String>();
	        nomesRestaurante.add("RestauranteZe");
	        nomesRestaurante.add("RestauranteGoodPrice");
	        nomesRestaurante.add("ComedoriaJoaquina");
	        
	        for(String nome: nomesRestaurante )
	        {
	            System.out.println(nome);
	            
	        }
	        System.out.print("\n");
	        System.out.println("Escolha o restaurante que quer o cardapio");
	        
	        String nomeRestaurante = scanner.next();
	        boolean nomeRestaurante1=false;
	        
	        for(int i=0; i<nomesRestaurante.size();i++)
	        {
	            if(nomeRestaurante.equals(nomesRestaurante.get(i)))
	            {
	                System.out.println("O nome do restaurante eh " +nomeRestaurante);
	                nomeRestaurante1 = true;//BuscaCEP(busca);
	                meuM.meuMenu();
	            }
	            
	        }
	        if(nomeRestaurante1 == false){
	        	ListRestaurante();
	        }
	        
	        
	        
	}
}

