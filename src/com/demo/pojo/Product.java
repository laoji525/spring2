package com.demo.pojo;

public class Product {

    public Category getCategory() {
        return category;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;

    private String name;

    public void setCategory(Category category) {
        this.category = category;
    }

    private Category category;
    public int getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
