/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instrumento.controller;

import instrumento.entidades.Instrumento;
import instrumento.entidades.TipoInstrumento;
import instrumento.model.InstrumentoModel;
import instrumento.model.InstrumentosModel;
import instrumento.view.InstrumentoView;
import instrumentos.logic.ModelInstrumento;
import intrumentos.presentacion.IntrumentosPresentacion;
import javax.swing.JOptionPane;

public class InstrumentoController {

    private static IntrumentosPresentacion Instrumento_Logic;//le puse asi para no tener que cambiar mucho el codigo pero ahora no es un puntero al modelo de la capa logica sino mas bien a la main class
    InstrumentoModel model;
    InstrumentoView view;

    public InstrumentoController(InstrumentoModel model, InstrumentoView view) {
        model.init(Instrumento_Logic.TipoInstrumentoModel.getInstrumentos().toArray(new TipoInstrumento[0]));
        this.model = model;
        this.view = view;
        view.setController(this);
        view.setModel(model);
    }

    public void guardar() {
        // se obtiene la lista de Instrumentos, para modificarla mas adelante
        InstrumentosModel instrumentosModel = IntrumentosPresentacion.Instrumentos_VIEW.getModel();

        Instrumento aux = new Instrumento();
        // esto hay q cambiarlo y hacer lo q el profe hizo para errores de cuando hay espacios vacios
        if (view.SerieFld.getText().length() != 0
                && view.MinimoFld.getText().length() != 0 && view.MaximoFld.getText().length() != 0
                && view.ToleranciaFld.getText().length() != 0 && view.DescripcionFld.getText().length() != 0) {

            aux.setSerie(view.SerieFld.getText());
            aux.setTipo((TipoInstrumento) view.InstrumentosComboBox.getSelectedItem());
            aux.setMaximo(Integer.parseInt(view.MaximoFld.getText()));
            aux.setMinimo(Integer.parseInt(view.MinimoFld.getText()));
            aux.setTolerancia(Integer.parseInt(view.ToleranciaFld.getText()));
            aux.setDescripcion(view.DescripcionFld.getText());

            try {
                switch (model.getModo()) {
                    case IntrumentosPresentacion.AGREGAR:
                        // tipo Instrumento agregado a la capa logica
                        Instrumento_Logic.InstrumentoModel.InstrumentoAgregar(aux);
                        // se modifica la lista Tipo de Instrumentos q existia, para refrescar la vantana TipoInstrumentosView el TableModel, presentando los Tp instr q existen
                        instrumentosModel.setTableModel(Instrumento_Logic.InstrumentoModel.InstrumentoSerch(instrumentosModel.getInstrumento()));
                        // usado para limpiar la ventana TipoInstrumentoView
                        model.setInstrumento(new Instrumento());
                        break;

                    case IntrumentosPresentacion.EDITAR:
                        Instrumento_Logic.InstrumentoModel.InstrumentoActualizar(aux);//modificado
                        instrumentosModel.setTableModel(Instrumento_Logic.InstrumentoModel.InstrumentoSerch(instrumentosModel.getInstrumento()));//modificado
                        break;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(view, "INSTRUMENTO YA EXISTE", "", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(view, "ESPACIOS VACIOS", "", JOptionPane.INFORMATION_MESSAGE);
        }

    }
}
