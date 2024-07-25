package Metodos;

public class ExemploMetodos {

	public static void main(String[] args) {

		double nota1 = 10.0;
		double nota2 = 5.0;

		System.out.println(calculaMedia(nota1, nota2));
		System.out.println(verificaAprovacao(calculaMedia(nota1, nota2)));

	}

	public static double calculaMedia(double n1, double n2) {
		return (n1 + n2) / 2;

	}

	public static String verificaAprovacao(double media) {
		if (media >= 7) {
			return "Aprovado";
		} else if (media < 3) {
			return "Reprovado";
		}
		return "Recuperação";

	}

}
