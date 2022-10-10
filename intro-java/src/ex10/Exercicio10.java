package ex10;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {

		Scanner leitura = new Scanner(System.in);
		System.out.println("Informe a primeira nota:");
		Double notaUm = Double.valueOf(leitura.nextLine());
		System.out.println("Informe a segunda nota:");
		Double notaDois = Double.valueOf(leitura.nextLine());
		System.out.println("Informe a terceira nota:");
		Double notaTres = Double.valueOf(leitura.nextLine());
		aprovacaoDiscente(notaUm, notaDois, notaTres);
	}

	public static Double aprovacaoDiscente(Double notaUm, Double notaDois, Double notaTres) {

		Double mediaAritmetica = (notaUm + notaDois + notaTres) / 3;
		if (mediaAritmetica >= 6) {
			System.out.println("Aprovado(a)!");
		}
		if (mediaAritmetica >= 4 && mediaAritmetica < 6) {
			System.out.println("Recuperação!");
		}
		if (mediaAritmetica < 4) {
			System.out.println(" Reprovado(a)!");
		}

		return mediaAritmetica;
	}
}