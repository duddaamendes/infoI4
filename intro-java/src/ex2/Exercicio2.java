package ex2;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {

		Scanner leitura = new Scanner(System.in);
		System.out.println("Insira o nome:");
		String nome = leitura.nextLine();
		System.out.println("Insira a idade:");
		Integer idade = Integer.valueOf(leitura.nextLine());
		System.out.println(nome);
		System.out.println(idade);

	}
}
