package com.conta.models;

public class ContaTerminal {
    private int numRegister;

    private String agency;

    private String fullName;

    private double saldo;

    public ContaTerminal(int numRegister, String agency, String fullName, double saldo) {
        this.numRegister = numRegister;
        this.agency = agency;
        this.fullName = fullName;
        this.saldo = saldo;
    }
    @Override
    public String toString() {
        return """
                Olá %s
                Obrigado por criar uma conta em nosso banco.
                Sua agência é %s, com conta %d
                e seu saldo de %.2f
                """.formatted(fullName, agency, numRegister, saldo);

    }
}
