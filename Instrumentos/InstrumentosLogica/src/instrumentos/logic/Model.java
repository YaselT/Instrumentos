/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instrumentos.logic;

import instrumentos.entities.TipoInstrumento;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Escinf
 */
public class Model {
    //private Dao dao;
    private HashMap<String,TipoInstrumento> list=new HashMap();
     
    private static Model uniqueInstance;
    
    public static Model instance(){
        if (uniqueInstance == null){
            uniqueInstance = new Model();
        }
        return uniqueInstance;
    }
    private Model(){
        //dao = new Dao();
    }

    public List<TipoInstrumento> tipoInstrumentoSerch(TipoInstrumento filtro){
        List<TipoInstrumento> resultado;
        resultado = new ArrayList<TipoInstrumento>();
        for (TipoInstrumento ti: list.values()){
            if (ti.getNombre().contains(filtro.getNombre())){
                resultado.add(ti);
            }
        }
        return resultado;        
    } 
    
    public void tipoInstrumentoAgregar(TipoInstrumento ti) throws Exception{
        if (list.get(ti.getCodigo())==null){
            list.put(ti.getCodigo(), ti);
        }
        else{
            throw new Exception("Tipo Instrumento ya Existe");
        }
    }
    
    public void tipoInstrumentoActualzar(TipoInstrumento ti) throws Exception{
        if (list.get(ti.getCodigo())!=null){
            list.put(ti.getCodigo(), ti);
        }
        else{
            throw new Exception("Tipo Instrumento No Existe");
        }
    }

    public void tipoInstrumentoBorrar(TipoInstrumento ti) throws Exception{
        if (list.get(ti.getCodigo())!=null){
            list.remove(ti.getCodigo());
        }
        else{
            throw new Exception("Tipo Instrumento No Existe");
        }
    }    
}
