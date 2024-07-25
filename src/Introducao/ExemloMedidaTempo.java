package Introducao;

import javax.swing.JOptionPane;

public class ExemloMedidaTempo {

	public static void main(String[] args) {
		
		
		String[] nomes = new String[100000];
		
		for (int i=0; i<nomes.length; i++ ) {
			nomes[i] = "nome "+ i;
		}
		String nmBusca = JOptionPane.showInputDialog("Nome para busca");
		
	}
}
