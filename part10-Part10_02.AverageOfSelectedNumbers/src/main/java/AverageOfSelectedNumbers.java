import java.util.*;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        List<String> list = new ArrayList<>();
        // Write your program here
        System.out.println("Input numbers, type \"end\" to stop.");
        double n = 0.00;
        double p = 0.00;
        
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
                String numType = scanner.nextLine();
                if (numType.equals("n")) {
                    n = list.stream()
                            .mapToInt(s -> Integer.valueOf(s))
                            .filter(number -> number < 0)
                            .average()
                            .getAsDouble();
                    System.out.println("Average of the negative numbers: " + n);
                } if (numType.equals("p")) {
                    p = list.stream()
                            .mapToInt(s -> Integer.valueOf(s))
                            .filter(number -> number > 0)
                            .average()
                            .getAsDouble();
                    System.out.println("Average of the positive numbers: " + p);
                }
                break;
            } 
            list.add(input);
        }
        

    }
}
