package Conexion;

   import java.sql.*;
   import javax.swing.JOptionPane;

public class ConexionMySQL {

    public String db = "clinicaveterinaria";
    public String url = "jdbc:mysql://localhost/"+db;
    public String user = "root";
    public String pass = "";
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
     public Connection Conectar()
    {
        Connection link = null;
        try
        {
            //Cargamos el Driver MySQL
            Class.forName("com.mysql.jdbc.Driver");
           
            //Creamos un enlace hacia la base de datos
            link = DriverManager.getConnection(this.url, this.user, this.pass);
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return link;  
    }
}
