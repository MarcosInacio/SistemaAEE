package sistema.AEEComida_dados;

import sistema.AEEComida_GUI.Restaurante;
import sistema.AEEComida_negocio.Lojista;

import java.io.Serializable;
import java.util.ArrayList;


public class RepositorioLojista implements IRepositorioLojista, Serializable {

	ArrayList<Lojista> arrayLojista = new ArrayList<Lojista>();
	
	public RepositorioLojista(){}
	
	public ArrayList<Lojista> getArrayLojista(){
		
		return arrayLojista;
	}
	
	
	@Override
	public void salvaCadastroLojista(Lojista lojista){
		
		if(lojista != null)
			(this.arrayLojista).add(lojista);
		
	}
	
//	public void excluiCadastroLojista(String loj)
	
}
