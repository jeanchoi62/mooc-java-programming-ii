package application;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import java.util.Scanner;

public class MultipleViews extends Application {
    
    
@Override
public void start(Stage window) {
	Label t = new Label("First view!");
	Button b = new Button("To the second view!");
	BorderPane layoutFirst = new BorderPane();
	layoutFirst.setTop(t);
	layoutFirst.setCenter(b);
	Scene first = new Scene(layoutFirst);
	
	VBox v = new VBox();
	Button b2 = new Button("To the third view!");
	Label t2 = new Label("Second view!");
	v.getChildren().add(b2);
	v.getChildren().add(t2);
	Scene second = new Scene(v);
	
	GridPane g = new GridPane();
	g.add(new Label("Third view!"), 0, 0);
	Button b3 = new Button("To the first view!");
	g.add(b3, 1, 1);
	Scene third = new Scene(g);
	
	b.setOnAction((event) -> {
		window.setScene(second);
	});
	
	b2.setOnAction((event) -> {
		window.setScene(third);
	});
	
	b3.setOnAction((event) -> {
		window.setScene(first);
	});
	
	
	window.setScene(first);
	window.show();
}

    public static void main(String[] args) {
        launch(MultipleViews.class);
    }

}
