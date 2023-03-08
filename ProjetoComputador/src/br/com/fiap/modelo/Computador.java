package br.com.fiap.modelo;

public class Computador {
	private String marcaPc;
	private Monitor monitor;
	private double precoPc;
	
	// set
	public void setMarcaPc(String marcaPc) {
		this.marcaPc = marcaPc;
	}
	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}
	public void setPrecoPc(double precoPc) {
		this.precoPc = precoPc;
	}
	
	// get
	public String getMarcaPc(){
		return marcaPc;
	}
	public Monitor getMonitor(){
		return monitor;
	}
	public double getPrecoPc(){
		return precoPc;
	}
}
