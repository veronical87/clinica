package CLASES;

import Conexion.ConexionMySQL;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class ClaseLocalidades {
    Connection cn;
    CallableStatement cmd;
    
     public ClaseLocalidades(){
       ConexionMySQL cm=new ConexionMySQL();
       cn=cm.Conectar();
    }
     
    
   public void LlenarTablaLocalidades(DefaultTableModel tabla){    
      try{
        String sql="SELECT provincia.nombre,localidades.nombre,codigo FROM localidades inner join provincia on localidades.idprovincia=provincia.id ORDER BY provincia.nombre ASC";
        cmd=cn.prepareCall(sql);
        ResultSet rs=cmd.executeQuery();
        String[] registro = new String[3];
        while(rs.next()){//aca se lee el maximo de filas           
           registro[0]=rs.getString("provincia.nombre");
           registro[1]=rs.getString("localidades.nombre");
           registro[2]=rs.getString("codigo");
           tabla.addRow(registro); 
        }
//      cmd.close();
//      cn.close();
      
      }catch(Exception ex){
         System.out.println(ex.getMessage());
      }
    }
    
public int Agregar(String localidad,int prov,int codigo){
       int encontrada=0; 
       String sql="call agregarLocalidad(?,?,?,?)";
        try{
          cmd=cn.prepareCall(sql);
          cmd.setString(1,localidad);
          cmd.setInt(2,prov);
          cmd.setInt(3,codigo);
          cmd.registerOutParameter(4, java.sql.Types.INTEGER);
          cmd.execute();          
          encontrada=cmd.getInt(4);  
       }catch(Exception ex){
         System.out.println(ex.getMessage());
       }
         return encontrada;
    }
    
    public void ModificarLocalidad(int id,String nombre,int prov,int codigo){
       String sql="call ModificarLocalidad(?,?,?,?)";
        try{
          cmd=cn.prepareCall(sql);
          cmd.setInt(1,id);
          cmd.setString(2,nombre);
          cmd.setInt(3, prov);
          cmd.setInt(4, codigo);
          cmd.execute();
       }catch(Exception ex){
         System.out.println(ex.getMessage());
       }
    }

  public int EliminarLocalidad(int localidad) {
    int encontrada=0; 
       String sql="call EliminarLocalidad(?,?)";
        try{
          cmd=cn.prepareCall(sql);
          cmd.setInt(1,localidad);
          cmd.registerOutParameter(2, java.sql.Types.INTEGER);
          cmd.execute();          
          encontrada=cmd.getInt(2);  
       }catch(Exception ex){
         System.out.println(ex.getMessage());
       }    
        return encontrada;
    }
  
   public int BuscarCoincidencias(String localidad,int provincia) {
    int encontrada=0; 
       String sql="call BuscarCoincidenciasxLocalidad(?,?,?)";
        try{
          cmd=cn.prepareCall(sql);
          cmd.setString(1,localidad);
          cmd.setInt(2,provincia);
          cmd.registerOutParameter(3, java.sql.Types.INTEGER);
          cmd.execute();          
          encontrada=cmd.getInt(3);  
       }catch(Exception ex){
         System.out.println(ex.getMessage());
       }    
        return encontrada;
    }
}
