package Metodos;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ExemploClasses {

	public static void main(String[] args) {

		ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	}

	public static void cadastra(ArrayList<Aluno> alunos) {
		Aluno a = new Aluno();
		a.nome = JOptionPane.showInputDialog("Nome: ");
		double nota = 0;
		do {
			nota = Double.parseDouble(JOptionPane.showInputDialog("Nota: "));
			if (nota != -1) {
				a.notas.add(nota);
			}
		} while (nota != -1);
		alunos.add(a);

	}

	
	public static double calculaMedia(ArrayList<Double> notas) {
		double media = calculaMedia(a.notas);
		if (media >=7)
			return a.nome +" Aprovado";
	} else {
		if ( media > 3) {
			return a.nome + "Recuperação";

	}

	} return a.nome
	{ 

	}

}	
}