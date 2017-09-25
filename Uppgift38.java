/*
Uppgift 38

Christoffer Billman

2017-09-25
*/

// (personlig kommentar), se sidan 74 för möjliga funktioner i standardklassen "Math".

import javax.swing.*;

public class Uppgift38{
	public static void main(String[] args) {
        
        Double d1, d2, d3, d4, d5, d6, d7, e1, e2, e3, f1, f2;
        
        d1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Temprature Monday?"));
        d2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Temprature Tuesday?"));
        d3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Temprature Wednesday?"));
        d4 = Double.parseDouble(JOptionPane.showInputDialog(null, "Temprature Thursday?"));
        d5 = Double.parseDouble(JOptionPane.showInputDialog(null, "Temprature Friday?"));
        d6 = Double.parseDouble(JOptionPane.showInputDialog(null, "Temprature Saturday?"));
        d7 = Double.parseDouble(JOptionPane.showInputDialog(null, "Temprature Sunday?"));
        
           e1 = Math.max(d1, d2);
            e2 = Math.max(d3, d4);
             e3 = Math.max(d5, d6);
        
            f1 = Math.max(e1, e2);
            f2 = Math.max(e3, d7);
               
        JOptionPane.showMessageDialog(null, Double.toString(Math.max(f1, f2)) + '\u00B0' + " Was the maximun temprature this week.");
    }
    
}