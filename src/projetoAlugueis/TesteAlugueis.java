/*
 * Eden Paulo Gill
 * 
 * Linguagem de Programação II
 * 
 * Exercício Alugueis
 * 
 * Classe TesteAlugueis
 * 
 */

package projetoAlugueis;

public class TesteAlugueis {
	
	public static void main(String [] args){
		Edificio edificioPortalDoSol;
		Edificio edificioEstelar;
		
		Apto apartamento;
		
		Inquilino inquilino;
		
		edificioPortalDoSol = new Edificio();
		edificioPortalDoSol.setNome("Portal do Sol");
		
		apartamento = new AptoTipoA(101, 1, 50);
		inquilino = new Inquilino();
		inquilino.setNome("João");
		apartamento.aluga(inquilino);
		edificioPortalDoSol.adicionaApartamento(apartamento);
		
		apartamento = new AptoTipoB(102, 1, 80);
		edificioPortalDoSol.adicionaApartamento(apartamento);
		
		apartamento = new AptoTipoA(201, 2, 60);
		edificioPortalDoSol.adicionaApartamento(apartamento);
		
		apartamento = new AptoTipoB(202, 2, 90);
		edificioPortalDoSol.adicionaApartamento(apartamento);
		
		apartamento = new AptoTipoA(301, 3, 70);
		edificioPortalDoSol.adicionaApartamento(apartamento);
		
		apartamento = new AptoTipoB(302, 3, 100);
		inquilino = new Inquilino();
		inquilino.setNome("Maria");
		apartamento.aluga(inquilino);
		edificioPortalDoSol.adicionaApartamento(apartamento);
		
		
		edificioEstelar = new Edificio();
		edificioEstelar.setNome("Estelar");
		
		apartamento = new AptoTipoA(1001, 1, 50);
		edificioEstelar.adicionaApartamento(apartamento);
		
		apartamento = new AptoTipoA(1002, 1, 50);
		apartamento.aluga(inquilino);
		edificioEstelar.adicionaApartamento(apartamento);
		
		apartamento = new AptoTipoA(1003, 1, 50);
		edificioEstelar.adicionaApartamento(apartamento);
		
		
		System.out.println("----- Lista Alugados Edificio Portal do Sol -----");    
	    for (Apto ap: edificioPortalDoSol.getApartamentosAlugados()) {
	    	System.out.println(ap.toString());
	    }
	    
	    System.out.println("----- Lista Alugados Edificio Estelar -----");
	    for (Apto ap: edificioEstelar.getApartamentosAlugados()) {
	    	System.out.println(ap.toString());
	    }
		
		
	    
	    edificioPortalDoSol.alugaAptoEdificio(102, inquilino);

		System.out.println("----- Lista Alugados Edificio Portal do Sol -----");    
	    for (Apto ap: edificioPortalDoSol.getApartamentosAlugados()) {
	    	System.out.println(ap.toString());
	    }
	    
	}
}
