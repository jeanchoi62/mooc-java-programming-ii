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

public class Employees {
    private ArrayList<Person> list;
    
    public Employees() {
        this.list = new ArrayList<>();
        
    }
    
    public void add(Person personToAdd) {
        list.add(personToAdd);
    }
    
    public void add(List<Person> peopleToAdd) {
        for (Person p: peopleToAdd) {
            this.list.add(p);
        }
    }
    
    
    public void print() {
        Iterator<Person> iterator = this.list.iterator();
        
        while(iterator.hasNext()) {
                System.out.println(iterator.next());
            
        }
    }
    
    public void print(Education education) {
        Iterator<Person> iterator = this.list.iterator();
        
        while(iterator.hasNext()) {
            Person e = iterator.next();
            if (e.getEducation() == education) {
                
                System.out.println(e);
            }
        }
    }
    
    public void fire(Education education) {
        Iterator<Person> iterator = this.list.iterator();
        
        while(iterator.hasNext()) {
            if (iterator.next().getEducation() == education) {
                iterator.remove();
            }
        }
    }
}
