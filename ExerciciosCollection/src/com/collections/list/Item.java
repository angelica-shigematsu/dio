package com.collections.list;

import java.util.Comparator;

public class Item implements Comparable<Item>{
    private String itemName;

    private double price;

    private int amount;

    public Item(String itemName, double price, int amount) {
        this.itemName = itemName;
        this.price = price;
        this.amount = amount;
    }

    public String getProductName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Item{" +
                "productName='" + itemName + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                '}';
    }

    @Override
    public int compareTo(Item i) {
        return getProductName().compareTo(i.getProductName());
    }
}

class ComparatorByPrice implements Comparator<Item> {
    @Override
    public int compare(Item i1, Item i2) {
        return Double.compare(i1.getPrice(), i2.getPrice());
    }
}



