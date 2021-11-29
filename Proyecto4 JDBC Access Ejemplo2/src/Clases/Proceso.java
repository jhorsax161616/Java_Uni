package Clases;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.awt.*;

public class Proceso {
    
    public List<Producto> LisProducto(Integer idProd){  //crear la función LisProducto, con argumento para consultar
        
        List<Producto> lista = new ArrayList();
        String consultaSQL = "select * from Producto where IdP LIKE '%"+idProd+"%'"; 
        Conexion conect = new Conexion();  
        
        try{
            //Preparar la sentencia SQL
            PreparedStatement st = conect.ObtenerConexion().prepareStatement(consultaSQL) ;
            //cuando ejecutemos una consulta st.executeQuery(), esta sera llevada a memoria 
            //a través de ResulSet y se almacenara en rs.
            ResultSet rs = st.executeQuery();
            //recorrer todo lo que esta memoria, leer fila por fila
            while(rs.next()){
                Producto p = new Producto();
                //captura el valor que tiene la memoria en la posición 1 de la sentencia sql. 
                //Para luego almacenar estos valores en p.setCodProd
                p.setCodProd(rs.getInt(1));
                p.setDescrip(rs.getString(2));
                p.setSaldo(rs.getInt(3));
                lista.add(p);
            }
        }
        catch(SQLException e){
                e.printStackTrace();
         }
            return lista;
   }             
}


