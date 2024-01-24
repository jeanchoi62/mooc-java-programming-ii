package application;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

import java.util.*;
import java.nio.file.Paths;

public class PartiesApplication extends Application {
    @Override
    public void start(Stage stage) {
        HashMap<String, HashMap<Integer, Double>> values = new HashMap<>();
        ArrayList<Integer> yearList = new ArrayList<>();
        String file = "partiesdata.tsv";

        try(Scanner data = new Scanner(Paths.get(file))) {
            String row = data.nextLine();
            String[] pieces = row.split("\t");

            // just get the years
            for (int i = 1; i < pieces.length; i++) { // skip first
                yearList.add(Integer.parseInt(pieces[i]));
            }

            System.out.println(yearList.size());
            for (int i: yearList) {
                System.out.println(i);
            }

            while (data.hasNext()) {
                String next = data.nextLine();
                pieces = next.split("\t");
                String party = pieces[0];
                HashMap<Integer, Double> map = new HashMap<>();
                for (int i = 1; i < pieces.length; i++) {
                    if (!pieces[i].equals("-")) {
                        int year = yearList.get(i-1);
                        String dat = pieces[i];
                        double number = Double.parseDouble(dat);
                        map.put(year, number);
                    }

                }
                values.put(party, map);

            }
        }

        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }


        NumberAxis xAxis = new NumberAxis(  1968, 2008, 4);
        NumberAxis yAxis = new NumberAxis(0, 30, 5);
        yAxis.setLabel("Ranking");
        xAxis.setLabel("Year");

        // create the line chart
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Relative support of the parties");

        // create data set
        values.keySet().stream().forEach(party -> {
            // a different data set for every party
            XYChart.Series data = new XYChart.Series();
            data.setName(party);

            // add the party's support numbers to the data set
            values.get(party).entrySet().stream().forEach(pair -> {
                data.getData().add(new XYChart.Data(pair.getKey(), pair.getValue()));
            });

            // and add the data set to the chart
            lineChart.getData().add(data);
        });

        Scene view = new Scene(lineChart, 640, 480);
        stage.setScene(view);
        stage.show();



    }
    public static void main(String[] args) {
        launch(PartiesApplication.class);
    }
}