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

public class Box implements Packable{ 
    private double maxWeight;
    private ArrayList<Packable> list;
    
    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        this.list = new ArrayList<>();
    }
    
    public void add(Packable packable) {
        if (packable.weight() + weight() <= this.maxWeight) {
            this.list.add(packable);
        }
    }
    
    public double weight() {
        double weight = 0;
        for (Packable p: this.list) {
            weight += p.weight();
        }
        return weight;
    }
    
    @Override
    public String toString() {
        return "Box: " + this.list.size() + " items, total weight " + weight() + " kg";
    }
    
}
