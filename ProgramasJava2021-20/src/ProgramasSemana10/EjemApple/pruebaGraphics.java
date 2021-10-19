package ProgramasSemana10.EjemApple;

import java.applet.Applet;
import java.awt.*;

public class pruebaGraphics extends Applet {

    @Override
    public void init() {
        // TODO start asynchronous download of heavy resources
            resize(600, 400);
            setBackground(Color.WHITE);
    }

    // TODO overwrite start(), stop() and destroy() methods
    @Override
    public void paint(Graphics g)
    {
        g.drawString("---Técnicas de Programación---", 50, 60);
        
        Color c1 = new Color (255, 0, 0); // Definiendo color rojo
        g.setColor(c1); //Aplicando el color rojo
        g.drawString("Probando Graphics!!", 50, 80);
        
        g.drawLine(50, 100, 210, 120);
        
        Color c2 = new Color(0,255,0);//Verde
        g.setColor(c2);
        g.drawRect(50, 130, 25, 25);
        
        Color c3 = new Color(255, 175, 175); //Rosa
        
        g.setColor(c3);
        g.fillRect(50, 160, 100, 20);
        g.drawRoundRect(200, 160, 90, 40, 30, 1000);
        
        g.setColor(c1);
        g.fillArc(70, 190, 250, 200, 0, 40);
        
        g.setFont(new Font("Arial", Font.PLAIN, 20));
        g.setColor(Color.DARK_GRAY);
        g.drawString("Nueto Tipo", 180, 250);
        
        
        for (int i= 0; i < 5; i++)
        {
            g.drawLine(50 + 100 *i, 110, 220 + 100 * i, 115);
        }
        
    }
}
