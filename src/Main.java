import java.util.Scanner;

import Model.Conta;
import Service.ContaService;
import Service.OperacaoService;

public class Main {

	public static void main(String[] args) {

		ContaService contaService = new ContaService();
		Conta conta = new Conta();
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o nome:");
		conta.setNome(sc.next());

		sc = new Scanner(System.in);
		System.out.print("Digite o CPF:");
		conta.setCpf(sc.next());

		sc = new Scanner(System.in);
		System.out.print("Digite a Agencia:");
		conta.setAgencia(sc.next());

		sc = new Scanner(System.in);
		System.out.print("Digite o Numero da Conta:");
		conta.setNumeroConta(sc.next());

		sc = new Scanner(System.in);
		System.out.print("Digite o Saldo:");
		conta.setSaldo(sc.nextDouble());

		contaService.adicionarConta(conta);
		System.out.println(conta.getSaldo());

		sc = new Scanner(System.in);
		System.out.print("Digite o 1 - Saque ou 2 - Deposito:");

		Integer escolha = sc.nextInt();
		OperacaoService operacaoService = new OperacaoService();

		if (escolha == 1) {
			sc = new Scanner(System.in);
			System.out.print("Digite o valor para saque:");
			System.out.println(operacaoService.saque(conta, sc.nextDouble()));
		} else if (escolha == 2) {
			sc = new Scanner(System.in);
			System.out.print("Digite o valor para deposito:");
			System.out.println(operacaoService.deposito(conta, sc.nextDouble()));

		}
		
		
		System.out.println("Digite numero conta");
        Conta conta1 = contaService.GetConta(sc.nextInt());
        System.out.println(conta1.agencia);
        

		System.out.println("Digite numero conta");
		System.out.println("Digite numero conta1");
		
        Conta conta2 = contaService.transferiencia( sc.nextInt());
       
       System.out.println("imprimir saldo"+ conta2.calculo1 +""+conta2.calculo );
        
     
        
        

	}
}
