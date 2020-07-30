/**
 * @author Ridhi Tamirasa
 * @version 7/27/2020
*/

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;
import java.util.Scanner;
import java.util.ArrayList;
 /**
  * This class allows users to go through the process of stock evaluation.
  * Performs calculations for them, as they navigate through yahoo finance.
  */
 public class StockAnalyzer{
     /**
     * Calculated growth PE. 
     * @param mc This is the user input of the market cap.
     * @param mni This is the user input of the margin net income.
     * @return calculated PE.
     */
    public static double calcPE(double mc, double mni){
        double calcPE = (mc/mni);
        return calcPE;
    }
      /**
     * Calculated growth Marketcap.
     * @param mni This is the user input of the margin net income.
     * @param mg This is the user input of their predicted margin percentage growth.
     * @param ni This is the user input of their prediction of years of margin growth.
     * @return calculated growth market cap.
     */
    public static double calcgMarketcap(double mni, double mg, double ni){
        double calcgMarketcap = ((Math.pow((mni*(1+mg)),ni))*20);
        return calcgMarketcap;
    }
      /**
     * This is the main program that accepts user input and displays calculations. 
     * @param args Unused.
     * @return Content in the console.
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your stock ticker name (symbol)");
        String name = in.nextLine();
        
        System.out.println("Use the following url to find your stock in yahoo finance.");
        System.out.println("finance.yahoo.com/lookup?s="+ name);
        
        System.out.println("Take a minute to look at the graph of the stock before continuing on with calculations. Is it consistent over time? Refer back to the AAPL CHART tile, it is an example of a good graph.");
        
        System.out.println("We will be making several calculations today,calculated PE, ideal Market Cap with growth, and ideal stock price with growth. Please keep all numbers in terms of millions.");
        
        System.out.println("Let's begin with the margin net income of last year. What was it?(You can find this in the financials tab)");
        double mni = in.nextDouble();
        
        System.out.println("Market Cap?");
        double mc = in.nextDouble();
        
        System.out.println("Now we will be finding the ideal market cap with growth.");
        System.out.println("By what percent do you expect the margin(net income/revenue) to grow?");
        
        double mg = in.nextDouble();
        
        System.out.println("How about the number of years the income of the company will grow?");
        double ni = in.nextDouble();
        
        System.out.println("Last question, what is the basic averarage shares?");
        double sh = in.nextDouble();
        
        System.out.println("Time to use your best judgement.");
        System.out.println("Your calculated growth PE is:  " +StockAnalyzer.calcPE(mc, mni));
        System.out.println("Your calculated growth margin is:  " +StockAnalyzer.calcgMarketcap(mni, mg, ni));
        System.out.println("Your calculated ideal growth stock price is:  " + (StockAnalyzer.calcgMarketcap(mni, mg, ni))/ sh);
        if((StockAnalyzer.calcPE(mc, mni)) <=100){
            System.out.println("The PE is very good, this is a good company to invest in");
         }
         else{
             System.out.println("Observe the other values, is the ideal growth stock price greater than the stock price right now?");
             System.out.println("Do you belive that this stock will change");
            }
      System.out.println("Thank you for participating in this simple investment analysis program. If you liked this, be sure to learn more.");
    }}