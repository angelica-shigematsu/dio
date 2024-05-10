package com.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShoppingCart {
    private List<Item> listItens;

    public ShoppingCart() {
        this.listItens = new ArrayList<>();
    }

    public Item addItem(String itemName, double price, int amount) {
        listItens.add(new Item(itemName, price, amount));
        return listItens.get(listItens.size() - 1);
    }

    public void removeItem(String itemName) throws ListEmptyError {
        List<Item> newItem = new ArrayList<>();

        if (!listItens.isEmpty()) {
            for (Item i : listItens) {
                if (i.getProductName().equalsIgnoreCase(itemName)) {
                    newItem.add(i);
                }
            }
            listItens.removeAll(newItem);
        } else {
            throw new ListEmptyError();
        }
    }

    public double calculateTotal() {
        double totalValue = 0;
        for(Item i: listItens) {
            totalValue += (i.getPrice() * i.getAmount());
        }
        return totalValue;
    }

    public String showItens() {
        if (!listItens.isEmpty()) {
            for (Item i : listItens) {
                System.out.println(i.toString());
            }
            return "Lista não vazia";

        } else {

            return "Lista não vazia";
        }
    }

    public List<Item> orderByNameProduct() {
        List<Item> productsByName = new ArrayList<>(listItens);

        Collections.sort(productsByName);

        return productsByName;
    }

    public List<Item> orderByPrice() {
        List<Item> productsByPrice= new ArrayList<>(listItens);

        Collections.sort(productsByPrice);

        return productsByPrice;
    }
}
