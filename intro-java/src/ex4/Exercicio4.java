package ex4;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			System.out.println("Informe o número:");
			Integer var = Integer.valueOf(leitura.nextLine());
			System.out.println(var);
		}
	}
}
