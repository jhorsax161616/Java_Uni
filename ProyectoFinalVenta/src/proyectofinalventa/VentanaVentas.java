package proyectofinalventa;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.text.SimpleDateFormat;
import java.util.Date;

public class VentanaVentas extends javax.swing.JFrame {
    
    String idCli,idPro;
    Float TotalPago;
    
    public VentanaVentas() {
        initComponents();  
        
        txtFechaVenta.setText(fechaActual());
    }
    
    @SuppressWarnings("unchecked")
    
    public static String fechaActual()
{
    Date fecha = new Date();
    SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/YYYY");

    return formatoFecha.format(fecha);
}
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frmNuevoCliente = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNuevoId = new javax.swing.JTextField();
        txtNuevoNombre = new javax.swing.JTextField();
        txtNuevoApellido = new javax.swing.JTextField();
        txtNuevoTelefono = new javax.swing.JTextField();
        txtNuevoNombreEmpresa = new javax.swing.JTextField();
        btnGuardarCliente = new javax.swing.JButton();
        btnCancelarNC = new javax.swing.JButton();
        frmNuevoProducto = new javax.swing.JFrame();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtNuevoIdProducto = new javax.swing.JTextField();
        txtNuevoModeloP = new javax.swing.JTextField();
        txtNuevoTallaP = new javax.swing.JTextField();
        txtNuevoColorP = new javax.swing.JTextField();
        txtNuevoNombreP = new javax.swing.JTextField();
        txtNuevoPrecioP = new javax.swing.JTextField();
        txtNuevoGeneroP = new javax.swing.JTextField();
        btnGuardarProducto = new javax.swing.JButton();
        btnCancelarNP = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnBuscarCliente = new javax.swing.JButton();
        btnNuevoCliente = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtBuscarCliente = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClienteEncontrado = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtBuscarProducto = new javax.swing.JTextField();
        btnBuscarProducto = new javax.swing.JButton();
        btnNuevoProducto = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProductoEncontrado = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblVenta = new javax.swing.JTable();
        txtFechaVenta = new javax.swing.JTextField();
        txtFechaEntrega = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        txtMontoAdelanto = new javax.swing.JTextField();
        btnEfectuarVenta = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        txtMontoTotal = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        chkBoleta = new javax.swing.JCheckBox();
        chkFactura = new javax.swing.JCheckBox();
        btnGenerarIdComp = new javax.swing.JButton();
        txtGenerarIdComp = new javax.swing.JTextField();

        frmNuevoCliente.setMinimumSize(new java.awt.Dimension(400, 500));

        jPanel2.setMinimumSize(new java.awt.Dimension(400, 500));
        jPanel2.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("NUEVO CLIENTE");

        jLabel3.setText("DNI o RUC:");

        jLabel4.setText("Nombres:");

        jLabel5.setText("Apellidos");

        jLabel6.setText("Telefono:");

        jLabel7.setText("Nombre Empresa:");

