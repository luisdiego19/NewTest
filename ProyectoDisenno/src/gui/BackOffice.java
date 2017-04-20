/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import controlador.ui.uiBackOffice;
import javax.accessibility.AccessibleContext;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author USER
 */
public class BackOffice extends javax.swing.JFrame {

    
    uiBackOffice ui;
    
    /**
     * Creates new form BackOffice
     */
    public BackOffice() {
        initComponents();
        ui = new uiBackOffice(this);
    }

    public uiBackOffice getUi() {
        return ui;
    }

    public JTextArea getAreaTextDetalles() {
        return areaTextDetalles;
    }

    public JButton getBtnAdjuntarEvidencia() {
        return btnAdjuntarEvidencia;
    }

    public JButton getBtnAdjuntarEvidencia1() {
        return btnAdjuntarEvidencia1;
    }

    public JComboBox<String> getComboSolInconsistencia() {
        return comboSolInconsistencia;
    }

    public JLabel getjLabel10() {
        return jLabel10;
    }

    public JLabel getjLabel11() {
        return jLabel11;
    }

    public JLabel getjLabel12() {
        return jLabel12;
    }

    public JLabel getjLabel16() {
        return jLabel16;
    }

    public JLabel getjLabel17() {
        return jLabel17;
    }

    public JLabel getjLabel18() {
        return jLabel18;
    }

    public JLabel getjLabel19() {
        return jLabel19;
    }

    public JLabel getjLabel20() {
        return jLabel20;
    }

    public JLabel getjLabel21() {
        return jLabel21;
    }

    public JLabel getjLabel22() {
        return jLabel22;
    }

    public JLabel getjLabel6() {
        return jLabel6;
    }

    public JLabel getjLabel7() {
        return jLabel7;
    }

    public JLabel getjLabel8() {
        return jLabel8;
    }

