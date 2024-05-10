import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double limiteDiario = scanner.nextDouble();
        double limiteRestante = 0;
        double saque = 1;


        for( int num = 1; saque != 0; num++) {
            saque = scanner.nextDouble();

            if (saque != 0) {
                limiteRestante = limiteDiario - saque;
                if (limiteDiario >= limiteRestante && limiteRestante > 0) {
                    System.out.println("Saque realizado. Limite restante: " + limiteRestante);
                }else {
                    System.out.println("Limite diario de saque atingido.Transacoes encerradas.");
                    break;
                }
            } else {
                System.out.println("Transacoes encerradas.");
            }
        }

// Fechamos o Scanner para evitar vazamento de recursos:
        scanner.close();
    }
}