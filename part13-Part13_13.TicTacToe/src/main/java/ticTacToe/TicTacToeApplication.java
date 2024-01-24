package ticTacToe;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class TicTacToeApplication extends Application {
    private double count =1;

    @Override
    public void start(Stage window) {
        BorderPane layout = new BorderPane();
        Label turnLabel = new Label();
        Label gameOverLabel = new Label();

        GridPane gridPane = new GridPane();
        Button topLeft = new Button();
        topLeft.setFont(Font.font("Monospaced", 40));
        Button topMiddle = new Button();
        topMiddle.setFont(Font.font("Monospaced", 40));
        Button topRight = new Button();
        topRight.setFont(Font.font("Monospaced", 40));
        Button middleLeft = new Button();
        middleLeft.setFont(Font.font("Monospaced", 40));
        Button middleMiddle = new Button();
        middleMiddle.setFont(Font.font("Monospaced", 40));
        Button middleRight = new Button();
        middleRight.setFont(Font.font("Monospaced", 40));
        Button bottomLeft = new Button();
        bottomLeft.setFont(Font.font("Monospaced", 40));
        Button bottomMiddle = new Button();
        bottomMiddle.setFont(Font.font("Monospaced", 40));
        Button bottomRight = new Button();
        bottomRight.setFont(Font.font("Monospaced", 40));

        gridPane.addRow(0, topLeft, topMiddle, topRight);
        gridPane.addRow(1, middleLeft, middleMiddle, middleRight);
        gridPane.addRow(2, bottomLeft, bottomMiddle, bottomRight);


        layout.setTop(turnLabel);
        layout.setCenter(gridPane);
        layout.setBottom(gameOverLabel);

        layout.setPadding(new Insets(20, 20, 20, 20));

        Scene scene = new Scene(layout);


        // First turn is always X
        turnLabel.setText("Turn: X");


        // top left button
        topLeft.setOnAction((event) -> {
            if (turnLabel.getText().equals("Turn: X")
                    && topLeft.getText().equals("")
                    && gameOverLabel.getText().equals("")) {

                if (middleLeft.getText().equals("X") && bottomLeft.getText().equals("X") ||
                        topMiddle.getText().equals("X") && topRight.getText().equals("X") ||
                        middleMiddle.getText().equals("X") && bottomRight.getText().equals("X")) {
                    topLeft.setText("X");
                    gameOverLabel.setText("The end!");
                    turnLabel.setText("The end!");

                }
                 else  {
                     turnLabel.setText("Turn: O");
                     topLeft.setText("X");
                }

            } else if (turnLabel.getText().equals("Turn: O")
                    && topLeft.getText().equals("")
                    && gameOverLabel.getText().equals("")) {
                if (middleLeft.getText().equals("O") && bottomLeft.getText().equals("O") ||
                        topMiddle.getText().equals("O") && topRight.getText().equals("O") ||
                        middleMiddle.getText().equals("O") && bottomRight.getText().equals("O")) {
                    topLeft.setText("0");
                    gameOverLabel.setText("The end!");
                    turnLabel.setText("The end!");

                } else {
                    turnLabel.setText("Turn: X");
                    topLeft.setText("O");
                }
            }
        });

        // top middle
        topMiddle.setOnAction((event) -> {
            if (turnLabel.getText().equals("Turn: X")
                    && topMiddle.getText().equals("")
                    && gameOverLabel.getText().equals("")) {
                if (topLeft.getText().equals("X") && topRight.getText().equals("X") ||
                        middleMiddle.getText().equals("X") && bottomMiddle.getText().equals("X")) {
                    topMiddle.setText("X");
                    gameOverLabel.setText("The end!");
                    turnLabel.setText("The end!");
                } else {
                    turnLabel.setText("Turn: O");
                    topMiddle.setText("X");
                }
            } else if (turnLabel.getText().equals("Turn: O")
                    && topMiddle.getText().equals("")
                    && gameOverLabel.getText().equals("")) {
                if (topLeft.getText().equals("O") && topRight.getText().equals("O") ||
                        middleMiddle.getText().equals("O") && bottomMiddle.getText().equals("O")) {
                    topMiddle.setText("O");
                    gameOverLabel.setText("The end!");
                    turnLabel.setText("The end!");
                } else {
                    turnLabel.setText("Turn: X");
                    topMiddle.setText("O");
                }
            }
        });


        // top right
        topRight.setOnAction((event) -> {
            if (turnLabel.getText().equals("Turn: X")
                    && topRight.getText().equals("")
                    && gameOverLabel.getText().equals("")) {
                if (topLeft.getText().equals("X") && topMiddle.getText().equals("X") ||
                        middleMiddle.getText().equals("X") && bottomLeft.getText().equals("X")
                        || middleRight.getText().equals("X") && bottomRight.getText().equals("X")) {
                    topRight.setText("X");
                    gameOverLabel.setText("The end!");
                    turnLabel.setText("The end!");
                } else {
                    turnLabel.setText("Turn: O");
                    topRight.setText("X");
                }
            } else if (turnLabel.getText().equals("Turn: O")
                    && topRight.getText().equals("")
                    && gameOverLabel.getText().equals("")) {
                if (topLeft.getText().equals("O") && topMiddle.getText().equals("O") ||
                        middleMiddle.getText().equals("O") && bottomLeft.getText().equals("O")
                        || middleRight.getText().equals("O") && bottomRight.getText().equals("O")) {
                    topRight.setText("O");
                    gameOverLabel.setText("The end!");
                    turnLabel.setText("The end!");
                } else {
                    turnLabel.setText("Turn: X");
                    topRight.setText("O");
                }
            }
        });

        // middle left
        middleLeft.setOnAction((event) -> {
            if (turnLabel.getText().equals("Turn: X")
                    && middleLeft.getText().equals("")
                    && gameOverLabel.getText().equals("")) {
                if (topLeft.getText().equals("X") && bottomRight.getText().equals("X") ||
                        middleMiddle.getText().equals("X") && middleRight.getText().equals("X")) {
                    middleLeft.setText("X");
                    gameOverLabel.setText("The end!");
                    turnLabel.setText("The end!");
                } else {
                    turnLabel.setText("Turn: O");
                    middleLeft.setText("X");
                }
            } else if (turnLabel.getText().equals("Turn: O")
                    && middleLeft.getText().equals("")
                    && gameOverLabel.getText().equals("")) {
                if (topLeft.getText().equals("O") && bottomRight.getText().equals("O") ||
                        middleMiddle.getText().equals("O") && middleRight.getText().equals("O")) {
                    middleLeft.setText("O");
                    gameOverLabel.setText("The end!");
                    turnLabel.setText("The end!");
                } else {

                    turnLabel.setText("Turn: X");
                    middleLeft.setText("O");
                }
            }
        });

        // middle middle
        middleMiddle.setOnAction((event) -> {
            if (turnLabel.getText().equals("Turn: X")
                    && middleMiddle.getText().equals("")
                    && gameOverLabel.getText().equals("")) {
                if (topMiddle.getText().equals("X") && bottomMiddle.getText().equals("X") ||
                        middleLeft.getText().equals("X") && middleRight.getText().equals("X")
                        || topLeft.getText().equals("X") && bottomRight.getText().equals("X")
                        || topRight.getText().equals("X") && bottomLeft.getText().equals("X")) {
                    middleLeft.setText("X");
                    gameOverLabel.setText("The end!");
                    turnLabel.setText("The end!");
                } else {
                    turnLabel.setText("Turn: O");
                    middleMiddle.setText("X");
                }

            } else if (turnLabel.getText().equals("Turn: O")
                    && middleMiddle.getText().equals("")
                    && gameOverLabel.getText().equals("")) {
                if (topMiddle.getText().equals("O") && bottomMiddle.getText().equals("O") ||
                        middleLeft.getText().equals("O") && middleRight.getText().equals("O")
                        || topLeft.getText().equals("O") && bottomRight.getText().equals("O")
                        || topRight.getText().equals("O") && bottomLeft.getText().equals("O")) {
                    middleLeft.setText("O");
                    gameOverLabel.setText("The end!");
                    turnLabel.setText("The end!");
                } else {
                    turnLabel.setText("Turn: X");
                    middleMiddle.setText("O");
                }
            }
        });

        // middle right
        middleRight.setOnAction((event) -> {
            if (turnLabel.getText().equals("Turn: X")
                    && middleRight.getText().equals("")
                    && gameOverLabel.getText().equals("")) {
                if (topRight.getText().equals("X") && bottomRight.getText().equals("X") ||
                        middleMiddle.getText().equals("X") && middleLeft.getText().equals("X")) {
                    middleLeft.setText("X");
                    gameOverLabel.setText("The end!");
                    turnLabel.setText("The end!");
                } else {
                    turnLabel.setText("Turn: O");
                    middleRight.setText("X");
                }
            } else if (turnLabel.getText().equals("Turn: O")
                    && middleRight.getText().equals("")
                    && gameOverLabel.getText().equals("")) {
                if (topRight.getText().equals("O") && bottomRight.getText().equals("O") ||
                        middleMiddle.getText().equals("O") && middleLeft.getText().equals("O")) {
                    middleLeft.setText("O");
                    gameOverLabel.setText("The end!");
                    turnLabel.setText("The end!");
                } else {
                    turnLabel.setText("Turn: X");
                    middleRight.setText("O");
                }
            }
        });



        // bottom left
        bottomLeft.setOnAction((event) -> {
            if (turnLabel.getText().equals("Turn: X")
                    && bottomLeft.getText().equals("")
                    && gameOverLabel.getText().equals("")) {
                if (middleLeft.getText().equals("X") && topLeft.getText().equals("X") ||
                        bottomMiddle.getText().equals("X") && bottomRight.getText().equals("X")
                        || middleMiddle.getText().equals("X") && topRight.getText().equals("X")) {
                    middleLeft.setText("X");
                    gameOverLabel.setText("The end!");
                    turnLabel.setText("The end!");
                } else {
                    turnLabel.setText("Turn: O");
                    bottomLeft.setText("X");
                }
            } else if (turnLabel.getText().equals("Turn: O")
                    && bottomLeft.getText().equals("")
                    && gameOverLabel.getText().equals("")) {
                if (middleLeft.getText().equals("O") && topLeft.getText().equals("O") ||
                        bottomMiddle.getText().equals("O") && bottomRight.getText().equals("O")
                        || middleMiddle.getText().equals("O") && topRight.getText().equals("O")) {
                    middleLeft.setText("O");
                    gameOverLabel.setText("The end!");
                    turnLabel.setText("The end!");
                } else {
                    turnLabel.setText("Turn: X");
                    bottomLeft.setText("O");
                }
            }
        });

        // bottom middle

        bottomMiddle.setOnAction((event) -> {
            if (turnLabel.getText().equals("Turn: X")
                    && bottomMiddle.getText().equals("")
                    && gameOverLabel.getText().equals("")) {
                if (middleMiddle.getText().equals("X") && topMiddle.getText().equals("X") ||
                        bottomLeft.getText().equals("X") && bottomRight.getText().equals("X")) {
                    middleLeft.setText("X");
                    gameOverLabel.setText("The end!");
                    turnLabel.setText("The end!");
                } else {

                    turnLabel.setText("Turn: O");
                    bottomMiddle.setText("X");
                }
            } else if (turnLabel.getText().equals("Turn: O")
                    && bottomMiddle.getText().equals("")
                    && gameOverLabel.getText().equals("")) {
                if (middleMiddle.getText().equals("O") && topMiddle.getText().equals("O") ||
                        bottomLeft.getText().equals("O") && bottomRight.getText().equals("O")) {
                    middleLeft.setText("O");
                    gameOverLabel.setText("The end!");
                    turnLabel.setText("The end!");
                } else {
                    turnLabel.setText("Turn: X");
                    bottomMiddle.setText("O");
                }
            }
        });

        // bottom right
        bottomRight.setOnAction((event) -> {
            if (turnLabel.getText().equals("Turn: X")
                    && bottomRight.getText().equals("")
                    && gameOverLabel.getText().equals("")) {
                if (middleRight.getText().equals("X") && topRight.getText().equals("X") ||
                        middleMiddle.getText().equals("X") && topLeft.getText().equals("X")
                || bottomLeft.getText().equals("X") && bottomMiddle.getText().equals("X")) {
                    middleLeft.setText("X");
                    gameOverLabel.setText("The end!");
                    turnLabel.setText("The end!");
                } else {
                    turnLabel.setText("Turn: O");
                    bottomRight.setText("X");
                }
            } else if (turnLabel.getText().equals("Turn: O")
                    && bottomRight.getText().equals("")
                    && gameOverLabel.getText().equals("")) {
                if (middleRight.getText().equals("O") && topRight.getText().equals("O") ||
                        middleMiddle.getText().equals("O") && topLeft.getText().equals("O")
                        || bottomLeft.getText().equals("O") && bottomMiddle.getText().equals("O")) {
                    middleLeft.setText("O");
                    gameOverLabel.setText("The end!");
                    turnLabel.setText("The end!");
                } else {
                    turnLabel.setText("Turn: X");
                    bottomRight.setText("O");
                }
            }
        });


        window.setScene(scene);
        window.show();

    }
    public static void main(String[] args) {
        launch(TicTacToeApplication.class);
    }
}