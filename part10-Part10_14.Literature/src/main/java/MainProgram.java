
import java.util.Scanner;
import java.util.*;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        
        while (true) {
            System.out.print("Input the name of the book, empty stops: ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            } else {
            System.out.println("Input the age recommendation: ");
            Integer age = Integer.valueOf(scanner.nextLine());
            Book book = new Book(title, age);
            books.add(book);
            }
        }
        
        System.out.println(books.size() + " books in total.");
        System.out.println("Books: ");
        
        Comparator<Book> comparator = Comparator
                .comparing(Book::getAge)
                .thenComparing(Book::getName);
        
        Collections.sort(books, comparator);
        
        for (Book b: books) {
            System.out.println(b);
        }
            

    }

}
