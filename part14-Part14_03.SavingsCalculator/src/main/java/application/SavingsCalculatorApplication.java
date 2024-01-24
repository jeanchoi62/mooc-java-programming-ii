package application;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class SavingsCalculatorApplication extends Application {
    int monthlyInput = 25;
    int oneYearSavings =0;
    XYChart.Series monthlyLine = new XYChart.Series();
    XYChart.Series interestLine = new XYChart.Series();
    NumberAxis yAxis = new NumberAxis(0, 10000, 2500);

    double interestRate = 0.0;
    @Override
    public void start(Stage primaryStage) {
        BorderPane layout = new BorderPane();
        NumberAxis xAxis = new NumberAxis(  0, 30, 1);
        yAxis.setLabel("Savings");
        xAxis.setLabel("Years");

        // create the line chart
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Savings Calculator");
        layout.setCenter(lineChart);
        monthlyLine.setName("Monthly Savings ");
        interestLine.setName("Interest ");

//TOP   The first BorderPane (on top) contains the text "Monthly savings" on the left,
//$$    a slider in the middle and a text describing the slider on the right.
        BorderPane monthlySavingsLayout = new BorderPane();
        monthlySavingsLayout.setLeft(new Label("Monthly savings"));
        Slider monthlySlider = new Slider();
        monthlySavingsLayout.setCenter(monthlySlider);
        Label monthDesc = new Label("25");
        monthDesc.setTextFill(Color.BLACK);
        // set slider tick increments
        monthlySlider.setMin(25);
        monthlySlider.setMax(250);
        monthlySlider.setBlockIncrement(25);
        // show tick marksS
        monthlySlider.setShowTickLabels(true);
        monthlySlider.setShowTickMarks(true);
//BOTTOMThe second BorderPane (below the first one) has the text "Yearly interest rate"
//years on the left, a slider in the middle and a text describing the slider on the right.
        BorderPane yearlyInterestLayout = new BorderPane();
        yearlyInterestLayout.setLeft(new Label("Yearly interest rate"));
        Slider yearlyInterestSlider = new Slider();
        yearlyInterestLayout.setCenter(yearlyInterestSlider);
        Label yearlyInterest = new Label("0");
        yearlyInterest.setTextFill(Color.BLACK);
        // set slider ticks
        yearlyInterestSlider.setMin(0);
        yearlyInterestSlider.setMax(10);
        yearlyInterestSlider.setBlockIncrement(1);
        // show tick marks
        yearlyInterestSlider.setShowTickMarks(true);
        yearlyInterestSlider.setShowTickLabels(true);


        ////
        for (int i = 0; i< 31; i++) {
            monthlyLine.getData().add(new XYChart.Data(i, (25 *12)*i));
        }
        // add listener to slider


        // add listener
        yearlyInterestSlider.valueProperty().addListener(
                new ChangeListener<Number>() {
                    @Override
                    public void changed(ObservableValue<? extends Number>
                                                observableValue, Number oldValue, Number newValue)
                    {
                        yearlyInterest.setText("" + newValue.intValue());
                        interestRate = newValue.doubleValue() / 100;
                        monthlyLine.getData().clear();
                        interestLine.getData().clear();
                        int newMax = monthlyInput *2500;
                        yAxis.setUpperBound(newMax);
                        yAxis.setTickUnit(newMax/10);

                        double a = 0;
                        double c = 0;
                        for (int j = 0; j< 31; j++) {
                            double b = (a + c) * interestRate;
                            double cTemp = c;
                            c = a + b + cTemp;
                            System.out.println("Year: " + j + " Value: " + c);

                            interestLine.getData().add(new XYChart.Data(j, c));
                            a = monthlyInput *12;
                        }
                        for (int i = 0; i< 31; i++) {
                        monthlyLine.getData().add(new XYChart.Data(i, monthlyInput *i*12));
                    }
                    }

                }
        );
        monthlySlider.valueProperty().addListener(
                new ChangeListener<Number>() {
                    @Override
                    public void changed(ObservableValue<? extends Number>
                                                observableValue, Number oldValue, Number newValue)
                    {
                        monthlyInput = newValue.intValue();
                        oneYearSavings = monthlyInput * 12;

                        monthDesc.setText("" + monthlyInput);
                        monthlyLine.getData().clear();
                        int newMax = monthlyInput *2500;
                        yAxis.setUpperBound(newMax);
                        yAxis.setTickUnit(newMax/10);

                        monthlyLine.getData().clear();
                        interestLine.getData().clear();
                        double a = 0;
                        double c = 0;
                        for (int j = 0; j< 31; j++) {
                            double b = (a + c) * interestRate;
                            double cTemp = c;
                            c = a + b + cTemp;
                            System.out.println("Year: " + j + " Value: " + c);

                            interestLine.getData().add(new XYChart.Data(j, c));
                            a = monthlyInput *12;
                        }
                        for (int i = 0; i< 31; i++) {
                            monthlyLine.getData().add(new XYChart.Data(i, monthlyInput *i*12));
                        }


                    }
                }
        );
        yearlyInterestLayout.setRight(yearlyInterest);
        monthlySavingsLayout.setRight(monthDesc);
        lineChart.getData().add(monthlyLine);
        lineChart.getData().add(interestLine);
        VBox vbox = new VBox();
        vbox.getChildren().add(monthlySavingsLayout);
        vbox.getChildren().add(yearlyInterestLayout);
        layout.setTop(vbox);

        Scene scene = new Scene(layout);

        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(SavingsCalculatorApplication.class);
    }
}