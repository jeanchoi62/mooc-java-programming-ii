package textstatistics;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.control.TextArea;

public class TextStatisticsApplication extends Application {
    
    public void start(Stage window) {
        
        BorderPane layout = new BorderPane();
        
        
        HBox h = new HBox();
        h.setSpacing(10);
        h.getChildren().add(new Label("Letters: 0"));
        h.getChildren().add(new Label("Words: 0"));
        h.getChildren().add(new Label("The longest word is:"));
        
        layout.setCenter(new TextArea("test"));
        layout.setBottom(h);
        
        Scene view = new Scene(layout);
        
        window.setScene(view);
        window.show();
        
    }


    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }

}
