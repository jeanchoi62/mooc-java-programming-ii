/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author JeanASUS
 */
public class StandardSensor implements Sensor {
    private int param;
    
    public StandardSensor(int param) {
        this.param = param;
    }
    
    public boolean isOn() {
        return true;
    }
    
    public void setOn() {
        
    }    
    public void setOff() {
        
    }    
    
    public int read() {
        return this.param;
    }
    
}
