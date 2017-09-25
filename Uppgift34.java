/*
Program som ska beräkna kostnaden av en mobilräkning.

Christoffer Billman

2017-09-25
*/

import javax.swing.*;

public class Uppgift34{
	public static void main(String[] args) {
        
        String costpermonthInputString, minpermonthInputString;
        Double costpermonth, minpermonth, totalcost;
        
       costpermonthInputString = JOptionPane.showInputDialog(null, "How much does a phone call cost per minute? (kr)");
        
       minpermonthInputString = JOptionPane.showInputDialog(null, "What is the average amount of time you spend in a phone call per months (minutes).");

        costpermonth = Double.parseDouble(costpermonthInputString);
        minpermonth = Double.parseDouble(minpermonthInputString);
        
        totalcost = costpermonth * minpermonth;
        
       JOptionPane.showMessageDialog(null,"Your phone bill will cost " + totalcost + "kr.");     

    }
}