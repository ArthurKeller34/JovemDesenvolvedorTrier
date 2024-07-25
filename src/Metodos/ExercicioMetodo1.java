package Metodos;

import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ExercicioMetodo1 {

	public static void main(String[] args) {
		
		String menuInicial = """
				1 - cadastrar alunos e notas
				2 - listar alunos
				3 - buscar aluno por nome 
				4 - lista de aprovados
				5 - lista de recuperção
				6 - lista de reprovados
				7 - sair
				""";
		
		int opEscolhida = Integer.parseInt(JOptionPane.showInputDialog(menuInicial));
		
		switch (opEscolhida) {
		case 1: 
			String cadastroNome = JOptionPane.showInputDialog("Qual o nome do aluno que deseja cadastrar? ");
			ArrayList<Aluno> nomesAlunos = new ArrayList<Aluno>();
			Aluno.add(nomesAlunos);
			if ( cadastroNome == "") {
				JOptionPane.showInputDialog(menuInicial);
			} else {
				JOptionPane.showInputDialog(cadastroNome);
			}
		
			
		
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + opEscolhida);
		}
		
		
		
	}
}
