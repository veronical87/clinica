package CLASES;

import Conexion.ConexionMySQL;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ClaseUsuarios {
     Connection cn;
     CallableStatement cmd;
    public ClaseUsuarios(){//constructor
       ConexionMySQL cm=new ConexionMySQL();
       cn=cm.Conectar();
    }
    
public void LlenarTabla(DefaultTableModel tabla){
   try{
    String sql="SELECT usuario,roles.nombre FROM usuarios INNER JOIN roles ON roles.id=usuarios.idtiporol INNER JOIN personas ON usuarios.idpersona=personas.id WHERE idTIPOpersona='"+1+"' AND idestado="+1;
    CallableStatement cmd=cn.prepareCall(sql);
    ResultSet rs=cmd.executeQuery();
    String[] registro = new String[2];
        while(rs.next()){//aca se lee el maximo de filas
           registro[0]=rs.getString("roles.nombre");        
           registro[1]=rs.getString("usuario");
           tabla.addRow(registro); 
        }
//      cmd.close();
//      cn.close();
      
      }catch(Exception ex){
         System.out.println(ex.getMessage());
      }
    }
    
    public int BuscarCoincidencias(String usuario) {
     int encontrado=0;   
     String sql="call BuscarCoincidenciasxUsuario(?,?)";
        try{
           cmd=cn.prepareCall(sql);
           cmd.setString(1,usuario);           
           cmd.registerOutParameter(2, java.sql.Types.INTEGER);
           cmd.execute();
           encontrado=cmd.getInt(2);           
//         cmd.close();
//         cn.close();    
        }catch(Exception ex){
          System.out.println(ex.getMessage());
           }      
        return encontrado;                       
    }  
    
    public int ExisteUsuario_Pantallas(int usuario) {
     int encontrado=0;   
     String sql="call ExisteUsuario_Pantallas(?,?)";
        try{
           cmd=cn.prepareCall(sql);
           cmd.setInt(1,usuario);
           cmd.registerOutParameter(2, java.sql.Types.INTEGER);
           cmd.execute();
           encontrado=cmd.getInt(2);
           
//         cmd.close();
//         cn.close();    
        }catch(Exception ex){
          System.out.println(ex.getMessage());
        }
      
        return encontrado;                       
    }
    
public int AgregarUsuario(String apellido,String nombre,String usuario,String pass,int persona,int rol){
    int encontrado=0; 
       String sql="call agregarUsuario(?,?,?,?,?,?,?)";
        try{                 
          cmd=cn.prepareCall(sql);         
          cmd.setString(1,apellido);
          cmd.setString(2,nombre);
          cmd.setString(3,usuario);
          cmd.setString(4,pass);
          cmd.setInt(5,persona) ;
          cmd.setInt(6,rol);
          cmd.registerOutParameter(7, java.sql.Types.INTEGER);
          cmd.execute();
          encontrado=cmd.getInt(7);
       }catch(Exception ex){
         System.out.println(ex.getMessage());
       }
        return encontrado;
    }
    
     
     public void Modificar(int id,String apellido,String nombre,String usu,String con,int Tiporol){
       String sql="call ModificarUsuario(?,?,?,?,?,?)";       
        try{
          cmd=cn.prepareCall(sql);
          cmd.setInt(1, id);
          cmd.setString(2,apellido);
          cmd.setString(3,nombre);
          cmd.setString(4,usu);
          cmd.setString(5,con);
          cmd.setInt(6,Tiporol);
         
          cmd.execute();
       }catch(Exception ex){
         System.out.println(ex.getMessage());
       }
    }
    
public int  existeUsuario(String usuario,String pass){
  int encontrado=0;   
  String sql="call ExisteUsuario(?,?,?)";
     try{
        cmd=cn.prepareCall(sql);
        cmd.setString(1,usuario);
        cmd.setString(2, pass);
        cmd.registerOutParameter(3, java.sql.Types.INTEGER);
        cmd.execute();
        encontrado=cmd.getInt(3);
//         cmd.close();
//         cn.close();    
        }catch(Exception ex){
          System.out.println(ex.getMessage());
        }      
        return encontrado;                       
}
}
