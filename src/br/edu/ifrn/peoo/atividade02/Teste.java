/*
 * Gabrielly Beatriz
 * Tiago Rodrigues
 * 
 * Tipo de relacionamento: Composição
 * Multiplicidade:
 * 	No documento da referida questão está mínimo: 0 e máximo: 1.
 *  Entretanto, como discutido em aula, deveria ser mínimo: 1 e máximo: 1
*/

package br.edu.ifrn.peoo.atividade02;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("# FUNCIONÁRIO");
		
		System.out.print("- Matrícula: ");
		String matricula = scan.nextLine();
		
		System.out.print("- Nome: ");
		String nome = scan.nextLine();
		
		System.out.print("- Salário: ");
		double salario = scan.nextDouble();
		
		scan.nextLine();
		
		System.out.println("\n# DEPENDENTE");
		
		System.out.print("- Nome: ");
		String dependenteNome = scan.nextLine();
		
		System.out.print("- Idade: ");
		int dependenteIdade = scan.nextInt();
		
		Dependente dependente = new Dependente(dependenteNome, dependenteIdade);
		
		Funcionario funcionario = new Funcionario();
		funcionario.setMatricula(matricula);
		funcionario.setNome(nome);
		funcionario.setSalario(salario);
		funcionario.setDependente(dependente);
		
		StringBuilder infoDependente = new StringBuilder();
		infoDependente.append(dependente.toString());
		
		StringBuilder infoFuncionario = new StringBuilder();
		infoFuncionario.append("> Matrícula: " + funcionario.getMatricula() + "\n");
		infoFuncionario.append("> Nome: " + funcionario.getNome() + "\n");
		infoFuncionario.append("> Salário: " + funcionario.getSalario() + "\n");
		infoFuncionario.append("> Dependente: \n" + infoDependente);
		
		System.out.println("-------------------------------------\n");
		System.out.println(infoFuncionario);
		
		scan.close();
		
	}

}
