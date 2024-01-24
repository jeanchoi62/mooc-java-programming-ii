/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jeanmac
 */
public class Hideout<T> {
    private T elem;
    
    public Hideout() {
        
    }
    
    public void putIntoHideout(T toHide) {
        this.elem = toHide;
    }
    
    public T takeFromHideout() {
        
        T temp = null;
        if (this.elem == null) {
            return null;
        } else {
            temp = this.elem;
            this.elem = null;
        }
        return temp;
    }
    
    public boolean isInHideout() {
        if (this.elem == null) {
            return false;
        } else {
            return true;
        }
    }
    
    
    
    
}
