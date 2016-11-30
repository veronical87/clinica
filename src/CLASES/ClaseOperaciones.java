package CLASES;

import Conexion.ConexionMySQL;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
public class ClaseOperaciones {
    Connection cn;
    CallableStatement cmd;
    
     public ClaseOperaciones(){
       ConexionMySQL cm=new ConexionMySQL();
       cn=cm.Conectar();
    }
     
public void LlenarTabla(DefaultTableModel tabla){
  try{
        String sql="SELECT operaciones.id,tipooperacion.nombre,veterinarios.apellido,veterinarios.nombre,CONCAT(propietarios.apellido,coma,propietarios.nombre)AS dueño,mascota FROM tipooperacion INNER JOIN operaciones ON tipooperacion.id=operaciones.idtipooperacion INNER JOIN veterinarios ON veterinarios.id=operaciones.idveterinario INNER JOIN fichamedica ON operaciones.idficha=fichamedica.id INNER JOIN propietarios ON fichamedica.idpropietario=propietarios.id ORDER BY tipooperacion.nombre ASC";
        cmd=cn.prepareCall(sql);
        ResultSet rs=cmd.executeQuery();
        String[] registro = new String[5];
        while(rs.next()){//aca se lee el maximo de filas
            registro[0]=rs.getString("operaciones.id");
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
 
  public void insertarDatosOperaciones(int ficha,String fechaActual,int idveterinario,int IDLOCALIDAD,int tipoOperacion,String diagnostico){
     String sql="call insertarDatosOperaciones(?,?,?,?,?,?)";
        try{
           cmd=cn.prepareCall(sql); 
           cmd.setInt(1,ficha);
           cmd.setString(2,fechaActual);
           cmd.setInt(3,idveterinario);           
           cmd.setInt(4,IDLOCALIDAD);  
           cmd.setInt(5,tipoOperacion);  
           cmd.setString(6,diagnostico);  
           cmd.execute();                    
//         cmd.close();
//         cn.close();    
        }catch(Exception ex){
          System.out.println(ex.getMessage());
        }     
    }
     
public void modificarDatosOperaciones(int ficha,String fechaActual,int idveterinario,int IDLOCALIDAD,int tipoOperacion,String diagnostico){
    String sql="call modificarDatosOperaciones(?,?,?,?,?,?)";
    try{
       cmd=cn.prepareCall(sql);        
       cmd.setInt(1,ficha);       
       cmd.setString(2,fechaActual);
       cmd.setInt(3,idveterinario);
       cmd.setInt(4,IDLOCALIDAD);
       cmd.setInt(5,tipoOperacion);
       cmd.setString(6,diagnostico);
       cmd.execute();          

//         cmd.close();
//         cn.close();    
        }catch(Exception ex){
          System.out.println(ex.getMessage());
        }      
    }      

public int BajaOperacion(int id) {
   int encontrada=0;
   String sql="call BajaOperacion(?,?)";
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

    
//  public String VerificarMedicamento(String nombre){
//     String encontrada=null;   
//     String sql="call VerificarMedicamento(?,?)";
//        try{
//           cmd=cn.prepareCall(sql);               
//           cmd.setString(1,nombre);
//           cmd.registerOutParameter(2, java.sql.Types.VARCHAR);
//           cmd.execute();
//           encontrada=cmd.getString(2);
//           
////         cmd.close();
////         cn.close();    
//        }catch(Exception ex){
//          System.out.println(ex.getMessage());
//        }      
//        return encontrada;
//    }
//  
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

public int CantVacunas(int IDFICHA) {
 int encontrada=0;   
 String sql="call CantVacunas(?,?)";
    try{
       cmd=cn.prepareCall(sql);         
       cmd.setInt(1,IDFICHA);
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

 public void agregarMedicamentoxOperacion(int IDOPERACION,int IDMEDICAMENTO,int idtipoOperacion, int c) {
   String sql="call agregarMedicamentoxConsulta(?,?,?,?)";    
    try{                
      cmd=cn.prepareCall(sql); 
      cmd.setInt(1,IDOPERACION);
      cmd.setInt(2,IDMEDICAMENTO);
      cmd.setInt(3,idtipoOperacion);
      cmd.setInt(4,c);   
      cmd.execute();
    
   }catch(Exception ex){
         System.out.println(ex.getMessage());
       }    
  }

  public void actualizarStockMedicamento(int IDMEDICAMENTO, int c, int indicador) {
    String sql="call actualizarStockMedicamento(?,?,?)";    
    try{                
      cmd=cn.prepareCall(sql);
      cmd.setInt(1,IDMEDICAMENTO);
      cmd.setInt(2,c);
      cmd.setInt(3,indicador);         
      cmd.execute();
    
   }catch(Exception ex){
         System.out.println(ex.getMessage());
       }    
    }

 public int VerificarfechaxConsulta(int idusuario,int idoperacion,String dia, String hora) {
    int encontrada=0;   
    String sql="call VerificarfechaxConsulta(?,?,?,?,?)";
    try{
       cmd=cn.prepareCall(sql);         
       cmd.setInt(1,idusuario);
       cmd.setInt(2,idoperacion);
       cmd.setString(3,dia);
       cmd.setString(4,hora);
       cmd.registerOutParameter(5, java.sql.Types.INTEGER);
       cmd.execute();
       encontrada=cmd.getInt(5);

//         cmd.close();
//         cn.close();    
    }catch(Exception ex){
      System.out.println(ex.getMessage());
    }      
    return encontrada; 
    }

    public void LlenarTablaMedicamento(DefaultTableModel tabla, int IDTipoOperacion) {
        try{
        String sql="SELECT medicamentos.nombre,categoriamedicamento.nombre FROM medicamentos INNER JOIN categoriamedicamento ON categoriamedicamento.id=medicamentos.idcategoria INNER JOIN medicamentosxoperacion ON medicamentos.id=medicamentosxoperacion.idmedicamento WHERE idoperacion='"+IDTipoOperacion+"' ORDER BY categoriamedicamento.nombre  ASC";
        cmd=cn.prepareCall(sql);
        ResultSet rs=cmd.executeQuery();
        String[] registro = new String[2];
        while(rs.next()){//aca se lee el maximo de filas
            registro[0]=rs.getString("categoriamedicamento.nombre");
            registro[1]=rs.getString("medicamentos.nombre");
            tabla.addRow(registro); 
        }
//      cmd.close();
//      cn.close();      
      }catch(Exception ex){
         System.out.println(ex.getMessage());
      }   
    }

 public void quitarMedicamentoxOperacion(int IDOPERACION, int IDMEDICAMENTO, int c) {
    String sql="call quitarMedicamentoxConsulta(?,?,?)";    
    try{                
      cmd=cn.prepareCall(sql);
      cmd.setInt(1,IDOPERACION);
      cmd.setInt(2,IDMEDICAMENTO);
      cmd.setInt(3,c);   
      cmd.execute();
    
   }catch(Exception ex){
         System.out.println(ex.getMessage());
       }      
    }

 public void InsertarFechaxOperacion(int idusuario, int operacion,String dia, String hora) {
    String sql="call InsertarFechaxConsulta(?,?,?,?)";    
    try{                
      cmd=cn.prepareCall(sql);
      cmd.setInt(1,idusuario);
      cmd.setInt(2,operacion);
      cmd.setString(3,dia);
      cmd.setString(4,hora);   
      cmd.execute();
    
   }catch(Exception ex){
         System.out.println(ex.getMessage());
       }   
    }
}
