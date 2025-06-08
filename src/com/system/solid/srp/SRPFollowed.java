package com.system.solid.srp;

import java.util.ArrayList;
import java.util.List;

class Product{
    private double price;
    private String name;

     Product(double price, String name) {
        this.price = price;
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class ShoppingCart{
    private List<Product> productList = new ArrayList<>();

    public void addProducts(Product product) {
        productList.add(product);
    }

    public List<Product> getProducts() {
        return productList;
    }

    public double calTotalPrice(){
        double price = 0;
        for (Product product: productList) {
            price += product.getPrice();
        }
        return price;
    }

}

class CartInvoicePrinter{

    private ShoppingCart shoppingCart;
    CartInvoicePrinter(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }
    void printInvoice() {
       List<Product> products = shoppingCart.getProducts();
       for(Product product : products) {
           System.out.println(product.getName() + " - "+"Rs:"+product.getPrice());
       }
        System.out.println("total price: Rs"+shoppingCart.calTotalPrice());
    }

}

class CartDBStorage{

    ShoppingCart shoppingCart;

    void saveToDb() {
        System.out.println("saving to db");
    }
}
public class SRPFollowed {
    public static void main(String[] args) {

        ShoppingCart sc = new ShoppingCart();
        sc.addProducts(new Product(234677,"Laptop"));
        sc.addProducts(new Product(345, "dress"));
        System.out.println(sc.getProducts());
        System.out.println(sc.calTotalPrice());

        CartInvoicePrinter cp = new CartInvoicePrinter(sc);
        cp.printInvoice();
    }
}
