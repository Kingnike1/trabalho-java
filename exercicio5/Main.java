import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println("1 - Conta Corrente");
        System.out.println("2 - Conta Poupança");
        System.out.print("Escolha o tipo de conta: ");

        int tipoConta = sc.nextInt();

        Conta conta;

        if (tipoConta == 1) {
            conta = new ContaCorrente();

        } else if (tipoConta == 2) {
            conta = new ContaPoupanca();

        } else {
            System.out.println("Tipo de conta inválido.");
            sc.close();
            return;
        }

        System.out.print("Digite o nome do titular: ");
        conta.titular = sc.next();

        System.out.print("Digite o número da conta: ");
        conta.numero = sc.nextInt();

        System.out.print("Digite o valor do depósito: ");
        double deposito = sc.nextDouble();
        conta.depositar(deposito);

        System.out.print("Digite o valor do saque: ");
        double saque = sc.nextDouble();
        conta.sacar(saque);

        if (conta instanceof ContaCorrente) {
            ContaCorrente corrente = (ContaCorrente) conta;

            System.out.print("Digite a taxa de manutenção: ");
            corrente.taxaManutencao = sc.nextDouble();

        } else if (conta instanceof ContaPoupanca) {
            ContaPoupanca poupanca = (ContaPoupanca) conta;

            System.out.print("Digite o percentual de rendimento (ex: 0.15 para 15%): ");
            poupanca.percentualRendimento = sc.nextDouble();
        }

        System.out.println("\n--- Informações da conta ---");

        System.out.println("Titular: " + conta.titular);
        System.out.println("Número: " + conta.numero);

        if (conta instanceof ContaCorrente) {
            System.out.println("Tipo: Conta Corrente");
        } else {
            System.out.println("Tipo: Conta Poupança");
        }

        System.out.printf("Saldo: R$ %.2f%n", conta.calcularSaldo());

        sc.close();
    }
}