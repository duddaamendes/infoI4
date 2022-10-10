package fixacaoIII;

import java.util.Scanner;

public class ContaCorrenteMain {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		cc.nomeTitular = "Maria Eduarda Mendes";
		cc.cpf = 9171968997l;
		cc.numeroConta = 8907654l;
		cc.saldo= 10000.00;
		cc.mostrarDados();
		
		System.out.println("");
		
		cc.sacar(234.00);
		cc.depositar(120.00);
		cc.mostrarDados();
		
	}

}
