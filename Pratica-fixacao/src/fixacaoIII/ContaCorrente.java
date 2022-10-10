package fixacaoIII;

import java.util.Scanner;

public class ContaCorrente {
	public String nomeTitular;
	public long cpf;
	public long numeroConta;
	public Double saldo;
	
	public Double sacar(double numSaque) {
		double retornoSaque = 0;
		if (numSaque>saldo) {
			System.out.println("Saldo insuficiente");
		}else {
			saldo = saldo-numSaque;
			retornoSaque=numSaque;
		}
		
		return retornoSaque;
	}
	
	public void mostrarDados() {
		System.out.println("Nome do Titular: "+nomeTitular);
		System.out.println("CPF: "+cpf);
		System.out.println("Conta: "+numeroConta);
		System.out.println("Saldo Conta: "+saldo);
	}
	
	public void depositar (double numDeposito)
	{
		saldo = saldo+numDeposito;
		
	} 

}
