package aplicacao;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Por favor, digite o número da Conta: ");
		int numero = sc.nextInt();
		System.out.println("Por favor, digite o número da Agência: ");
		String agencia = sc.next();
		System.out.println("Por favor, digite o nome do Cliente: ");
		sc.nextLine();
		String nomeCliente = sc.nextLine();
		System.out.println("Por favor, digite o saldo da Conta: ");
		Double saldo = sc.nextDouble();
		
		String mensagem = "Olá " +nomeCliente+ ", obrigado por criar " +
				           " uma conta em nosso banco, sua agência é " +agencia+
				           ", conta " +numero+ " e seu saldo " +saldo+
				           " já está disponível para saque.";
	
		System.out.println(mensagem);
		sc.close();
	}
}