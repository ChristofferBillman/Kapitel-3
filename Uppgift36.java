/*
Program som ska göra om ett antal sekunder till timmar och minuter.

Christoffer Billman

2017-09-25
*/

import javax.swing.*;

public class Uppgift36{
	public static void main(String[] args) {
        
       int hours, minutes, seconds, time, hoursRemainder, minutesRemainder;
        
        time = Integer.parseInt(JOptionPane.showInputDialog(null, "How long did the calculation take? (s)"));
        
        hours = time / 3600;
            hoursRemainder = time % 3600; //3600 är 1h i sekunder
        
        minutes = hoursRemainder / 60; //Och uppenbarligen är 1 min 60 sekunder.
        
            seconds = hoursRemainder % 60;
        
        JOptionPane.showMessageDialog(null, time + " seconds is " + hours + " hours, " + minutes + " minutes and " + seconds + " seconds." );
    }
}