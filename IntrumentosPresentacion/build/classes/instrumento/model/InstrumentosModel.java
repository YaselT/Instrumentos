/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instrumento.model;

import instrumento.entidades.Instrumento;
import java.util.ArrayList;
import java.util.List;
import java.util.Observer;
import javax.swing.DefaultComboBoxModel;


public class InstrumentosModel extends java.util.Observable {
    Instrumento instrumento;
    InstrumentosTableModel Var_InstrumentosTM;    
    
    public InstrumentosModel() {       
    }
    
    public void init () {
        instrumento = new Instrumento();
        List<Instrumento> row = new ArrayList<Instrumento>();
        this.setTableModel(row);        
    }

    public Instrumento getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(Instrumento instrumento) {
        this.instrumento = instrumento;
    }

    public List<Instrumento> getList_Instrumentos() {
        return Var_InstrumentosTM.rows;
    }   
    
    public InstrumentosTableModel getTableModel() {
        return Var_InstrumentosTM;
    }
    
    public void setTableModel(List<Instrumento> instrumentos) {
        int[] cols = {InstrumentosTableModel.SERIE, InstrumentosTableModel.TIPO, InstrumentosTableModel.DESCRIPCION, 
            InstrumentosTableModel.MINIMO, InstrumentosTableModel.MAXIMO, InstrumentosTableModel.TOLERANCIA0};
        Var_InstrumentosTM = new InstrumentosTableModel(cols, instrumentos);
        setChanged();
        notifyObservers();   
    }
    
    public void addObserver(Observer o) {
        super.addObserver(o);
        setChanged();
        notifyObservers();
    }
    
}
