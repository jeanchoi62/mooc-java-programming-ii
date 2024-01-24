

package application;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import java.util.Scanner;
import javafx.scene.layout.HBox;


public class JokeApplication extends Application{
    
    @Override
    public void start(Stage window) {
    		BorderPane layout = new BorderPane();
		Label mainText = new Label("What do you call a bear with no teeth?");
		Button jokeButton = new Button("Joke");
		Button answer = new Button("Answer");
		Button explanation = new Button("Explanation");
		
		VBox menu = new VBox();
		menu.getChildren().add(mainText);
		menu.getChildren().addAll(jokeButton, answer, explanation);
		
		layout.setTop(menu);
		
		Scene scene = new Scene(layout);
		
		jokeButton.setOnAction((event) -> mainText.setText("What do you call a bear with no teeth?")
		);
		
		
		answer.setOnAction((event) -> mainText.setText("A gummy bear."));
		
		explanation.setOnAction((event) -> mainText.setText("A gummy bear because a mouth with no teeth is gummy."));
		
		window.setScene(scene);
		window.show();
    }

    public static void main(String[] args) {
        launch(JokeApplication.class);
    }
}
