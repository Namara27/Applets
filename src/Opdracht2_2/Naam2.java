package Opdracht2_2;

import java.awt.*;
import java.applet.*;

public class Naam2 extends Applet {
    //een (lege) methode die de Applet initialiseert
    public void init() {
        setBackground(Color.white);
    }
    //een methode die de inhoud van het scherm tekent
    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Namara", 50, 60 );
        g.setColor(Color.red);
        g.drawString("Kerkenaar", 50, 70);
    }

}
