import com.conta.models.ContaTerminal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Por favor, digite o nome da agência");
            String nameAgency = scan.nextLine();

            System.out.println("Por favor, digite o seu nome");
            String nameAccount = scan.nextLine();

            System.out.println("Por favor, digite o número da agência");
            int numRegister = scan.nextInt();

            System.out.println("Por favor, digite o seu saldo");
            double saldo = scan.nextDouble();

            ContaTerminal conta = new ContaTerminal(numRegister, nameAgency, nameAccount, saldo);

            System.out.println("**************************");
            System.out.println(conta.toString());
            System.out.println("**************************");
        } catch (InputMismatchException e) {
            System.out.println("Campos inválidos");
        }
    }
}