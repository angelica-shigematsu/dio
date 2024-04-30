package edu.contador.controlefluxo;

public class ParametrosInvalidosException extends Exception {
    private final String message;
    private int statusCode;

    public ParametrosInvalidosException() {
        this.message = "O segundo parâmetro deve ser maior que o primeiro";
        this.statusCode = 400;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public int getStatusCode() {
        return statusCode;
    }
}
