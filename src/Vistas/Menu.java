package Vistas;

import javax.swing.JInternalFrame;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("FraveMAX: Lider en Electrodomesticos");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/Vistas/imagenes/fondo.png"));
        Image image = icon.getImage();
        escritorio = new javax.swing.JDesktopPane() {
            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };
        barraMenu = new javax.swing.JMenuBar();
        menuClientes = new javax.swing.JMenu();
        vistaAgregarCliente = new javax.swing.JMenuItem();
        vistaModificarCliente = new javax.swing.JMenuItem();
        vistaEliminarCliente = new javax.swing.JMenuItem();
        menuProductos = new javax.swing.JMenu();
        vistaRegistrarProducto = new javax.swing.JMenuItem();
        vistaEliminarProducto = new javax.swing.JMenuItem();
        menuProveedor = new javax.swing.JMenu();
        vistaAgregarProveedor = new javax.swing.JMenuItem();
        vistaModificarProveedor = new javax.swing.JMenuItem();
        vistaEliminarProveedor = new javax.swing.JMenuItem();
        menuVentas = new javax.swing.JMenu();
        vistaRealizarVenta = new javax.swing.JMenuItem();
        vistaConsultarVentas = new javax.swing.JMenuItem();
        menuCompras = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jmnStock = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 775, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 516, Short.MAX_VALUE)
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

        menuProductos.setText("Productos");

        vistaRegistrarProducto.setText("Registrar Producto");
        vistaRegistrarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vistaRegistrarProductoActionPerformed(evt);
            }
        });
        menuProductos.add(vistaRegistrarProducto);

        vistaEliminarProducto.setText("Eliminar Producto");
        vistaEliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vistaEliminarProductoActionPerformed(evt);
            }
        });
        menuProductos.add(vistaEliminarProducto);

        barraMenu.add(menuProductos);

        menuProveedor.setText("Proveedores");

        vistaAgregarProveedor.setText("Agregar Proveedor");
        vistaAgregarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vistaAgregarProveedorActionPerformed(evt);
            }
        });
        menuProveedor.add(vistaAgregarProveedor);

        vistaModificarProveedor.setText("Modificar Proveedor");
        vistaModificarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vistaModificarProveedorActionPerformed(evt);
            }
        });
        menuProveedor.add(vistaModificarProveedor);

        vistaEliminarProveedor.setText("Eliminar Proveedor");
        vistaEliminarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vistaEliminarProveedorActionPerformed(evt);
            }
        });
        menuProveedor.add(vistaEliminarProveedor);

        barraMenu.add(menuProveedor);

        menuVentas.setText("Ventas");

        vistaRealizarVenta.setText("Realizar Venta");
        vistaRealizarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vistaRealizarVentaActionPerformed(evt);
            }
        });
        menuVentas.add(vistaRealizarVenta);

        vistaConsultarVentas.setText("Consultar Ventas");
        vistaConsultarVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vistaConsultarVentasActionPerformed(evt);
            }
        });
        menuVentas.add(vistaConsultarVentas);

        barraMenu.add(menuVentas);

        menuCompras.setText("Compras");

        jMenuItem1.setText("Realizar Compra");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuCompras.add(jMenuItem1);

        barraMenu.add(menuCompras);

        jMenu6.setText("Inventario");

        jmnStock.setText("Consultar Stock");
        jmnStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnStockActionPerformed(evt);
            }
        });
        jMenu6.add(jmnStock);

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

    private void vistaModificarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vistaModificarProveedorActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        ModificarProveedor mp = new ModificarProveedor();
        centrarVentana(mp);
    }//GEN-LAST:event_vistaModificarProveedorActionPerformed

    private void vistaEliminarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vistaEliminarProveedorActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        EliminarProveedor ep = new EliminarProveedor();
        centrarVentana(ep);
    }//GEN-LAST:event_vistaEliminarProveedorActionPerformed

    private void vistaRegistrarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vistaRegistrarProductoActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        RegistrarProducto rp = new RegistrarProducto();
        centrarVentana(rp);
    }//GEN-LAST:event_vistaRegistrarProductoActionPerformed

    private void vistaEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vistaEliminarProductoActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        EliminarProducto ep = new EliminarProducto();
        centrarVentana(ep);
    }//GEN-LAST:event_vistaEliminarProductoActionPerformed

    private void vistaRealizarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vistaRealizarVentaActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        RealizarVentas rv = new RealizarVentas();
        centrarVentana(rv);
    }//GEN-LAST:event_vistaRealizarVentaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        RealizarCompras rc = new RealizarCompras();
        centrarVentana(rc);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jmnStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnStockActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        Inventario inv = new Inventario();
        centrarVentana(inv);
    }//GEN-LAST:event_jmnStockActionPerformed

    private void vistaConsultarVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vistaConsultarVentasActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        ConsultarVentas cV = new ConsultarVentas();
        centrarVentana(cV);
    }//GEN-LAST:event_vistaConsultarVentasActionPerformed

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
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jmnStock;
    private javax.swing.JMenu menuClientes;
    private javax.swing.JMenu menuCompras;
    private javax.swing.JMenu menuProductos;
    private javax.swing.JMenu menuProveedor;
    private javax.swing.JMenu menuVentas;
    private javax.swing.JMenuItem vistaAgregarCliente;
    private javax.swing.JMenuItem vistaAgregarProveedor;
    private javax.swing.JMenuItem vistaConsultarVentas;
    private javax.swing.JMenuItem vistaEliminarCliente;
    private javax.swing.JMenuItem vistaEliminarProducto;
    private javax.swing.JMenuItem vistaEliminarProveedor;
    private javax.swing.JMenuItem vistaModificarCliente;
    private javax.swing.JMenuItem vistaModificarProveedor;
    private javax.swing.JMenuItem vistaRealizarVenta;
    private javax.swing.JMenuItem vistaRegistrarProducto;
    // End of variables declaration//GEN-END:variables
}
