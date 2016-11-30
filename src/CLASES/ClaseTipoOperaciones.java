package CLASES;

import Conexion.ConexionMySQL;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class ClaseTipoOperaciones {
    Connection cn;
    CallableStatement cmd;
   
    
   public ClaseTipoOperaciones(){
       ConexionMySQL cm=new ConexionMySQL();
       cn=cm.Conectar();
    } 
   
   public void LlenarTabla(DefaultTableModel tabla){
      try{
        String sql="SELECT categoriatipo.nombre,tipooperacion.nombre FROM tipooperacion INNER JOIN categoriatipo ON tipooperacion.idcategoria=categoriatipo.id ORDER BY categoriatipo.nombre ASC";
        cmd=cn.prepareCall(sql);
        ResultSet rs=cmd.executeQuery();
        String[] registro = new String[2];
        while(rs.next()){//aca se lee el maximo de filas
            registro[0]=rs.getString("categoriatipo.nombre");
            registro[1]=rs.getString("tipooperacion.nombre");
            tabla.addRow(registro); 
        }
//      cmd.close();
//      cn.close();      
      }catch(Exception ex){
         System.out.println(ex.getMessage());
      }     
    }
     
  public int AgregarTipoOperacion(int idcategoriaTipo,String nombre){
     int encontrada=0;   
     String sql="call AgregarTipoOperacion(?,?,?)";
        try{
           cmd=cn.prepareCall(sql);
           cmd.setInt(1,idcategoriaTipo);
           cmd.setString(2,nombre);
           cmd.registerOutParameter(3, java.sql.Types.INTEGER);
           cmd.execute();
           encontrada=cmd.getInt(3);
                                
//         cmd.close();
//         cn.close();    
        }catch(Exception ex){
          System.out.println(ex.getMessage());
        }      
        return encontrada;
    }
     
     public void ModificarTipoOperacion(int id,int categoria,String nombre){
       String sql="call ModificarTipoOperacion(?,?,?)";
        try{
          cmd=cn.prepareCall(sql);
          cmd.setInt(1,id);
          cmd.setInt(2,categoria);
          cmd.setString(3,nombre);
          cmd.execute();
       }catch(Exception ex){
         System.out.println(ex.getMessage());
       }
    }     

  public int EliminarTipoOperacion(int idtipo) {
     int encontrada=0;   
     String sql="call EliminarTipoOperacion(?,?)";
        try{
           cmd=cn.prepareCall(sql);
           cmd.setInt(1,idtipo);
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
}
