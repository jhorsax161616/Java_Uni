package cordovapomajhordan;

import java.awt.Color;
import javax.swing.JOptionPane;

public class EjemploFormulario extends javax.swing.JFrame {

    public EjemploFormulario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frmCalculaS = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        sueldoB = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cmbMin = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        panBeneficios = new javax.swing.JPanel();
        cbBonificacion = new javax.swing.JCheckBox();
        cbReparto = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        sueldoN = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        panAFP = new javax.swing.JPanel();
        rbtPrima = new javax.swing.JRadioButton();
        rbtHorizonte = new javax.swing.JRadioButton();
        rbtOtros = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
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
        omCalcularS = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        omInforme = new javax.swing.JMenuItem();

        frmCalculaS.setMinimumSize(new java.awt.Dimension(600, 400));

        jLabel1.setText("Sueldo Base:");

        jLabel2.setText("Minutos Tardanza:");

        cmbMin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "5-10", "11-20", "21 mas" }));

        jLabel3.setText("Beneficios:");

        cbBonificacion.setText("Bonificación");

        cbReparto.setText("Reparto Utilidades");

        javax.swing.GroupLayout panBeneficiosLayout = new javax.swing.GroupLayout(panBeneficios);
        panBeneficios.setLayout(panBeneficiosLayout);
        panBeneficiosLayout.setHorizontalGroup(
            panBeneficiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBeneficiosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbBonificacion)
                .addGap(18, 18, 18)
                .addComponent(cbReparto)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        panBeneficiosLayout.setVerticalGroup(
            panBeneficiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBeneficiosLayout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addGroup(panBeneficiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbBonificacion)
                    .addComponent(cbReparto)))
        );

        jLabel4.setText("Sueldo Neto:");

        btnCalcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cordovapomajhordan/nuevo1.gif"))); // NOI18N
        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel5.setText("AFP:");

        rbtPrima.setText("Prima");
        rbtPrima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtPrimaActionPerformed(evt);
            }
        });

        rbtHorizonte.setText("Horizonte");
        rbtHorizonte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtHorizonteActionPerformed(evt);
            }
        });

        rbtOtros.setText("Otros");
        rbtOtros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtOtrosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panAFPLayout = new javax.swing.GroupLayout(panAFP);
        panAFP.setLayout(panAFPLayout);
        panAFPLayout.setHorizontalGroup(
            panAFPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAFPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panAFPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtPrima)
                    .addComponent(rbtHorizonte)
                    .addComponent(rbtOtros))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        panAFPLayout.setVerticalGroup(
            panAFPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAFPLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(rbtPrima)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtHorizonte)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtOtros)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout frmCalculaSLayout = new javax.swing.GroupLayout(frmCalculaS.getContentPane());
        frmCalculaS.getContentPane().setLayout(frmCalculaSLayout);
        frmCalculaSLayout.setHorizontalGroup(
            frmCalculaSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmCalculaSLayout.createSequentialGroup()
                .addGroup(frmCalculaSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frmCalculaSLayout.createSequentialGroup()
                        .addGroup(frmCalculaSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(frmCalculaSLayout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(jLabel4)
                                .addGap(48, 48, 48)
                                .addComponent(sueldoN, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(frmCalculaSLayout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addComponent(btnCalcular)
                                .addGap(94, 94, 94)
                                .addComponent(btnSalir))
                            .addGroup(frmCalculaSLayout.createSequentialGroup()
                                .addGap(148, 148, 148)
                                .addComponent(panBeneficios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE))
                    .addGroup(frmCalculaSLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(frmCalculaSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(frmCalculaSLayout.createSequentialGroup()
                                .addGroup(frmCalculaSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(frmCalculaSLayout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(41, 41, 41)
                                        .addComponent(sueldoB, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(frmCalculaSLayout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cmbMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panAFP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        frmCalculaSLayout.setVerticalGroup(
            frmCalculaSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmCalculaSLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(frmCalculaSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(sueldoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(frmCalculaSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panBeneficios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addGroup(frmCalculaSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(sueldoN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(frmCalculaSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalcular)
                    .addComponent(btnSalir))
                .addGap(43, 43, 43))
            .addGroup(frmCalculaSLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(frmCalculaSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panAFP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cordovapomajhordan/redflowers.png"))); // NOI18N

        mOpera.setText("Operaciones");

        smOperaBasicas.setText("Operaciones Básicas");
        smOperaBasicas.setToolTipText("");

        omSumar.setText("Sumar");
        omSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                omSumarActionPerformed(evt);
            }
        });
        smOperaBasicas.add(omSumar);

        omRestar.setText("Restar");
        smOperaBasicas.add(omRestar);

        omMultiplicar.setText("Multiplicar");
        smOperaBasicas.add(omMultiplicar);

        omDividir.setText("Dividir");
        smOperaBasicas.add(omDividir);

        mOpera.add(smOperaBasicas);

        smOtros.setText("Otros");

        omCambiaC.setText("Cambiar Color");
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

        jMenuBar1.add(mOpera);

        mTRansacc.setText("Transacciones");

        omCalcularS.setText("Calcular");
        omCalcularS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                omCalcularSActionPerformed(evt);
            }
        });
        mTRansacc.add(omCalcularS);
        mTRansacc.add(jSeparator1);

        omInforme.setText("Informe");
        mTRansacc.add(omInforme);

        jMenuBar1.add(mTRansacc);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(279, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(250, 250, 250))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(jLabel6)
                .addContainerGap(206, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void omSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_omSumarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_omSumarActionPerformed

    private void omCambiaCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_omCambiaCActionPerformed
        // TODO add your handling code here:
        this.getContentPane().setBackground(Color.PINK);
    }//GEN-LAST:event_omCambiaCActionPerformed

    private void omCalcularSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_omCalcularSActionPerformed
        // TODO add your handling code here:
        frmCalculaS.setVisible(true);
    }//GEN-LAST:event_omCalcularSActionPerformed

    private void omSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_omSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_omSalirActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        frmCalculaS.setVisible(false);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void rbtPrimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtPrimaActionPerformed
        // TODO add your handling code here:
        if(this.rbtPrima.isSelected()==true)
        {
            this.rbtOtros.setSelected(false);
            this.rbtHorizonte.setSelected(false);
        }
    }//GEN-LAST:event_rbtPrimaActionPerformed

    private void rbtHorizonteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtHorizonteActionPerformed
        // TODO add your handling code here:
        if(this.rbtHorizonte.isSelected()==true)
        {
            this.rbtOtros.setSelected(false);
            this.rbtPrima.setSelected(false);
        }
    }//GEN-LAST:event_rbtHorizonteActionPerformed

    private void rbtOtrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtOtrosActionPerformed
        // TODO add your handling code here:
        if(this.rbtOtros.isSelected()==true)
        {
            this.rbtPrima.setSelected(false);
            this.rbtHorizonte.setSelected(false);
        }
    }//GEN-LAST:event_rbtOtrosActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:
        double sueldoBase = 0,descTard = 0, descAFP = 0, bene = 0, sueldoNeto;
        int index;
        
        try{
            sueldoBase = Integer.parseInt(this.sueldoB.getText());
            
            if (sueldoBase > 0)
            {
            index = this.cmbMin.getSelectedIndex();
            
            switch(index)
            {
                case 0:
                {
                    descTard = 0;
                }break;
                case 1:
                {
                    descTard = 10;
                }break;
                case 3:
                {
                    descTard = 20;
                }break;
                case 4:
                {
                    descTard = 30;
                }break;
            }
            
            if(this.cbBonificacion.isSelected()==true)
                bene = 0.05 * sueldoBase;
            if(this.cbReparto.isSelected()==true)
                bene = 0.1 * sueldoBase;
            
            
            if(this.rbtPrima.isSelected()==true)
                descAFP = 0.11 * sueldoBase;
            else if(this.rbtHorizonte.isSelected()==true)
                descAFP = 0.13 * sueldoBase;
            else if(this.rbtOtros.isSelected()==true)
                descAFP = 0.12 * sueldoBase;
            
            sueldoNeto = sueldoBase - descAFP - descTard + bene;
            
            this.sueldoN.setText("" + sueldoNeto);
            
            }
            else
                this.sueldoN.setText("Error: Sueldo inválido");
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Ocurrion un error del tipo: " + e.toString());
        }
        

    }//GEN-LAST:event_btnCalcularActionPerformed

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
            java.util.logging.Logger.getLogger(EjemploFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EjemploFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EjemploFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EjemploFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EjemploFormulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnSalir;
    private javax.swing.JCheckBox cbBonificacion;
    private javax.swing.JCheckBox cbReparto;
    private javax.swing.JComboBox<String> cmbMin;
    private javax.swing.JFrame frmCalculaS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenu mOpera;
    private javax.swing.JMenu mTRansacc;
    private javax.swing.JMenuItem omCalcularS;
    private javax.swing.JMenuItem omCambiaC;
    private javax.swing.JMenuItem omDividir;
    private javax.swing.JMenuItem omInforme;
    private javax.swing.JMenuItem omMultiplicar;
    private javax.swing.JMenuItem omRestar;
    private javax.swing.JMenuItem omSalir;
    private javax.swing.JMenuItem omSumar;
    private javax.swing.JPanel panAFP;
    private javax.swing.JPanel panBeneficios;
    private javax.swing.JRadioButton rbtHorizonte;
    private javax.swing.JRadioButton rbtOtros;
    private javax.swing.JRadioButton rbtPrima;
    private javax.swing.JMenu smOperaBasicas;
    private javax.swing.JMenu smOtros;
    private javax.swing.JTextField sueldoB;
    private javax.swing.JTextField sueldoN;
    // End of variables declaration//GEN-END:variables
}
