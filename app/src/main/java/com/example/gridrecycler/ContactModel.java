package com.example.gridrecycler;

public class ContactModel {
    int img1,img2;
    String city1,city2,dest,price;

    public ContactModel(int img1, int img2, String price, String city1, String city2, String dest){
        this.city1 = city1;
        this.city2 = city2;
        this.dest = dest;
        this.img1 = img1;
        this.img2 = img2;
        this.price = price;
    }
}
