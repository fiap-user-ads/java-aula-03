package br.com.fiap.main;

import br.com.fiap.modelo.Produto;

public class TesteProduto {
	public static void main(String[] args) {
		Produto objProduto = new Produto();
		
		// entrada
		objProduto.setTipo("celular");
		objProduto.setMarca("iphone");	
		objProduto.setQuantidade(1);	
		objProduto.setPreco(2400);	
		
		// saida
		System.out.println("Tipo: " + objProduto.getTipo() + 
							"\nMarca: " + objProduto.getMarca() +
							"\nQuantidade: " + objProduto.getQuantidade() +
							"\nPreço: R$" + objProduto.getPreco());
	}
}
