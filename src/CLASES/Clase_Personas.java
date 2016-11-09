package CLASES;

import Conexion.ConexionMySQL;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Clase_Personas {
     Connection cn;
     CallableStatement cmd;
    public Clase_Personas(){//constructor
       ConexionMySQL cm=new ConexionMySQL();
       cn=cm.Conectar();
    }
    
 public void InsertarPersona(String dire,int tipotelefono,int numero,int localidad,String email,int tipoPersona,String fecha,String hora,String usuario,String tabla,String nuevo){
       String sql="call agregarPersona(?,?,?,?,?,?,?,?,?,?,?)";
        try{                 
          cmd=cn.prepareCall(sql);          
          cmd.setString(1,dire); 
          cmd.setInt(2,tipotelefono);
          cmd.setInt(3,numero);
          cmd.setInt(4,localidad);
          cmd.setString(5,email);
          cmd.setInt(6,tipoPersona);         
          cmd.setString(7,fecha);
          cmd.setString(8,hora);
          cmd.setString(9,usuario);
          cmd.setString(10,tabla);
          cmd.setString(11,nuevo);
          cmd.execute();
       }catch(Exception ex){
         System.out.println(ex.getMessage());
       }
    }
    
 public void ModificarPersona(int id,String dire,int tipotelefono,int numero,int localidad,String email,String fecha,String hora,String usuario,String tabla,String anterior,String nuevo){
       String sql="call modificarPersona(?,?,?,?,?,?,?,?,?,?,?,?)";       
        try{
          cmd=cn.prepareCall(sql);
          cmd.setInt(1,id);
          cmd.setString(2,dire);
          cmd.setInt(3,tipotelefono);
          cmd.setInt(4,numero);
          cmd.setInt(5,localidad);
          cmd.setString(6,email);       
          cmd.setString(7,fecha);
          cmd.setString(8,hora);
          cmd.setString(9,usuario);
          cmd.setString(10,tabla);
          cmd.setString(11,anterior);
          cmd.setString(12,nuevo);        
          cmd.execute();
       }catch(Exception ex){
         System.out.println(ex.getMessage());
       }
    }  
 
  public void BajaPersona(int id,String fecha,String hora,String usuario,String tabla){
       String sql="call bajaPersona(?,?,?,?,?)";       
        try{
          cmd=cn.prepareCall(sql);
          cmd.setInt(1,id);
          cmd.setString(2,fecha);
          cmd.setString(3,hora);
          cmd.setString(4,usuario);
          cmd.setString(5,tabla);
          cmd.execute();
       }catch(Exception ex){
         System.out.println(ex.getMessage());
       }
    } 
}
