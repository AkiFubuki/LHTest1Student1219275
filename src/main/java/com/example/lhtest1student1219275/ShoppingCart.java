package com.example.lhtest1student1219275;

import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Component> cart;
    private double sum;

    private void addItem(Component component){
        cart= new ArrayList<>();
    }

    private double getTotalPrice(double price){
        sum=price+price;

        return sum;
    }

    public String getComponentNames(String ComponentNames){
        return ComponentNames;
    }
    public String toString(){
        int num;
        return "The cart has components with a total price of $"+sum;
    }

}
