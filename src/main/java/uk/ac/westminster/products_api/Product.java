package uk.ac.westminster.products_api;

import ch.qos.logback.classic.model.ConfigurationModel;

public class Product {

    public ConfigurationModel getId;
    private Long id;
    private String name;
    private double price;

    public Product() {}


    public Product(Long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }



// restored the "Activity 3 — Break It, Live"
// Reproduced the lecture demonstration one field at a time. This is the moment encapsulation clicks — do not skip it, even
//though it feels destructive.

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
