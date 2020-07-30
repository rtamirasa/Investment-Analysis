/**Copyright (c) 1995, 2008, Oracle and/or its affiliates. All rights reserved.
 * @author Ridhi Tamirasa
 * @version 7/27/2020
*/
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;
 /**
  * This class displays the GUI aspect of the program with cards.
  * 
  */
 
public class Begin {
   /**This static field is the second card/tab*/
    final static String CONCEPTS = "Important Concepts";
     /**This static field is the first card/tab*/
    final static String TEXTPANEL = "Instructions.";
     /**This static field is the third card/tab*/
    final static String SCONCEPTS = "The eight rules";
     /**This uses an integer to add extra window width ensuring a horizontal layout.*/
    final static int extraWindowWidth = 300;
    /** 
    * This method adds components to the pane
    * @param pane
    * @return JavaGUI of pane with cards.
    */
   
    public void addComponentToPane(Container pane) {
        JTabbedPane tabbedPane = new JTabbedPane();
 
        //Create the "tabs".
        JPanel card1 = new JPanel() {
            
         /** 
         * This method makes the window wide for horizontal alignment
         * @param Nothing.
         * @return Size.
         */
            public Dimension getPreferredSize() {
                Dimension size = super.getPreferredSize();
                size.width += extraWindowWidth;
                return size;
            }
        };
        
        //Second panel of text, future graphs
                
        
        final JLabel labela = new JLabel();     
        labela.setBounds(100,20, 100, 50); 
        labela.setSize(400,100);
        labela.setText("For this excercise, begin by looking at the 8 rules, and running the LineChart program.");
        
        
        final JLabel labelb = new JLabel();     
        labelb.setBounds(100,40, 100, 50); 
        labelb.setSize(400,100);
        labelb.setText("That chart is an example of the stock AAPL, and is mainly neutral in pattern.");
        
        
        final JLabel labelc = new JLabel();     
        labelc.setBounds(100,60, 100, 50); 
        labelc.setSize(400,100);
        labelc.setText("We will be looking at a lot of important concepts in stocks today, so head over to the important concept tabs."); 
        
        final JLabel labeld = new JLabel();     
        labelc.setBounds(100,80, 100, 50); 
        labelc.setSize(400,100);
        labelc.setText("to learn about these values. Finish this learning program, by running the StockAnalyzer to do your own stock analysis.");
        
        
        card1.add(labela);
        card1.add(labelb);
        card1.add(labelc);
        card1.add(labeld);
        
        JPanel card2 = new JPanel();
        
        //getting addof the labels and checkboxes
        JFrame f= new JFrame("CheckBox Example");    
        
        final JLabel mlabel = new JLabel();     
        mlabel.setBounds(100,0, 100, 50);
        mlabel.setSize(400,100);   
        
        final JLabel plabel = new JLabel();     
        plabel.setBounds(100,20, 100, 50); 
        plabel.setSize(400,100);
        
        final JLabel elabel = new JLabel();     
        elabel.setBounds(100,40, 100, 50); 
        elabel.setSize(400,100);
        
        final JLabel flabel = new JLabel();     
        flabel.setBounds(100,80, 100, 50); 
        flabel.setSize(400,100);
        flabel.setText("Click on the checkboxes to learn about a concept.");
        
        
        //checkboxes
        JCheckBox checkbox1 = new JCheckBox("Market Cap");    
        checkbox1.setBounds(10,200, 100,50);  
        //second checkbox
        JCheckBox checkbox2 = new JCheckBox("PE");    
        checkbox2.setBounds(10,250, 100,50);    
        //third checkbox
        JCheckBox checkbox3 = new JCheckBox("EPS");    
        checkbox3.setBounds(10,300, 100,50);
        
        //adding checkboxes and other elements into card1
        card2.add(checkbox1);
        card2.add(checkbox2);
        card2.add(checkbox3);
        card2.add(mlabel);
        card2.add(plabel);
        card2.add(elabel);
        card2.add(flabel);
        
         /** 
         * This method checks if the state of an item has changed, changing mlabel accordingly.
         * @param ItemEvent e.
         * @return mlabel.
         */
         
        checkbox1.addItemListener(new ItemListener(){    
             public void itemStateChanged(ItemEvent e) {                 
               
                mlabel.setText("The market cap is the value the market sets on a company's shares");   
                  
          }});
           /** 
         * This method checks if the state of an item has changed, changing plabel accordingly.
         * @param ItemEvent e.
         * @return mlabel.
         */
        checkbox2.addItemListener(new ItemListener() {    
             public void itemStateChanged(ItemEvent e) {                 
         plabel.setText("The PE,price to earning ratio relate's a company's share price to its earning per share.");
               // + (e.getStateChange()==1?"checked":"unchecked"));    
             }    
        }); 
           /** 
         * This method checks if the state of an item has changed, changing mlabel accordingly.
         * @param ItemEvent e.
         * @return elabel.
         */
          checkbox3.addItemListener(new ItemListener() {    
             public void itemStateChanged(ItemEvent e) {                 
              elabel.setText("The EPS is the company's net profit divided by the number of common shares.");   
                  
                //+ (e.getStateChange()==1?"checked":"unchecked"));    
             }    
          }); 
           
        
        //third panel for instructions
        JPanel card3 = new JPanel();
        
        final JLabel label1 = new JLabel();     
        label1.setBounds(100,0, 100, 50);
        label1.setSize(400,100);   
        label1.setText("The eight basic rules/principles of investing are as follows:");
        
        final JLabel label2 = new JLabel();     
        label2.setBounds(100,20, 100, 50);
        label2.setSize(400,100);   
        label2.setText("1. Never trust others' analysis:");
        
        final JLabel label3 = new JLabel();     
        label3.setBounds(100,40, 100, 50);
        label3.setSize(400,100);   
        label3.setText("2. Growth in a company does not lead to growth for an investor");
        
        final JLabel label4 = new JLabel();     
        label4.setBounds(100,60, 100, 50);
        label4.setSize(400,100);   
        label4.setText("3. If there is a stable sector don't expect another company to not disrupt that sector (fort and moat)");
        
          final JLabel label5 = new JLabel();     
        label5.setBounds(100,80, 100, 50);
        label5.setSize(400,100);   
        label5.setText("4. Start investing as soon as possible");        
        
         final JLabel label6 = new JLabel();     
        label6.setBounds(100,100, 100, 50);
        label6.setSize(400,100);   
        label6.setText("5. Diversify your sectors.");
        
        final JLabel label7 = new JLabel();     
        label7.setBounds(100,120, 100, 50);
        label7.setSize(400,100);   
        label7.setText("6. Split investments between staple and disruptive");
        
        final JLabel label8 = new JLabel();     
        label8.setBounds(100,140, 100, 50);
        label8.setSize(400,100);   
        label8.setText("7. Buy in panic, and sell in a euphoria.");
        
        final JLabel label9 = new JLabel();     
        label9.setBounds(100,160, 100, 50);
        label9.setSize(400,100);   
        label9.setText("8. Calculate your own ideal market value.");
        
        
        card3.add(label1);
        card3.add(label2);
        card3.add(label3);
        card3.add(label4);
        card3.add(label5);
        card3.add(label6);
        card3.add(label7);
        card3.add(label8);
        card3.add(label9);
        
        
        
        
        
        
        
        tabbedPane.addTab(TEXTPANEL, card1);
        tabbedPane.addTab(CONCEPTS, card2);
        tabbedPane.addTab(SCONCEPTS, card3);
        pane.add(tabbedPane, BorderLayout.CENTER);
       
    }
 
    /**
     * Creates the GUI and shows it. 
     * @param Nothing.
     * @return New JFrame.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("New");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
       /**constructor for begin*/
        Begin demo = new Begin();
        demo.addComponentToPane(frame.getContentPane());
 
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
     /**
     * This is the main method that tests errors in code and launches it.
     * @param Nothing.
     * @return Nothing.
     */
    public static void main(String[] args) {
        /* Use an appropriate Look and Feel */
        try {
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
        } catch (InstantiationException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        /* Turn off metal's use of bold fonts */
        UIManager.put("swing.boldMetal", Boolean.FALSE);
        
        //Schedule a job for the event dispatch thread:
        //creating and showing this application's GUI.
       /**
     * This schedules a job for the event, and create the GUI.
     * @param Nothing.
     * @return GUI.
     */
        javax.swing.SwingUtilities.invokeLater(new Runnable()
        {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}