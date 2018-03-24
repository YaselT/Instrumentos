/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intrumentos.presentacion;

import TipoInstrumento.controller.TipoInstrumentoContoller;
import TipoInstrumento.controller.TipoInstrumentosController;
import TipoInstrumento.model.TipoInstrumentoModel;
import TipoInstrumento.model.TipoInstrumentosModel;
import TipoInstrumento.view.TipoInstrumentoView;
import TipoInstrumento.view.TipoInstrumentosView;
import instrumento.controller.InstrumentoController;
import instrumento.controller.InstrumentosController;
import instrumento.model.InstrumentoModel;
import instrumento.model.InstrumentosModel;
import instrumento.view.InstrumentoView;
import instrumento.view.InstrumentosView;
import instrumentos.logic.Model;
import instrumentos.logic.ModelInstrumento;
import menu.MenuView;


/**
 *
 * @author LENOVO
 */
public class IntrumentosPresentacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MenuView menu = new MenuView ();
        menu.setVisible(true);
        
        TipoInstrumentoModel = Model.instance();
        InstrumentoModel = ModelInstrumento.instance();
        
        
        TipoInstrumentosModel tipoInstrumentosModel = new TipoInstrumentosModel();
        TipoInstrumentosView tipoInstrumentosView = new TipoInstrumentosView ();
        Tp_Instrumentos_VIEW = tipoInstrumentosView;
        TipoInstrumentosController tipoInstrumentosController = new TipoInstrumentosController (tipoInstrumentosView, tipoInstrumentosModel);
        
        TipoInstrumentoModel tipoInstrumentoModel = new TipoInstrumentoModel () ;
        TipoInstrumentoView tipoInstrumentoView = new TipoInstrumentoView(menu,true);
        Tp_Instrumento_VIEW = tipoInstrumentoView;
        TipoInstrumentoContoller tipoInstrumentoContoller = new TipoInstrumentoContoller (tipoInstrumentoModel, tipoInstrumentoView);//modificado
        
        
        InstrumentosModel instrumentosModel = new InstrumentosModel ();
        InstrumentosView  instrumentosView = new InstrumentosView();
        Instrumentos_VIEW = instrumentosView;
        InstrumentosController instrumentosController = new InstrumentosController (instrumentosModel, instrumentosView);
        
        InstrumentoModel instrumentoModel = new InstrumentoModel () ;
        InstrumentoView instrumentoView = new InstrumentoView(menu,true);
        Instrumento_VIEW = instrumentoView;
        InstrumentoController instrumentoController = new InstrumentoController (instrumentoModel, instrumentoView);
       
        
        menu.Contenedor.add( instrumentosView );
        menu.Contenedor.add( tipoInstrumentosView );
        
    }
    public static Model TipoInstrumentoModel;
    public static ModelInstrumento InstrumentoModel;
    
    public static  TipoInstrumentoView Tp_Instrumento_VIEW;
    public static  TipoInstrumentosView Tp_Instrumentos_VIEW;
    
    public static  InstrumentosView Instrumentos_VIEW;
    public static  InstrumentoView Instrumento_VIEW;
    
    public static final int EDITAR=1;     
    public static final int AGREGAR=0;
}
