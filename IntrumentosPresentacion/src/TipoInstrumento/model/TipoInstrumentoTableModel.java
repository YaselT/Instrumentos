
package TipoInstrumento.model;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import instrumento.entidades.TipoInstrumento;



public class TipoInstrumentoTableModel extends AbstractTableModel{
    List<TipoInstrumento> rows;
    int[] cols;

    public  TipoInstrumentoTableModel(int[] cols, List<TipoInstrumento> rows){
        this.cols=cols;
        this.rows=rows;
        initColNames();
    }

    //agregado
    public List getRows(){
        return rows;
    }
    
    public int getColumnCount() {
        return cols.length;
    }

    public String getColumnName(int col){
        return colNames[cols[col]];
    }

    public Class<?> getColumnClass(int col){
        switch (cols[col]){           
            default: return super.getColumnClass(col);
        }    
    }    
    
    public int getRowCount() {
        return rows.size();
    }

    public Object getValueAt(int row, int col) {
        TipoInstrumento ti = rows.get(row);
        switch (cols[col]){
            case CODIGO: return ti.getCodigo();
            case NOMBRE: return ti.getNombre();
            case UNIDAD: return ti.getUnidad();            
            default: return "";
        }
    }    

    public TipoInstrumento getRowAt(int row) {
        return rows.get(row);
    }
    
    public static final int CODIGO=0;
    public static final int NOMBRE=1;
    public static final int UNIDAD=2;
    
    
    String[] colNames = new String[3];
    private void initColNames(){
        colNames[CODIGO]= "Codigo";
        colNames[NOMBRE]= "Nombre";
        colNames[UNIDAD]= "Unidad";        
    }
            
}
