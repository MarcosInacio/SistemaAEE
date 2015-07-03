package sistema.AEEComida_GUI;

import sistema.AEEComida_dados.*;

public class Controlador {
	
	private RepositorioLojista repositorioLojistas;
	private RepositorioUsuario repositorioUsuarios;
	
	public Controlador(){
		
		this.repositorioLojistas = new RepositorioLojista();
		this.repositorioUsuarios = new RepositorioUsuario();
		
	}

	public RepositorioLojista getRepositorioLojistas() {
		return repositorioLojistas;
	}

	public RepositorioUsuario getRepositorioUsuarios() {
		return repositorioUsuarios;
	}
	
	

}
