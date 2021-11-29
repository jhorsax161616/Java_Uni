package Proyecto;

import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class VentanaPrincipal extends javax.swing.JFrame {

        float TotalPago = 0;   // TOTAL a PAGAR
        
        String dni;
        
        public VentanaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null); //CENTRAR VENTANA PRINCIPAL
        this.setTitle("Menu Principal");
               
        }

   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frmVenta = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtDNI = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClienteEncontrado = new javax.swing.JTable();
        btnBuscarCliente = new javax.swing.JButton();
        btnNuevoCliente = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        txtNombProducto = new javax.swing.JTextField();
        btnBuscarProducto = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProductoEncontrado = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        btnSeleccionar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblVenta = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        btnEfectuar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        frmNuevoCliente = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNuevoDNI = new javax.swing.JTextField();
        txtNuevoNombre = new javax.swing.JTextField();
        txtNuevoApellido = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnRegistraNuevoClie = new javax.swing.JButton();
        btnCancelaNuevoClie = new javax.swing.JButton();
        frmNuevoProducto = new javax.swing.JFrame();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtNuevoDNI1 = new javax.swing.JTextField();
        txtNuevoNombre1 = new javax.swing.JTextField();
        txtNuevoApellido1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btnRegistraNuevoClie1 = new javax.swing.JButton();
        btnCancelaNuevoClie1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        frmBuscarUsuario = new javax.swing.JFrame();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txtNuevoDNI2 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        btnRegistraNuevoClie2 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        opSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        opVentas = new javax.swing.JMenuItem();

        frmVenta.setMinimumSize(new java.awt.Dimension(900, 800));

        jPanel1.setPreferredSize(new java.awt.Dimension(800, 900));

        jLabel1.setText("Ingrese DNI Cliente:");

        txtDNI.setToolTipText("");

        tblClienteEncontrado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Cod Cliente", "Nombre Cliente", "Apellido Cliente"
            }
        ));
        jScrollPane1.setViewportView(tblClienteEncontrado);

        btnBuscarCliente.setText("Buscar Cliente");
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });

        btnNuevoCliente.setText("Nuevo Cliente");
        btnNuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoClienteActionPerformed(evt);
            }
        });

        jLabel2.setText("Ingrese Nombre Producto:");

        txtNombProducto.setToolTipText("");

        btnBuscarProducto.setText("Buscar Producto");
        btnBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProductoActionPerformed(evt);
            }
        });

        tblProductoEncontrado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Cod Producto", "Nombre Producto", "Precio", "Saldo Actual"
            }
        ));
        jScrollPane2.setViewportView(tblProductoEncontrado);

        jLabel3.setText("Cantidad:");

        txtCantidad.setToolTipText("");

        btnSeleccionar.setText("Seleccionar");
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar de Lista");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        tblVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod Producto", "Nomre Producto", "Precio Venta", "Cantidad", "SubTotal"
            }
        ));
        tblVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane3.setViewportView(tblVenta);

        jLabel4.setText("TOTAL VENTA (S/.)");

        txtTotal.setToolTipText("");

        btnEfectuar.setText("EfectuarVenta");
        btnEfectuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEfectuarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(jLabel4)
                        .addGap(30, 30, 30)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(btnBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(btnBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(139, 139, 139)
                        .addComponent(btnNuevoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(btnEfectuar, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnSeleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(33, 33, 33)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevoCliente)
                    .addComponent(btnBuscarCliente))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btnBuscarProducto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSeleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(296, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEfectuar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21))))
        );

        javax.swing.GroupLayout frmVentaLayout = new javax.swing.GroupLayout(frmVenta.getContentPane());
        frmVenta.getContentPane().setLayout(frmVentaLayout);
        frmVentaLayout.setHorizontalGroup(
            frmVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        frmVentaLayout.setVerticalGroup(
            frmVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 703, Short.MAX_VALUE)
        );

        frmNuevoCliente.setMinimumSize(new java.awt.Dimension(500, 300));

        jPanel2.setMinimumSize(new java.awt.Dimension(300, 300));

        jLabel5.setText("Ingrese DNI: ");

        jLabel6.setText("Ingrese Nombre:");

        jLabel7.setText("Ingrese Apellido: ");

        txtNuevoDNI.setPreferredSize(new java.awt.Dimension(200, 200));
        txtNuevoDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNuevoDNIActionPerformed(evt);
            }
        });

        txtNuevoNombre.setToolTipText("");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("NUEVO CLIENTE");

        btnRegistraNuevoClie.setText("Registrar");
        btnRegistraNuevoClie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistraNuevoClieActionPerformed(evt);
            }
        });

        btnCancelaNuevoClie.setText("Cancelar");
        btnCancelaNuevoClie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelaNuevoClieActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNuevoDNI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNuevoNombre)
                            .addComponent(txtNuevoApellido)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLabel8))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(btnRegistraNuevoClie, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btnCancelaNuevoClie, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel8)
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNuevoDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNuevoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNuevoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistraNuevoClie)
                    .addComponent(btnCancelaNuevoClie))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout frmNuevoClienteLayout = new javax.swing.GroupLayout(frmNuevoCliente.getContentPane());
        frmNuevoCliente.getContentPane().setLayout(frmNuevoClienteLayout);
        frmNuevoClienteLayout.setHorizontalGroup(
            frmNuevoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        frmNuevoClienteLayout.setVerticalGroup(
            frmNuevoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        frmNuevoProducto.setMinimumSize(new java.awt.Dimension(500, 300));

        jPanel3.setMinimumSize(new java.awt.Dimension(300, 300));

        jLabel9.setText("Ingrese Codigo Producto: ");

        jLabel10.setText("Ingrese Nombre Producto:");

        jLabel11.setText("Ingrese Precio Producto: ");

        txtNuevoDNI1.setPreferredSize(new java.awt.Dimension(200, 200));
        txtNuevoDNI1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNuevoDNI1ActionPerformed(evt);
            }
        });

        txtNuevoNombre1.setToolTipText("");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("NUEVO PRODUCTO");

        btnRegistraNuevoClie1.setText("Registrar");
        btnRegistraNuevoClie1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistraNuevoClie1ActionPerformed(evt);
            }
        });

        btnCancelaNuevoClie1.setText("Cancelar");
        btnCancelaNuevoClie1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelaNuevoClie1ActionPerformed(evt);
            }
        });

        jLabel13.setText("Ingrese Stock Producto:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel13))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNuevoDNI1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNuevoNombre1)
                            .addComponent(txtNuevoApellido1)
                            .addComponent(jTextField1)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLabel12))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(btnRegistraNuevoClie1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnCancelaNuevoClie1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel12)
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNuevoDNI1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNuevoNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNuevoApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistraNuevoClie1)
                    .addComponent(btnCancelaNuevoClie1))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout frmNuevoProductoLayout = new javax.swing.GroupLayout(frmNuevoProducto.getContentPane());
        frmNuevoProducto.getContentPane().setLayout(frmNuevoProductoLayout);
        frmNuevoProductoLayout.setHorizontalGroup(
            frmNuevoProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        frmNuevoProductoLayout.setVerticalGroup(
            frmNuevoProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        frmBuscarUsuario.setMinimumSize(new java.awt.Dimension(500, 300));

        jPanel4.setMinimumSize(new java.awt.Dimension(300, 300));

        jLabel14.setText("Ingrese Nombre Usuario a Buscar: ");

        txtNuevoDNI2.setPreferredSize(new java.awt.Dimension(200, 200));
        txtNuevoDNI2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNuevoDNI2ActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("BUSCAR USUARIO");

        btnRegistraNuevoClie2.setText("BUSCAR");
        btnRegistraNuevoClie2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistraNuevoClie2ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nombre Usuario", "Password Usuario"
            }
        ));
        jScrollPane4.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(txtNuevoDNI2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(148, 148, 148)
                                .addComponent(jLabel17))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(btnRegistraNuevoClie2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel17)
                .addGap(35, 35, 35)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNuevoDNI2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(25, 25, 25)
                .addComponent(btnRegistraNuevoClie2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout frmBuscarUsuarioLayout = new javax.swing.GroupLayout(frmBuscarUsuario.getContentPane());
        frmBuscarUsuario.getContentPane().setLayout(frmBuscarUsuarioLayout);
        frmBuscarUsuarioLayout.setHorizontalGroup(
            frmBuscarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        frmBuscarUsuarioLayout.setVerticalGroup(
            frmBuscarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("File");

        opSalir.setText("Salir");
        opSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opSalirActionPerformed(evt);
            }
        });
        jMenu1.add(opSalir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Proceso");

        opVentas.setText("Registrar Venta");
        opVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opVentasActionPerformed(evt);
            }
        });
        jMenu2.add(opVentas);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    private void opSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_opSalirActionPerformed

    
    private void opVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opVentasActionPerformed
        frmVenta.setLocationRelativeTo(null);   //CENTRAR VENTANA VENTAS
        frmVenta.setVisible(true);
        
    }//GEN-LAST:event_opVentasActionPerformed

    
    private void btnNuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoClienteActionPerformed
        frmNuevoCliente.setLocationRelativeTo(null);  //CENTRAR VENTANA NUEVO CLIENTE
        frmNuevoCliente.setVisible(true);
    }//GEN-LAST:event_btnNuevoClienteActionPerformed

    
    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        
        dni = txtDNI.getText();
              
        DefaultTableModel dt = new DefaultTableModel();
        String query = "SELECT * FROM Cliente where DNICliente = "+dni+";";
        
        tblClienteEncontrado.setModel(dt);
        dt.addColumn("DNI Cliente");
        dt.addColumn("Nombre");
        dt.addColumn("Apellido");
         
       cConnection con = new cConnection();
        
        try{         
            PreparedStatement pstm = con.ObtenerConexion().prepareStatement(query);
            ResultSet rs = pstm.executeQuery();         
            while(rs.next()){            
                    dt.addRow(new Object[] {rs.getString("DNICliente"),rs.getString("Nombre"),rs.getString("Apellido")});
            }
            rs.close();
          }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"No existe Cliente. Puede Crear Nuevo.","Mensaje",JOptionPane.CANCEL_OPTION);
        }
        txtNuevoDNI.setText(dni);
    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    
    private void btnBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProductoActionPerformed
        
        String nprod= txtNombProducto.getText();
        DefaultTableModel dt = new DefaultTableModel();
         
        String query ="SELECT * from Producto where NombProd LIKE '"+nprod+"%'";
        
        tblProductoEncontrado.setModel(dt);
          
          dt.addColumn("Codigo");
          dt.addColumn("Nombre Producto");
          dt.addColumn("Precio Venta");
          dt.addColumn("Saldo");
          cConnection con = new cConnection();
        
       try
       {
          Statement st = con.ObtenerConexion().createStatement();
          ResultSet rs = st.executeQuery(query);
             
          while(rs.next())
          {
            dt.addRow(new Object[] {rs.getString("CodProd"),rs.getString("NombProd"),rs.getString("Precio"),rs.getString("Stock")});
          }
       }
       catch(Exception e)
       {
          JOptionPane.showMessageDialog(null,"No existe el Producto","Mensaje",JOptionPane.CANCEL_OPTION);
       }
    }//GEN-LAST:event_btnBuscarProductoActionPerformed

    
    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
        
        
        int filaSeleccionada = tblProductoEncontrado.getSelectedRow();
       
        try{
            if (filaSeleccionada == -1) //para validar que se seleccione fila
                JOptionPane.showMessageDialog(null, "Debe Seleccionar Producto");
            else
                {
                    DefaultTableModel modelSeleccion = (DefaultTableModel)tblProductoEncontrado.getModel();
                    String cod = tblProductoEncontrado.getValueAt(filaSeleccionada, 0).toString();
                    String np  = tblProductoEncontrado.getValueAt(filaSeleccionada, 1).toString();
                    float pre  = Float.parseFloat(tblProductoEncontrado.getValueAt(filaSeleccionada, 2).toString());
                    int cant   = Integer.parseInt(txtCantidad.getText());
                    
                    //Calcular Importe de fila
                    float subT = pre * cant;
                    String ImporteFila = String.valueOf(subT);
                    
                    //Pasar a la otra jtable
                    DefaultTableModel modelVenta = (DefaultTableModel)tblVenta.getModel();
                    modelVenta.addRow(new Object[]{cod,np,pre,cant,ImporteFila});
                    
                   TotalPago = TotalPago + subT;
                   
                   txtTotal.setText(""+TotalPago);
                   txtCantidad.setText("");
                   txtNombProducto.setText("");
                    
                }
        }
        catch(Exception e){
        
        }
        
  
    }//GEN-LAST:event_btnSeleccionarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
             
        int filaSeleccionada  = tblVenta.getSelectedRow();
       try{
         if (filaSeleccionada == -1) //para validar que se seleccione fila
                JOptionPane.showMessageDialog(null, "Debe Seleccionar Producto");
            else
                {
                    String cod    = tblVenta.getValueAt(filaSeleccionada, 0).toString();
                    String nomb   = (tblVenta.getValueAt(filaSeleccionada, 1).toString());
                    double precio = Double.parseDouble(tblVenta.getValueAt(filaSeleccionada, 2).toString());
                    String canti  = tblVenta.getValueAt(filaSeleccionada, 3).toString();
                    String subT   = tblVenta.getValueAt(filaSeleccionada, 4).toString();
        
                    DefaultTableModel modelo = (DefaultTableModel) tblVenta.getModel();  
                    modelo.removeRow(filaSeleccionada);
        
                    TotalPago = TotalPago - Float.parseFloat(subT);
                    txtTotal.setText(""+TotalPago);
                }
         }
        catch(Exception e){
        
        }
      
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        frmVenta.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEfectuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEfectuarActionPerformed
      
           for(int i = 0;i<tblVenta.getRowCount();i++){
               try{  
                       cConnection con = new cConnection();                        
                        int cantV = Integer.parseInt(tblVenta.getValueAt(i, 3).toString());
                        float stotal = Float.parseFloat(tblVenta.getValueAt(i, 4).toString());  
                               
                        Statement st = null;
                        st = con.ObtenerConexion().createStatement();
                        st.executeUpdate("INSERT INTO Venta(Cant,Subtotal)" + "values( "+cantV+" , "+stotal+")");
                          
            
                }catch(Exception e){
                        JOptionPane.showMessageDialog(null,"No se Pudo Agregar","Mensaje",JOptionPane.CANCEL_OPTION);
                        tblProductoEncontrado.removeAll();
                        tblVenta.removeAll();  
                        tblClienteEncontrado.removeAll();
                        txtDNI.setText("");
                        txtTotal.setText("");
                }
                
              } 
              JOptionPane.showMessageDialog(null, "Se registro correctamente la venta..."); 
              
              tblProductoEncontrado.removeAll();
              tblVenta.removeAll();
              tblClienteEncontrado.removeAll();
              txtDNI.setText("");
              txtTotal.setText("");
                   
    }//GEN-LAST:event_btnEfectuarActionPerformed

    private void btnCancelaNuevoClieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelaNuevoClieActionPerformed
        frmNuevoCliente.setVisible(false);
    }//GEN-LAST:event_btnCancelaNuevoClieActionPerformed

    private void btnRegistraNuevoClieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistraNuevoClieActionPerformed
        
        cConnection con = new cConnection();
        try{
            
        
            int dniC = Integer.parseInt(txtNuevoDNI.getText());
            
            String nom = txtNuevoNombre.getText();
            String ape = txtNuevoApellido.getText();
            
            Statement st = null;
            st = con.ObtenerConexion().createStatement();
            st.executeUpdate("INSERT INTO Cliente(DNICliente,Nombre,Apellido)" + "values("+dniC+" ,' "+nom+" ', '"+ape+"')");
            
            JOptionPane.showMessageDialog(null, "Se registró cliente...");
            txtNuevoDNI.setText("");
            txtNuevoNombre.setText("");
            txtNuevoApellido.setText("");
        }
        catch(Exception e){
                JOptionPane.showMessageDialog(null,"No se Pudo Agregar","Mensaje",JOptionPane.CANCEL_OPTION);
                txtNuevoDNI.setText("");
                txtNuevoNombre.setText("");
                txtNuevoApellido.setText("");
        }
        
    }//GEN-LAST:event_btnRegistraNuevoClieActionPerformed

