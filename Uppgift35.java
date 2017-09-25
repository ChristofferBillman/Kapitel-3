/*
Program som ska beräkna hur mycket moms som är på en produkt samt hur mycket momsen

Christoffer Billman

2017-09-25
*/

import javax.swing.*;

public class Uppgift35{
	public static void main(String[] args) {
        
        String priceInputString;
        Double price, vat, pricenovat, vatshare;
            vatshare = 0.12; // Antar att andelen moms är 12%.
        
        priceInputString = JOptionPane.showInputDialog(null, "How much does your product cost (including VAT)(kr).");
        
        price = Double.parseDouble(priceInputString);
        
        
        vat = price * vatshare;   
        pricenovat = price - vat;
            
       JOptionPane.showMessageDialog(null,"The amout of VAT you paid on this product is " + vat + "kr." + "\n The cost of the prodcut excluding VAT is " + pricenovat + "kr." );     

    }
}