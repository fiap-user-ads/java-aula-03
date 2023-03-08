package br.com.fiap.main;

import br.com.fiap.modelo.Computador;
import br.com.fiap.modelo.Monitor;

public class TesteComputador {
	public static void main(String[] args) {
		Computador objComputador = new Computador();
		Monitor objMonitor = new Monitor();
		
		// entrada
		objComputador.setMarcaPc("dell");
		objComputador.setMonitor(objMonitor);	
		objComputador.setPrecoPc(4000);	
		
		objMonitor.setMarca("LG");
		objMonitor.setPolegada(32);
		objMonitor.setHertz("75hz");
		objMonitor.setPreco(750);
		
		// saida
		System.out.println("Marca do PC: " + objComputador.getMarcaPc() + 
							"\nPreço do PC: R$" + objComputador.getPrecoPc() +
							"\nMarca do Monitor: " + objComputador.getMonitor().getMarca() + 
							"\nPolegada do Monitor: " + objComputador.getMonitor().getPolegada() +
							"\nHeartz do Monitor: " + objComputador.getMonitor().getHertz() +
							"\nPreço do Monitor: R$" + objComputador.getMonitor().getPreco());
	}
}
