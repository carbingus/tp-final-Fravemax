package Vistas;

import AccesoADatos.ClienteData;
import Entidades.Cliente;
import javax.swing.JOptionPane;

public class AgregarCliente extends javax.swing.JInternalFrame {
    ClienteData cd = new ClienteData();
    Cliente cliente = null;
    
    public AgregarCliente() {
        initComponents();
        txtDni.requestFocus();
        setTitle("Registro de Clientes");
        setResizable(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblDni = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblDomicilio = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtDomicilio = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jlblIconito = new javax.swing.JLabel();

        lblTitulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTitulo.setText("Agregar Cliente");

        lblDni.setText("Dni:");

        lblApellido.setText("Apellido:");

        lblNombre.setText("Nombre:");

        lblDomicilio.setText("Domicilio:");

        lblTelefono.setText("Telefono:");

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
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

        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });

        txtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniKeyTyped(evt);
            }
        });

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jlblIconito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/imagenes/usuario-default-mini.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDomicilio, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTelefono, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblApellido, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDni, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAgregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalir))
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtTelefono)
                        .addComponent(txtNombre)
                        .addComponent(txtDomicilio)
                        .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlblIconito)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlblIconito, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDni))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblApellido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDomicilio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefono))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnSalir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if (txtDni.getText().trim().isEmpty() || txtApellido.getText().trim().isEmpty() || txtNombre.getText().trim().isEmpty() || txtDomicilio.getText().trim().isEmpty() || txtTelefono.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, rellene todos los campos.");
        } else {
            cliente = new Cliente(Integer.parseInt(txtDni.getText()), txtApellido.getText(), txtNombre.getText(), txtDomicilio.getText(), txtTelefono.getText(), true);
            cd.guardarCliente(cliente);
            JOptionPane.showMessageDialog(this, "Cliente agregado con exito!");
            limpiar();
            txtDni.requestFocus();
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingrese solo números.");
        }
    }//GEN-LAST:event_txtDniKeyTyped

    private void txtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLowerCase(validar)) {
            String cadena = (""+validar).toUpperCase();
            validar = cadena.charAt(0);
            evt.setKeyChar(validar);
        }
        if (Character.isDigit(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingrese solo letras.");
        }
    }//GEN-LAST:event_txtApellidoKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLowerCase(validar)) {
            String cadena = (""+validar).toUpperCase();
            validar = cadena.charAt(0);
            evt.setKeyChar(validar);
        }
        if (Character.isDigit(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingrese solo letras.");
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingrese solo números.");
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtDomicilioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDomicilioKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLowerCase(validar)) {
            String cadena = (""+validar).toUpperCase();
            validar = cadena.charAt(0);
            evt.setKeyChar(validar);
        }
    }//GEN-LAST:event_txtDomicilioKeyTyped

    public void limpiar() {
        txtDni.setText("");
        txtApellido.setText("");
        txtNombre.setText("");
        txtDomicilio.setText("");
        txtTelefono.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jlblIconito;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblDni;
    private javax.swing.JLabel lblDomicilio;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtDomicilio;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
