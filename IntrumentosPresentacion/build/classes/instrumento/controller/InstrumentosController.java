/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instrumento.controller;

import instrumento.entidades.Instrumento;
import instrumento.model.InstrumentoModel;
import instrumento.model.InstrumentosModel;
import instrumento.view.InstrumentosView;
import intrumentos.presentacion.IntrumentosPresentacion;
import java.util.List;
import javax.swing.JOptionPane;


public class InstrumentosController {    
    InstrumentosModel model;
    InstrumentosView  view;
    private static IntrumentosPresentacion Instrumento_Logic;

    public InstrumentosController(InstrumentosModel model, InstrumentosView view ) {
        model.init();        
        this.model = model;
        this.view = view;
        
        view.setController(this);
        view.setModel(model);
    }

    public void agregar() {
       InstrumentoModel  instrumentoModel = IntrumentosPresentacion.Instrumento_VIEW.getModel(); 
       instrumentoModel.setInstrumento( new Instrumento() ); // para limpiar la ventana de Instrumento_VIEW 
       instrumentoModel.setModo( IntrumentosPresentacion.AGREGAR );
       IntrumentosPresentacion.Instrumento_VIEW.setVisible(true);
    }

    public void buscar() {
        model.getInstrumento().setSerie(view.nombreFld.getText() );
        List <Instrumento> rows = Instrumento_Logic.InstrumentoModel.InstrumentoSerch( model.getInstrumento() );
        if ( !rows.isEmpty() ) {
            model.setTableModel(rows);
        }
        else
            JOptionPane.showMessageDialog(view, "VACIO", "",JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void editar(int row) {
        InstrumentoModel InstrumentoModel = IntrumentosPresentacion.Instrumento_VIEW.getModel(); 
        Instrumento editado = model.getTableModel().getRowAt(row);
        InstrumentoModel.setModo( IntrumentosPresentacion.EDITAR );
        InstrumentoModel.setInstrumento(editado);
        IntrumentosPresentacion.Instrumento_VIEW.setVisible(true);
    }
    
    public void borrar(int row) {
        Instrumento editado = model.getTableModel().getRowAt(row);
        try {
            Instrumento_Logic.InstrumentoModel.InstrumentoBorrar(editado);
        }
        catch (Exception e) {
            
        }
        model.setTableModel( Instrumento_Logic.InstrumentoModel.InstrumentoSerch(new Instrumento()) );
        
    }
    
}
