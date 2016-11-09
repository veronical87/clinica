package Conexion;

import java.sql.SQLException;

public class JavaApplication2 {
     public static ConexionMySQL conexion = new ConexionMySQL();
     public static void main(String[] args)throws SQLException {
       
     System.out.println("Conectado: "+conexion.Conectar());

    }
}
