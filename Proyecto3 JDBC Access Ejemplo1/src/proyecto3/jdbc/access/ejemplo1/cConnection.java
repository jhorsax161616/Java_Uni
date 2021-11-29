package proyecto3.jdbc.access.ejemplo1;

import java.sql.*;

public class cConnection {
    
    private String url = "jdbc:ucanaccess://D:\\OneDrive - continental.edu.pe\\Uni_C\\SEMESTRE_IV\\Programacion_POO\\Unidad_4\\BDEjemplo.accdb";
    
    private String usr = "";
    private String pswd = "";
    private Connection con = null;
    
    /*Constructor de carga fuente JBC-ODBC*/
    public cConnection()
    {
        loadDriver();
    }
    
    //Carga el driver de la conexion a la base de datos
    private void loadDriver()
    {
        try
        {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        }
        catch(ClassNotFoundException e)
        {
            System.out.println("Error al conectar el puente JDBC-Acces");
        }
    }
    
    //obtener una conexion con el nombre del driver especificado
    public Connection mkConection()
    {
        System.out.println("Estableciendo conexion con " + url);
        
        try
        {   //obteniendo la conexion
            con = DriverManager.getConnection(url, usr, pswd);
        }
        catch(SQLException sqle)
        {
            System.out.println("No se pudo establecer la conexioon");
            return null;
        }
        
        System.out.println("Conexion establecida con " + url);
        
        return con;
    }
    
    //Cerrar la conexion
    public boolean closeConecction()
    {
        try
        {
            con.close();
        }
        catch(SQLException sqle)
        {
            System.out.println("No se cerro la conexion!!");
            return false;
        }
        System.out.println("Conexion cerrada con exito");
        return true;
    }
}