package Vistas;

import AccesoADatos.ClienteData;
import AccesoADatos.DetalleVentaData;
import AccesoADatos.ProductoData;
import AccesoADatos.VentaData;
import Entidades.Cliente;
import Entidades.DetalleVenta;
import Entidades.Producto;
import Entidades.Venta;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JSpinner.DefaultEditor;
import javax.swing.SpinnerNumberModel;

public class RealizarVentas extends javax.swing.JInternalFrame {
    ClienteData cd = new ClienteData();
    Cliente cliente = null;
    ProductoData pd = new ProductoData();
    Producto producto = null;
    DetalleVentaData dv = new DetalleVentaData();
    DetalleVenta detalleVenta = null;
    VentaData vd = new VentaData();
    Venta venta = null;
    SpinnerNumberModel snm = new SpinnerNumberModel();

    public RealizarVentas() {
        initComponents();
        
        List<Cliente> listaClientes = cd.listarClientes();
        Collections.sort(listaClientes, new Comparator<Cliente>() {
            public int compare(Cliente o1, Cliente o2) {
                return o1.toString().compareTo(o2.toString());
            }
        });
        for (Cliente cliente : listaClientes) {
            cmbCliente.addItem(cliente);
        }
        
        List<Producto> listaProductos = pd.listarProductosConStock();
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
        ((DefaultEditor) spinner.getEditor()).getTextField().setEditable(false);
        
        txtFecha.setMinSelectableDate(new Date());
        txtFecha.setMaxSelectableDate(new Date());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblCliente = new javax.swing.JLabel();
        lblProducto = new javax.swing.JLabel();
        cmbCliente = new javax.swing.JComboBox<>();
        cmbProducto = new javax.swing.JComboBox<>();
        lblCantidad = new javax.swing.JLabel();
        spinner = new javax.swing.JSpinner();
        btnAceptar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        txtFecha = new com.toedter.calendar.JDateChooser();
        lblFecha = new javax.swing.JLabel();
        lblPrecioUnidad = new javax.swing.JLabel();
        lblPrecioTotal = new javax.swing.JLabel();
        txtPrecioUnidad = new javax.swing.JLabel();
        txtPrecioTotal = new javax.swing.JLabel();
        jlblIconito = new javax.swing.JLabel();

        lblTitulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTitulo.setText("Realizar Venta");

        lblCliente.setText("Cliente:");

        lblProducto.setText("Producto:");

        cmbProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbProductoActionPerformed(evt);
            }
        });

        lblCantidad.setText("Cantidad:");

        spinner.setFocusable(false);
        spinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinnerStateChanged(evt);
            }
        });

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

        lblFecha.setText("Fecha:");

        lblPrecioUnidad.setText("Precio x Unidad:");

        lblPrecioTotal.setText("Precio Total:");

        txtPrecioUnidad.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtPrecioUnidad.setText("-/-");

        txtPrecioTotal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtPrecioTotal.setText("-/-");

        jlblIconito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/imagenes/producto-default-mini.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblProducto)
                    .addComponent(lblCliente)
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
                        .addComponent(cmbCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbProducto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 132, Short.MAX_VALUE)
                .addComponent(btnAceptar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalir)
                .addGap(126, 126, 126))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addComponent(jlblIconito)
                .addGap(78, 78, 78))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTitulo)
                    .addComponent(jlblIconito))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCliente)
                    .addComponent(cmbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addGap(12, 12, 12)
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrecioUnidad)
                    .addComponent(txtPrecioUnidad))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrecioTotal)
                    .addComponent(txtPrecioTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnSalir))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        if (txtFecha.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Te falto elegir la fecha!");
        } else {
            Date date = txtFecha.getDate();
            LocalDate fecha = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            cliente = (Cliente)cmbCliente.getSelectedItem();
            venta = new Venta(fecha, cliente);
            vd.guardarVenta(venta);
            
            int cantidad = Integer.parseInt(spinner.getValue().toString());
            double precioVenta = Double.parseDouble(spinner.getValue().toString())*producto.getPrecio()*1.3;
            detalleVenta = new DetalleVenta(cantidad, precioVenta, venta, producto);
            dv.guardarDetalleVenta(detalleVenta);
            
            producto.setStock(producto.getStock() - cantidad);
            pd.modificarProducto(producto);
            
            JOptionPane.showMessageDialog(this, "Venta exitosa!");
            
            limpiar();
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void spinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerStateChanged
        txtPrecioTotal.setText("$ "+Double.parseDouble(spinner.getValue().toString())*producto.getPrecio()*1.3+"");
    }//GEN-LAST:event_spinnerStateChanged

    private void cmbProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbProductoActionPerformed
        producto = (Producto)cmbProducto.getSelectedItem();
        txtPrecioUnidad.setText("$ "+producto.getPrecio()*1.3+"");
        txtPrecioTotal.setText("$ "+producto.getPrecio()*1.3+"");
        snm.setMaximum(producto.getStock());
        spinner.setValue(1);
    }//GEN-LAST:event_cmbProductoActionPerformed

    public void limpiar() {
        if (producto.getStock() == 0) {
            cmbProducto.removeItem(cmbProducto.getSelectedItem());
        }
        snm.setMaximum(producto.getStock());
        spinner.setValue(1);
        txtFecha.setDate(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<Cliente> cmbCliente;
    private javax.swing.JComboBox<Producto> cmbProducto;
    private javax.swing.JLabel jlblIconito;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblPrecioTotal;
    private javax.swing.JLabel lblPrecioUnidad;
    private javax.swing.JLabel lblProducto;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JSpinner spinner;
    private com.toedter.calendar.JDateChooser txtFecha;
    private javax.swing.JLabel txtPrecioTotal;
    private javax.swing.JLabel txtPrecioUnidad;
    // End of variables declaration//GEN-END:variables
}
