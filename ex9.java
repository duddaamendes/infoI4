package ex9;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex9 {

		public static void main(String[] args) {
			
			List lista = new ArrayList<>();
			ArrayList listaNum = new ArrayList<>();
			Scanner leitura = new Scanner(System.in);

			for (int i = 0; i < 5; i++) {
			System.out.println("Insira algo na lista: ");
			String itens = leitura.nextLine();

			if (itens.isEmpty()) {
			System.out.println("A lista esta vazia");
			}

			if (!itens.isEmpty()) {
			listaNum.add(itens);

			}

			}

			System.out.println("Tamanho da lista:" + listaNum.size());
			for (String elemento : listaNum) {
			System.out.println(elemento);
			}
		}
	}
}
