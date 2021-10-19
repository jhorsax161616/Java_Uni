package ProgramasSemana10.EjemApple;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.applet.AudioClip;
import java.net.URL;


public class CaritaFeliz extends Applet {


    @Override
    public void init() {
        // TODO start asynchronous download of heavy resources
        resize(600, 400);
        setBackground(Color.BLACK);
    }
    
    @Override
    public  void paint(Graphics g) {
        
        //Title
        g.setFont(new Font("Arial", Font.PLAIN, 20));
        g.setColor(Color.WHITE);
        g.drawString("La carita Feliz", 270, 50);
        
        //Carita
        g.setColor(Color.YELLOW);
        g.fillOval(200, 80, 300, 300);
        
        g.setColor(Color.BLACK);
        g.fillOval(260, 140, 50, 50);
        
        g.fillOval(390, 140, 50, 50);
        
        g.setColor(Color.WHITE);
        g.fillOval(265, 145, 20, 20);
        
        g.fillOval(415, 145, 20, 20);
        
        g.setColor(Color.GRAY);
        g.fillArc(305, 80, 100, 200, 240, 60);
        
        
        g.setColor(Color.red);
        g.fillArc(250, 250, 200, 120, 180, 180);
    }

    // TODO overwrite start(), stop() and destroy() methods
}
