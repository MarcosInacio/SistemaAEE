package sistema.AEEComida_dados;

import java.util.ArrayList;

import sistema.AEEComida_negocio.*;

public class RepositorioUsuario implements IRepositorioUsuario {

	private	ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
	

	public RepositorioUsuario(){}
	
	Menu meuM = new Menu();
	int n=0;
	
	@Override
	public void salvarCadastroUsuario(Usuario usuario)
	{
			if(usuario != null){
		
				this.usuarios.add(usuario);
				
				System.out.println(usuario);
			
			
			}
			else
			{
				System.out.println("N�o!\n");
				listarUsuarios();
				System.out.println("\n\n");
				
			}
			n=n+1;
		//	meuM.meuMenu();
     }
	
	@Override
	public void listarUsuarios(){
		
		for (Usuario usuario : usuarios) 
		{
			System.out.println(usuario);
		}
		
	}
	//public
	

}
