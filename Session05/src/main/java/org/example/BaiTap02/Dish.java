package org.example.BaiTap02;

public class Dish {
    private Long id;
    private String name;
    private double price;
    private boolean isAvailable;

    public Dish(Long id, String name, double price, boolean isAvailable) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public boolean isAvailable() { return isAvailable; }
}