        btnGuardarCliente.setBackground(new java.awt.Color(0, 204, 0));
        btnGuardarCliente.setText("GUARDAR");
        btnGuardarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarClienteActionPerformed(evt);
            }
        });

        btnCancelarNC.setBackground(new java.awt.Color(255, 51, 51));
        btnCancelarNC.setText("SALIR");
        btnCancelarNC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarNCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(122, 122, 122))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(91, 91, 91)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNuevoId, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(txtNuevoNombre)
                            .addComponent(txtNuevoApellido)
                            .addComponent(txtNuevoTelefono)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(51, 51, 51)
                        .addComponent(txtNuevoNombreEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(btnGuardarCliente)
                        .addGap(59, 59, 59)
                        .addComponent(btnCancelarNC)))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNuevoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNuevoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNuevoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtNuevoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtNuevoNombreEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarCliente)
                    .addComponent(btnCancelarNC))
                .addGap(70, 70, 70))
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

        frmNuevoProducto.setMinimumSize(new java.awt.Dimension(400, 700));

        jPanel3.setMinimumSize(new java.awt.Dimension(400, 700));
        jPanel3.setPreferredSize(new java.awt.Dimension(400, 700));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("NUEVO PRODUCTO");

        jLabel11.setText("ID Producto:");

        jLabel12.setText("Modelo Producto:");

        jLabel13.setText("Talla Producto:");

        jLabel14.setText("Color Producto:");

        jLabel15.setText("Nombre Producto:");

        jLabel16.setText("Precio Unitario:");

        jLabel17.setText("Género Producto:");

        btnGuardarProducto.setBackground(new java.awt.Color(0, 204, 0));
        btnGuardarProducto.setText("GUARDAR");
        btnGuardarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarProductoActionPerformed(evt);
            }
        });

        btnCancelarNP.setBackground(new java.awt.Color(255, 0, 51));
        btnCancelarNP.setText("SALIR");
        btnCancelarNP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarNPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnGuardarProducto)
                        .addGap(74, 74, 74)
                        .addComponent(btnCancelarNP))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNuevoIdProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                            .addComponent(txtNuevoModeloP)
                            .addComponent(txtNuevoTallaP)
                            .addComponent(txtNuevoColorP)
                            .addComponent(txtNuevoNombreP)
                            .addComponent(txtNuevoPrecioP)
                            .addComponent(txtNuevoGeneroP))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 120, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(108, 108, 108))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtNuevoIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtNuevoModeloP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtNuevoTallaP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtNuevoColorP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtNuevoNombreP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtNuevoPrecioP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtNuevoGeneroP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarProducto)
                    .addComponent(btnCancelarNP))
                .addContainerGap(114, Short.MAX_VALUE))
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1020, 850));
        setPreferredSize(new java.awt.Dimension(1020, 850));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(1020, 850));
        jPanel1.setPreferredSize(new java.awt.Dimension(1020, 850));

        btnBuscarCliente.setBackground(new java.awt.Color(0, 153, 255));
        btnBuscarCliente.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnBuscarCliente.setText("Buscar Cliente");
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });

        btnNuevoCliente.setBackground(new java.awt.Color(0, 204, 0));
        btnNuevoCliente.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnNuevoCliente.setText("Nuevo Cliente");
        btnNuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoClienteActionPerformed(evt);
            }
        });

        jLabel1.setText("ID Cliente:");

        txtBuscarCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarClienteKeyTyped(evt);
            }
        });

        tblClienteEncontrado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "IdCliente", "Nombres", "Apellidos", "TelefonoCliente", "NombreEmpresa"
            }
        ));
        jScrollPane1.setViewportView(tblClienteEncontrado);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("VENTAS");

        jLabel9.setText("ID del producto:");

        txtBuscarProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarProductoKeyTyped(evt);
            }
        });

        btnBuscarProducto.setBackground(new java.awt.Color(0, 153, 255));
        btnBuscarProducto.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnBuscarProducto.setText("Buscar Producto");
        btnBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProductoActionPerformed(evt);
            }
        });

        btnNuevoProducto.setBackground(new java.awt.Color(0, 204, 0));
        btnNuevoProducto.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnNuevoProducto.setText("Nuevo Producto");
        btnNuevoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoProductoActionPerformed(evt);
            }
        });

        tblProductoEncontrado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "IdProducto", "ModeloProducto", "TallaProducto", "ColorProducto", "NombreProducto", "PrecioUnitario", "GeneroProducto"
            }
        ));
        jScrollPane2.setViewportView(tblProductoEncontrado);

        jLabel18.setText("Cantidad:");

        tblVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IdComprobante", "IdCliente", "FechaVenta", "TipoComprobante", "FechaEntrega", "MontoAdelanto", "CantidadProducto", "PrecioUnitario"
            }
        ));
        jScrollPane3.setViewportView(tblVenta);

        jLabel19.setText("Fecha de Entrega:");

        jLabel20.setText("Fecha de Venta:");

        btnEliminar.setBackground(new java.awt.Color(255, 153, 51));
        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnEliminar.setText("Eliminar de Lista");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel21.setText("Monto Adelanto:");

        btnEfectuarVenta.setBackground(new java.awt.Color(0, 204, 0));
        btnEfectuarVenta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEfectuarVenta.setText("EFECTUAR VENTA");
        btnEfectuarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEfectuarVentaActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(255, 51, 51));
        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel23.setText("MONTO TOTAL:");

        txtMontoTotal.setEditable(false);

        btnAgregar.setBackground(new java.awt.Color(0, 102, 255));
        btnAgregar.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        chkBoleta.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        chkBoleta.setText("Boleta");
        chkBoleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkBoletaActionPerformed(evt);
            }
        });

        chkFactura.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        chkFactura.setText("Factura");
        chkFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkFacturaActionPerformed(evt);
            }
        });

        btnGenerarIdComp.setBackground(new java.awt.Color(204, 255, 102));
        btnGenerarIdComp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnGenerarIdComp.setText("Generar ID Comprobante");
        btnGenerarIdComp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarIdCompActionPerformed(evt);
            }
        });

        txtGenerarIdComp.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 929, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(431, 431, 431)
                                .addComponent(jLabel8)))
                        .addGap(0, 49, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnSalir))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2)
                                .addGap(11, 11, 11))
                            .addComponent(jScrollPane3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(chkBoleta)
                                        .addGap(18, 18, 18)
                                        .addComponent(chkFactura)
                                        .addGap(63, 63, 63)
                                        .addComponent(btnGenerarIdComp)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtGenerarIdComp, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnEfectuarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(55, 55, 55)
                                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(27, 27, 27)
                                        .addComponent(txtBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(38, 38, 38)
                                        .addComponent(btnBuscarProducto)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnNuevoProducto))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel20)
                                            .addComponent(jLabel19))
                                        .addGap(36, 36, 36)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtFechaVenta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtFechaEntrega, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(81, 81, 81)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel18)
                                            .addComponent(jLabel21))
                                        .addGap(42, 42, 42)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtMontoAdelanto, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(98, 98, 98)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel23)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtMontoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(22, 22, 22))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNuevoCliente)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscarCliente)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel8)
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscarCliente))
                        .addGap(24, 24, 24)
                        .addComponent(btnNuevoCliente)
                        .addGap(27, 27, 27)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarProducto)
                    .addComponent(btnNuevoProducto))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(txtFechaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtFechaEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMontoAdelanto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel23)
                    .addComponent(txtMontoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkBoleta)
                    .addComponent(chkFactura)
                    .addComponent(btnGenerarIdComp)
                    .addComponent(txtGenerarIdComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(btnSalir))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEliminar)
                            .addComponent(btnEfectuarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(56, 56, 56))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        //Buscar Cliente    
        idCli = txtBuscarCliente.getText();
              
        DefaultTableModel dt = new DefaultTableModel();
        String query = "SELECT * FROM Cliente where IdCliente = "+idCli+";";
        
        tblClienteEncontrado.setModel(dt);
        dt.addColumn("IdCliente");
        dt.addColumn("Nombres");
        dt.addColumn("Apellidos");
        dt.addColumn("TelefonoCliente");
        dt.addColumn("NombreEmpresa");
         
       cConnection con = new cConnection();
        
        try{         
            PreparedStatement pstm = con.ObtenerConexion().prepareStatement(query);
            ResultSet rs = pstm.executeQuery();         
            while(rs.next()){            
                    dt.addRow(new Object[] {rs.getString("IdCliente"),rs.getString("Nombres"),rs.getString("Apellidos"),rs.getString("TelefonoCliente"),rs.getString("NombreEmpresa")});
            }
            rs.close();
          }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"No existe Cliente. Puede Crear uno Nuevo.","Mensaje",JOptionPane.CANCEL_OPTION);
        }
        txtBuscarCliente.setText(idCli);
    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    private void btnNuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoClienteActionPerformed
        //Abre ventana Nuevo Cliente
        frmNuevoCliente.setLocationRelativeTo(null);   //CENTRAR VENTANA
        frmNuevoCliente.setVisible(true);
    }//GEN-LAST:event_btnNuevoClienteActionPerformed

    private void btnCancelarNCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarNCActionPerformed
        //Salir de ventana Nuevo Cliente
        frmNuevoCliente.setVisible(false);
    }//GEN-LAST:event_btnCancelarNCActionPerformed

    private void btnGuardarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarClienteActionPerformed
        //Guardar Cliente
        cConnection con = new cConnection();
        try{
            
        
            int IdC = Integer.parseInt(txtNuevoId.getText());
            
            String nom = txtNuevoNombre.getText();
            String ape = txtNuevoApellido.getText();
            String tel = txtNuevoTelefono.getText();
            String nomE = txtNuevoNombreEmpresa.getText();
            
            
            Statement st = null;
            st = con.ObtenerConexion().createStatement();
            st.executeUpdate("INSERT INTO Cliente(IdCliente,Nombres,Apellidos,TelefonoCliente,NombreEmpresa)" + "values("+IdC+" ,' "+nom+" ', '"+ape+"', '"+tel+"', '"+nomE+"')");
            
            JOptionPane.showMessageDialog(null, "Se registró al cliente correctamente.");
            txtNuevoId.setText("");
            txtNuevoNombre.setText("");
            txtNuevoApellido.setText("");
            txtNuevoTelefono.setText("");
            txtNuevoNombreEmpresa.setText("");
        }
        catch(Exception e){
                JOptionPane.showMessageDialog(null,"No se Pudo Agregar CLIENTE","Mensaje",JOptionPane.CANCEL_OPTION);
                txtNuevoId.setText("");
                txtNuevoNombre.setText("");
                txtNuevoApellido.setText("");
                txtNuevoTelefono.setText("");
                txtNuevoNombreEmpresa.setText("");
        }
    }//GEN-LAST:event_btnGuardarClienteActionPerformed

    private void btnNuevoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoProductoActionPerformed
        //Abre ventana Nuevo Producto
        frmNuevoProducto.setLocationRelativeTo(null);   //CENTRAR VENTANA
        frmNuevoProducto.setVisible(true);
    }//GEN-LAST:event_btnNuevoProductoActionPerformed

    private void btnCancelarNPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarNPActionPerformed
        //Salir de ventana Nuevo Producto
        frmNuevoProducto.setVisible(false);
    }//GEN-LAST:event_btnCancelarNPActionPerformed

    private void btnGuardarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarProductoActionPerformed
        //Guardar Producto
        cConnection con = new cConnection();
        try{
            
        
            int IdP = Integer.parseInt(txtNuevoIdProducto.getText());
            String model = txtNuevoModeloP.getText();
            int talla = Integer.parseInt(txtNuevoTallaP.getText());
            String color = txtNuevoColorP.getText();
            String nombreP = txtNuevoNombreP.getText();
            int precioP = Integer.parseInt(txtNuevoPrecioP.getText());
            String generoP = txtNuevoGeneroP.getText();
            
            Statement st = null;
            st = con.ObtenerConexion().createStatement();
            st.executeUpdate("INSERT INTO Producto(IdProducto,ModeloProducto,TallaProducto,ColorProducto,NombreProducto,PrecioUnitario,GeneroProducto)" + "values("+IdP+" ,' "+model+" ', '"+talla+"', '"+color+"', '"+nombreP+"', '"+precioP+"', '"+generoP+"')");
            
            JOptionPane.showMessageDialog(null, "Se registró el producto correctamente.");
            txtNuevoIdProducto.setText("");
            txtNuevoModeloP.setText("");
            txtNuevoTallaP.setText("");
            txtNuevoColorP.setText("");
            txtNuevoNombreP.setText("");
            txtNuevoPrecioP.setText("");
            txtNuevoGeneroP.setText("");
            
        }
        catch(Exception e){
                JOptionPane.showMessageDialog(null,"No se Pudo Agregar PRODUCTO","Mensaje",JOptionPane.CANCEL_OPTION);
                txtNuevoIdProducto.setText("");
                txtNuevoModeloP.setText("");
                txtNuevoTallaP.setText("");
                txtNuevoColorP.setText("");
                txtNuevoNombreP.setText("");
                txtNuevoPrecioP.setText("");
                txtNuevoGeneroP.setText("");
        }        
    }//GEN-LAST:event_btnGuardarProductoActionPerformed

    private void txtBuscarClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarClienteKeyTyped
        //Solo números
        char validar = evt.getKeyChar();
        
        if(Character.isLetter(validar))
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtBuscarClienteKeyTyped

    private void txtBuscarProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarProductoKeyTyped
        //Solo números
        char validar = evt.getKeyChar();
        
        if(Character.isLetter(validar))
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtBuscarProductoKeyTyped

    private void btnBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProductoActionPerformed
        //Buscar Producto
        idPro = txtBuscarProducto.getText();
              
        DefaultTableModel dt = new DefaultTableModel();
        String query = "SELECT * FROM Producto where IdProducto = "+idPro+";";
        
        tblProductoEncontrado.setModel(dt);
        dt.addColumn("IdProducto");
        dt.addColumn("ModeloProducto");
        dt.addColumn("TallaProducto");
        dt.addColumn("ColorProducto");
        dt.addColumn("NombreProducto");
        dt.addColumn("PrecioUnitario");
        dt.addColumn("GeneroProducto");
         
       cConnection con = new cConnection();
        
        try{         
            PreparedStatement pstm = con.ObtenerConexion().prepareStatement(query);
            ResultSet rs = pstm.executeQuery();         
            while(rs.next()){            
                    dt.addRow(new Object[] {rs.getString("IdProducto"),rs.getString("ModeloProducto"),rs.getString("TallaProducto"),rs.getString("ColorProducto"),rs.getString("NombreProducto"),rs.getString("PrecioUnitario"),rs.getString("GeneroProducto")});
            }
            rs.close();
          }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"No existe Producto. Puede Crear uno Nuevo.","Mensaje",JOptionPane.CANCEL_OPTION);
        }
        txtBuscarProducto.setText(idPro);
    }//GEN-LAST:event_btnBuscarProductoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        int filaSeleccionada = tblProductoEncontrado.getSelectedRow();
       
        try{
            if (filaSeleccionada == -1) //para validar que se seleccione fila
                JOptionPane.showMessageDialog(null, "Debe Seleccionar Producto");
            else
                {
                    String IdComp = txtGenerarIdComp.getText(); //0
                    String FechaV = txtFechaVenta.getText(); //2
                    String FechaE = txtFechaEntrega.getText(); //4
                    String MAdelanto = txtMontoAdelanto.getText(); //5
                    String CProducto = txtCantidad.getText(); //6
                    String TipoC = ""; //3
                    
                    if(this.chkBoleta.isSelected())
                    {
                        TipoC = "Boleta";
                    }
                    
                    else

                    if(this.chkFactura.isSelected())
                    {
                        TipoC = "Factura";
                    }
                    
                    //int cant   = Integer.parseInt(txtCantidad.getText());
                    
                    // Tabla Cliente
                    DefaultTableModel modelSeleccionC = (DefaultTableModel)tblClienteEncontrado.getModel();
                    String IdCli = tblClienteEncontrado.getValueAt(filaSeleccionada, 0).toString(); //1

                    //Tabla Producto
                    DefaultTableModel modelSeleccionP = (DefaultTableModel)tblProductoEncontrado.getModel();
                    String IdPro = tblProductoEncontrado.getValueAt(filaSeleccionada, 0).toString();
                    String np  = tblProductoEncontrado.getValueAt(filaSeleccionada, 1).toString();
                    String PUnit = tblProductoEncontrado.getValueAt(filaSeleccionada, 5).toString(); //7
                    float pre  = Float.parseFloat(tblProductoEncontrado.getValueAt(filaSeleccionada, 5).toString());
                    
                    //Calcular Importe de fila
                    int cant   = Integer.parseInt(txtCantidad.getText());
                    float subT = pre * cant;
                    String MontoTotal = String.valueOf(subT);
                    
                    this.txtMontoTotal.setText(MontoTotal);
                    
                    //Pasar a la otra jtable
                    DefaultTableModel modelVenta = (DefaultTableModel)tblVenta.getModel();
                    modelVenta.addRow(new Object[]{IdComp,IdCli,FechaV,TipoC,FechaE,MAdelanto,CProducto,PUnit});
                    
                   TotalPago = TotalPago + subT;
                   
                   txtMontoTotal.setText(""+TotalPago);
                   txtCantidad.setText("");
                   txtBuscarProducto.setText("");
                    
                }
        }
        catch(Exception e){
        
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
                     
        int filaSeleccionada  = tblVenta.getSelectedRow();
       try{
         if (filaSeleccionada == -1) //para validar que se seleccione fila
                JOptionPane.showMessageDialog(null, "Debe Seleccionar Producto");
            else
                {
                    String IdComp    = tblVenta.getValueAt(filaSeleccionada, 0).toString();
                    String IdCli   = (tblVenta.getValueAt(filaSeleccionada, 1).toString());
                    String FechaV = tblVenta.getValueAt(filaSeleccionada, 2).toString();
                    String TipoC  = tblVenta.getValueAt(filaSeleccionada, 3).toString();
                    String FechaE   = tblVenta.getValueAt(filaSeleccionada, 4).toString();
                    String MontoA   = tblVenta.getValueAt(filaSeleccionada, 5).toString();
                    String CantP   = tblVenta.getValueAt(filaSeleccionada, 6).toString();
                    String PrecioU   = tblVenta.getValueAt(filaSeleccionada, 7).toString();
                    
                    int preU = Integer.parseInt(PrecioU);
                    float subT = preU * Float.parseFloat(CantP);
                    DefaultTableModel modelo = (DefaultTableModel) tblVenta.getModel();  
                    modelo.removeRow(filaSeleccionada);
        
                    TotalPago = TotalPago - subT;
                    txtMontoTotal.setText(""+TotalPago);
                    
                }
         }
        catch(Exception e){
        
        }
      
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void chkBoletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkBoletaActionPerformed
        if(this.chkBoleta.isSelected()==true)
        {
            this.chkFactura.setSelected(false);
        }
    }//GEN-LAST:event_chkBoletaActionPerformed

    private void chkFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkFacturaActionPerformed
        if(this.chkFactura.isSelected()==true)
        {
            this.chkBoleta.setSelected(false);
        }
    }//GEN-LAST:event_chkFacturaActionPerformed

    private void btnEfectuarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEfectuarVentaActionPerformed
                   for(int i = 0;i<tblVenta.getRowCount();i++){
               try{  
                       cConnection con = new cConnection();                        
                        int IdComp    = Integer.parseInt(tblVenta.getValueAt(i, 0).toString());
                        int IdCli   = Integer.parseInt(tblVenta.getValueAt(i, 1).toString());
                        String FechaV = tblVenta.getValueAt(i, 2).toString();
                        String TipoC  = tblVenta.getValueAt(i, 3).toString();
                        String FechaE   = tblVenta.getValueAt(i, 4).toString();
                        float MontoA   = Float.parseFloat(tblVenta.getValueAt(i, 5).toString());
                        int CantP   = Integer.parseInt(tblVenta.getValueAt(i, 6).toString());
                        float PrecioU   = Float.parseFloat(tblVenta.getValueAt(i, 7).toString());
                        float MontoT = Float.parseFloat(txtMontoTotal.getText());
                        int IdPro = Integer.parseInt(txtBuscarProducto.getText());
                        
                        Statement st = null;
                        st = con.ObtenerConexion().createStatement();
                        st.executeUpdate("INSERT INTO Cabecera(IdComprobante,IdCliente,FechaVenta,TipoComprobante,FechaEntrega,MontoAdelanto,MontoTotal)" + "values( "+IdComp+" , "+IdCli+", '"+FechaV+"', '"+TipoC+"', '"+FechaE+"', "+MontoA+", "+MontoT+")");
                        
                        st = con.ObtenerConexion().createStatement();
                        st.executeUpdate("INSERT INTO Detalle(IdComprobante,IdCliente,IdProducto,CantidadProducto,PrecioUnitario,MontoTotal)" + "values( '"+IdComp+"' , "+IdCli+", "+IdPro+", "+CantP+", "+PrecioU+", "+MontoT+")");
                          
            
                }catch(Exception e){
                        JOptionPane.showMessageDialog(null,"No se Pudo Agregar","Mensaje",JOptionPane.CANCEL_OPTION);
                        tblProductoEncontrado.removeAll();
                        tblVenta.removeAll();  
                        tblClienteEncontrado.removeAll();
                        txtFechaEntrega.setText("");
                        txtBuscarCliente.setText("");
                        txtMontoTotal.setText("");
                        txtMontoAdelanto.setText("");
                        txtBuscarProducto.setText("");
                }
                
              } 
              JOptionPane.showMessageDialog(null, "Se registró correctamente la venta..."); 
              
              tblProductoEncontrado.removeAll();
              tblVenta.removeAll();
              tblClienteEncontrado.removeAll();
              txtFechaEntrega.setText("");
              txtBuscarCliente.setText("");
              txtMontoTotal.setText("");
              txtMontoAdelanto.setText("");
              txtBuscarProducto.setText("");
              txtGenerarIdComp.setText("");
    }//GEN-LAST:event_btnEfectuarVentaActionPerformed

    private void btnGenerarIdCompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarIdCompActionPerformed
        //Generar Id (Número Aleatorio)
        int aleatorio = 0;
        aleatorio = (int) (Math.random() * 1000);
        
        txtGenerarIdComp.setText(String.valueOf(aleatorio));
    }//GEN-LAST:event_btnGenerarIdCompActionPerformed

    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(VentanaVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaVentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnBuscarProducto;
    private javax.swing.JButton btnCancelarNC;
    private javax.swing.JButton btnCancelarNP;
    private javax.swing.JButton btnEfectuarVenta;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGenerarIdComp;
    private javax.swing.JButton btnGuardarCliente;
    private javax.swing.JButton btnGuardarProducto;
    private javax.swing.JButton btnNuevoCliente;
    private javax.swing.JButton btnNuevoProducto;
    private javax.swing.JButton btnSalir;
    private javax.swing.JCheckBox chkBoleta;
    private javax.swing.JCheckBox chkFactura;
    private javax.swing.JFrame frmNuevoCliente;
    private javax.swing.JFrame frmNuevoProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblClienteEncontrado;
    private javax.swing.JTable tblProductoEncontrado;
    private javax.swing.JTable tblVenta;
    private javax.swing.JTextField txtBuscarCliente;
    private javax.swing.JTextField txtBuscarProducto;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtFechaEntrega;
    private javax.swing.JTextField txtFechaVenta;
    private javax.swing.JTextField txtGenerarIdComp;
    private javax.swing.JTextField txtMontoAdelanto;
    private javax.swing.JTextField txtMontoTotal;
    private javax.swing.JTextField txtNuevoApellido;
    private javax.swing.JTextField txtNuevoColorP;
    private javax.swing.JTextField txtNuevoGeneroP;
    private javax.swing.JTextField txtNuevoId;
    private javax.swing.JTextField txtNuevoIdProducto;
    private javax.swing.JTextField txtNuevoModeloP;
    private javax.swing.JTextField txtNuevoNombre;
    private javax.swing.JTextField txtNuevoNombreEmpresa;
    private javax.swing.JTextField txtNuevoNombreP;
    private javax.swing.JTextField txtNuevoPrecioP;
    private javax.swing.JTextField txtNuevoTallaP;
    private javax.swing.JTextField txtNuevoTelefono;
    // End of variables declaration//GEN-END:variables
}
