package org.example.model;

public abstract class ProductForSale {
    private String type;
    private double price;
    private String description;

    public ProductForSale(String type,  double price,String description) {
        this.type = type;
        this.price = price;
        this.description = description;
        
    }



    public abstract void showDetails();



    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public double getSalesPrice(int quantity) {
        return quantity*price;
    }
}
