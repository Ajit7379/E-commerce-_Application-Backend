package com.org.ShirtCollection;

public class Shirt {
   private String bname;
   private int size;
   private double price;
   private String color;
   
   
   Shirt()
   {
	   super();
   }


public Shirt(String bname, int size, double price, String color) {
	super();
	this.bname = bname;
	this.size = size;
	this.price = price;
	this.color = color;
}


public String getBname() {
	return bname;
}


public void setBname(String bname) {
	this.bname = bname;
}


public int getSize() {
	return size;
}


public void setSize(int size) {
	this.size = size;
}


public double getPrice() {
	return price;
}


public void setPrice(double price) {
	this.price = price;
}


public String getColor() {
	return color;
}


public void setColor(String color) {
	this.color = color;
}


@Override
public String toString() {
	return "Shirt [bname=" + bname + ", size=" + size + ", price=" + price + ", color=" + color + "]";
}
   
}
