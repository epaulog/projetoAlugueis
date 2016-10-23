/*
 * Eden Paulo Gill
 * 
 * Linguagem de Programação II
 * 
 * Exercício Alugueis
 * 
 * Classe Apto
 * 
 */

package projetoAlugueis;

public abstract class Apto {
	
	private static float reaisPorMetroQuadrado = 10.0f;
	
	private int numero;
	private int andar;
	private float area;
	private boolean alugado;
	private Inquilino inquilino;
	
	public Apto (int _num, int _andar, int _area) {
		numero = _num;
		andar = _andar;
		area = _area;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public int getAndar() {
		return andar;
	}
	
	public float getArea() {
		return area;
	}
	
	public boolean isAlugado() {
		return alugado;
	}
	
	public Inquilino getInquilino() {
		return inquilino;
	}
	
	public float precoFinal() {
		return precoExtra() + (area * reaisPorMetroQuadrado);
	}
	
	abstract public float precoExtra();
	
	public void aluga(Inquilino _inquilino) {
		if (!alugado) {
			inquilino = _inquilino;
			alugado = true;
		} else {
			System.out.println("Apto já alugado!");
		}
	}

	public void desaluga() {
		if (alugado) {
			inquilino = null;
			alugado = false;
		} else {
			System.out.println("Apto não alugado!");
		}
	}

	@Override
	public String toString() {
		return "Apto n: " + numero + ", inquilino: " + inquilino + ", valor: " + precoFinal();
	}
	
	
	
}
