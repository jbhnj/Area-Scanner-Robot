package Run;

import javax.swing.JFrame;

import InterfaceGrafica.TelaPrincipal;
import Trabalho1.Sistema;

public class APP {

	public static void main(String[] args) throws Exception {
		
		//Sistema sistema = new Sistema();
					
		//sistema.addManhattan(1, 5, 4, true, true, true, true);
		//sistema.addEuclidiana(2, 5, 4, false, true, false, false);
		//sistema.addEuclidiana(3, 1, 4, false, false, true, false);
		//sistema.addEuclidiana(4, 1, 3, false, false, true, false);
		
		//System.out.println(sistema.monitorar(10, 10, false, true, false, false));
		
		JFrame telaprincipal = new TelaPrincipal();
		telaprincipal.setVisible(true);
	}

}
