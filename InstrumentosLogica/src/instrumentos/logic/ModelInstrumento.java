/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instrumentos.logic;

import instrumento.entidades.Instrumento;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author anderson
 */
public class ModelInstrumento {
    private HashMap<String,Instrumento> list=new HashMap();
    
    private static ModelInstrumento uniqueInstance;
    
    public static ModelInstrumento instance(){
        if (uniqueInstance == null){
            uniqueInstance = new ModelInstrumento();
        }
        return uniqueInstance;
    }
    
    private ModelInstrumento() {
    }   
    
    public List<Instrumento> InstrumentoSerch(Instrumento filtro){
        List<Instrumento> resultado;
        resultado = new ArrayList<Instrumento>();
        for (Instrumento ti: list.values()) {
            if ( ti.getSerie().contains( filtro.getSerie() ) ){
                resultado.add(ti);
            }
        }
        return resultado;        
    } 
    
    public void InstrumentoAgregar(Instrumento ti) throws Exception{
        if ( list.get( ti.getSerie() ) == null ) {
            list.put(ti.getSerie(), ti);
        }
        else{
            throw new Exception("Instrumento ya Existe");
        }
    }
    
    public void InstrumentoActualizar(Instrumento ti) throws Exception{
        if ( list.get( ti.getSerie() ) != null) {
            list.put( ti.getSerie(), ti );
        }
        else{
            throw new Exception("Instrumento No Existe");
        }
    }

    public void InstrumentoBorrar(Instrumento ti) throws Exception{
        if ( list.get( ti.getSerie() ) != null ) {
            list.remove( ti.getSerie() );
        }
        else{
            throw new Exception("Instrumento No Existe");
        }
    }   
}
