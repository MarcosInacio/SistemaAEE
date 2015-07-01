package sistema.AEEComida_negocio;

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
	private String busca;
	
	public BuscarCep()
	{
	
	}
	Menu meuM = new Menu();
	public void BuscarCEP() 
	{
		System.out.println("\nDigite seu CEP com 8 numeros para sabermos sua localidade: ");
		String numBusca = scanner.next();
		ListaRestaurante listaR = new ListaRestaurante();
		
		
		try{

	        Document doc = Jsoup.connect("http://www.qualocep.com/busca-cep/"+numBusca)
	                  .timeout(120000)
	                  .get();
	//        Elements urlPesquisa = doc.select("span[itemprop=streetAddress]");
	        
	         System.out.println(doc.getElementsByAttributeValue("itemprop", "streetAddress").text());
	         System.out.println(doc.getElementsByTag("td").get(2).text());
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
	        	//listaR.ListRestaurante();
	        }
		
	}
	
	
	
}
