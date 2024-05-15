package br.com.conta.bancario.models;

public enum ContaType {
    CORRENTE("corrente"),

    POUPANCA("poupança");

    private String typeAccount;

    ContaType(String typeAccount) {
        this.typeAccount = typeAccount;
    }

    public String getTypeAccount() {
        return typeAccount;
    }
}