    public JLabel getjLabel9() {
        return jLabel9;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public JPanel getjPanel2() {
        return jPanel2;
    }

    public JPanel getjPanel3() {
        return jPanel3;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public JTextField getjTextField10() {
        return jTextField10;
    }

    public JTextField getTxtEstCarnet() {
        return txtEstCarnet;
    }

    public JTextField getTxtEstCorreo() {
        return txtEstCorreo;
    }

    public JTextField getTxtEstNombre() {
        return txtEstNombre;
    }

    public JTextField getTxtSolCurso() {
        return txtSolCurso;
    }

    public JTextField getTxtSolFecha() {
        return txtSolFecha;
    }

    public JTextField getTxtSolGrupo() {
        return txtSolGrupo;
    }

    public JTextField getTxtSolID() {
        return txtSolID;
    }

    public JTextField getTxtSolNombre() {
        return txtSolNombre;
    }

    public JTextField getTxtSolPeriodo() {
        return txtSolPeriodo;
    }

    public static int getEXIT_ON_CLOSE() {
        return EXIT_ON_CLOSE;
    }

    public JRootPane getRootPane() {
        return rootPane;
    }

    public boolean isRootPaneCheckingEnabled() {
        return rootPaneCheckingEnabled;
    }

    public AccessibleContext getAccessibleContext() {
        return accessibleContext;
    }

    public static int getDEFAULT_CURSOR() {
        return DEFAULT_CURSOR;
    }

    public static int getCROSSHAIR_CURSOR() {
        return CROSSHAIR_CURSOR;
    }

    public static int getTEXT_CURSOR() {
        return TEXT_CURSOR;
    }

    public static int getWAIT_CURSOR() {
        return WAIT_CURSOR;
    }

    public static int getSW_RESIZE_CURSOR() {
        return SW_RESIZE_CURSOR;
    }

    public static int getSE_RESIZE_CURSOR() {
        return SE_RESIZE_CURSOR;
    }

    public static int getNW_RESIZE_CURSOR() {
        return NW_RESIZE_CURSOR;
    }

    public static int getNE_RESIZE_CURSOR() {
        return NE_RESIZE_CURSOR;
    }

    public static int getN_RESIZE_CURSOR() {
        return N_RESIZE_CURSOR;
    }

    public static int getS_RESIZE_CURSOR() {
        return S_RESIZE_CURSOR;
    }

    public static int getW_RESIZE_CURSOR() {
        return W_RESIZE_CURSOR;
    }

    public static int getE_RESIZE_CURSOR() {
        return E_RESIZE_CURSOR;
    }

    public static int getHAND_CURSOR() {
        return HAND_CURSOR;
    }

    public static int getMOVE_CURSOR() {
        return MOVE_CURSOR;
    }

    public static int getNORMAL() {
        return NORMAL;
    }

    public static int getICONIFIED() {
        return ICONIFIED;
    }

    public static int getMAXIMIZED_HORIZ() {
        return MAXIMIZED_HORIZ;
    }

    public static int getMAXIMIZED_VERT() {
        return MAXIMIZED_VERT;
    }

    public static int getMAXIMIZED_BOTH() {
        return MAXIMIZED_BOTH;
    }

    public static float getTOP_ALIGNMENT() {
        return TOP_ALIGNMENT;
    }

    public static float getCENTER_ALIGNMENT() {
        return CENTER_ALIGNMENT;
    }

    public static float getBOTTOM_ALIGNMENT() {
        return BOTTOM_ALIGNMENT;
    }

    public static float getLEFT_ALIGNMENT() {
        return LEFT_ALIGNMENT;
    }

    public static float getRIGHT_ALIGNMENT() {
        return RIGHT_ALIGNMENT;
    }


    public static int getDO_NOTHING_ON_CLOSE() {
        return DO_NOTHING_ON_CLOSE;
    }

    public static int getHIDE_ON_CLOSE() {
        return HIDE_ON_CLOSE;
    }

    public static int getDISPOSE_ON_CLOSE() {
        return DISPOSE_ON_CLOSE;
    }


    public static int getWIDTH() {
        return WIDTH;
    }

    public static int getHEIGHT() {
        return HEIGHT;
    }

    public static int getPROPERTIES() {
        return PROPERTIES;
    }

    public static int getSOMEBITS() {
        return SOMEBITS;
    }

    public static int getFRAMEBITS() {
        return FRAMEBITS;
    }

    public static int getALLBITS() {
        return ALLBITS;
    }

    public static int getERROR() {
        return ERROR;
    }

    public static int getABORT() {
        return ABORT;
    }
    
    
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtSolFecha = new javax.swing.JTextField();
        txtSolID = new javax.swing.JTextField();
        txtSolNombre = new javax.swing.JTextField();
        txtSolGrupo = new javax.swing.JTextField();
        comboSolInconsistencia = new javax.swing.JComboBox<>();
        txtSolPeriodo = new javax.swing.JTextField();
        txtSolCurso = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtEstCarnet = new javax.swing.JTextField();
        txtEstNombre = new javax.swing.JTextField();
        txtEstCorreo = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        btnAdjuntarEvidencia = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaTextDetalles = new javax.swing.JTextArea();
        btnAdjuntarEvidencia1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel8.setText("Nombre Solicitante");

        jLabel6.setText("Fecha");

        jLabel10.setText("Periodo");

        jLabel11.setText("Curso");

        jLabel7.setText("ID Solicitante");

        jLabel12.setText("Grupo");

        jLabel9.setText("Solicitud");

        jLabel21.setText("Inconsistencia");

        txtSolNombre.setToolTipText("");

        comboSolInconsistencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ERROR_NOTA", "INCLUSION_ACTA", "EXCLUSION_ACTA" }));

        txtSolPeriodo.setToolTipText("");

        txtSolCurso.setToolTipText("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jLabel9)
                        .addGap(0, 115, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSolNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(36, 36, 36)
                                .addComponent(txtSolID))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(70, 70, 70)
                                .addComponent(txtSolFecha))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(70, 70, 70))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel21)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel11))
                                        .addGap(31, 31, 31)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtSolGrupo)
                                    .addComponent(comboSolInconsistencia, 0, 158, Short.MAX_VALUE)
                                    .addComponent(txtSolPeriodo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                                    .addComponent(txtSolCurso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtSolFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtSolID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtSolNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(txtSolPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(txtSolCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtSolGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addComponent(comboSolInconsistencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68))
        );

        jLabel16.setText("Carne");

        jLabel17.setText("Nombre");

        jLabel18.setText("Correo Electrónico");

        jLabel19.setText("Número Telefónico");

        jLabel20.setText("Estudiante");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(147, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addGap(158, 158, 158))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField10, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtEstCorreo))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEstCarnet, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                            .addComponent(txtEstNombre))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtEstCarnet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtEstNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtEstCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnAdjuntarEvidencia.setText("Adjuntar Evidencia");

        jLabel22.setText("Detalles");

        areaTextDetalles.setColumns(20);
        areaTextDetalles.setRows(5);
        jScrollPane1.setViewportView(areaTextDetalles);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(jLabel22)
                .addContainerGap(168, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnAdjuntarEvidencia1.setText("Crear Solicitud");
        btnAdjuntarEvidencia1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdjuntarEvidencia1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAdjuntarEvidencia, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAdjuntarEvidencia1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(290, 290, 290))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAdjuntarEvidencia1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(btnAdjuntarEvidencia)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdjuntarEvidencia1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdjuntarEvidencia1ActionPerformed
       ui.accionAgregarSolicitud();
    }//GEN-LAST:event_btnAdjuntarEvidencia1ActionPerformed

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
            java.util.logging.Logger.getLogger(BackOffice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BackOffice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BackOffice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BackOffice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BackOffice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaTextDetalles;
    private javax.swing.JButton btnAdjuntarEvidencia;
    private javax.swing.JButton btnAdjuntarEvidencia1;
    private javax.swing.JComboBox<String> comboSolInconsistencia;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField txtEstCarnet;
    private javax.swing.JTextField txtEstCorreo;
    private javax.swing.JTextField txtEstNombre;
    private javax.swing.JTextField txtSolCurso;
    private javax.swing.JTextField txtSolFecha;
    private javax.swing.JTextField txtSolGrupo;
    private javax.swing.JTextField txtSolID;
    private javax.swing.JTextField txtSolNombre;
    private javax.swing.JTextField txtSolPeriodo;
    // End of variables declaration//GEN-END:variables
}
