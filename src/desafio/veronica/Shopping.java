package desafio.veronica;

import java.util.ArrayList;

public class Shopping {
    private String product;
    private double price;
    private double limit;
    private double balance;

    public Shopping(double limit) {
        this.limit = limit;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    public void addShopping(double price){
        this.limit -= price;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
