package com.example.lhtest1student1219275;

import java.util.Arrays;
import java.util.List;

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

    public static List<String> getManufacturer() {
        return Arrays.asList("3Com","Acer","Arctic","AMD", "Asus","Apple Inc.","Bose","Cooler Master", "Hitachi", "Intel", "Logitech", "Marvell", "Nvidia", "Qualcomm", "Samsung","Tyan","Fujitsu","MSI","Seagate","Toshiba", "Western Digital", "XTREEM");
    }

    public void setManufacturer(String manufacturer) {
        List<String> validManufacturer = getManufacturer();
        if (validManufacturer.contains(manufacturer))
            this.manufacturer = manufacturer;
        else{
            throw new IllegalArgumentException("Provided manufacturer is not in the list");
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price<=10000 && price>=0)
            this.price = price;
        else {
            throw new IllegalArgumentException("Price must be in the range of 0-10000");
        }
    }
}
