package ex6;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		int[] vetor = new int[10];
		int maior = 0;
		int menor = 999999;

		for (int i = 0; i < 10; i++) {
			System.out.println("Informe o valor:");
			vetor[i] = Integer.valueOf(leitura.nextLine());
		}
		for (int i = 0; i < 10; i++) {
			if (vetor[i] > maior) {
				maior = vetor[i];
			}
			if (vetor[i] < menor) {
				menor = vetor[i];
			}
		}
		System.out.println("O maior valor é");
		System.out.println(maior);
		System.out.println("O menor valor é");
		System.out.println(menor);

	}
}