/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clothesapp.model;

/**
 *
 * @author Rose Khatiwada
 * LMU ID: 23048677
 */
public class ClothesModel {
    private int productcode;
    private String productname;
    private String producttype;
    private String color;
    private int stock;
    private double price;
    
    public ClothesModel(int productcode, String productname, String producttype, String color, int stock, double price){
        this.productcode = productcode;
        this.productname = productname;
        this.producttype = producttype;
        this.color = color;
        this.stock = stock;
        this.price = price;
}

    public int getProductcode() {
        return productcode;
    }

    public void setProductcode(int productcode) {
        this.productcode = productcode;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getProducttype() {
        return producttype;
    }

    public void setProducttype(String producttype) {
        this.producttype = producttype;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
}
