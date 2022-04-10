package com.example.food;

import java.io.Serializable;

public class item implements Serializable {

    private String iname;
    private int price;

    public item() {
    }

    public String getIname() {
        return iname;
    }

    public void setIname(String iname) {
        this.iname = iname;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }




}
