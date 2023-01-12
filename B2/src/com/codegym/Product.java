package com.codegym;

public class Product {
    private int id;
    private String name;
    private int price;
    private int number;
    private double promotion;

    Product(int id, String name, int price, int number, double promotion) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.number = number;
        this.promotion = promotion;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getNumber() {
        return number;
    }

    public double getPromotion() {
        return promotion;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setPromotion(double promotion) {
        this.promotion = promotion;
    }


    public double getTong() {
        return this.price * this.number;
    }

    public double getTienSale() {
        return (this.price * this.number * this.promotion) / 100;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", number=" + number +
                ", promotion=" + promotion +
                '}';
    }
}
