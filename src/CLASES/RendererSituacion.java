package CLASES;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
public class RendererSituacion extends DefaultTableCellRenderer {
  private int columna_patron ;
  
    public RendererSituacion(int Colpatron)
    {
        this.columna_patron = Colpatron;        
    }
    
     @Override
    public Component getTableCellRendererComponent ( JTable table, Object value, boolean selected, boolean focused, int row, int column )
    {        
        setBackground(Color.white);//color de fondo
        table.setForeground(Color.black);//color de texto
        //Si la celda corresponde a una fila con estado FALSE, se cambia el color de fondo a rojo
        if( table.getValueAt(row,columna_patron).equals("POR REALIZAR")){
            setBackground(new java.awt.Color(255,51,51));            
        }else if( table.getValueAt(row,columna_patron).equals("REALIZADO")){
              setBackground(new java.awt.Color(40,168,92));
        }else if( table.getValueAt(row,columna_patron).equals("CONFIRMADO")){
              setBackground(new java.awt.Color(40,168,92));
        }else if( table.getValueAt(row,columna_patron).equals("DISPONIBLE")){
              setBackground(new java.awt.Color(255,204,51));
        }
        super.getTableCellRendererComponent(table, value, selected, focused, row, column);        
        
        return this;
 }
     


}
