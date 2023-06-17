package Vistas;

import AccesoADatos.ClienteData;
import Entidades.Cliente;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.JOptionPane;

public class EliminarCliente extends javax.swing.JInternalFrame {
    ClienteData cd = new ClienteData();
    Cliente cliente = null;

    public EliminarCliente() {
        initComponents();
        setTitle("Limpieza de Clientes");
        setResizable(false);
        
        List<Cliente> listaClientes = cd.listarClientes();
        
        Collections.sort(listaClientes, new Comparator<Cliente>() {
            public int compare(Cliente o1, Cliente o2) {
                return o1.toString().compareTo(o2.toString());
            }
        });
        
        for (Cliente cliente : listaClientes) {
            cmbCliente.addItem(cliente);
        }
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        cmbCliente = new javax.swing.JComboBox<>();
        lblSeleccione = new javax.swing.JLabel();
        separador = new javax.swing.JSeparator();
        lblDni = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblDomicilio = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        txtDni = new javax.swing.JLabel();
        txtApellido = new javax.swing.JLabel();
        txtNombre = new javax.swing.JLabel();
        txtDomicilio = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        lblTitulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTitulo.setText("Eliminar Cliente");

        cmbCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbClienteActionPerformed(evt);
            }
        });

        lblSeleccione.setText("Seleccione:");

        lblDni.setText("Dni:");

        lblApellido.setText("Apellido:");

        lblNombre.setText("Nombre:");

        lblDomicilio.setText("Domicilio:");

        lblTelefono.setText("Telefono:");

        txtDni.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtDni.setText("-/-");

        txtApellido.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtApellido.setText("-/-");

        txtNombre.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtNombre.setText("-/-");

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
                        .addGap(52, 52, 52)
                        .addComponent(lblSeleccione)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitulo)
                            .addComponent(cmbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNombre)
                            .addComponent(lblApellido)
                            .addComponent(lblDni)
                            .addComponent(lblDomicilio)
                            .addComponent(lblTelefono))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDni)
                            .addComponent(txtApellido)
                            .addComponent(txtNombre)
                            .addComponent(txtDomicilio)
                            .addComponent(txtTelefono))))
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalir)
                .addGap(124, 124, 124))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSeleccione))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDni)
                    .addComponent(txtDni))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellido)
                    .addComponent(txtApellido))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDomicilio)
                    .addComponent(txtDomicilio))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefono)
                    .addComponent(txtTelefono))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addComponent(btnSalir))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbClienteActionPerformed
        cliente = (Cliente)cmbCliente.getSelectedItem();
        txtDni.setText(cliente.getDni()+"");
        txtApellido.setText(cliente.getApellido());
        txtNombre.setText(cliente.getNombre());
        txtDomicilio.setText(cliente.getDomicilio());
        txtTelefono.setText(cliente.getTelefono());
    }//GEN-LAST:event_cmbClienteActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        cd.eliminarCliente(cliente.getIdCliente());
        JOptionPane.showMessageDialog(this, "Cliente eliminado con exito!");
        cmbCliente.removeItem(cmbCliente.getSelectedItem());
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<Cliente> cmbCliente;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblDni;
    private javax.swing.JLabel lblDomicilio;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblSeleccione;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JSeparator separador;
    private javax.swing.JLabel txtApellido;
    private javax.swing.JLabel txtDni;
    private javax.swing.JLabel txtDomicilio;
    private javax.swing.JLabel txtNombre;
    private javax.swing.JLabel txtTelefono;
    // End of variables declaration//GEN-END:variables
}
