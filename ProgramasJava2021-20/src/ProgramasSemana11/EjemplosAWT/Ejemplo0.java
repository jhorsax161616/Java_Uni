package ProgramasSemana11.EjemplosAWT;
import java.awt.*;

public class Ejemplo0 extends java.applet.Applet {

    public void init() {
        
        Label miEtiq1;
        TextField miText1;
        Button miBot1;
        Choice ch1;
        List list1;
        
        try {
            setLayout(null);
            resize(800, 300)            ;
            
            miEtiq1 = new Label("Ingrese Nombre: ");
            miEtiq1.setBounds(50, 80, 100, 20);
            add(miEtiq1);
            
            miText1 = new TextField(12);
            miText1.setBounds(155, 80, 100, 20);
            add(miText1);
            
            ch1 = new Choice();
            ch1.setBounds(300, 80, 100, 20);
            ch1.add("POO");
            ch1.add("Fisica");
            ch1.add("Naranjitas");
            add(ch1);
            
            list1 = new List(5, true);
            list1.setBounds(410, 80, 100, 100);
            list1.add("Lunes");
            list1.add("Martes");
            list1.add("Miercoles");
            list1.add("Jueves");
            list1.add("Viernes");
            add(list1);
            
            miBot1 = new Button("Guardar");
            miBot1.setBounds(100, 120, 80, 30);
            add(miBot1);
            
            
            
            java.awt.EventQueue.invokeAndWait(new Runnable() {
                public void run() {
                    initComponents();
                }
            });
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setLayout(new java.awt.BorderLayout());
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
