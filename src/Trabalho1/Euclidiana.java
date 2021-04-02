package Trabalho1;

public class Euclidiana extends Unidade{

	public Euclidiana(int id, double abscissa, double ordenada, boolean video, boolean termometro, boolean co2, boolean ch4) {
		
		super(id, abscissa, ordenada, video, termometro, co2, ch4);
	}
	
	public double locomover(double abscissa, double ordenada) {
		
		double distancia = Math.sqrt((Math.pow(abscissa - this.abscissa, 2)) + (Math.pow(ordenada - this.ordenada, 2)));
		
		return distancia;
	}

}