private void txtNuevoDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNuevoDNIActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_txtNuevoDNIActionPerformed

    private void txtNuevoDNI1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNuevoDNI1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNuevoDNI1ActionPerformed

    private void btnRegistraNuevoClie1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistraNuevoClie1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistraNuevoClie1ActionPerformed

    private void btnCancelaNuevoClie1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelaNuevoClie1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelaNuevoClie1ActionPerformed

    private void txtNuevoDNI2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNuevoDNI2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNuevoDNI2ActionPerformed

    private void btnRegistraNuevoClie2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistraNuevoClie2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistraNuevoClie2ActionPerformed
    

    public static void main(String args[]) {
        
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnBuscarProducto;
    private javax.swing.JButton btnCancelaNuevoClie;
    private javax.swing.JButton btnCancelaNuevoClie1;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEfectuar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNuevoCliente;
    private javax.swing.JButton btnRegistraNuevoClie;
    private javax.swing.JButton btnRegistraNuevoClie1;
    private javax.swing.JButton btnRegistraNuevoClie2;
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.JFrame frmBuscarUsuario;
    private javax.swing.JFrame frmNuevoCliente;
    private javax.swing.JFrame frmNuevoProducto;
    private javax.swing.JFrame frmVenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JMenuItem opSalir;
    private javax.swing.JMenuItem opVentas;
    private javax.swing.JTable tblClienteEncontrado;
    private javax.swing.JTable tblProductoEncontrado;
    private javax.swing.JTable tblVenta;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtNombProducto;
    private javax.swing.JTextField txtNuevoApellido;
    private javax.swing.JTextField txtNuevoApellido1;
    private javax.swing.JTextField txtNuevoDNI;
    private javax.swing.JTextField txtNuevoDNI1;
    private javax.swing.JTextField txtNuevoDNI2;
    private javax.swing.JTextField txtNuevoNombre;
    private javax.swing.JTextField txtNuevoNombre1;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
