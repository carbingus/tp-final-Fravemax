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
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
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

        barraMenu.add(menuClientes);

        jMenu1.setText("Productos");
        barraMenu.add(jMenu1);

        jMenu3.setText("Proveedores");
        barraMenu.add(jMenu3);

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
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu menuClientes;
    private javax.swing.JMenuItem vistaAgregarCliente;
    private javax.swing.JMenuItem vistaModificarCliente;
    // End of variables declaration//GEN-END:variables
}
