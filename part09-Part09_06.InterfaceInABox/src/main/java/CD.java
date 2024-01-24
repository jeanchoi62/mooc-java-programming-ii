/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JeanASUS
 */
public class CD implements Packable{
    private String artist;
    private String name;
    private int pubYear;
    private double weight = 0.1;
    
    public CD(String artist, String name, int pubYear) {
        this.artist = artist;
        this.name = name;
        this.pubYear = pubYear;
    }
    
    public double weight() {
        return this.weight;
    }
    
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.pubYear + ")";
    }
    
    
}
