package com.example.recyclerview;

public class itemModel {
    private String name;
    private int image;

    public itemModel(String name, int image){
        this.name = name;
        this.image = image;
    }
    public String getName(){ return this.name; }
    public Integer getImage(){ return this.image; }
}
