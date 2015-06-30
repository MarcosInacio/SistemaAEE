package sistema.AEEComida;

import sistema.AEEComida_negocio.*;

public class TesteSistemaComida {

	public static void main(String[] args) {
		Menu meuM = new Menu();
		meuM.meuMenu();
		CriteriosDePontuacao criterio = new CriteriosDePontuacao();
		criterio.setPrimeiroCriterio();
		System.out.println("Pontuação em AEE: " + criterio.getPrimeiroCriterio());
		criterio.setSegundoCriterio();
		System.out.println("Pontuação Prêmio em AEE: " + criterio.getSegundoCriterio());
	}
	

}
