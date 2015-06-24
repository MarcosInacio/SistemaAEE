package sistema.AEEComida_dados;

import sistema.AEEComida_negocio.Lojista;
import java.util.ArrayList;


public class RepositorioLojista implements IRepositorioLojista {

	ArrayList<Lojista> arrayLojista = new ArrayList<Lojista>();
	
	public RepositorioLojista(){}
	
	@Override
	public void salvaCadastroLojista(Lojista lojista){
		
		if(lojista != null)
			(this.arrayLojista).add(lojista);
		
	}
	
//	public void excluiCadastroLojista(String loj)
	
}
