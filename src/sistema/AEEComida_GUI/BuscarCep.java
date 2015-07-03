package sistema.AEEComida_GUI;

import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.jsoup.nodes.Element;
import org.jsoup.HttpStatusException;

import java.net.SocketTimeoutException;
import java.io.IOException;

import javax.swing.JOptionPane;

public class BuscarCep {
	Scanner scanner = new Scanner(System.in);
	
	public BuscarCep()
	{
	
	}
	Menu meuM = new Menu();
	public void buscarCEP() 
	{
	
		String numBusca = JOptionPane.showInputDialog("Informe o seu CEP");
		ListaRestaurante listaR = new ListaRestaurante();
		
		
		try{

	        Document doc = Jsoup.connect("http://www.qualocep.com/busca-cep/"+numBusca)
	                  .timeout(120000)
	                  .get();
	//        Elements urlPesquisa = doc.select("span[itemprop=streetAddress]");
	        
	         if(doc.getElementsByTag("td").isEmpty())
	        	 JOptionPane.showMessageDialog(null, "CEP inválido");
	         else 
	        	 JOptionPane.showMessageDialog(null, doc.getElementsByAttributeValue("itemprop", "streetAddress").text() + 
	        			 "\n" + doc.getElementsByTag("td").get(2).text());
	         listaR.ListRestaurante();
	         
	         //addressLocality retornaria a cidade	
	         //addressRegion retornaria o UF
	        

	        } catch (SocketTimeoutException e) {
	        	JOptionPane.showMessageDialog(null, "Não foi possivel efetuar a operação",
	        			"Erro!", JOptionPane.INFORMATION_MESSAGE);
				meuM.meuMenu();

	        } catch (HttpStatusException w) {
	        	JOptionPane.showMessageDialog(null, "Não foi possivel efetuar a operação",
	        			"Erro!", JOptionPane.INFORMATION_MESSAGE);
				meuM.meuMenu();
				
	        }catch(IOException c){
	        	JOptionPane.showMessageDialog(null, "Não foi possivel efetuar a operação",
	        			"Erro!", JOptionPane.INFORMATION_MESSAGE);
				meuM.meuMenu();
	        }
		
	}
	
	
	
}
