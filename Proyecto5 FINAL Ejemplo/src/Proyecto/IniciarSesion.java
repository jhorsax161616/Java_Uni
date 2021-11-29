package Proyecto;

import java.sql.*;
import javax.swing.JOptionPane;

public class IniciarSesion extends javax.swing.JFrame {

   public IniciarSesion() {
        initComponents();
        setLocationRelativeTo(null);  // centrar ventana
}
 @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPassw = new javax.swing.JPasswordField();
        txtUser = new javax.swing.JTextField();
        btnIniciarSesion = new javax.swing.JButton();
        btnCancelarInicio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(200, 150));
        setResizable(false);

        jLabel1.setText("Nombre User");

        jLabel2.setText("Password");

        txtPassw.setToolTipText("");
        txtPassw.setMinimumSize(new java.awt.Dimension(150, 20));
        txtPassw.setName(""); // NOI18N

        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });

        btnIniciarSesion.setText("ACEPTAR");
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });

        btnCancelarInicio.setText("CANCELAR");
        btnCancelarInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarInicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(btnIniciarSesion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(btnCancelarInicio))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUser, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(txtPassw, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPassw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIniciarSesion)
                    .addComponent(btnCancelarInicio))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
}//GEN-LAST:event_txtUserActionPerformed
private void btnCancelarInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarInicioActionPerformed
       System.exit(0);
}//GEN-LAST:event_btnCancelarInicioActionPerformed

private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed

    cConnection cn = new cConnection(); // invoca a la clase que conecta
    
    Statement  st = null; 
    ResultSet  rs = null;
    String query;
    
    int band = 0; //bandera para verificación
     
    String user= txtUser.getText();
    String passw = txtPassw.getText();
    
    query = "select * from Usuario where NombUser='" + user +"' and PassUSer='"+ passw +"'";
        
    try{
          st = cn.ObtenerConexion().createStatement();  
          rs = st.executeQuery(query);
            
          while(rs.next()){
                if(rs.getString(1) == null)
                        band = 0;  // no coincide user o passw
                else
                    band = 1;
            }
        }
        catch (SQLException ex){
            JOptionPane.showConfirmDialog(null, "ERROR DE ACCESO"+ex);
        }
     
       if (band == 1){
            try {
                 RunSplash ventanaSplash = new RunSplash();
                 ventanaSplash.setVisible(true);
                 
                  this.dispose();
                                 
                 } 
            catch (InterruptedException ex) {
                ex.printStackTrace();
            }
      }
      else{        
            JOptionPane.showMessageDialog(null,"ERROR. Vuelva a Ingresar");
            this.setVisible(rootPaneCheckingEnabled);   // muestra la ventana actual
            this.txtUser.setText("");
            this.txtPassw.setText("");
            this.txtUser.requestFocus();
    }
}//GEN-LAST:event_btnIniciarSesionActionPerformed

public static void main(String args[]) {
  
     java.awt.EventQueue.invokeLater(new Runnable() {

     public void run() {
                new IniciarSesion().setVisible(true);
            }
     });
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarInicio;
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField txtPassw;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}


