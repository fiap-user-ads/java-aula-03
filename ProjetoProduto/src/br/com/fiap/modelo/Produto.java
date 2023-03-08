package br.com.fiap.modelo;

public class Produto {
	private String tipo;
	private String marca;
	private int quantidade;
	private double preco;
	
	// set
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setQuantidade(int quantidade ) {
		this.quantidade = quantidade;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	// get
	public String getTipo(){
		return tipo;
	}
	public String getMarca(){
		return marca;
	}
	public int getQuantidade(){
		return quantidade;
	}
	public double getPreco(){
		return preco;
	}
}
