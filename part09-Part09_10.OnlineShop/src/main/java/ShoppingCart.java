/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JeanASUS
 */

import java.util.*;
        
public class ShoppingCart {
    private Map<String, Item> map;
    
    public ShoppingCart() {
        this.map = new HashMap<>();
    }
    
    public void add(String product, int price) {
        //check if item already exists
        for (String p : this.map.keySet()) {
            if (product.equals(p)) {
                //increase the item quantity by one
                this.map.get(p).increaseQuantity();
                return;
            } 
        }
            this.map.put(product, new Item(product, 1, price));
        
    }
    
    
    public int price() {
        int total = 0;
        for (Item i: this.map.values()) {
            total += i.price();
        }
        return total;
    }
    
    public void print() {
        for (Item i: this.map.values()) {
            System.out.println(i);
        }
    }
    
}