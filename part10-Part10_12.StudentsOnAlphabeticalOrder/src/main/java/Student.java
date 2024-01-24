import java.util.*;

public class Student implements Comparable<Student>{

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
    
    @Override
    public int compareTo(Student student) {
        int shortest = 0;
        if (this.name.length() <= student.getName().length()) {
            shortest = this.name.length();
        } else {
            shortest = student.getName().length();
        }
        int r = 0; 
        
        for (int i = 0; i < shortest; i++) {
           
        if (this.name.charAt(i) == student.getName().charAt(i)) {
            continue;
        } else if (this.name.charAt(i) > student.getName().charAt(i)) {
            r = 1;
            return r;
        } else {
            r = -1;
            return r;
            }
        }
        return r;
        
     }   
         
}
        

