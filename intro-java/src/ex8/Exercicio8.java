package ex8;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		ArrayList<String> lista = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			System.out.println("Informe o item:");
			String objeto = leitura.nextLine();
			lista.add(objeto);
		}
		for (String objetosLista : lista) {
			
			System.out.println(objetosLista);
		}
		System.out.println("Tamanho da lista:"+ lista.size());
		System.out.println("Ultimo elemento:" + lista.get(lista.size()-1));
	}
}
