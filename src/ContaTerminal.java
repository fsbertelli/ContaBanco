import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numeroConta;
        String agencia, nomeCliente;
        double saldo;
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Por favor, digite o seu nome: ");
        nomeCliente = scanner.nextLine();

        System.out.print("\nPor favor, digite o número da agência: ");
        agencia = scanner.next();

        System.out.print("\nPor favor, digite o número da conta: ");
        numeroConta = scanner.nextInt();

        System.out.print("\nPor favor, digite o saldo incial: ");
        saldo = scanner.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, " +
                "sua agência é %s, conta %d e " +
                "seu saldo R$ %.2f já está disponível para saque.",
                nomeCliente, agencia, numeroConta, saldo);

    }
}
