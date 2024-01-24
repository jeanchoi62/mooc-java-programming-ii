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

public class Warehouse {
    private Map<String, Integer> priceMap;
    private Map<String, Integer> stockMap;
    
    public Warehouse() {
        this.priceMap = new HashMap<>();
        this.stockMap = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock) {
       this.priceMap.put(product, price);
       this.stockMap.put(product, stock);
    }
    
    public int price(String product) {
        int price = -99;
        for (String key: this.priceMap.keySet()) {
            if (key.equals(product)) {
                price = this.priceMap.get(key);
            }
        }
        
        return price;
    }
    
    public int stock(String product) {
        int stock = 0;
        for (String key: this.stockMap.keySet()) {
            if (key.equals(product)) {
                stock = this.stockMap.get(key);
            }
        }
        return stock;
    }
        
    public boolean take(String product) {
        boolean inStock = false;
        for (String key: this.stockMap.keySet()) {
            if (key.equals(product) && this.stockMap.get(key) > 0 ) {
                this.stockMap.put(product, this.stockMap.get(key)-1);
                inStock = true;
            }
        }
        return inStock;
    }

    public Set<String> products() {
        Set<String> products = priceMap.keySet();
        return products;
    }
}
