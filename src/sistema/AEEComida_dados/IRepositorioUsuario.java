package sistema.AEEComida_dados;

import sistema.AEEComida_negocio.Usuario;

public interface IRepositorioUsuario {
	
	void salvarCadastroUsuario(Usuario usuario);
	
	void listarUsuarios();
	
	

}
