package org.example.model;

public class Store {
    public static void main(String[] args) {
        ProductForSale[] products= new ProductForSale[5];
        products[0]= new Chocolate("sweet",15,"check dsc");
        products[1]= new Bread("Bakery","br dsc",5,"einkron","brown");
        products[2]= new Coke("Drinks","dr desc",15,true,2.5);

        //listProducts();
    }

    public static void listProducts(ProductForSale[] products) {
        for(ProductForSale product:products){
            if(product != null){
                product.showDetails();
            }
        }
    }

}