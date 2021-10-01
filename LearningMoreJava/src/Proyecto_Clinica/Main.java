package Proyecto_Clinica;

import static Proyecto_Clinica.UI.UIMenu.*;
import java.util.Date;

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
                
        Patient patien = new Patient("Alex", "elote@gmail.com");
        patien.setHeight(1.70);
        patien.setWeight(52.5);
        
        System.out.println(patien);
        
        System.out.println();
        
        Doctor myDoctor = new Doctor("Sacramento", "tilto@clinic.com");
        myDoctor.addAvailableAppointment(new Date(), "6am");
        myDoctor.addAvailableAppointment(new Date(), "12pm");
        myDoctor.addAvailableAppointment(new Date(), "8pm");

        System.out.println(myDoctor);
    }
    
}
