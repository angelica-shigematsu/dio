package br.com.conta.bancario.models;

import com.sun.tools.jconsole.JConsoleContext;

public class SavingsAccount extends Conta implements IConta{

    private double saldo;
    public SavingsAccount(Client client) {
        super(client);
        saldo = getSaldo();
        typeAccount = ContaType.POUPANCA;
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
        contaDestiny.deposit(value);
        withdraw(value);
        System.out.println("\n******************Tranfêrencia**********************");
    }

    @Override
    public String printDatas() {
        return"Tipo de conta : " + typeAccount.getTypeAccount() +
                ", numero='" + numero + '\'' +
                ", agencia=" + agencia +
                ", saldo=" + saldo +
                ", Cliente: " + getEntity().getName();
    }
}
