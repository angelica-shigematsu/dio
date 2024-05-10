package com.collections.list;

public class ListEmptyError extends Exception {
    private int code;

    private String message;

    public ListEmptyError() {
        this.code = 400;
        this.message = "Erro. A lista está vazia";
    }
}
