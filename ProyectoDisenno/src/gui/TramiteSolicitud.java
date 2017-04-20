/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import controlador.ui.uiTramiteSolicitud;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextArea;

/**
 *
 * @author USER
 */
public class TramiteSolicitud extends javax.swing.JFrame {

    
    private uiTramiteSolicitud ui; 
    
    /**
     * Creates new form TramiteSolicitud
     */
    public TramiteSolicitud() {
        initComponents();
        ui = new uiTramiteSolicitud(this);            
    }

    public uiTramiteSolicitud getUi() {
        return ui;
    }

    public void setUi(uiTramiteSolicitud ui) {
        this.ui = ui;
    }

    public JTextArea getAreaTextAgregarConsiderando() {
        return areaTextAgregarConsiderando;
    }

    public void setAreaTextAgregarConsiderando(JTextArea areaTextAgregarConsiderando) {
        this.areaTextAgregarConsiderando = areaTextAgregarConsiderando;
    }

    public JTextArea getAreaTextModificarConsiderando() {
        return areaTextModificarConsiderando;
    }

    public void setAreaTextModificarConsiderando(JTextArea areaTextModificarConsiderando) {
        this.areaTextModificarConsiderando = areaTextModificarConsiderando;
    }

    public JTextArea getAreaTextTodosConsiderandos() {
        return areaTextTodosConsiderandos;
    }

    public void setAreaTextTodosConsiderandos(JTextArea areaTextTodosConsiderandos) {
        this.areaTextTodosConsiderandos = areaTextTodosConsiderandos;
    }

    public JButton getBtnAgregarConsiderando() {
        return btnAgregarConsiderando;
    }

    public void setBtnAgregarConsiderando(JButton btnAgregarConsiderando) {
        this.btnAgregarConsiderando = btnAgregarConsiderando;
    }

    public JButton getBtnEliminarConsiderando() {
        return btnEliminarConsiderando;
    }

    public void setBtnEliminarConsiderando(JButton btnEliminarConsiderando) {
        this.btnEliminarConsiderando = btnEliminarConsiderando;
    }

    public JButton getBtnModificarConsiderando() {
        return btnModificarConsiderando;
    }

    public void setBtnModificarConsiderando(JButton btnModificarConsiderando) {
        this.btnModificarConsiderando = btnModificarConsiderando;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public JLabel getjLabel4() {
        return jLabel4;
    }

    public void setjLabel4(JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JScrollPane getjScrollPane2() {
        return jScrollPane2;
    }

    public void setjScrollPane2(JScrollPane jScrollPane2) {
        this.jScrollPane2 = jScrollPane2;
    }

    public JScrollPane getjScrollPane3() {
        return jScrollPane3;
    }

    public void setjScrollPane3(JScrollPane jScrollPane3) {
        this.jScrollPane3 = jScrollPane3;
    }

    public JSpinner getSpnSeleccionarConsiderando() {
        return spnSeleccionarConsiderando;
    }

    public void setSpnSeleccionarConsiderando(JSpinner spnSeleccionarConsiderando) {
        this.spnSeleccionarConsiderando = spnSeleccionarConsiderando;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spnSeleccionarConsiderando = new javax.swing.JSpinner();
        btnModificarConsiderando = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaTextAgregarConsiderando = new javax.swing.JTextArea();
        btnAgregarConsiderando = new javax.swing.JButton();
        btnEliminarConsiderando = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        areaTextTodosConsiderandos = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        areaTextModificarConsiderando = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnModificarConsiderando.setText("Modificar");

        areaTextAgregarConsiderando.setColumns(20);
        areaTextAgregarConsiderando.setRows(5);
        jScrollPane1.setViewportView(areaTextAgregarConsiderando);

        btnAgregarConsiderando.setText("Agregar");

        btnEliminarConsiderando.setText("Eliminar");

        jLabel2.setText("Seleccionar considerando #");

        areaTextTodosConsiderandos.setColumns(20);
        areaTextTodosConsiderandos.setRows(5);
        jScrollPane2.setViewportView(areaTextTodosConsiderandos);

        jLabel4.setText("Considerandos");

        areaTextModificarConsiderando.setColumns(20);
        areaTextModificarConsiderando.setRows(5);
        jScrollPane3.setViewportView(areaTextModificarConsiderando);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(btnAgregarConsiderando))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnModificarConsiderando))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(spnSeleccionarConsiderando, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarConsiderando))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(277, 277, 277)
                        .addComponent(jLabel4)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(btnAgregarConsiderando)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(spnSeleccionarConsiderando, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarConsiderando))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(19, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnModificarConsiderando)
                        .addGap(78, 78, 78))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(TramiteSolicitud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TramiteSolicitud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TramiteSolicitud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TramiteSolicitud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TramiteSolicitud().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaTextAgregarConsiderando;
    private javax.swing.JTextArea areaTextModificarConsiderando;
    private javax.swing.JTextArea areaTextTodosConsiderandos;
    private javax.swing.JButton btnAgregarConsiderando;
    private javax.swing.JButton btnEliminarConsiderando;
    private javax.swing.JButton btnModificarConsiderando;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSpinner spnSeleccionarConsiderando;
    // End of variables declaration//GEN-END:variables
}
