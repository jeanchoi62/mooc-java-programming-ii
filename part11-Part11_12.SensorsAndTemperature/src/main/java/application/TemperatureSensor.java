/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.*;

/**
 *
 * @author JeanASUS
 */
public class TemperatureSensor implements Sensor {
    private boolean sensorOn;
    
    public TemperatureSensor() {
        
    }
    
    public boolean isOn() {
        if (this.sensorOn == true) {
            return true;
        } return false;
    }
    
    public void setOn() {
        this.sensorOn = true;
        
    }    
    public void setOff() {
        this.sensorOn = false;
    }    
    
    public int read() {
        if (this.sensorOn == false) {
            throw new IllegalStateException("");
        }
        
        int max = 30;
        int min = -30;
        Random rand = new Random();
        int result = rand.nextInt(max - min +1) + min;
        return result;
        
    }
    
}
