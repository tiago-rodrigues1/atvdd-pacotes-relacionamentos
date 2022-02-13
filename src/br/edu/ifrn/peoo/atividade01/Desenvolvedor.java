/*
 * Gabrielly Beatriz
 * Tiago Rodrigues 
*/

package br.edu.ifrn.peoo.atividade01;

public class Desenvolvedor {
	
	private String nome;
	private double salario;
	
	public Desenvolvedor() { 
		
	}
	
	public Desenvolvedor (String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double getSalario() {
		return salario;
	}
	
	@Override
	public String toString() {
		return "Desenvolvedor: " + this.nome + " salario: " + this.salario;
	}
	
}
