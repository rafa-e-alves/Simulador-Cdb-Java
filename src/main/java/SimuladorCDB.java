import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class SimuladorCDB {

    public static double obterValorPositivo(String mensagem, Scanner scanner) {
        double valor;
        do {
            try {
                System.out.print(mensagem);
                valor = scanner.nextDouble();
                if (valor <= 0) {
                    System.out.println("O valor deve ser maior que zero. Tente novamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número válido.");
                scanner.next();
                valor = -1;
            }
        } while (valor <= 0);
        return valor;
    }

    public static int obterNumeroMeses(Scanner scanner) {
        int meses = -1;
        do {
            try {
                System.out.print("Informe o prazo do investimento (meses): ");
                meses = scanner.nextInt();
                if (meses <= 0) {
                    System.out.println("O prazo deve ser maior que zero e não pode ser negativo. Tente novamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número válido.");
                scanner.next();
            }
        } while (meses <= 0);
        return meses;
    }

    public static double calcularSaldo(double investimentoInicial, double aporteMensal, double taxaMensal, int meses) {
        double saldo = investimentoInicial;
        for (int i = 1; i <= meses; i++) {
            saldo = saldo * (1 + taxaMensal) + aporteMensal;
        }
        return saldo;
    }

    public static void exibirResultados(double totalInvestido, double lucro, double saldo, int meses) {
        NumberFormat formato = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

        System.out.printf("\nValor total investido: %s%n", formato.format(totalInvestido));
        System.out.printf("Lucro total ao final de %d meses: %s%n", meses, formato.format(lucro));
        System.out.printf("Valor total (investimento + lucro): %s%n", formato.format(saldo));
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double investimentoInicial = obterValorPositivo("Informe o investimento inicial (R$): ", scanner);
        double aporteMensal = obterValorPositivo("Informe o aporte mensal (R$): ", scanner);
        double taxaAnual = obterValorPositivo("Informe a taxa de juros anual (%): ", scanner);

        int meses = obterNumeroMeses(scanner);

        double taxaMensal = (taxaAnual / 100) / 12;
        double saldo = calcularSaldo(investimentoInicial, aporteMensal, taxaMensal, meses);

        double totalInvestido = investimentoInicial + aporteMensal * meses;
        double lucro = saldo - totalInvestido;

        exibirResultados(totalInvestido, lucro, saldo, meses);

        scanner.close();
    }
}
