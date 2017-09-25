/*
Uppgift 31 & 32 fast med explicita typomvandlingar som korrigerar errormeddelandena.

Christoffer Billman

2017-09-25
*/

import javax.swing.*;

public class Uppgift37{
	public static void main(String[] args) {
        
        int i = 500;
        double d = 500;
        byte b = (byte) 500;
            
        /*
        Inga error! Dock så "kapas" variabeln b's värde till 127.
        */
        
        //Uppgift 32
        int i2 = (int) (500.7 + 0.4); //Adderar 0.4 så att talet avrundas uppåt (rätt) istället för nedåt.
        double d2 = 500.7;
        byte b2 = (byte) (500.7 + 0.5); //Samma visa som variabeln i. Här "kapas" både decimalerna och själva värdet då en byte rymmer max 127.
               
    }
}