/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TipoInstrumento.controller;

import TipoInstrumento.model.TipoInstrumentoModel;
import TipoInstrumento.model.TipoInstrumentosModel;
import TipoInstrumento.view.TipoInstrumentosView;
import instrumento.entidades.TipoInstrumento;
import instrumentos.logic.Model;
import intrumentos.presentacion.IntrumentosPresentacion;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class TipoInstrumentosController {
    
    TipoInstrumentosView view;
    TipoInstrumentosModel model;
    private static IntrumentosPresentacion model_Logic;

    public TipoInstrumentosController( TipoInstrumentosView view, TipoInstrumentosModel model) {
        model.init();      
        this.view = view;
        this.model = model;
        
        view.setController(this);
        view.setModel(model);
    }
    
    
    
    public void buscar() {
        model.getInstrumento().setNombre( view.nombreFld.getText() );
        List <TipoInstrumento> rows = model_Logic.TipoInstrumentoModel.tipoInstrumentoSerch( model.getInstrumento() );
        if (!rows.isEmpty()) {
            model.setTableModel(rows);
        }
        else
            JOptionPane.showMessageDialog(view, "VACIO", "",JOptionPane.INFORMATION_MESSAGE);
    } 

    public void agregar() {
       TipoInstrumentoModel tipoInstrumentoModel = IntrumentosPresentacion.Tp_Instrumento_VIEW.getModel(); 
       tipoInstrumentoModel.setModo( IntrumentosPresentacion.AGREGAR );
       tipoInstrumentoModel.setInstrumento( new TipoInstrumento() ); // para limpiar la ventana de Tp_Instrumento_VIEW 
       IntrumentosPresentacion.Tp_Instrumento_VIEW.setVisible(true);
    }
    
    public void editar(int row) {
        TipoInstrumentoModel tipoInstrumentoModel = IntrumentosPresentacion.Tp_Instrumento_VIEW.getModel(); 
        TipoInstrumento editado = model.getTableModel().getRowAt(row);
        tipoInstrumentoModel.setModo( IntrumentosPresentacion.EDITAR );
        tipoInstrumentoModel.setInstrumento(editado);
        IntrumentosPresentacion.Tp_Instrumento_VIEW.setVisible(true);
    }
    
    public void borrar(int row) {
        TipoInstrumento editado = model.getTableModel().getRowAt(row);
        try {
            model_Logic.TipoInstrumentoModel.tipoInstrumentoBorrar(editado);
        }
        catch (Exception e) {
            
        }
        model.setTableModel( model_Logic.TipoInstrumentoModel.tipoInstrumentoSerch(new TipoInstrumento()) );
        
    }

    
    
}
