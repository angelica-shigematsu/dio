package br.com.conta.bancario.models;

public class Company extends Entity{

    private String cnpj;

    public Company(String name,String cnpj) {
        super(name);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }


}
