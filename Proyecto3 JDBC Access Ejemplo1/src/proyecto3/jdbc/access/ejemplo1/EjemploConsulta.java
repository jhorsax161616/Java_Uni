package proyecto3.jdbc.access.ejemplo1;

import  java.sql.*;

public class EjemploConsulta {

    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        cConnection conect = new cConnection();
        Connection con = conect.mkConection();
        Statement stm = con.createStatement();
        
        String strSQL = "SELECT * FROM Producto";
        
        //Ejecutando consulta sql
        ResultSet rs = stm.executeQuery(strSQL);
        
        //Mostrar datos de la tabla productos
        while (rs.next())
        {
            System.out.println("Codigo producto: " + rs.getString("IdP"));
            System.out.println("Descripcion: " + rs.getString("Descripcion"));
            System.out.println("Precio Producto: " + rs.getString("Stock"));
            System.out.println();
        }
        
        //Cerrar todo
        rs.close();
        
        stm.close();
        
        boolean isClosed = conect.closeConecction();
        
        if (!isClosed){
            System.out.println("Error al cerrar la conexion!!");
        }
    }
    
}
