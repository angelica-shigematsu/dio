package br.com.conta.bancario.models;

public class Client extends Entity{

    private String cpf;

    public Client(String name, String cpf) {
        super(name);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }
}
