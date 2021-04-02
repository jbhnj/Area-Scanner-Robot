package Trabalho1;

public abstract class Unidade {
	
	int id;
	double abscissa;
	double ordenada;
	boolean video;
	boolean termometro;
	boolean co2;
	boolean ch4;
	
	public Unidade(int id, double abcissa, double ordenada, boolean video, boolean termometro, boolean co2, boolean ch4) {
		
		this.id = id;
		this.abscissa = abcissa;
		this.ordenada = ordenada;
		this.video = video;
		this.termometro = termometro;
		this.co2 = co2;
		this.ch4 = ch4;
	}

	public int getId() {
		
		return this.id;
	}
	
	protected void setId(int id) {
		
		this.id = id;
	}

	public double getAbscissa() {
		
		return abscissa;
	}

	protected void setAbscissa(float abcissa) {
		
		this.abscissa = abcissa;
	}

	public double getOrdenada() {
		
		return ordenada;
	}

	protected void setOrdenada(float ordenada) {
		
		this.ordenada = ordenada;
	}

	public boolean isVideo() {
		
		return video;
	}

	protected void setVideo(boolean video) {
		
		this.video = video;
	}

	public boolean isTermometro() {
		
		return termometro;
	}

	protected void setTermometro(boolean termometro) {
		
		this.termometro = termometro;
	}

	public boolean isCo2() {
		
		return co2;
	}

	protected void setCo2(boolean co2) {
		
		this.co2 = co2;
	}

	public boolean isCh4() {
		
		return ch4;
	}

	protected void setCh4(boolean ch4) {
		
		this.ch4 = ch4;
	}

	public boolean contem( boolean video, boolean termometro, boolean co2, boolean ch4) {
		
		if(video)
			
			if(this.isVideo()!= video)
				
				return false;
		
		if(termometro)
			
			if(this.isTermometro()!=termometro)
				
				return false;
		
		if(co2)
			
			if(this.isCo2()!=co2)
				
				return false;
		
		if(ch4)
			
			if(this.isCh4()!=ch4)
				
				return false;
		
		return true;
		
	}
	
	public abstract double locomover(double abscissa, double ordenada);

	public void mudarPosicao(float abscissa, float ordenada) {
		
		this.setAbscissa(abscissa);
		this.setOrdenada(ordenada);
	}
	
}