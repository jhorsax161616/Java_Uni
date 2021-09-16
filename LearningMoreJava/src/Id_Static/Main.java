package Id_Static;

import Id_Static.UI.UIMenu;

public class Main {

    public static void main(String[] args) {
        // Incremento de Id automático por cada objeto creado
        Doctor myDoctor = new Doctor();
        myDoctor.name = "Mendez Pino";
        myDoctor.showName();
        myDoctor.showId();
        
        //Se pude incrementar sin crear un objeto
        //Doctor.Id++;
        
        Doctor myDoctor2 = new Doctor();
        myDoctor2.name = "Mendez Pino";
        myDoctor2.showName();
        myDoctor2.showId();
        
        
        //Un ejemplo de la utilidad del static con un menu
        //Mejorando la Modularidad del programa... 
        UIMenu.showMenu();
    }
    
}
