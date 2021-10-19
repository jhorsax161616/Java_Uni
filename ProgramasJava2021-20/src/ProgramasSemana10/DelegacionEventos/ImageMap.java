package ProgramasSemana10.DelegacionEventos;

import javax.swing.JApplet;
import java.awt.Graphics;
import java.awt.event.*;
import javax.swing.ImageIcon;

public class ImageMap extends JApplet {
    private ImageIcon mapImage;
    
    private static final String captions[] = {"Erro. Tienes que mejorar.",
        "Buena Practiva de Programación", "Atento a las Indicaciones", 
        "Tips para la Práctica", "Tips de Recarga",
        "Reviión de Práctica", "Tips de Prevención"
    };
    

    @Override
    public void init() {
        // TODO start asynchronous download of heavy resources
        resize(900, 400);
        
        addMouseListener(
            new MouseAdapter()
                {
                    @Override
                    public void mouseExited(MouseEvent event)
                    {
                        showStatus("Puntero fuera del Applet");
                    }
                }
        );
        
        addMouseMotionListener(
        
            new MouseMotionAdapter()
            {
                //determinar sobre que icono aparece
                @Override
                public void mouseMoved(MouseEvent event)
                {
                    showStatus(translateLocation(event.getX(), event.getY()));
                }
            }
        );
        mapImage = new ImageIcon(getClass().getResource("icons.png"));
    }
    // TODO overwrite start(), stop() and destroy() methods
    
    //Mostrar mapa de imagenes
    @Override
    public void paint(Graphics g)
    {
        super.paint(g);
        mapImage.paintIcon(this, g, 0, 0);
    }
    
    //Mostrar imagen segun posicion del puntero
    public String translateLocation(int x, int y)
    {
        if(x >= mapImage.getIconWidth() || y >= mapImage.getIconHeight())
        {
            return "Fuera!!!";
        }
        
        //Determina numeo de icono
        double iconWidth = (double) mapImage.getIconWidth()/7.0;
        int iconNumber = (int) ((double) x / iconWidth);
        
        return captions[iconNumber]; // Mensajes segun seccion array
    }
}
