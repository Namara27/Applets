package Opdracht2_1;

//importeer de benodigde klassen uit de Java bibliotheek
import java.awt.*;
import java.applet.*;

public class Naam extends Applet {

    //een (lege) methode die de Applet initialiseert
    public void init() {
        setBackground(Color.blue);
    }
    //een methode die de inhoud van het scherm tekent
    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.drawString("Namara", 50, 60 );
    }


}

