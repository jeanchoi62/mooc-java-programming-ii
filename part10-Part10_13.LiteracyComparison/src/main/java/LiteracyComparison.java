
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.*;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        
        try {
            
            		Files.lines(Paths.get("literacy.csv"))
				.sorted((p1, p2) -> { return Double.valueOf(p1.split(",")[5].trim())
						.compareTo(Double.valueOf(p2.split(",")[5].trim()));
					
				}).forEach(p -> System.out.println( 
                                        p.split(",")[3].trim() 
                                        + " (" 
                                        + p.split(",")[4].trim()
                                        + "), "
                                        + p.split(",")[2].trim().split(" ")[0]
                                        // (p.split(",")[2].trim()).split("(")[0].trim()
                                        + ", "
                                        + p.split(",")[5].trim()));
                                        
                             

            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        

    }
}
