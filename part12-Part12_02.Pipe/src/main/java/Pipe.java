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

public class Pipe <T>{
    private ArrayList<T> list;
    
    public Pipe() {
        this.list = new ArrayList<>();
    }
    
    public void putIntoPipe(T value) {
        this.list.add(value);
    }
    
    public T takeFromPipe() {
        T t = null;
        if (this.list.isEmpty()) {
            return null;
        } else {
            t = this.list.get(0);
        }
        
        return t;
    }
    
    public boolean isInPipe() {
        if (this.list.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }
}
