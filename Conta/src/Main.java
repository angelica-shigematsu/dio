import br.com.conta.bancario.models.*;

public class Main {
    public static void main(String[] args) {

        Entity company = new Company("Services LTda.", "123435467889");

        Conta contaCompany = new CheckingAccount(company);
        System.out.println(contaCompany.printDatas());

        Client client = new Client("Angélica", "987654321");

        Conta contaClient = new CheckingAccount(client);
        contaClient.deposit(400.0);
        System.out.println(contaClient.printDatas());


        System.out.println("******************************************");

        contaClient.transfer(contaCompany, 300.0);

        System.out.println(contaClient.printDatas());

        System.out.println(contaCompany.printDatas());

        System.out.println("*******************************************");

        SavingsAccount savingConta = new SavingsAccount(client);
        savingConta.deposit(200.0);
        savingConta.withdraw(100.0);
        savingConta.transfer(contaClient, 50.0);
        System.out.println(savingConta.printDatas());

        System.out.println(contaClient.printDatas());

    }
}