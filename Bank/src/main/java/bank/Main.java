package bank;

import java.util.Scanner;

import bank.Bank.InputValorNegativo;
import bank.Bank.SaldoInsuficiente;

public class Main {
    public static void main(String args[]) throws SaldoInsuficiente, InputValorNegativo {
        Bank bk = new Bank();
        Scanner in = new Scanner(System.in);

        for (;;) {
            System.out.println("| 1) Saldo \n| 2) Saque \n| 3) Depósito \n| Aperte qualquer outra tecla para sair");
            int operation = in.nextInt();
            double value;
            if (operation == 1) {
                System.out.println("Seu Saldo é de: $" + bk.saldo() + "\n");
            } else if (operation == 2) {
                System.out.println("Digite o valor do Saque:\n");
                value = in.nextDouble();
                bk.saque(value);
            } else if (operation == 3) {
                System.out.println("Digite o valor do Depósito:\n");
                value = in.nextDouble();
                bk.deposito(value);
            } else {
                System.out.println("Até a próxima!!");
                break;
            }
        }

    }
}
