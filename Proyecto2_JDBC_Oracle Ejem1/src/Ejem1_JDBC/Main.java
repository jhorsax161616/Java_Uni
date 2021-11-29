package Ejem1_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        Connection cn = null;
        
        //obteniendo la conexion
        try {
            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
            cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "oracle");
            System.out.println("Obteniendo coneccón.....Exitosa");
            }
        catch (Exception e){
            System.out.println("Error de conexión \n " + e.toString());
        }
        
        //Cerrando la conexión
        try {
            cn.close();
            System.out.println("Cerrando la conexión!!");
        }
        catch (SQLException e) {
            System.out.println("Error de cierre.!!" + e.toString());
        }
        
    }
    
}
