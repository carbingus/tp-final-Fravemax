package Vistas;

import AccesoADatos.ProveedorData;
import Entidades.Proveedor;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.JOptionPane;

public class ModificarProveedor extends javax.swing.JInternalFrame {
    ProveedorData pd = new ProveedorData();
    Proveedor proveedor = null;

    public ModificarProveedor() {
        initComponents();
        setTitle("Actualizacion de datos de Proveedores");
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
        separador = new javax.swing.JSeparator();
        lblRazonSocial = new javax.swing.JLabel();
        lblDomicilio = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        txtRazonSocial = new javax.swing.JTextField();
        txtDomicilio = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        btnModificar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        lblTitulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTitulo.setText("Modificar Proveedor");

        lblSeleccione.setText("Seleccione:");

        cmbProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbProveedorActionPerformed(evt);
            }
        });

        lblRazonSocial.setText("Razon Social:");

        lblDomicilio.setText("Domicilio:");

        lblTelefono.setText("Telefono:");

        txtRazonSocial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRazonSocialKeyTyped(evt);
            }
        });

        txtDomicilio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDomicilioKeyTyped(evt);
            }
        });

        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 27, Short.MAX_VALUE)
                .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(lblTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(lblSeleccione)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDomicilio)
                            .addComponent(lblRazonSocial)
                            .addComponent(lblTelefono))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtRazonSocial)
                            .addComponent(txtDomicilio)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(btnModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSalir)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSeleccione)
                    .addComponent(cmbProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRazonSocial)
                    .addComponent(txtRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDomicilio)
                    .addComponent(txtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefono)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificar)
                    .addComponent(btnSalir))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbProveedorActionPerformed
        proveedor = (Proveedor)cmbProveedor.getSelectedItem();
        txtRazonSocial.setText(proveedor.getRazonSocial());
        txtDomicilio.setText(proveedor.getDomicilio());
        txtTelefono.setText(proveedor.getTelefono());
    }//GEN-LAST:event_cmbProveedorActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if (txtRazonSocial.getText().trim().isEmpty() || txtDomicilio.getText().trim().isEmpty() || txtTelefono.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Los campos no deben quedar vacios!");
        } else {
            proveedor.setRazonSocial(txtRazonSocial.getText());
            proveedor.setDomicilio(txtDomicilio.getText());
            proveedor.setTelefono(txtTelefono.getText());
            pd.modificarProveedor(proveedor);
            JOptionPane.showMessageDialog(this, "Proveedor modificado con exito!");
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtRazonSocialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRazonSocialKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLowerCase(validar)) {
            String cadena = (""+validar).toUpperCase();
            validar = cadena.charAt(0);
            evt.setKeyChar(validar);
        }
    }//GEN-LAST:event_txtRazonSocialKeyTyped

    private void txtDomicilioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDomicilioKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLowerCase(validar)) {
            String cadena = (""+validar).toUpperCase();
            validar = cadena.charAt(0);
            evt.setKeyChar(validar);
        }
    }//GEN-LAST:event_txtDomicilioKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingrese solo números.");
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<Proveedor> cmbProveedor;
    private javax.swing.JLabel lblDomicilio;
    private javax.swing.JLabel lblRazonSocial;
    private javax.swing.JLabel lblSeleccione;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JSeparator separador;
    private javax.swing.JTextField txtDomicilio;
    private javax.swing.JTextField txtRazonSocial;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
