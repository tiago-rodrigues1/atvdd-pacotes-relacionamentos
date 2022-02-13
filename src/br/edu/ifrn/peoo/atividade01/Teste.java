/*
 * Gabrielly Beatriz
 * Tiago Rodrigues
 * 
 * Tipo de relacionamento: Agregação
 * Multiplicidade: mínimo: 0 e máximo: muitos
*/
package br.edu.ifrn.peoo.atividade01;

public class Teste {
	
	public static void main(String[] args) {
		Projeto prj = new Projeto(01, "janela");
		Desenvolvedor g1 = new Desenvolvedor ();
		g1.setNome("Gaby");
		g1.setSalario(1100);
		
		prj.adicionar(g1);
		
		System.out.println("Projeto: " + prj.getNome() + " Código: " + prj.getCodigo());
		System.out.println(g1.toString());
	}
}
