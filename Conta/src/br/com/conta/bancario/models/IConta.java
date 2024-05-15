package br.com.conta.bancario.models;

public interface IConta {
    abstract void deposit(double value);

    abstract void withdraw(double value);

    abstract void transfer(Conta contaDestiny, double value);
}
