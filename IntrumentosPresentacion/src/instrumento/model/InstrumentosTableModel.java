/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instrumento.model;

import instrumento.entidades.Instrumento;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class InstrumentosTableModel extends AbstractTableModel{
    List<Instrumento> rows;
    int[] cols; 

    public InstrumentosTableModel(int[] cols, List<Instrumento> rows) {
        this.rows = rows;
        this.cols = cols;
        initColNames();
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
        Instrumento inst = rows.get(row);
        switch (cols[col]){
            case SERIE: return inst.getSerie();
            case TIPO: return inst.getTipo().getNombre();
            case DESCRIPCION: return inst.getDescripcion();
            case MINIMO: return inst.getMinimo();
            case MAXIMO: return inst.getMaximo();
            case TOLERANCIA0: return inst.getTolerancia();
            default: return "";
        }
    }
    
    public Instrumento getRowAt(int row) {
        return rows.get(row);
    }
    
    public static final int SERIE=0;
    public static final int TIPO=1;
    public static final int DESCRIPCION=2;
    public static final int MINIMO=3;
    public static final int MAXIMO=4;
    public static final int TOLERANCIA0=5;
    
    
    String[] colNames = new String[6];
    private void initColNames(){
        colNames[SERIE]= "Serie";
        colNames[TIPO]= "Tipo";
        colNames[DESCRIPCION]= "Descripción"; 
        colNames[MINIMO]= "Mínimo";
        colNames[MAXIMO]= "Máximo ";
        colNames[TOLERANCIA0]= "Tolerancia"; 
    }
    
}
