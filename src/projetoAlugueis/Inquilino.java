/*
 * Eden Paulo Gill
 * 
 * Linguagem de Programação II
 * 
 * Exercício Alugueis
 * 
 * Classe Inquilino
 * 
 */
package projetoAlugueis;

public class Inquilino {
	private String nome;
	
	public void setNome(String _nome) {
		nome = _nome;
	}
	
	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return nome;
	}

}
