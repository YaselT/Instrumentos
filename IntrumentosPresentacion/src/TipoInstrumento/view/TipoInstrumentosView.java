/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TipoInstrumento.view;

import TipoInstrumento.controller.TipoInstrumentosController;
import TipoInstrumento.model.TipoInstrumentosModel;
import intrumentos.presentacion.IntrumentosPresentacion;
import java.util.Observable;

/**
 *
 * @author LENOVO
 */
public class TipoInstrumentosView extends javax.swing.JInternalFrame implements java.util.Observer{
    TipoInstrumentosController controller;
    TipoInstrumentosModel model;
    
    public void setController(TipoInstrumentosController controller) {
        this.controller = controller;
    }
    
    public void setModel(TipoInstrumentosModel model) {
        this.model = model;
        model.addObserver(this);
    }
    
    public TipoInstrumentosController getController() {
        return controller;
    }

    
    public TipoInstrumentosModel getModel() {
        return model;
    }
    
    
    public TipoInstrumentosView() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        VentanaAgregar = new javax.swing.JDialog();
        jComboBox1 = new javax.swing.JComboBox<>();
        TipoInstrumentoLabel = new javax.swing.JLabel();
        CodigoLabel = new javax.swing.JLabel();
        UnidadLabel = new javax.swing.JLabel();
        CodigoTxtField = new javax.swing.JTextField();
        UnidadTxtField = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tiposInstrumentosFld = new javax.swing.JTable();
        btnBusqueda = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        nombreFld = new javax.swing.JTextField();

        jComboBox1.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        TipoInstrumentoLabel.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        TipoInstrumentoLabel.setText("Tipo de instrumento");

        CodigoLabel.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        CodigoLabel.setText("Codigo");

        UnidadLabel.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        UnidadLabel.setText("Unidad");

        CodigoTxtField.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N

        UnidadTxtField.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N

        btnAceptar.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        btnAceptar.setText("Aceptar");

        btnCancelar.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        btnCancelar.setText("Cancelar");

        javax.swing.GroupLayout VentanaAgregarLayout = new javax.swing.GroupLayout(VentanaAgregar.getContentPane());
        VentanaAgregar.getContentPane().setLayout(VentanaAgregarLayout);
        VentanaAgregarLayout.setHorizontalGroup(
            VentanaAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VentanaAgregarLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(VentanaAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CodigoLabel)
                    .addComponent(UnidadLabel)
                    .addComponent(btnAceptar)
                    .addComponent(TipoInstrumentoLabel))
                .addGap(23, 23, 23)
                .addGroup(VentanaAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(VentanaAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(UnidadTxtField, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                        .addComponent(CodigoTxtField))
                    .addComponent(btnCancelar))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        VentanaAgregarLayout.setVerticalGroup(
            VentanaAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VentanaAgregarLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(VentanaAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TipoInstrumentoLabel)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(VentanaAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CodigoLabel)
                    .addComponent(CodigoTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(VentanaAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UnidadLabel)
                    .addComponent(UnidadTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(VentanaAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnCancelar))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        tiposInstrumentosFld.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        tiposInstrumentosFld.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tiposInstrumentosFld.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tiposInstrumentosFldMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tiposInstrumentosFld);

        btnBusqueda.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        btnBusqueda.setText("Busqueda");
        btnBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusquedaActionPerformed(evt);
            }
        });

        btnAgregar.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnBorrar.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        nombreFld.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnBusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nombreFld)
                            .addComponent(btnBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBusqueda)
                    .addComponent(nombreFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnBorrar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusquedaActionPerformed
        controller.buscar();
        
    }//GEN-LAST:event_btnBusquedaActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        IntrumentosPresentacion.Tp_Instrumento_VIEW.setLocation( this.btnAgregar.getLocationOnScreen() );
        controller.agregar();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        int row = this.tiposInstrumentosFld.getSelectedRow();
        if (row != -1)
            controller.borrar(row);
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void tiposInstrumentosFldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tiposInstrumentosFldMouseClicked
        if ( evt.getClickCount() == 2 ) {
            int row = this.tiposInstrumentosFld.getSelectedRow();
            IntrumentosPresentacion.Tp_Instrumento_VIEW.setLocation( evt.getLocationOnScreen() );
            controller.editar(row);
        }
    }//GEN-LAST:event_tiposInstrumentosFldMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TipoInstrumentosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TipoInstrumentosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TipoInstrumentosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TipoInstrumentosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TipoInstrumentosView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CodigoLabel;
    private javax.swing.JTextField CodigoTxtField;
    private javax.swing.JLabel TipoInstrumentoLabel;
    private javax.swing.JLabel UnidadLabel;
    private javax.swing.JTextField UnidadTxtField;
    private javax.swing.JDialog VentanaAgregar;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBusqueda;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextField nombreFld;
    private javax.swing.JTable tiposInstrumentosFld;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {
        tiposInstrumentosFld.setModel( model.getTableModel() );
    }
}
