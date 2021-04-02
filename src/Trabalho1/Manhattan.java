package Trabalho1;

public class Manhattan extends Unidade {

	public Manhattan(int id, double abscissa, double ordenada, boolean video, boolean termometro, boolean co2, boolean ch4) {
		
		super(id, abscissa, ordenada, video, termometro, co2, ch4);
	}
	
	public double locomover(double abscissa, double ordenada) {
		
		double distancia = Math.abs(abscissa - this.abscissa) + Math.abs(ordenada - this.ordenada);
		
		return distancia;
	}

}
