package sistema.AEEComida_dados;

import sistema.AEEComida_negocio.*;

public class RepositorioUsuario {
	private int proxima;
	private	Usuario[] array;
	
public RepositorioUsuario(int tam){
		
		this.array = new Usuario[tam];   // instancia do array recebendo o tamanho como parâmetro
		this.proxima = 0;
		
		System.out.println("huehuehue");
	}
	Menu meuM = new Menu();
	int n=0;
	public void salvarCadastroUsuario(Usuario usuario)
	{
			if(this.proxima < (this.array).length){
		/*    array[n] = usuario;
		    array[n+1] = array[n-1];
			array[n-1] = array[n];
			array[n]= array[n+1];
			
			System.out.println("\nTamanho da lista: " + array.length);
			array[n] = null;
			listarUsuarios();
			System.out.println("\n\n");
			//user.cadastrarUsuario();
			//System.out.println("\n\n"); */
				
			this.array[proxima] = usuario;
			this.proxima = this.proxima + 1;
			System.out.println(usuario);
			
			}
			else
			{
				System.out.println("Não!\n");
				array[n] = usuario;
				System.out.println("\nTamanho da lista: " + array.length);
				listarUsuarios();
				System.out.println("\n\n");
				
			}
			n=n+1;
		//	meuM.meuMenu();
     }
	public void listarUsuarios()
	{
		for (Usuario usuario : array) 
		{
			System.out.println(usuario);
		}
		
	}
	//public
	

}
