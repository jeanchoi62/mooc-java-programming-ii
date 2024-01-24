
import java.util.*;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        // Write your program here
        System.out.println("Input numbers, type \"end\" to stop.");
        
        
        while (true) {
            String input = scanner.nextLine();
            
            if (input.equals("end")) {
                break;
            } 
            list.add(input);
        }
        
        double output = list.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .average()
                .getAsDouble();
        
            System.out.println("average of the numbers: " + output);

    }
}
