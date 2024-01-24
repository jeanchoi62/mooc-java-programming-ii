package title;

import java.util.Scanner;
import javafx.application.Application;
import javafx.application.Application.Parameters;
import javafx.stage.Stage;

public class Main extends Application {
    
    @Override 
     public void start(Stage window) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the title?");
        String title = scanner.nextLine();
         
         Application.Parameters params = getParameters();
         String organization = title;
         String course = params.getNamed().get("course");
         
         window.setTitle(organization + ": " + course);
         window.show();
     }
}
