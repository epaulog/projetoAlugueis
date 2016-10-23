/*
 * Eden Paulo Gill
 * 
 * Linguagem de Programação II
 * 
 * Exercício Alugueis
 * 
 * Classe AptoTipoB
 * 
 */
package projetoAlugueis;

public class AptoTipoB extends Apto {
	
	public AptoTipoB(int _num, int _andar, int _area) {
		super(_num, _andar, _area);
	}

	public float precoExtra() {
		if (getAndar() == 1)
			return 200.0f;
		else
			return 0;
	};
}
