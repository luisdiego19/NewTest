/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import controlador.ui.uiPanelSolicitudes;
import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JTable;


/**
 *
 * @author USER
 */
public class PanelSolicitudes extends javax.swing.JFrame {

    
    private uiPanelSolicitudes ui;
    
    /**
     * Creates new form PanelSolicitudes
     */
    public PanelSolicitudes() {
        initComponents();
        ui = new uiPanelSolicitudes(this);                
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaSolicitudes = new javax.swing.JTable();
        btnVerSolicitud = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuItemBackOffice = new javax.swing.JMenuItem();
        menuItemConfiguraciones = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tablaSolicitudes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha", "ID", "Nombre", "Periodo", "Curso", "Grupo", "Carnet", "Nombre ", "Estado"
            }
        ));
        tablaSolicitudes.setCellSelectionEnabled(true);
        tablaSolicitudes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(tablaSolicitudes);
        tablaSolicitudes.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        btnVerSolicitud.setText("Ver Solicitud");
        btnVerSolicitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerSolicitudActionPerformed(evt);
            }
        });

        jMenu1.setText("Operaciones");

        menuItemBackOffice.setText("BackOffice");
        menuItemBackOffice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemBackOfficeActionPerformed(evt);
            }
        });
        jMenu1.add(menuItemBackOffice);

        menuItemConfiguraciones.setText("Configuraciones");
        menuItemConfiguraciones.setToolTipText("");
        jMenu1.add(menuItemConfiguraciones);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Datos");

        jMenuItem2.setText("Estadísticas");
        jMenu2.add(jMenuItem2);

        jMenuItem3.setText("Cartera Docente");
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("Plan de Estudios");
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("Oferta Académica del Periodo");
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(315, 315, 315)
                .addComponent(btnVerSolicitud)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnVerSolicitud)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerSolicitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerSolicitudActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVerSolicitudActionPerformed

    private void menuItemBackOfficeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemBackOfficeActionPerformed
        ui.accionMenuBackOffice();
    }//GEN-LAST:event_menuItemBackOfficeActionPerformed

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
            java.util.logging.Logger.getLogger(PanelSolicitudes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelSolicitudes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelSolicitudes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelSolicitudes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelSolicitudes().setVisible(true);
            }
        });
    }

    public JButton getBtnVerSolicitud() {
        return btnVerSolicitud;
    }

    public JMenuItem getMenuItemBackOffice() {
        return menuItemBackOffice;
    }

    public JMenuItem getMenuItemConfiguraciones() {
        return menuItemConfiguraciones;
    }

    public JTable getTablaSolicitudes() {
        return tablaSolicitudes;
    }
            
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVerSolicitud;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem menuItemBackOffice;
    private javax.swing.JMenuItem menuItemConfiguraciones;
    private javax.swing.JTable tablaSolicitudes;
    // End of variables declaration//GEN-END:variables
}
