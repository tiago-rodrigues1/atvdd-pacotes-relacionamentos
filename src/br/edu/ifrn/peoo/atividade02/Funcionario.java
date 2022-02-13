/*
 * Gabrielly Beatriz
 * Tiago Rodrigues 
*/

package br.edu.ifrn.peoo.atividade02;

public class Funcionario {
	private String matricula;
	private String nome;
	private double salario;
	private Dependente dependente;
	
	public Funcionario() {
		
	}
	
	public String getMatricula() {
		return this.matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getSalario() {
		return this.salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public Dependente getDependente() {
		return this.dependente;
	}
	
	public void setDependente(Dependente dp) {
		this.dependente = dp;
	}
}
