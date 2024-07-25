package Metodos;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ExemploArrayList {

	public static void main(String[] args) {
		ArrayList<String> nomes = new ArrayList<String>();
		
	}
	
	public static int menu() { 
		String m = """
			1 - cadastrar
			2 - listar todos
			3 - buscar por nome
			4 - sair
			""";
		int op = Integer.parseInt(JOptionPane.showInputDialog(m));
		if ( op< 1 || op > 4)
		return menu();
		return op;
}
	public static void cadastraNome (ArrayList<String> lista) {
		lista.add(JOptionPane.showInputDialog("Nome: "));
	}
	
	
}