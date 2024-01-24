package smiley;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class SmileyApplication extends Application {



    @Override
    public void start(Stage primaryStage) {
        Canvas paintingCanvas = new Canvas(640, 480);
        Canvas perm = new Canvas(640, 480);

        GraphicsContext painter = paintingCanvas.getGraphicsContext2D();



        BorderPane paintingLayout = new BorderPane();
        paintingLayout.setStyle("-fx-background-color: white");
        paintingLayout.setCenter(paintingCanvas);
        paintingCanvas.setStyle("-fx-background-color: white");
        painter.setFill(Color.BLACK);
        painter.fillRect(30.897, 36.897 ,10, 10);
        paintingCanvas.setLayoutX(27.8786);

        //set event listener
//        paintingCanvas.setOnMouseDragged(event -> {
//            double xLocation = event.getX();
//            double yLocation = event.getY();
//            painter.setFill(Color.BLACK);
//            painter.fillRect(xLocation, yLocation, 10, 10);
//
//        });



        perm = paintingCanvas;



        Scene scene = new Scene(paintingLayout);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
