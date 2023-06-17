package Vistas;

import AccesoADatos.ProductoData;
import Entidades.Producto;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.JOptionPane;

public class EliminarProducto extends javax.swing.JInternalFrame {
    ProductoData pd = new ProductoData();
    Producto producto = null;

    public EliminarProducto() {
        initComponents();
        setTitle("Eliminacion de Productos");
        setResizable(false);
        
        List<Producto> listaProductos = pd.listarProductosSinStock();
        
        Collections.sort(listaProductos, new Comparator<Producto>() {
            public int compare(Producto o1, Producto o2) {
                return o1.toString().compareTo(o2.toString());
            }
        });
        
        for (Producto producto : listaProductos) {
            cmbProducto.addItem(producto);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblSeleccione = new javax.swing.JLabel();
        cmbProducto = new javax.swing.JComboBox<>();
        separador = new javax.swing.JSeparator();
        lblNombre = new javax.swing.JLabel();
        lblPrecioCosto = new javax.swing.JLabel();
        txtNombre = new javax.swing.JLabel();
        txtPrecioCosto = new javax.swing.JLabel();
        lblPrecioVenta = new javax.swing.JLabel();
        txtPrecioVenta = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        lblTitulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTitulo.setText("Eliminar Producto");

        lblSeleccione.setText("Seleccione:");

        cmbProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbProductoActionPerformed(evt);
            }
        });

        lblNombre.setText("Nombre:");

        lblPrecioCosto.setText("Precio Costo:");

        txtNombre.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtNombre.setText("-/-");

        txtPrecioCosto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtPrecioCosto.setText("-/-");

        lblPrecioVenta.setText("Precio Venta:");

        txtPrecioVenta.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtPrecioVenta.setText("-/-");

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
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
                        .addGap(44, 44, 44)
                        .addComponent(lblSeleccione)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitulo)
                            .addComponent(cmbProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblPrecioCosto)
                                    .addComponent(lblNombre)
                                    .addComponent(lblPrecioVenta))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombre)
                                    .addComponent(txtPrecioCosto)
                                    .addComponent(txtPrecioVenta)))
                            .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalir)
                .addGap(114, 114, 114))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSeleccione)
                    .addComponent(cmbProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrecioCosto)
                    .addComponent(txtPrecioCosto))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrecioVenta)
                    .addComponent(txtPrecioVenta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addComponent(btnSalir))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbProductoActionPerformed
        producto = (Producto)cmbProducto.getSelectedItem();
        txtNombre.setText(producto.getNombre());
        txtPrecioCosto.setText("$ "+producto.getPrecio()+"");
        txtPrecioVenta.setText("$ "+(producto.getPrecio()*1.3)+"");
    }//GEN-LAST:event_cmbProductoActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        pd.eliminarProducto(producto.getIdProducto());
        JOptionPane.showMessageDialog(this, "Producto eliminado con exito!");
        cmbProducto.removeItem(cmbProducto.getSelectedItem());
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<Producto> cmbProducto;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrecioCosto;
    private javax.swing.JLabel lblPrecioVenta;
    private javax.swing.JLabel lblSeleccione;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JSeparator separador;
    private javax.swing.JLabel txtNombre;
    private javax.swing.JLabel txtPrecioCosto;
    private javax.swing.JLabel txtPrecioVenta;
    // End of variables declaration//GEN-END:variables
}
