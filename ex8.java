package ex9;
	import java.util.Scanner;
public class ex8 {
	public static void main(String[] args) {

		Scanner leitura = new Scanner(System.in);
		String [] vetor = new String[10];
		for (int i = 0; i < vetor.length; i++) {
		System.out.println("Insira um valor: ");
		vetor[i] = leitura.nextLine();
		}
		for (int i = 0; i < vetor.length; i++) {
		System.out.println(vetor[i]);

		}
		System.out.println ("Ultimo elemento:");
		System.out.println (vetor[vetor.length - 1]);
		}
}
