package ProgramasSemana09.Multihilo;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Jugador {
    
    int vida = 10;
    int curacion = 50;
    
    public Jugador(){
        vida = 10;
        curacion = 80;
    }

    synchronized public void RecibirGolpe(int cantidad){
        
        vida = vida - cantidad;
        
        try{
            Thread.sleep(5);
        }
        catch (InterruptedException ex){
            Logger.getLogger(Jugador.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
    
    synchronized public void RecibirVida(int curacion){
        
        vida = vida + curacion;
        
        try{
            Thread.sleep(5);
        }
        catch (InterruptedException ex){
            Logger.getLogger(Jugador.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
    
    synchronized public boolean DeclararMuerto(){
        
        return (vida <= 0);
    }

}
