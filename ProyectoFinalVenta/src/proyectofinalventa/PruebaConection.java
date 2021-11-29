package proyectofinalventa;

import java.sql.*;

public class PruebaConection {

    public static void main(String[] args) {
        
        //Crear un objeto de la clase conexión
        cConnection conect = new cConnection();
        
        //Obtener la conexión
        Connection con = conect.ObtenerConexion();
        
        if(con == null)
        {
            //Error al establecer conexión
        }
    }
    
}
