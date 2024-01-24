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

public class Herd implements Movable{
    private ArrayList<Movable> list;
    
    public Herd() {
        this.list = new ArrayList<>();
    }
    
    @Override
    public String toString() {
        String p = "";
        for (Movable m: this.list) {
           p += m.toString() + "\n";
        }
        return p;
    }
    
    public void addToHerd(Movable movable) {
        this.list.add(movable);
    }
    
    public void move (int dx, int dy) {
        for (Movable m: this.list) {
            m.move(dx, dy);
        }
    }
    
}
