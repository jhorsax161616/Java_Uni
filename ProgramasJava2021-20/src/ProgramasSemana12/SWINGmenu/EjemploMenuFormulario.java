package ProgramasSemana12.SWINGmenu;

import java.awt.Color;

public class EjemploMenuFormulario extends javax.swing.JFrame {

    public EjemploMenuFormulario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frmSumar = new javax.swing.JFrame();
        btnSumar = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        popMenuSalir = new javax.swing.JPopupMenu();
        opopSalir = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        bmPrincipal = new javax.swing.JMenuBar();
        mOpera = new javax.swing.JMenu();
        smOperaBasicas = new javax.swing.JMenu();
        omSumar = new javax.swing.JMenuItem();
        omRestar = new javax.swing.JMenuItem();
        omMultiplicar = new javax.swing.JMenuItem();
        omDividir = new javax.swing.JMenuItem();
        smOtros = new javax.swing.JMenu();
        omCambiaC = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        omSalir = new javax.swing.JMenuItem();
        mTRansacc = new javax.swing.JMenu();
        omCalcularP = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        omInformeC = new javax.swing.JMenuItem();

        frmSumar.setMinimumSize(new java.awt.Dimension(500, 300));

        btnSumar.setText("Sumar");
        btnSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.setComponentPopupMenu(popMenuSalir);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProgramasSemana12/SWINGmenu/nuevo1.gif"))); // NOI18N
        jButton1.setText("NUEVO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout frmSumarLayout = new javax.swing.GroupLayout(frmSumar.getContentPane());
        frmSumar.getContentPane().setLayout(frmSumarLayout);
        frmSumarLayout.setHorizontalGroup(
            frmSumarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmSumarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(frmSumarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                    .addComponent(jTextField1)
                    .addComponent(jTextField3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(frmSumarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnSumar, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(73, 73, 73))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frmSumarLayout.createSequentialGroup()
                .addContainerGap(286, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(135, 135, 135))
        );
        frmSumarLayout.setVerticalGroup(
            frmSumarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmSumarLayout.createSequentialGroup()
                .addGroup(frmSumarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frmSumarLayout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(btnSumar))
                    .addGroup(frmSumarLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(frmSumarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frmSumarLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(btnSalir))
                    .addGroup(frmSumarLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jButton1)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        opopSalir.setText("Salir");
        opopSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opopSalirActionPerformed(evt);
            }
        });
        popMenuSalir.add(opopSalir);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProgramasSemana12/SWINGmenu/redflowers.png"))); // NOI18N

        mOpera.setBackground(new java.awt.Color(241, 186, 149));
        mOpera.setText("Operaciones");

        smOperaBasicas.setText("Operaciones Básicas");

        omSumar.setText("Sumar");
        omSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                omSumarActionPerformed(evt);
            }
        });
        smOperaBasicas.add(omSumar);

        omRestar.setText("Restar");
        smOperaBasicas.add(omRestar);

        omMultiplicar.setText("Mulitplicar");
        smOperaBasicas.add(omMultiplicar);

        omDividir.setText("Dividir");
        smOperaBasicas.add(omDividir);

        mOpera.add(smOperaBasicas);

        smOtros.setText("Otros");

        omCambiaC.setText("Cambia Color");
        omCambiaC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                omCambiaCActionPerformed(evt);
            }
        });
        smOtros.add(omCambiaC);

        mOpera.add(smOtros);
        mOpera.add(jSeparator2);

        omSalir.setText("Salir");
        omSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                omSalirActionPerformed(evt);
            }
        });
        mOpera.add(omSalir);

        bmPrincipal.add(mOpera);

        mTRansacc.setBackground(new java.awt.Color(236, 199, 109));
        mTRansacc.setText("Transacciones");

        omCalcularP.setText("Calcular");
        mTRansacc.add(omCalcularP);

        jSeparator1.setBackground(new java.awt.Color(242, 155, 1));
        jSeparator1.setForeground(new java.awt.Color(255, 0, 0));
        mTRansacc.add(jSeparator1);

        omInformeC.setText("Informe");
        mTRansacc.add(omInformeC);

        bmPrincipal.add(mTRansacc);

        setJMenuBar(bmPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(131, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(109, 109, 109))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(77, 77, 77))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void omCambiaCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_omCambiaCActionPerformed
        // TODO add your handling code here:
        this.getContentPane().setBackground(Color.PINK);
    }//GEN-LAST:event_omCambiaCActionPerformed

    private void omSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_omSumarActionPerformed
        // TODO add your handling code here:
        frmSumar.setVisible(true);
    }//GEN-LAST:event_omSumarActionPerformed

    private void omSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_omSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_omSalirActionPerformed

    private void opopSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opopSalirActionPerformed
        frmSumar.setVisible(false);
    }//GEN-LAST:event_opopSalirActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        frmSumar.setVisible(false);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumarActionPerformed
        // TODO add your handling code here:
        String num1 = jTextField1.getText();
        String num2 = jTextField2.getText();
        
        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);
        
        int sum = n1 + n2;
        
        jTextField3.setText("La suma es: " + sum);
    }//GEN-LAST:event_btnSumarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(EjemploMenuFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EjemploMenuFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EjemploMenuFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EjemploMenuFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EjemploMenuFormulario().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar bmPrincipal;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSumar;
    private javax.swing.JFrame frmSumar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JMenu mOpera;
    private javax.swing.JMenu mTRansacc;
    private javax.swing.JMenuItem omCalcularP;
    private javax.swing.JMenuItem omCambiaC;
    private javax.swing.JMenuItem omDividir;
    private javax.swing.JMenuItem omInformeC;
    private javax.swing.JMenuItem omMultiplicar;
    private javax.swing.JMenuItem omRestar;
    private javax.swing.JMenuItem omSalir;
    private javax.swing.JMenuItem omSumar;
    private javax.swing.JMenuItem opopSalir;
    private javax.swing.JPopupMenu popMenuSalir;
    private javax.swing.JMenu smOperaBasicas;
    private javax.swing.JMenu smOtros;
    // End of variables declaration//GEN-END:variables
}
