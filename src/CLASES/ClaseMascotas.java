package CLASES;
import Conexion.ConexionMySQL;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ClaseMascotas {
     Connection cn;
     CallableStatement cmd;
    public ClaseMascotas(){//constructor
       ConexionMySQL cm=new ConexionMySQL();
       cn=cm.Conectar();
    }
    
     public void LlenarTabla(DefaultTableModel tabla){
      try{
        String sql="SELECT CONCAT(propietarios.apellido,propietarios.nombre)AS dueño,mascotas.nombre,especies.nombre,razas.nombre FROM propietarios INNER JOIN mascotas ON propietarios.id=mascotas.idpropietario INNER JOIN especies ON especies.id=mascotas.idespecie INNER JOIN razas ON mascotas.idraza=razas.id ORDER BY CONCAT(propietarios.apellido,propietarios.nombre) ASC";
        cmd=cn.prepareCall(sql);
        ResultSet rs=cmd.executeQuery();
        String[] registro = new String[1];
        while(rs.next()){//aca se lee el maximo de filas
            registro[0]=rs.getString("dueño");
            registro[0]=rs.getString("mascotas.nombre");
            registro[0]=rs.getString("especies.nombre");
            registro[0]=rs.getString("razas.nombre");
            tabla.addRow(registro); 
        }
//      cmd.close();
//      cn.close();      
      }catch(Exception ex){
         System.out.println(ex.getMessage());
      }     
    }
     
  public int VerificarMascotaxHistorialClinico(int idmascota) {
     int encontrada=0;   
     String sql="call VerificarMascotaxHistorialClinico(?,?)";
        try{
           cmd=cn.prepareCall(sql);
           cmd.setInt(1,idmascota);
           
           cmd.registerOutParameter(2, java.sql.Types.INTEGER);
           cmd.execute();
           encontrada=cmd.getInt(2);           
//         cmd.close();
//         cn.close();    
        }catch(Exception ex){
          System.out.println(ex.getMessage());
           }      
        return encontrada;
      }
  
  public int VerificarMascotaxFicha(int idmascota) {
     int encontrada=0;   
     String sql="call VerificarMascotaxFicha(?,?)";
        try{
           cmd=cn.prepareCall(sql);
           cmd.setInt(1,idmascota);           
           cmd.registerOutParameter(2, java.sql.Types.INTEGER);
           cmd.execute();
           encontrada=cmd.getInt(2);           
//         cmd.close();
//         cn.close();    
        }catch(Exception ex){
          System.out.println(ex.getMessage());
           }      
        return encontrada;
      }
     
  public String AgregarMascota(String nombre,int dueno,int especie,int raza,int sexo,int pesaje){
     String encontrada=null;   
     String sql="call AgregarRaza(?,?)";
        try{
           cmd=cn.prepareCall(sql);
           cmd.setString(1,nombre);
           cmd.registerOutParameter(2, java.sql.Types.VARCHAR);
           cmd.execute();
           encontrada=cmd.getString(2);
           
//         cmd.close();
//         cn.close();    
        }catch(Exception ex){
          System.out.println(ex.getMessage());
        }      
        return encontrada;
    }
     
     public void ModificarRaza(int id,String nombre){
       String sql="call ModificarRaza(?,?)";
        try{
          cmd=cn.prepareCall(sql);
          cmd.setInt(1,id);
          cmd.setString(2,nombre);
          cmd.execute();
       }catch(Exception ex){
         System.out.println(ex.getMessage());
       }
    }     
        
    public void EliminarRaza(int id){
       String sql="call EliminarRaza(?)";
        try{                
          cmd=cn.prepareCall(sql);
          cmd.setInt(1,id);
          cmd.execute();
       }catch(Exception ex){
         System.out.println(ex.getMessage());
       }
    }
    
  public String VerificarRaza(String nombre){
     String encontrada=null;   
     String sql="call VerificarRaza(?,?)";
        try{
           cmd=cn.prepareCall(sql);
           cmd.setString(1,nombre);
           cmd.registerOutParameter(2, java.sql.Types.VARCHAR);
           cmd.execute();
           encontrada=cmd.getString(2);
           
//         cmd.close();
//         cn.close();    
        }catch(Exception ex){
          System.out.println(ex.getMessage());
        }      
        return encontrada;
    }
    
    
    }
