
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
import java.util.stream.Collectors;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        
        while(true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input <0) {
            break;
        } list.add(input);
        }
        
        ArrayList<Integer> output = list.stream()
                .filter(value -> value >= 1 && value <= 5)
                .collect(Collectors.toCollection(ArrayList::new));
        
        output.stream()
                .forEach(value -> System.out.println(value));

    }
}
