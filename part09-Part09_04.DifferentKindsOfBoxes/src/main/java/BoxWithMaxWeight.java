/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jeanmac
 */
import java.util.*;

public class BoxWithMaxWeight extends Box{
    private int capacity;
    private ArrayList<Item> items;
    
    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }
    

    
    public void add(Item item) {
        int totalWeight = 0;
    
        for (Item i: this.items) {
            totalWeight += i.getWeight();
        }
        
        if (totalWeight + item.getWeight() <= this.capacity) {
        	this.items.add(item);
        } 
    }
    
    
    
    
    
    public void add(ArrayList<Item> items) {
        int totalWeight = 0;
    
        for (Item i: this.items) {
            totalWeight += i.getWeight();
        }
        
        for (Item p: items) {
            if (p.getWeight() + totalWeight > this.capacity) {
                break;
            } else {
                this.items.add(p);
            }
        }
    }
    
    public void listAll() {
        int count = 1;
        for (Item i: this.items) {
            System.out.println(count + ": " + i);
            count++;
        }
    }
    
    public boolean isInBox(Item item) {
        if (items.contains(item)) {
        	return true;
        } else {
        	return false;
        }
    }
}