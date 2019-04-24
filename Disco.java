package ar.edu.unlam.pb2.disco;

public class Disco {
	
	private Double radioInterior;
	private Double radioExterior;
	private final static Double PI=3.14;
	
	public Disco(Double radioInterior, Double radioExterior) {
		this.radioExterior= radioExterior;
		this.radioInterior = radioInterior;
	}
	
	
	public Double calcularPerimetroInterior() {
		return 2*PI*radioInterior; 
	}
	
	public Double calcularPerimetroExterior() {
		return 2*PI*radioExterior; 
	}
	
	public Double calcularSuperficie() {
		return (PI*radioExterior*radioExterior)- (PI*radioInterior*radioInterior);
	}


	public Double getRadioInterior() {
		return radioInterior;
	}


	public void setRadioInterior(Double radioInterior) {
		this.radioInterior = radioInterior;
	}


	public Double getRadioExterior() {
		return radioExterior;
	}


	public void setRadioExterior(Double radioExterior) {
		this.radioExterior = radioExterior;
	}
	
}
