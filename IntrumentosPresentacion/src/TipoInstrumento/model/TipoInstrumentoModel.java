/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TipoInstrumento.model;

import instrumento.entidades.TipoInstrumento;

/**
 *
 * @author anderson
 */
public class TipoInstrumentoModel  extends java.util.Observable{
    TipoInstrumento instrumento;
    
    int modo;    

    public TipoInstrumentoModel() {
       
    }
    
    
    
    public void init() {
        setInstrumento( new TipoInstrumento() );
    }
    
    public TipoInstrumento getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(TipoInstrumento instrumento) {
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
    
    public void addObserver(java.util.Observer o) {
        super.addObserver(o);
        setChanged();
        notifyObservers();
    }

   
    
}
