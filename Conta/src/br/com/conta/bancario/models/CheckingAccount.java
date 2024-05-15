package br.com.conta.bancario.models;

public class CheckingAccount extends Conta implements IConta {
    private static final int percentual = 3;

    private double saldo;

    public CheckingAccount(Entity entity) {
        super(entity);
        saldo = getSaldo();
        typeAccount = ContaType.CORRENTE;
    }

    @Override
    public void deposit(double value) {
        saldo = saldo + value;
    }

    @Override
    public void withdraw(double value) {
       saldo -= value;
    }

    @Override
    public void transfer(Conta contaDestiny, double value) {
        withdraw(value);
        contaDestiny.deposit(value);
        System.out.println("\n******************Tranfêrencia**********************");
    }

    @Override
    public String printDatas() {
        String entiyType = "Empresa: ";
        if (entity instanceof Client) {
            entiyType = "Cliente: ";
        }
        return "Tipo de conta : " + typeAccount.getTypeAccount() +
                ", numero='" + numero + '\'' +
                ", agencia=" + agencia +
                ", saldo=" + saldo +
                ", " + entiyType  + getEntity().getName();
    }
}
