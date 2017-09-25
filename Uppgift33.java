/*
Program som får fram en cirkels area och omkrets med hjälp av dess radie.

Christoffer Billman

2017-09-25
*/

import javax.swing.*;

public class Uppgift33{
	public static void main(String[] args) {
      
        double circumfrence, area, pi, radius;
        String radiusInputString;
        
        pi = 3.1415926536;
        
       radiusInputString = JOptionPane.showInputDialog(null, "Hej! Har kan du fa reda pa din cirkels Omkrets och Area.\nMata in cirkelns radie i dialogrutan.");
        
         radius = Double.parseDouble(radiusInputString);
        
        circumfrence = radius * pi;
        area = pi * radius * radius;
        
       JOptionPane.showMessageDialog(null, "Din cirkels omkrets ar " + circumfrence + ".\n" + "Din cirkels area ar " + area + "." );     

    }
}