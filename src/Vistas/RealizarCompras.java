package Vistas;

import AccesoADatos.CompraData;
import AccesoADatos.DetalleCompraData;
import AccesoADatos.ProductoData;
import AccesoADatos.ProveedorData;
import Entidades.Compra;
import Entidades.DetalleCompra;
import Entidades.Producto;
import Entidades.Proveedor;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class RealizarCompras extends javax.swing.JInternalFrame {
    ProveedorData pvd = new ProveedorData();
    Proveedor proveedor = null;
    ProductoData pd = new ProductoData();
    Producto producto = null;
    DetalleCompraData dc = new DetalleCompraData();
    DetalleCompra detalleCompra = null;
    CompraData cd = new CompraData();
    Compra compra = null;
    SpinnerNumberModel snm = new SpinnerNumberModel();

    public RealizarCompras() {
        initComponents();
        setTitle("Pedidos a Proveedores");
        setResizable(false);
        
        List<Proveedor> listaProveedores = pvd.listarProveedores();
        
        Collections.sort(listaProveedores, new Comparator<Proveedor>() {
            
            public int compare(Proveedor o1, Proveedor o2) {
                return o1.toString().compareTo(o2.toString());
                
            }
        });
        
        for (Proveedor proveedor : listaProveedores) {
            
            cmbProveedor.addItem(proveedor);
        }
        
        List<Producto> listaProductos = pd.listarProductos();
        
        Collections.sort(listaProductos, new Comparator<Producto>() {
            
            public int compare(Producto o1, Producto o2) {
                
                return o1.toString().compareTo(o2.toString());
                
            }
        });
        
        for (Producto producto : listaProductos) {
            
            cmbProducto.addItem(producto);
        }
        
        snm.setMinimum(1);
        snm.setValue(1);
        spinner.setModel(snm);
        ((JSpinner.DefaultEditor) spinner.getEditor()).getTextField().setEditable(false);
        
        txtFecha.setMinSelectableDate(new Date());
        txtFecha.setMaxSelectableDate(new Date());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblProveedor = new javax.swing.JLabel();
        cmbProveedor = new javax.swing.JComboBox<>();
        lblProducto = new javax.swing.JLabel();
        cmbProducto = new javax.swing.JComboBox<>();
        lblCantidad = new javax.swing.JLabel();
        spinner = new javax.swing.JSpinner();
        txtFecha = new com.toedter.calendar.JDateChooser();
        lblFecha = new javax.swing.JLabel();
        lblPrecioUnidad = new javax.swing.JLabel();
        lblPrecioTotal = new javax.swing.JLabel();
        txtPrecioUnidad = new javax.swing.JLabel();
        txtPrecioTotal = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        lblTitulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTitulo.setText("Realizar Compra");

        lblProveedor.setText("Proveedor:");

        lblProducto.setText("Producto:");

        cmbProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbProductoActionPerformed(evt);
            }
        });

        lblCantidad.setText("Cantidad:");

        spinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinnerStateChanged(evt);
            }
        });

        lblFecha.setText("Fecha:");

        lblPrecioUnidad.setText("Precio x Unidad:");

        lblPrecioTotal.setText("Precio Total:");

        txtPrecioUnidad.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtPrecioUnidad.setText("-/-");

        txtPrecioTotal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtPrecioTotal.setText("-/-");

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(lblTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblProducto)
                            .addComponent(lblProveedor)
                            .addComponent(lblCantidad)
                            .addComponent(lblFecha))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblPrecioTotal)
                                    .addComponent(lblPrecioUnidad))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPrecioUnidad)
                                    .addComponent(txtPrecioTotal)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(spinner)
                                .addComponent(cmbProveedor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmbProducto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAceptar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSalir)))))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProveedor)
                    .addComponent(cmbProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProducto)
                    .addComponent(cmbProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCantidad))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(lblFecha))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrecioUnidad)
                    .addComponent(txtPrecioUnidad))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrecioTotal)
                    .addComponent(txtPrecioTotal))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnSalir))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        if (txtFecha.getDate() == null) {
            
            JOptionPane.showMessageDialog(this, "Te falto elegir la fecha!");
            
        } else {
            
            Date date = txtFecha.getDate();
            LocalDate fecha = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            
            proveedor = (Proveedor)cmbProveedor.getSelectedItem();
            compra = new Compra(proveedor, fecha);
            
            cd.guardarCompra(compra);

            int cantidad = Integer.parseInt(spinner.getValue().toString());
            double precioCosto = Double.parseDouble(spinner.getValue().toString())*producto.getPrecio();
            
            detalleCompra = new DetalleCompra(cantidad, precioCosto, compra, producto);
            dc.guardarDetalleCompra(detalleCompra);
            
            producto.setStock(producto.getStock() + cantidad);
            pd.modificarProducto(producto);
            
            JOptionPane.showMessageDialog(this, "Compra exitosa!");
            limpiar();
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void spinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerStateChanged
        txtPrecioTotal.setText("$ "+Double.parseDouble(spinner.getValue().toString())*producto.getPrecio()+"");
    }//GEN-LAST:event_spinnerStateChanged

    private void cmbProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbProductoActionPerformed
        producto = (Producto)cmbProducto.getSelectedItem();
        txtPrecioUnidad.setText("$ "+producto.getPrecio()+"");
        txtPrecioTotal.setText("$ "+producto.getPrecio()+"");
        spinner.setValue(1);
    }//GEN-LAST:event_cmbProductoActionPerformed

    public void limpiar() {
        spinner.setValue(1);
        txtFecha.setDate(null);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<Producto> cmbProducto;
    private javax.swing.JComboBox<Proveedor> cmbProveedor;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblPrecioTotal;
    private javax.swing.JLabel lblPrecioUnidad;
    private javax.swing.JLabel lblProducto;
    private javax.swing.JLabel lblProveedor;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JSpinner spinner;
    private com.toedter.calendar.JDateChooser txtFecha;
    private javax.swing.JLabel txtPrecioTotal;
    private javax.swing.JLabel txtPrecioUnidad;
    // End of variables declaration//GEN-END:variables
}
