package ex7;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		String[] vetor = new String[10];
		vetor[0] = "Maria";
		vetor[1] = "Andri";
		vetor[2] = "Pati";
		vetor[3] = "Paulinho";
		vetor[4] = "Joãozinho";
		vetor[5] = "Ana";
		vetor[6] = "Claudia";
		vetor[7] = "Pedrinha";
		vetor[8] = "Pedrinho";
		vetor[9] = "Antonio";
		for (int i = 0; i < 10; i++) {
			System.out.println(vetor[i]);
		}
		System.out.println("O veotr tem tamanho:" + vetor.length);
		System.out.println("O último elemento do vetor é:" + vetor[9]);
	}
}