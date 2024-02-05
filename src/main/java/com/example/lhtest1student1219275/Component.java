package com.example.lhtest1student1219275;

public class Component {

    private String name;
    private String manufacturer;
    private double price;

    public Component(String name, String manufacturer, double price) {
        setName(name);
        setManufacturer(manufacturer);
        setPrice(price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && name.length() >= 3) {
            this.name = name;
        } else {
            // Throw an exception
            throw new IllegalArgumentException("Name must be at least 3 characters long");
        }
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {

    }
}
