package Desafio;

import java.util.Scanner;

public class Conta {

	public static void main(String[] args) {
		
		String nome = "Rosi";
		String tipoConta = "Corrente";
		double saldo = 1599.99;
		int opcao = 0;
		
		System.out.println("******************************");
		System.out.println("\nNome do cliente: " + nome);
		System.out.println("\nTipo conta: " + tipoConta);
		System.out.println("\nSaldo atual: " + saldo);
		System.out.println("\n******************************");
		
		String menu = """
				** Digite sua opcao **
				1 - Consultar saldo
				2 - Transferir valor
				3 - Receber valor
				4- Sair
				
				""";
		
		//esse Scanner vai receber a minha opcao
		//System.in vai configurar para que ele receba dados do teclado
		
		Scanner ler = new Scanner (System.in);
		
		while (opcao != 4) { //enquanto for diferente de 4 exiba o menu e leia a opacao
			System.out.println(menu);
			opcao = ler.nextInt();
			
			if (opcao == 1) {
				System.out.println("o Saldo atualizado e " + saldo);
			}else if (opcao == 2) {
				System.out.println("Qual o valor que deseja transferir?");
			//vou criar uma variavel para receber o que for lido pelo Scanner
				double valor = ler.nextDouble();
				if (valor > saldo) {
					System.out.println("nao ha saldo para realizar a transferencia");
				}else {
					saldo -= valor;
					System.out.println("seu novo saldo e " + saldo);
				}
				}else if (opcao == 3) {
				
					System.out.println("valor recebido");
					double valor = ler.nextDouble();
					saldo += valor;
					System.out.println("novo saldo "+ saldo);
			}else if (opcao != 4){
				System.out.println("opcao invalida");
				
			}
		}

	}

}
