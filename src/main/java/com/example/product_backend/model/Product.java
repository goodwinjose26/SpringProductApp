package com.example.product_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")

public class Product {
  @Id
  @GeneratedValue
  private  int id;
  private String prdcode;
  private String name;
  private String mandate;
  private String expdate;
  private String brand;
  private int price;
  private String sellername;
  private  String disname;

    public Product() {
    }

    public Product(int id, String prdcode, String name, String mandate, String expdate, String brand, int price, String sellername, String disname) {
        this.id = id;
        this.prdcode = prdcode;
        this.name = name;
        this.mandate = mandate;
        this.expdate = expdate;
        this.brand = brand;
        this.price = price;
        this.sellername = sellername;
        this.disname = disname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrdcode() {
        return prdcode;
    }

    public void setPrdcode(String prdcode) {
        this.prdcode = prdcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMandate() {
        return mandate;
    }

    public void setMandate(String mandate) {
        this.mandate = mandate;
    }

    public String getExpdate() {
        return expdate;
    }

    public void setExpdate(String expdate) {
        this.expdate = expdate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getSellername() {
        return sellername;
    }

    public void setSellername(String sellername) {
        this.sellername = sellername;
    }

    public String getDisname() {
        return disname;
    }

    public void setDisname(String disname) {
        this.disname = disname;
    }
}
