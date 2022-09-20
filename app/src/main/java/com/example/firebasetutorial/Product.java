package com.example.firebasetutorial;

import com.google.firebase.firestore.ServerTimestamp;
import com.google.type.Date;

public class Product {
    private String name;
    private String price;
    private  String stocks;
//    @ServerTimestamp
//    private Date date;

    public Product(){
        //needed lang to
    }

    public Product(String name, String price, String stocks) {
        this.name = name;
        this.price = price;
        this.stocks = stocks;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public String getStocks() {
        return stocks;
    }

//    public Date getDate() {
//        return date;
//    }
//
//    public void setDate(Date date) {
//        this.date = date;
//    }
}
