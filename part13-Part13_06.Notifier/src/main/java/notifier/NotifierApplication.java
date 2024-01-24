package notifier;
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
import javafx.event.ActionEvent;


public class NotifierApplication extends Application{
    
    public void start(Stage window) {
        TextField t = new TextField();
        Button b = new Button("COPY");
        Label l = new Label();
        
        b.setOnAction(new EventHandler<ActionEvent>() {
    @Override
    public void handle(ActionEvent event) {
        l.setText(t.getText());
    }
});
        
        
        VBox v = new VBox();
        v.getChildren().add(t);
        v.getChildren().add(b);
        v.getChildren().add(l);
        
        Scene view = new Scene(v);
        
        window.setScene(view);
        window.show();
    }


    public static void main(String[] args) {
        launch(NotifierApplication.class);
    }

}
