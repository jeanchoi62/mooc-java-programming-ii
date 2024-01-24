
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.*;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here
    }
    //implement the class method public static List<Integer> positive(List<Integer> numbers)
    public static List<Integer> positive(List<Integer> numbers) {
        ArrayList<Integer> values = numbers.stream() 
                .filter(value -> value >= 0)
                .collect(Collectors.toCollection(ArrayList::new));
        return values;
    }

}
