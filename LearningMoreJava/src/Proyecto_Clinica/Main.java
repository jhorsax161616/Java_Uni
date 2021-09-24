package Proyecto_Clinica;

import static Proyecto_Clinica.UI.UIMenu.*;

public class Main {

    public static void main(String[] args) {
        /*
        // Incremento de id automático por cada objeto creado
        Doctor myDoctor = new Doctor();
        myDoctor.name = "Mendez Pino";
        myDoctor.showName();
        myDoctor.showId();
        
        //Se pude incrementar sin crear un objeto
        //Doctor.id++;
        
        Doctor myDoctor2 = new Doctor();
        myDoctor2.name = "Mendez Pino";
        myDoctor2.showName();
        myDoctor2.showId();
        */
        
        //Un ejemplo de la utilidad del static con un menu
        //Mejorando la Modularidad del programa... 
        
        //showMenu();
        
        Doctor myDoctor = new Doctor("Elife Tino","Pediatria");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);
        
        Patient patient = new Patient("Alex", "ale.gmail.com");
        
        
    }
    
}