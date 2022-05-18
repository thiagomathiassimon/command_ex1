package br.com.unisul.mmt;

public class Stock {

    private String name = "ABC";
    private int quantity = 10;

    public void buy() {
        System.out.println("Stock [Name: ".concat(name).concat(", Quantity: ").concat(String.valueOf(quantity)).concat(" ] bought"));
    }

    public void sell() {
        System.out.println("Stock [Name: ".concat(name).concat(", Quantity: ").concat(String.valueOf(quantity)).concat(" ] sold"));
    }

}
