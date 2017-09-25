/*
test på vilka datatyper som tillåter vilken typ av data.

Christoffer Billman

2017-09-25
*/

import javax.swing.*;

public class Uppgift31{
	public static void main(String[] args) {
        
        int i = 500;
        double d = 500;
        byte b = 500;
            
        /*
        Det blir bara fel i den sista variabeln, b. Den är ottilåten för att 500 är ett värde som är större än 127, vilket är det största tal den datatypen kan hantera. Om man ändå vill att varibeln ska vara tilldelad 500, kommer java automatiskt konvertera värdet av variabeln till 127 då det är det närmaste man kan komma 500.
        */
            
      
    }
}