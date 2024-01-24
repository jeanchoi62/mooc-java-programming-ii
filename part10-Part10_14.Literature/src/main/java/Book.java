import java.util.*;
public class Book {
    private String book;
    private int age;
    
    public Book(String book, int age) {
        this.book = book;
        this.age = age;
    }
    
    public int getAge() {
    	return this.age;
    }
    
    public String getName() {
        return this.book;
    }
    
    @Override
    public String toString() {
    	return this.book + " (recommended for " + this.age + " year-olds or older)";
    }
    
    
    
}
