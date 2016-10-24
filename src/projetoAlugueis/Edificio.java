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
	
	public void alugaAptoEdificio(int _numero, Inquilino _inquilino) {
		boolean existe = false;
		for (Apto ap: listaAptos) {
	    	if (ap.getNumero() == _numero) {
	    		ap.aluga(_inquilino);
	    		existe = true;
	    	}
	    }
		if (!existe) {
			System.out.println("Apto " + _numero + " não existe no Edificio " + nome);
		}
	}

	public void desalugaAptoEdificio(int _numero, Inquilino _inquilino) {
		boolean existe = false;
		for (Apto ap: listaAptos) {
	    	if (ap.getNumero() == _numero) {
	    		ap.desaluga();
	    		existe = true;
	    	}
	    }
		if (!existe) {
			System.out.println("Apto " + _numero + " não existe no Edificio " + nome);
		}
	}
	
	
}
