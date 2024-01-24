
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0;
        double positiveCount = 0;
        
        while (true) {
            double input = Integer.valueOf(scanner.nextLine()).doubleValue();
            if (input == 0) {
                if (total <= 0) {
                    System.out.println("Cannot calculate the average");
                    return;
                }
                System.out.println(total/positiveCount);
                return;
        		
            } 
            if (input > 0) {
                positiveCount++;
                total += input;
            } 
        }
    }
}