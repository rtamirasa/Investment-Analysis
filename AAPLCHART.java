/**Copyright (c) 1995, 2008, Oracle and/or its affiliates. All rights reserved.
 * @author Ridhi Tamirasa
 * @version 7/27/2020
*/

//import statements for the graph
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.Timer;
  /**
  * This class displays the chart of Apple's closing stock price.
  * Gives users an example of a stock graph.
  */
public class AAPLCHART extends Application {
    
     /** 
    * This method is used to start and create the aapl graph using data from yahoo finance.
    * 
    * @param stage 
    * @return stage, (the graph)
    */  
    
    @Override public void start(Stage stage) {
        stage.setTitle("Line Chart");
        final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
        xAxis.setLabel("Month");       
        
        final LineChart<String,Number> lineChart = 
                new LineChart<String,Number>(xAxis,yAxis);
                
        lineChart.setTitle("AAPL closing stock price, 2019");
                                
        XYChart.Series series = new XYChart.Series();
        series.setName("Stock Closing Price");
        
        series.getData().add(new XYChart.Data("Jan", 156.82));
        series.getData().add(new XYChart.Data("Feb", 174.18));
        series.getData().add(new XYChart.Data("Mar", 195.09));
        series.getData().add(new XYChart.Data("Apr", 287.05));
        series.getData().add(new XYChart.Data("May", 315.01));
        series.getData().add(new XYChart.Data("Jun", 366.53));
        series.getData().add(new XYChart.Data("Jul", 393.43));
        series.getData().add(new XYChart.Data("Aug", 212.46));
        series.getData().add(new XYChart.Data("Sep", 223.59));
        series.getData().add(new XYChart.Data("Oct", 249.05));
        series.getData().add(new XYChart.Data("Nov", 267.10));
        series.getData().add(new XYChart.Data("Dec", 291.52));
        
        
        Scene scene  = new Scene(lineChart,800,600);
        lineChart.getData().add(series);
       
        stage.setScene(scene);
        stage.show();
    }
     /** 
    * This method is largely ignored as main is used as a fallback for JavaFx.
    * @param args
    * @return Nothing.
    */
 
    public static void main(String[] args) {
        launch(args);
       
        }
}