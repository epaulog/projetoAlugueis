/*
 * Eden Paulo Gill
 * 
 * Linguagem de Programação II
 * 
 * Exercício Alugueis
 * 
 * Classe Edificio
 * 
 */

package projetoAlugueis;

import java.util.List;
import java.util.ArrayList;

public class Edificio {

	private String nome;
	private List<Apto> listaAptos = new ArrayList<Apto>();
	
	public void setNome(String _nome) {
		nome = _nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void adicionaApartamento(Apto a) {
		listaAptos.add(a);
	}
	
	public List<Apto> getApartamentosAlugados() {
		List<Apto> listaAlugados = new ArrayList<Apto>();
		
		for (Apto ap: listaAptos) {
	    	if (ap.isAlugado()) {
	    		listaAlugados.add(ap);
	    	}
	    }
		
		return listaAlugados;
	}
}
