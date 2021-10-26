package ProgramasSemana11.EjemplosAWT;

import java.awt.*;

public class EjemploOperacionesVarios extends java.applet.Applet {
    
    //Declarando objetos
    Label nombre, genero, sistemaO, hobby, curso;
    Choice ChoiceSisteOpe;
    CheckboxGroup ChekGenero;
    Checkbox generM, generF, musica, deporte, aventura;
    TextArea texta;
    Button btn1;
    List ListCursos;
    TextField txt1;
    
    @Override
    public void init() {
        setLayout(null);
        resize(700,500);
        
        //Crear y posicionar label de NOMBRE
        nombre = new Label("NOMBRE: ");
        nombre.setBounds(10, 10, 70, 30);
        nombre.setBackground(Color.ORANGE);
        nombre.setForeground(Color.blue);
        add(nombre);
        
        //Caja txt1 y vacia
        txt1 = new TextField(" ");
        txt1.setBounds(100, 10, 110, 20);
        add(txt1);
        
        //Genero
        genero = new Label("GENERO: ");
        genero.setBounds(10, 40, 60, 30);
        genero.setBackground(Color.BLACK);
        genero.setForeground(Color.WHITE);
        add(genero);
        
        ChekGenero = new CheckboxGroup();
        generM = new Checkbox("Masculino", ChekGenero, true);
        generM.setBounds(10, 70, 100, 30);
        add(generM);
        
        generF = new Checkbox("Femenino", ChekGenero, false);
        generF.setBounds(60, 95, 100, 30);
        add(generF);
        
        sistemaO = new Label("SISTEMA OPERATIVO");
        sistemaO.setBounds(10, 130, 140, 20);
        add(sistemaO);
        
        ChoiceSisteOpe = new Choice();
        ChoiceSisteOpe.setBounds(120, 160, 110, 20);
        ChoiceSisteOpe.add("Windows");
        ChoiceSisteOpe.add("MAC");
        ChoiceSisteOpe.add("Linux");
        add(ChoiceSisteOpe);
        
        hobby = new Label("PASATIEMPO");
        hobby.setBounds(10, 190, 70, 20);
        add(hobby);
        
        musica = new Checkbox("Musica");
        musica.setBounds(100, 210, 160, 20);
        add(musica);
        
        deporte = new Checkbox("Deporte");
        deporte.setBounds(100, 240, 160, 20);
        add(deporte);
        
        aventura = new Checkbox("Aventura");
        aventura.setBounds(100, 270, 160, 20);
        add(aventura);
        
        curso = new Label("CURSOS");
        curso.setBounds(10, 300, 50, 20);
        add(curso);
        
        ListCursos = new List(4, true);
        ListCursos.setBounds(70, 330, 100, 80);
        ListCursos.add("PHP");
        ListCursos.add("JAVA");
        ListCursos.add("ASP. NET");
        ListCursos.add("ASP");
        add(ListCursos);
                
        texta = new TextArea();
        texta.setBounds(320, 10, 300, 250);
        add(texta);
        
        btn1 = new Button("Mostrar");
        btn1.setBounds(250, 160, 50, 20);
        add(btn1);       
    }
    
    public boolean action(Event e, Object o){
        
        String nomb = "", gener="", sisOp="",pasatmp="",nbCurs="";
        int opc;
        
        nomb = txt1.getText();
        
        if(generM.getState()==true){
            generF.setState(false);
        }
        else if(generF.getState()==true){
            generM.setState(false);
        }
        
        if(e.target == btn1)
        {
            if(generM.getState()==true){
                gener = "Hombre";
            }
            else if(generF.getState()==true){
                gener = "Mujer";
            }
            
            opc = this.ChoiceSisteOpe.getSelectedIndex();
            
            switch(opc){
                case 0: sisOp = this.ChoiceSisteOpe.getSelectedItem();break;
                case 1: sisOp = this.ChoiceSisteOpe.getSelectedItem();break;
                case 2: sisOp = this.ChoiceSisteOpe.getSelectedItem();break;
            }
            if(musica.getState()==true){
                pasatmp += "Musica, ";
            }
            if(deporte.getState()==true){
                pasatmp += "Deporte, ";
            }
            if(aventura.getState()==true){
                pasatmp +="Aventura, ";
            }
            
            if (ListCursos.isSelected(0)){
                nbCurs+="PHP, ";
            }
            if (ListCursos.isSelected(1)){
                nbCurs+="JAVA, ";
            }
            if (ListCursos.isSelected(2)){
                nbCurs+="ASP.NET, ";
            }
            if (ListCursos.isSelected(3)){
                nbCurs+="ASP, ";
            }
            
            texta.setText("Nombre:" + "\n\t" + nomb + "\n");
            texta.append("Genero:" + "\n\t" + gener + "\n");
            texta.append("Sistema Operativo:" + "\n\t" + sisOp + "\n");
            texta.append("PasaTiempo:" + "\n\t" + pasatmp + "\n");
            texta.append("Curso:" + "\n\t" + nbCurs + "\n");
        }
        return true;
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setLayout(new java.awt.BorderLayout());
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
