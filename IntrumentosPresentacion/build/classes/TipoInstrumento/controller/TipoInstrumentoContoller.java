/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TipoInstrumento.controller;

import TipoInstrumento.model.TipoInstrumentoModel;
import TipoInstrumento.model.TipoInstrumentosModel;
import TipoInstrumento.view.TipoInstrumentoView;
import instrumento.entidades.TipoInstrumento;
import instrumentos.logic.Model;
import intrumentos.presentacion.IntrumentosPresentacion;
import javax.swing.JOptionPane;


public class TipoInstrumentoContoller {
   // Model model_Logic;
    TipoInstrumentoModel model;
    TipoInstrumentoView view;
    private static IntrumentosPresentacion model_Logic;
    

    public TipoInstrumentoContoller(TipoInstrumentoModel model, TipoInstrumentoView view) {
        model.init();       
        this.model = model;
        this.view = view;
        
        view.setController(this);
        view.setModel(model);
    }

    public void guardar() {
        // se obtiene la lista de Tipo de Instrumentos, para modificarla mas adelante
        TipoInstrumentosModel tipoInstrumentosModel = IntrumentosPresentacion.Tp_Instrumentos_VIEW.getModel();

        TipoInstrumento aux = new TipoInstrumento();
        
        if ( view.NombreFld.getText().length()!=0 && view.UnidadFld.getText().length() !=0 ) {//modificado            
            aux.setNombre(view.NombreFld.getText());
            aux.setUnidad(view.UnidadFld.getText());
            aux.setCodigo( view.CodigoFld.getText() );
            try {
                switch ( model.getModo() ) {
                    case IntrumentosPresentacion.AGREGAR :
                        // tipo Instrumento agregado a la capa logica
                        model_Logic.TipoInstrumentoModel.tipoInstrumentoAgregar(aux);//modificado
                        // se modifica la lista Tipo de Instrumentos q existia, para refrescar la vantana TipoInstrumentosView el TableModel, presentando los Tp instr q existen
                        tipoInstrumentosModel.setTableModel( model_Logic.TipoInstrumentoModel.tipoInstrumentoSerch( tipoInstrumentosModel.getInstrumento() ) );//modificado
                        // usado para limpiar la ventana TipoInstrumentoView
                        model.setInstrumento( new TipoInstrumento() );
                        break;
                        
                    case IntrumentosPresentacion.EDITAR:
                        
                        model_Logic.TipoInstrumentoModel.tipoInstrumentoActualizar(aux);
                        tipoInstrumentosModel.setTableModel( model_Logic.TipoInstrumentoModel.tipoInstrumentoSerch( tipoInstrumentosModel.getInstrumento() ) );
                        break;
                }
            }
            catch(Exception e) {
                JOptionPane.showMessageDialog(view, "TIPO DE INSTRUMENTO YA EXISTE", "",JOptionPane.INFORMATION_MESSAGE);
            }
            
        }
        else
            JOptionPane.showMessageDialog(view, "ESPACIOS VACIOS", "",JOptionPane.INFORMATION_MESSAGE);
        
    }
    
    
}
