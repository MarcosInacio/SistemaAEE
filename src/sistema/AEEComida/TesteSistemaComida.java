package sistema.AEEComida;

import sistema.AEEComida_negocio.*;

public class TesteSistemaComida {

	public static void main(String[] args) {
		Menu meuM = new Menu();
		meuM.meuMenu();
		CriteriosDePontuacao criterio = new CriteriosDePontuacao();
		criterio.setPrimeiroCriterio();
		System.out.println("Pontua��o em AEE: " + criterio.getPrimeiroCriterio());
		criterio.setSegundoCriterio();
		System.out.println("Pontua��o Pr�mio em AEE: " + criterio.getSegundoCriterio());
	}
	

}
