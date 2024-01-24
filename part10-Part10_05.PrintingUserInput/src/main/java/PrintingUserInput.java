
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        
        while (true) {
            String row = scanner.nextLine();
            if (row.equals("")) {
                break;
            } list.add(row);
        }
        
        
        
        String output = list.stream()
                .reduce("", (previousString, word) -> previousString + word + "\n");
        System.out.println(output);
        
        
    }
}
