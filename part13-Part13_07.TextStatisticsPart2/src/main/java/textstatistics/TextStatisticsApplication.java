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
import javafx.scene.layout.VBox;
import javafx.scene.control.TextArea;
import javafx.event.EventHandler;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

import java.util.*;
import java.util.stream.Stream;

public class TextStatisticsApplication extends Application {
    
    public void start(Stage window) {
        
        BorderPane layout = new BorderPane();
        HBox h = new HBox();
        h.setSpacing(10);
        
        TextArea leftText = new TextArea();
        Label letters = new Label("Letters: ");
        Label wordsLabel = new Label("Words: ");
        Label longestLabel = new Label("The longest word is: ");
        h.getChildren().add(letters);
        h.getChildren().add(wordsLabel);
        h.getChildren().add(longestLabel);
        
        layout.setCenter(leftText);
        layout.setBottom(h);
        
        Scene view = new Scene(layout);
        
        window.setScene(view);
        window.show();
        
        
        leftText.textProperty().addListener((lettersLabel, oldValue, newValue) -> {
            int characters = newValue.length();
            String[] parts = newValue.split(" ");
            int words = parts.length;
            String longest = Arrays.stream(parts)
                .sorted((s1, s2) -> s2.length() - s1.length())
                .findFirst()
                .get();

            // set values of text elements
            letters.setText("Letters: " + String.valueOf(characters));
            wordsLabel.setText("Words: " + String.valueOf(words));
           longestLabel.setText("The longest word is: " + longest);
        });
        
        
        
        
    }


    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }
}