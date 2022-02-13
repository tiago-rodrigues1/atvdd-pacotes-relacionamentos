/*
 * Gabrielly Beatriz
 * Tiago Rodrigues 
*/

package br.edu.ifrn.peoo.atividade02;

public class Dependente {
	private String nome;
	private int idade;
	
	public Dependente(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		
		str.append("  > Nome: " + this.nome + "\n");
		str.append("  > Idade: " + this.idade + "\n");
		
		return str.toString();
	}
	
	
}
