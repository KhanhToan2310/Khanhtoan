/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment;

import java.io.Serializable;

/**
 *
 * @author PHONG VU
 */
public class Product implements Serializable {
    private static final long serialversionUID = 1L;
    private String pcode;
    private String pro_name;
    private int quantity;
    private int saled;
    private double price;
    private double value;
    public Product() {
    }

    public Product(String pcode, String pro_name, int quantity, int saled, double price,double value) {
        this.pcode = pcode;
        this.pro_name = pro_name;
        this.quantity = quantity;
        this.saled = saled;
        this.price = price;
        this.value = value;
    }

    public String getPcode() {
        return pcode;
    }

    public void setPcode(String pcode) {
        this.pcode = pcode;
    }

    public String getPro_name() {
        return pro_name;
    }

    public void setPro_name(String pro_name) {
        this.pro_name = pro_name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getSaled() {
        return saled;
    }

    public void setSaled(int saled) {
        this.saled = saled;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
  return String.format("%-10s| %-10s| %-10d| %-10d| %-10f| %-10f",pcode,pro_name,quantity,saled,price, value) ;
    }
    
    
}
