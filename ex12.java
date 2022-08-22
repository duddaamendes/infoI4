package ex9;

import java.util.ArrayList;
import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) {

		List lista = new ArrayList<>();

		ArrayList listNames = new ArrayList<>();

		listNames.add("Duda"); // inserir
		listNames.add("Andri"); // inserir
		listNames.add("Emily"); // inserir
		listNames.add("Ana"); // inserir
		listNames.add("Theo"); // inserir
		listNames.add("Osni"); // inserir
		listNames.add("Michel"); // inserir
		listNames.add("Gabriela"); // inserir
		listNames.add("Gabriel"); // inserir
		listNames.add("Paula"); // inserir

		listNames.set(3, "Precisa mudar Theo"); // atualizar

		Scanner leitura = new Scanner(System.in);

		for (String elemento : listNames) {
			System.out.println(elemento);
		}

	}
}
