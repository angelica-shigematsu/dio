package com.collections.list;

public class Main {
    public static void main(String[] args) throws ListEmptyError {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem("Toalha", 14.70, 1);
        cart.addItem("Escova de dente", 10, 3);


        System.out.println("*****************************");
        System.out.println("Itens desordenada");

        cart.showItens();

        System.out.println("*****************************");
        System.out.println("Lista ordernada por nome: ");

        System.out.println(cart.orderByNameProduct());


        System.out.println("*****************************");
        System.out.println("Lista ordernada por preço: ");

        System.out.println(cart.orderByPrice());

        System.out.println("Total da venda " + cart.calculateTotal());

        cart.removeItem("Toalha");

        System.out.println("*****************************");
        System.out.println("Item removido");

        cart.showItens();
    }
}