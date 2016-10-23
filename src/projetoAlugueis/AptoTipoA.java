/*
 * Eden Paulo Gill
 * 
 * Linguagem de Programação II
 * 
 * Exercício Alugueis
 * 
 * Classe Edificio
 * 
 * Inicial
 * 
 */
package projetoAlugueis;

public class AptoTipoA extends Apto {
	
	public AptoTipoA(int _num, int _andar, int _area) {
		super(_num, _andar, _area);
	}

	public float precoExtra() {
		return (getAndar() * 100);
	};
}
