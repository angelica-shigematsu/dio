package br.com.conta.bancario.models;

public abstract class Conta implements IConta{

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int numero;

    protected int agencia;

    protected static double saldo;

    protected Entity entity;

    protected ContaType typeAccount;


    public Conta(Entity entity) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.entity = entity;
    }

    public int getNumero() {
        return numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public Entity getEntity() {
        return entity;
    }

    @Override
    public abstract void deposit(double value);

    @Override
    public abstract void withdraw(double value);

    @Override
    public abstract void transfer(Conta contaDestiny, double value);

    public abstract String printDatas() ;
}
