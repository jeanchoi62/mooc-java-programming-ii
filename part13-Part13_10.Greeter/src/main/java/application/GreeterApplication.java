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

public class GreeterApplication extends Application {
	@Override
	public void start(Stage window) {
		Label greet = new Label("Enter your name and start.");
		TextField name = new TextField();
		Button start = new Button("Start");
		
		GridPane layout = new GridPane();
		layout.add(greet, 0, 0);
		layout.add(name, 0, 1);
		layout.add(start, 0, 2);
		
		Scene passwordView = new Scene(layout);
		
		
		
		
		// View for successful login / view
		GridPane successLayout = new GridPane();
		Label welcome = new Label();
		successLayout.add(welcome, 0, 0);
		Scene successScene = new Scene(successLayout);
		
		start.setOnAction((event) -> {
			welcome.setText("Welcome " + name.getText() + "!");
			window.setScene(successScene);
		});
		
		window.setScene(passwordView);
		window.show();	
	}

	public static void main(String[] args) {
		launch(GreeterApplication.class);
	}

}