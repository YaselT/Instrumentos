/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TipoInstrumento.model;

import instrumento.entidades.TipoInstrumento;
import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public class TipoInstrumentosModel extends java.util.Observable {
    TipoInstrumento instrumento;
    TipoInstrumentoTableModel Var_Instrumentos;

    public TipoInstrumentosModel() {
    }
    
    public void init () {
        instrumento = new TipoInstrumento ();
        List<TipoInstrumento> row = new ArrayList<TipoInstrumento>();
        this.setTableModel(row);
    }
    
    public void setInstrumento(TipoInstrumento instrumento) {
        this.instrumento = instrumento;
    }
    
    public void setTableModel(List<TipoInstrumento> instrumentos) {
        int [] cols = {TipoInstrumentoTableModel.CODIGO, TipoInstrumentoTableModel.NOMBRE, TipoInstrumentoTableModel.UNIDAD};
        Var_Instrumentos = new TipoInstrumentoTableModel (cols, instrumentos);
        setChanged();
        notifyObservers();    
    }
    
    public TipoInstrumento getInstrumento() {
        return instrumento;
    }
    
    public List<TipoInstrumento>  getVar_Instrumentos() {
        return Var_Instrumentos.rows;
    }
    
    public TipoInstrumentoTableModel getTableModel() {
        return Var_Instrumentos;
    }
    
    @Override
    public void addObserver(Observer o) {
        super.addObserver(o);
        setChanged();
        notifyObservers();
    }
    
    
    
   

    
    
    
}
