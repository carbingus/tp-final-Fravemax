package Vistas;

import javax.swing.JInternalFrame;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        barraMenu = new javax.swing.JMenuBar();
        menuClientes = new javax.swing.JMenu();
        vistaAgregarCliente = new javax.swing.JMenuItem();
        vistaModificarCliente = new javax.swing.JMenuItem();
        vistaEliminarCliente = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        vistaModificarProveedor = new javax.swing.JMenu();
        vistaAgregarProveedor = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        vistaEliminarProveedor = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 462, Short.MAX_VALUE)
        );

        menuClientes.setText("Clientes");

        vistaAgregarCliente.setText("Agregar Cliente");
        vistaAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vistaAgregarClienteActionPerformed(evt);
            }
        });
        menuClientes.add(vistaAgregarCliente);

        vistaModificarCliente.setText("Modificar Cliente");
        vistaModificarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vistaModificarClienteActionPerformed(evt);
            }
        });
        menuClientes.add(vistaModificarCliente);

        vistaEliminarCliente.setText("Eliminar Cliente");
        vistaEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vistaEliminarClienteActionPerformed(evt);
            }
        });
        menuClientes.add(vistaEliminarCliente);

        barraMenu.add(menuClientes);

        jMenu1.setText("Productos");
        barraMenu.add(jMenu1);

        vistaModificarProveedor.setText("Proveedores");

        vistaAgregarProveedor.setText("Agregar Proveedor");
        vistaAgregarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vistaAgregarProveedorActionPerformed(evt);
            }
        });
        vistaModificarProveedor.add(vistaAgregarProveedor);

        jMenuItem1.setText("Modificar Proveedor");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        vistaModificarProveedor.add(jMenuItem1);

        vistaEliminarProveedor.setText("Eliminar Proveedor");
        vistaEliminarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vistaEliminarProveedorActionPerformed(evt);
            }
        });
        vistaModificarProveedor.add(vistaEliminarProveedor);

        barraMenu.add(vistaModificarProveedor);

        jMenu4.setText("Ventas");
        barraMenu.add(jMenu4);

        jMenu5.setText("Compras");
        barraMenu.add(jMenu5);

        jMenu6.setText("Inventario");
        barraMenu.add(jMenu6);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void vistaAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vistaAgregarClienteActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        AgregarCliente ac = new AgregarCliente();
        centrarVentana(ac);
    }//GEN-LAST:event_vistaAgregarClienteActionPerformed

    private void vistaModificarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vistaModificarClienteActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        ModificarCliente md = new ModificarCliente();
        centrarVentana(md);
    }//GEN-LAST:event_vistaModificarClienteActionPerformed

    private void vistaEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vistaEliminarClienteActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        EliminarCliente ec = new EliminarCliente();
        centrarVentana(ec);
    }//GEN-LAST:event_vistaEliminarClienteActionPerformed

    private void vistaAgregarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vistaAgregarProveedorActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        AgregarProveedor ap = new AgregarProveedor();
        centrarVentana(ap);
    }//GEN-LAST:event_vistaAgregarProveedorActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        ModificarProveedor mp = new ModificarProveedor();
        centrarVentana(mp);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void vistaEliminarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vistaEliminarProveedorActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        EliminarProveedor ep = new EliminarProveedor();
        centrarVentana(ep);
    }//GEN-LAST:event_vistaEliminarProveedorActionPerformed

    public void centrarVentana(JInternalFrame ventana) {
        int x = escritorio.getWidth()/2 - ventana.getWidth()/2;
        int y = escritorio.getHeight()/2 - ventana.getHeight()/2;
        if (ventana.isShowing()) {
            ventana.setLocation(x, y);
        } else {
            escritorio.add(ventana);
            ventana.setLocation(x, y);
            ventana.show();
        }
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu menuClientes;
    private javax.swing.JMenuItem vistaAgregarCliente;
    private javax.swing.JMenuItem vistaAgregarProveedor;
    private javax.swing.JMenuItem vistaEliminarCliente;
    private javax.swing.JMenuItem vistaEliminarProveedor;
    private javax.swing.JMenuItem vistaModificarCliente;
    private javax.swing.JMenu vistaModificarProveedor;
    // End of variables declaration//GEN-END:variables
}
