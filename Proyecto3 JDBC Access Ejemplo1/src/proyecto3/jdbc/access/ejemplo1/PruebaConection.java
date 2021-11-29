package proyecto3.jdbc.access.ejemplo1;

import java.sql.*;

public class PruebaConection {

    public static void main(String[] args) {
        // Crear un objeto de la clase conexion
        cConnection conect = new cConnection();
        
        //Obetener la conexion
        Connection con = conect.mkConection();
        
        conect.closeConecction();
        if (con == null){
            System.out.println("Error al conectar");
        }
    }
    
}
