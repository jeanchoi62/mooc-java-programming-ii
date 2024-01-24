
public class Program {
    
    public static String arrayAsString(int[][] array) {
        String result = "";
        
        for (int i=0; i<array.length;i++) {
            for (int j=0; j<array[i].length; j++) {
                result += array[i][j];
            }
            result += "\n";
        }
                
        return result;
        
    }

    public static void main(String[] args) {
        // Test your method here
    }

}
