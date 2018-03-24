/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instrumento.model;

import TipoInstrumento.model.TipoInstrumentoTableModel;
import instrumento.entidades.Instrumento;
import instrumento.entidades.TipoInstrumento;
import java.util.Collection;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;

public class InstrumentoModel extends java.util.Observable {

    Instrumento instrumento;    
    int modo;
    ComboBoxModel<TipoInstrumento> tiposInstrumento;

    public void init(TipoInstrumento[] tipoInstrumento) {
        setInstrumento(new Instrumento());
        setTiposInstrumento(tipoInstrumento);
    }

    public Instrumento getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(Instrumento instrumento) {
        this.instrumento = instrumento;
        setChanged();
        notifyObservers();
    }

    public int getModo() {
        return modo;
    }

    public void setModo(int modo) {
        this.modo = modo;
    }

    public ComboBoxModel<TipoInstrumento> getTipoInstrumento() {
        return tiposInstrumento;
    }

    public void setTiposInstrumento(TipoInstrumento[] tipoInstrumento) {
        this.tiposInstrumento = new DefaultComboBoxModel(tipoInstrumento);
        setChanged();
        notifyObservers();
    }

    public void addObserver(java.util.Observer o) {
        super.addObserver(o);
        setChanged();
        notifyObservers();
    }
}
