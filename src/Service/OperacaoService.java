package Service;

import java.util.Scanner;

import Model.Conta;

public class OperacaoService {
		ContaService contaService = new ContaService();
		
		public String deposito(Conta conta, double valor) {
			if (valor != 0) {
				conta.setSaldo(conta.getSaldo() + valor);
				contaService.alterarConta(conta); 
				return"Deposito efetuado com sucessso! Saldo atual: R$ "+ conta.getSaldo();
			}else {
				return"Preencha o valor, por favor! ";
			}
				
		}

		public String saque(Conta conta, double valor) {
			if (valor != 0) {
				if(conta.getSaldo() > valor) {
					conta.setSaldo(conta.getSaldo() - valor);
					contaService.alterarConta(conta);
					return"Saque efetuado com sucessso! Saldo atual: R$ "+ conta.getSaldo();
				}else {
					return"O saldo é "+ conta.getSaldo();
				}
			}else {
				return"Preencha o valor, por favor! ";
			}	

		}

}

