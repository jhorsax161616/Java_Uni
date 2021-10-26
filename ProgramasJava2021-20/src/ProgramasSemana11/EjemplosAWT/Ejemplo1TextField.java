package ProgramasSemana11.EjemplosAWT;

import java.awt.*;

public class Ejemplo1TextField extends java.applet.Applet {
    
    @Override
    public void init() {
          
        add(new Label("Nombre Completo: "));
        add(new TextField("Nombre.."));
        add(new Label("Telefono"));
        add(new TextField("12 numeros", 12));
        add(new Label("Password"));
        TextField t = new TextField("Contraseña", 20);
        t.setEchoCharacter('*');
        add(t);
            
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setLayout(new java.awt.BorderLayout());
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
