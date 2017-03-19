package CLASES;
import Conexion.ConexionMySQL;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class ClaseMedicamentos {
    Connection cn;
    CallableStatement cmd;
    
     public ClaseMedicamentos(){
       ConexionMySQL cm=new ConexionMySQL();
       cn=cm.Conectar();
    }
      
    public void LlenarTablaPrincipal(DefaultTableModel tabla){
      try{
        String sql="SELECT medicamentos.id,categoriamedicamento.nombre,medicamentos.nombre FROM medicamentos INNER JOIN categoriamedicamento ON categoriamedicamento.id=medicamentos.idcategoria ORDER BY medicamentos.id ASC";
        cmd=cn.prepareCall(sql);
        ResultSet rs=cmd.executeQuery();
        String[] registro = new String[3];
        while(rs.next()){//aca se lee el maximo de filas
            registro[0]=rs.getString("medicamentos.id");
            registro[1]=rs.getString("categoriamedicamento.nombre");
            registro[2]=rs.getString("medicamentos.nombre");
            tabla.addRow(registro); 
        }
//      cmd.close();
//      cn.close();      
      }catch(Exception ex){
         System.out.println(ex.getMessage());
      }     
    }     
         
  public int AgregarMedicamento(String nombre,int categoria,int actual,int min,String descripcion,String composicion,String accion){
     int resultado = 0;
      String sql="call AgregarMedicamento(?,?,?,?,?,?,?,?)";
        try{
           cmd=cn.prepareCall(sql);        
           cmd.setString(1,nombre);
           cmd.setInt(2,categoria);
           cmd.setInt(3,actual);
           cmd.setInt(4, min); 
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
  
  public int VerificarMedicamento(String nombre){
     int encontrada=0;   
     String sql="call VerificarMedicamento(?,?)";
        try{
           cmd=cn.prepareCall(sql);           
          
           cmd.setString(1,nombre);
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

    public int VerificarMedicamentoxOperacion(int idMedicamento) {
        int encontrada=0;
        String sql="call VerificarMedicamentoxOperacion(?,?)";
        try{
           cmd=cn.prepareCall(sql);          
           cmd.setInt(1,idMedicamento);
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

    public void AgregarMedxTipoOp(int IDTipoOp,int idMed, int idespecie) {
         String sql="call AgregarMedxTipoOp(?,?,?)";
        try{
          cmd=cn.prepareCall(sql); 
          cmd.setInt(1,IDTipoOp); 
          cmd.setInt(2,idMed);         
          cmd.setInt(3,idespecie);                  
          cmd.execute();
       }catch(Exception ex){
         System.out.println(ex.getMessage());
       } 
    }
     
     public void ModificarMedicamento(int id,String nombre,int categoria,int actual,int min,String descripcion,String composicion,String accion){
       String sql="call ModificarMedicamento(?,?,?,?,?,?,?,?)";
        try{
          cmd=cn.prepareCall(sql); 
          cmd.setInt(1,id);
           cmd.setString(2,nombre);
           cmd.setInt(3,categoria);
           cmd.setInt(4,actual);
           cmd.setInt(5, min); 
           cmd.setString(6,descripcion);
           cmd.setString(7,composicion);
           cmd.setString(8,accion);
          cmd.execute();
       }catch(Exception ex){
         System.out.println(ex.getMessage());
       }
    }      

public int EliminarMedicamento(int id) {
   int encontrada=0;
   String sql="call EliminarMedicamento(?,?)";
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

public int agregarTIPOVACUNAxMEDICAMENTO(int idvacuna,int idremedio) {
   int encontrada=0;
   String sql="call agregarTIPOVACUNAxMEDICAMENTO(?,?,?)";
    try{
       cmd=cn.prepareCall(sql);
       cmd.setInt(1,idvacuna);
       cmd.setInt(2,idremedio);
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
}
