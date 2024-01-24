
import java.util.Scanner;

public class Program {
    
    public static int sum(int[] array, int fromWhere, int toWhere, int smallest, int largest) {
        //if from where is < 0 
        int start = 0;
        if (fromWhere < 0) {
            start = 0;
        } else {
            start = fromWhere;
        }
        
        int end = 0;
        //if toWhere is > length of array
        if (toWhere >= array.length) {
            end = array.length - 1;
        } else {
            end = toWhere;
        }
        
        int total = 0;
        for (int i = start; i <= end; i++) {
            if (array[i] <= largest && array[i]>= smallest) {
                total += array[i];
            }
        }
        
        return total;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // test your method here

    }
}
