/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JeanASUS
 */
public class AverageSensor implements Sensor{
    private ArrayList<Sensor> list;
    private ArrayList<Integer> intlist;
    
    public AverageSensor() {
        this.list = new ArrayList<>();
        this.intlist = new ArrayList<>();
    }

    @Override
    public boolean isOn() {
        for (Sensor s: this.list) {
            if (s.isOn() == false) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public void setOn() {
        for (Sensor s: this.list) {
            s.setOn();
        }
    }    
    @Override
    public void setOff() {
        for (Sensor s: this.list) {
            s.setOff();
        }
    }    
    
    @Override
    public int read() {
        
        if (this.isOn() == false || this.list.isEmpty()) {
            throw new IllegalStateException("");
        }
        int total = 0;
        
        for (Sensor s: this.list) {
            total += s.read();
            
            
        }
        
        int result = total / this.list.size();
        this.intlist.add(result);
        return result;
        
    }
    
    public void addSensor(Sensor toAdd) {
        this.list.add(toAdd);
    }
    
    public List<Integer> readings() {
        return this.intlist;
    }
}
