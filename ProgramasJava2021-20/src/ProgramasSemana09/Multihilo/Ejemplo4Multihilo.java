package ProgramasSemana09.Multihilo;

public class Ejemplo4Multihilo extends javax.swing.JFrame {
    
    Jugador matrix = new Jugador();
    
    Hilo01 h1 = new Hilo01(matrix);
    Hilo02 h2 = new Hilo02(matrix);
    Hilo03 h3 = new Hilo03(matrix);
    
    
    public Ejemplo4Multihilo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnGolpe = new javax.swing.JButton();
        btnCuracion = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaResultados = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(12, 1, 58));

        jLabel1.setFont(new java.awt.Font("URW Gothic", 2, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setText("Desarrollo del Juego");

        btnGolpe.setBackground(new java.awt.Color(79, 4, 4));
        btnGolpe.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnGolpe.setForeground(new java.awt.Color(254, 254, 254));
        btnGolpe.setText("Golpea  =  -20");
        btnGolpe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGolpeActionPerformed(evt);
            }
        });

        btnCuracion.setBackground(new java.awt.Color(1, 62, 1));
        btnCuracion.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnCuracion.setForeground(new java.awt.Color(254, 254, 254));
        btnCuracion.setText("Curar = +50");
        btnCuracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuracionActionPerformed(evt);
            }
        });

        txtaResultados.setColumns(20);
        txtaResultados.setRows(5);
        jScrollPane1.setViewportView(txtaResultados);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnGolpe, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel1)
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnGolpe, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110)
                        .addComponent(btnCuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap(115, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGolpeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGolpeActionPerformed
        // TODO add your handling code here:
        h1.run();
        h3.run();
    }//GEN-LAST:event_btnGolpeActionPerformed

    private void btnCuracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuracionActionPerformed
        // TODO add your handling code here:
        h2.run();
        h3.run();
    }//GEN-LAST:event_btnCuracionActionPerformed

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
            java.util.logging.Logger.getLogger(Ejemplo4Multihilo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejemplo4Multihilo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejemplo4Multihilo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejemplo4Multihilo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejemplo4Multihilo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCuracion;
    private javax.swing.JButton btnGolpe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtaResultados;
    // End of variables declaration//GEN-END:variables

    //CREANDO HILOS
    class Hilo01 extends Thread{
        Jugador jugad;
        
        public Hilo01 (Jugador tempJugador){
            jugad = tempJugador;
        }
        
        public void run(){
            jugad.RecibirGolpe(20);
        }
    }
    
    class Hilo02 extends Thread{
        Jugador jugad;
        
        public Hilo02 (Jugador tempJugador){
            jugad = tempJugador;
        }
        
        public void run(){
            jugad.RecibirVida(50);
        }
    }
    
    class Hilo03 extends Thread{
        Jugador jugad;
        
        public Hilo03 (Jugador tempJugador){
            jugad = tempJugador;
        }
        
        public void run(){
            
            if (jugad.DeclararMuerto()){
                txtaResultados.setText("\n EL JUGADOR SE MURIÓ....!!!\n" + "vida final: " + jugad.vida);
                btnGolpe.setEnabled(false);
                btnCuracion.setEnabled(false);
            }
            else{
                txtaResultados.append("\n EL JUGADOR SIGUE VIVOOOO....!!!\n" + "vida final: " + jugad.vida);
            }
        }
    }
}
