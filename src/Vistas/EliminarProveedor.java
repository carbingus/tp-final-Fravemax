package Vistas;

import AccesoADatos.ProveedorData;
import Entidades.Proveedor;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.JOptionPane;

public class EliminarProveedor extends javax.swing.JInternalFrame {
    ProveedorData pd = new ProveedorData();
    Proveedor proveedor = null;

    public EliminarProveedor() {
        initComponents();
        setTitle("Eliminacion de Proveedores");
        setResizable(false);
        
        List<Proveedor> listaProveedores = pd.listarProveedores();
        
        Collections.sort(listaProveedores, new Comparator<Proveedor>() {
            public int compare(Proveedor o1, Proveedor o2) {
                return o1.toString().compareTo(o2.toString());
            }
        });
        
        for (Proveedor proveedor : listaProveedores) {
            cmbProveedor.addItem(proveedor);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblSeleccione = new javax.swing.JLabel();
        cmbProveedor = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        lblRazonSocial = new javax.swing.JLabel();
        lblDomicilio = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        txtRazonSocial = new javax.swing.JLabel();
        txtDomicilio = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        lblTitulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTitulo.setText("Eliminar Proveedor");

        lblSeleccione.setText("Seleccione:");

        cmbProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbProveedorActionPerformed(evt);
            }
        });

        lblRazonSocial.setText("Razon Social:");

        lblDomicilio.setText("Domicilio:");

        lblTelefono.setText("Telefono:");

        txtRazonSocial.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtRazonSocial.setText("-/-");

        txtDomicilio.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtDomicilio.setText("-/-");

        txtTelefono.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtTelefono.setText("-/-");

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
                        .addGap(112, 112, 112)
                        .addComponent(lblTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDomicilio)
                            .addComponent(lblRazonSocial)
                            .addComponent(lblTelefono))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRazonSocial)
                            .addComponent(txtDomicilio)
                            .addComponent(txtTelefono))))
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblSeleccione)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSalir)
                        .addGap(122, 122, 122))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSeleccione)
                    .addComponent(cmbProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRazonSocial)
                    .addComponent(txtRazonSocial))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDomicilio)
                    .addComponent(txtDomicilio))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefono)
                    .addComponent(txtTelefono))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addComponent(btnSalir))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbProveedorActionPerformed
        proveedor = (Proveedor)cmbProveedor.getSelectedItem();
        txtRazonSocial.setText(proveedor.getRazonSocial());
        txtDomicilio.setText(proveedor.getDomicilio());
        txtTelefono.setText(proveedor.getTelefono());
    }//GEN-LAST:event_cmbProveedorActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        pd.eliminarProveedor(proveedor.getIdProveedor());
        JOptionPane.showMessageDialog(this, "Proveedor eliminado con exito!");
        cmbProveedor.removeItem(cmbProveedor.getSelectedItem());
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<Proveedor> cmbProveedor;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblDomicilio;
    private javax.swing.JLabel lblRazonSocial;
    private javax.swing.JLabel lblSeleccione;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel txtDomicilio;
    private javax.swing.JLabel txtRazonSocial;
    private javax.swing.JLabel txtTelefono;
    // End of variables declaration//GEN-END:variables
}
