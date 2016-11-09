package CLASES;

import Conexion.ConexionMySQL;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
public class ClaseConsultas {
    Connection cn;
    CallableStatement cmd;
    
     public ClaseConsultas(){
       ConexionMySQL cm=new ConexionMySQL();
       cn=cm.Conectar();
    }
     
     public void LlenarTabla(DefaultTableModel tabla){
      try{
        String sql="SELECT consultas.id,tipooperacion.nombre,veterinarios.apellido,veterinarios.nombre,CONCAT(propietarios.apellido,coma,propietarios.nombre)AS dueño,mascota FROM tipooperacion INNER JOIN consultas ON tipooperacion.id=consultas.idtipooperacion INNER JOIN veterinarios ON veterinarios.id=consultas.idveterinario INNER JOIN fichamedica ON consultas.idficha=fichamedica.id INNER JOIN propietarios ON fichamedica.idpropietario=propietarios.id ORDER BY tipooperacion.nombre ASC";
        cmd=cn.prepareCall(sql);
        ResultSet rs=cmd.executeQuery();
        String[] registro = new String[5];
        while(rs.next()){//aca se lee el maximo de filas
            registro[0]=rs.getString("consultas.id");
            registro[1]=rs.getString("tipooperacion.nombre");
            registro[2]=rs.getString("veterinarios.apellido")+","+rs.getString("veterinarios.nombre");
            registro[3]=rs.getString("dueño");
            registro[4]=rs.getString("mascota");
            tabla.addRow(registro); 
        }
//      cmd.close();
//      cn.close();      
      }catch(Exception ex){
         System.out.println(ex.getMessage());
      }     
    }     
         
  public int AgregarConsulta(String nombre,int categoria,int min,int max,String descripcion,String composicion,String accion){
     int resultado = 0;
      String sql="call AgregarConsulta(?,?,?,?,?,?,?,?)";
        try{
           cmd=cn.prepareCall(sql);        
           cmd.setString(1,nombre);
           cmd.setInt(2,categoria);
           cmd.setInt(3,min);
           cmd.setInt(4, max); 
           cmd.setString(5,descripcion);
           cmd.setString(6,composicion);
           cmd.setString(7,accion);
           cmd.registerOutParameter(8, java.sql.Types.INTEGER);
           cmd.execute();
           resultado=cmd.getInt(8); 
                    
//         cmd.close();
//         cn.close();    
        }catch(Exception ex){
          System.out.println(ex.getMessage());
        }      
       return resultado;
    }
     
     public void ModificarConsulta(int id,String nombre,int categoria,int min,int max,String descripcion,String composicion,String accion){
       String sql="call ModificarConsulta(?,?,?,?,?,?,?,?)";
        try{
          cmd=cn.prepareCall(sql); 
          cmd.setInt(1,id);
           cmd.setString(2,nombre);
           cmd.setInt(3,categoria);
           cmd.setInt(4,min);
           cmd.setInt(5, max); 
           cmd.setString(6,descripcion);
           cmd.setString(7,composicion);
           cmd.setString(8,accion);
          cmd.execute();
       }catch(Exception ex){
         System.out.println(ex.getMessage());
       }
    }      

public int BajaConsulta(int id) {
   int encontrada=0;
   String sql="call BajaConsulta(?,?)";
    try{
       cmd=cn.prepareCall(sql);
       cmd.setInt(1,id);
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

    
  public String VerificarMedicamento(String nombre){
     String encontrada=null;   
     String sql="call VerificarMedicamento(?,?)";
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
  
      public void InsertarDatosAuditoria(String fechaActual, String hor, String usu, String tabla, String operacion, String anterior, String nuevo) {
        String sql="call InsertarDatosAuditoria(?,?,?,?,?,?,?)";    
    try{                
      cmd=cn.prepareCall(sql);
      cmd.setString(1,fechaActual);
      cmd.setString(2,hor);
      cmd.setString(3,usu);
      cmd.setString(4,tabla);
      cmd.setString(5,operacion);
      cmd.setString(6,anterior);
      cmd.setString(7,nuevo);
      cmd.execute();
    
   }catch(Exception ex){
         System.out.println(ex.getMessage());
       }
    }
}
