package br.com.fiap.modelo;

public class Monitor {
	private String marca;
	private int polegada;
	private String hertz;
	private double preco;
	
	// set
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setPolegada(int polegada) {
		this.polegada = polegada;
	}
	public void setHertz(String hertz ) {
		this.hertz = hertz;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	// get
	public String getMarca(){
		return marca;
	}
	public int getPolegada(){
		return polegada;
	}
	public String getHertz(){
		return hertz;
	}
	public double getPreco(){
		return preco;
	}
}
