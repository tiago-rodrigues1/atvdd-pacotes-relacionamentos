/*
 * Gabrielly Beatriz
 * Tiago Rodrigues 
*/

package br.edu.ifrn.peoo.atividade01;

import java.util.ArrayList;

public class Projeto {
	
	private int codigo;
	private String nome;
	private ArrayList<Desenvolvedor> desenvolvedores;
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;	
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void adicionar(Desenvolvedor d) {
		this.desenvolvedores.add(d);
	}
	
	public ArrayList<Desenvolvedor> getDesenvolvedor (){
		return desenvolvedores;
	}
	
	public Projeto() {
		desenvolvedores = new ArrayList <Desenvolvedor>();
	}
	
	public Projeto (int codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
		this.desenvolvedores = new ArrayList <Desenvolvedor>();
	}
}
