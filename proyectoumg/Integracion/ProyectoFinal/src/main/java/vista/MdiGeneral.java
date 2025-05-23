/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import Controlador.seguridad.Bitacora;
import Controlador.seguridad.UsuarioConectado;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import vista.bancos.MantenimientoBancos;
import vista.bancos.MantenimientoTipo_cuenta;
import vista.bancos.MantenimientoTipo_moneda;
import vista.bancos.MantenimientoTipo_operacion_bancaria;
import vista.seguridad.MantenimientoUsuario;
import vista.seguridad.MantenimientoPerfiles;
import vista.seguridad.MantenimientoAplicacion;
import vista.seguridad.MantenimientoBitacora;
import vista.seguridad.AplicacionaUsuariosDEF;


/**
 *
 * @author visitante
 */
public class MdiGeneral extends javax.swing.JFrame {

    /**
     * Creates new form MdiGeneral
     */
    final int APLICACION=99;
    public MdiGeneral() {
        initComponents();
        setLocationRelativeTo(null);
        this.setExtendedState(MdiGeneral.MAXIMIZED_BOTH);
        this.setTitle("Ejemplo Capas");
        //setDefaultCloseOperation(EXIT_ON_CLOSE);
        cerrar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuGeneralSeguridad = new javax.swing.JMenu();
        MenuMantenimientos = new javax.swing.JMenu();
        MantenimientoUsuarios = new javax.swing.JMenuItem();
        MantenimientoAplicaciones = new javax.swing.JMenuItem();
        MantenimientoPerfiles = new javax.swing.JMenuItem();
        mnuAsignaciones = new javax.swing.JMenu();
        AsignacionesAplicacionesPerfil = new javax.swing.JMenuItem();
        AsignacionAplicacionesUsuario = new javax.swing.JMenuItem();
        AsignacionPerfilUsuario = new javax.swing.JMenuItem();
        Bitacora = new javax.swing.JMenu();
        ConsultaBitacora = new javax.swing.JMenuItem();
        salirSistema = new javax.swing.JMenuItem();
        MenuGeneralSeguridad1 = new javax.swing.JMenu();
        MenuMantenimientos1 = new javax.swing.JMenu();
        MantenimientoBancos = new javax.swing.JMenuItem();
        MantenimientoTipo_cuenta = new javax.swing.JMenuItem();
        MantenimientoTipoOperacionBancaria = new javax.swing.JMenuItem();
        MantenimientoTipoMoneda = new javax.swing.JMenuItem();
        salirSistema1 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 442, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        MenuGeneralSeguridad.setText("Seguridad");

        MenuMantenimientos.setText("Mantenimientos");
        MenuMantenimientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuMantenimientosActionPerformed(evt);
            }
        });

        MantenimientoUsuarios.setText("Mantenimiento Usuarios");
        MantenimientoUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MantenimientoUsuariosActionPerformed(evt);
            }
        });
        MenuMantenimientos.add(MantenimientoUsuarios);

        MantenimientoAplicaciones.setText("Mantenimiento Aplicaciones");
        MantenimientoAplicaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MantenimientoAplicacionesActionPerformed(evt);
            }
        });
        MenuMantenimientos.add(MantenimientoAplicaciones);

        MantenimientoPerfiles.setText("Mantenimiento Perfiles");
        MantenimientoPerfiles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MantenimientoPerfilesActionPerformed(evt);
            }
        });
        MenuMantenimientos.add(MantenimientoPerfiles);

        MenuGeneralSeguridad.add(MenuMantenimientos);

        mnuAsignaciones.setText("Asignaciones");

        AsignacionesAplicacionesPerfil.setText("Asignacion Aplicaciones a Perfil");
        AsignacionesAplicacionesPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AsignacionesAplicacionesPerfilActionPerformed(evt);
            }
        });
        mnuAsignaciones.add(AsignacionesAplicacionesPerfil);

        AsignacionAplicacionesUsuario.setText("Asignacion Aplicaciones a Usuario");
        AsignacionAplicacionesUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AsignacionAplicacionesUsuarioActionPerformed(evt);
            }
        });
        mnuAsignaciones.add(AsignacionAplicacionesUsuario);

        AsignacionPerfilUsuario.setText("Asignacion Perfil a Usuario");
        AsignacionPerfilUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AsignacionPerfilUsuarioActionPerformed(evt);
            }
        });
        mnuAsignaciones.add(AsignacionPerfilUsuario);

        MenuGeneralSeguridad.add(mnuAsignaciones);

        Bitacora.setText("Bitacora");
        Bitacora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BitacoraActionPerformed(evt);
            }
        });

        ConsultaBitacora.setText("Consulta Bitacora");
        ConsultaBitacora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultaBitacoraActionPerformed(evt);
            }
        });
        Bitacora.add(ConsultaBitacora);

        MenuGeneralSeguridad.add(Bitacora);

        salirSistema.setText("Salir del Sistema");
        salirSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirSistemaActionPerformed(evt);
            }
        });
        MenuGeneralSeguridad.add(salirSistema);

        jMenuBar1.add(MenuGeneralSeguridad);

        MenuGeneralSeguridad1.setText("BANCOS");

        MenuMantenimientos1.setText("Mantenimientos");
        MenuMantenimientos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuMantenimientos1ActionPerformed(evt);
            }
        });

        MantenimientoBancos.setText("Mantenimiento Bancos");
        MantenimientoBancos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MantenimientoBancosActionPerformed(evt);
            }
        });
        MenuMantenimientos1.add(MantenimientoBancos);

        MantenimientoTipo_cuenta.setText("Mantenimiento Tipo de Cuenta");
        MantenimientoTipo_cuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MantenimientoTipo_cuentaActionPerformed(evt);
            }
        });
        MenuMantenimientos1.add(MantenimientoTipo_cuenta);

        MantenimientoTipoOperacionBancaria.setText("Mantenimiento Tipo de operaciòn bancaria");
        MantenimientoTipoOperacionBancaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MantenimientoTipoOperacionBancariaActionPerformed(evt);
            }
        });
        MenuMantenimientos1.add(MantenimientoTipoOperacionBancaria);

        MantenimientoTipoMoneda.setText("Mantenimiento Tipo de Moneda");
        MantenimientoTipoMoneda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MantenimientoTipoMonedaActionPerformed(evt);
            }
        });
        MenuMantenimientos1.add(MantenimientoTipoMoneda);

        MenuGeneralSeguridad1.add(MenuMantenimientos1);

        salirSistema1.setText("Salir del Sistema");
        salirSistema1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirSistema1ActionPerformed(evt);
            }
        });
        MenuGeneralSeguridad1.add(salirSistema1);

        jMenuBar1.add(MenuGeneralSeguridad1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void cerrar(){
        try 
        {
            this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            addWindowListener(new WindowAdapter() 
            {
                public void windowClosing(WindowEvent e) 
                {
                    confirmarSalida();
                }
            });
            this.setVisible(true);
        } catch (Exception e) 
        {
            e.printStackTrace();
        }
    }    
    public void confirmarSalida() 
    {
        int valor=JOptionPane.showConfirmDialog(this,"¿Està seguro de cerrar?", "Advertencia", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                    if (valor==JOptionPane.YES_OPTION) 
                    {
                        JOptionPane.showMessageDialog(null, "Gracias por su visita, hasta pronto", "Gracias", JOptionPane.INFORMATION_MESSAGE);
                        System.exit(0);
                    }
    }
    
    private void MenuMantenimientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuMantenimientosActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_MenuMantenimientosActionPerformed

    private void MantenimientoUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MantenimientoUsuariosActionPerformed
        // TODO add your handling code here:
         // Cerrar otros JInternalFrame antes de abrir uno nuevo//MISHEL
for (javax.swing.JInternalFrame frame : jDesktopPane1.getAllFrames()) {
    frame.dispose(); // Cierra cada ventana abierta
    }
        MantenimientoUsuario ventana = new MantenimientoUsuario();
        jDesktopPane1.add(ventana);
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension FrameSize = ventana.getSize();
        ventana.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
    }//GEN-LAST:event_MantenimientoUsuariosActionPerformed

    private void MantenimientoAplicacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MantenimientoAplicacionesActionPerformed
        // TODO add your handling code here:
         // Cerrar otros JInternalFrame antes de abrir uno nuevo//MISHEL
for (javax.swing.JInternalFrame frame : jDesktopPane1.getAllFrames()) {
    frame.dispose(); // Cierra cada ventana abierta
}
        MantenimientoAplicacion ventana = new MantenimientoAplicacion();
        jDesktopPane1.add(ventana);
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension FrameSize = ventana.getSize();
        ventana.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
    }//GEN-LAST:event_MantenimientoAplicacionesActionPerformed

    private void MantenimientoPerfilesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MantenimientoPerfilesActionPerformed
        // TODO add your handling code here:
                 // Cerrar otros JInternalFrame antes de abrir uno nuevo//MISHEL
for (javax.swing.JInternalFrame frame : jDesktopPane1.getAllFrames()) {
    frame.dispose(); // Cierra cada ventana abierta
}
       MantenimientoPerfiles ventana = new MantenimientoPerfiles();
       jDesktopPane1.add(ventana);
       Dimension desktopSize = jDesktopPane1.getSize();
       Dimension FrameSize = ventana.getSize();
       ventana.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
    }//GEN-LAST:event_MantenimientoPerfilesActionPerformed

    private void BitacoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BitacoraActionPerformed
        // TODO add your handling code here:
//       MantenimientoBitacora ventana = new MantenimientoBitacora();
//       jDesktopPane1.add(ventana);
//       Dimension desktopSize = jDesktopPane1.getSize();
//       Dimension FrameSize = ventana.getSize();
//       ventana.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
    }//GEN-LAST:event_BitacoraActionPerformed

    private void ConsultaBitacoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultaBitacoraActionPerformed
        // TODO add your handling code here:
                 // Cerrar otros JInternalFrame antes de abrir uno nuevo//MISHEL
for (javax.swing.JInternalFrame frame : jDesktopPane1.getAllFrames()) {
    frame.dispose(); // Cierra cada ventana abierta
}
       MantenimientoBitacora ventana = new MantenimientoBitacora();
       jDesktopPane1.add(ventana);
       Dimension desktopSize = jDesktopPane1.getSize();
       Dimension FrameSize = ventana.getSize();
       ventana.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
    }//GEN-LAST:event_ConsultaBitacoraActionPerformed

    private void AsignacionAplicacionesUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AsignacionAplicacionesUsuarioActionPerformed
        // TODO add your handling code here:
        //       MantenimientoBitacora ventana = new MantenimientoBitacora();
       for (javax.swing.JInternalFrame frame : jDesktopPane1.getAllFrames()) {
            frame.dispose(); 
       }
       AplicacionaUsuariosDEF ventana = new AplicacionaUsuariosDEF();
       jDesktopPane1.add(ventana);
       Dimension desktopSize = jDesktopPane1.getSize();
       Dimension FrameSize = ventana.getSize();
       ventana.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
    }//GEN-LAST:event_AsignacionAplicacionesUsuarioActionPerformed

    private void AsignacionPerfilUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AsignacionPerfilUsuarioActionPerformed
        // TODO add your handling code here:
//       MantenimientoBitacora ventana = new MantenimientoBitacora();
//       jDesktopPane1.add(ventana);
//       Dimension desktopSize = jDesktopPane1.getSize();
//       Dimension FrameSize = ventana.getSize();
//       ventana.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
    }//GEN-LAST:event_AsignacionPerfilUsuarioActionPerformed

    private void AsignacionesAplicacionesPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AsignacionesAplicacionesPerfilActionPerformed
        // TODO add your handling code here:
        //       MantenimientoBitacora ventana = new MantenimientoBitacora();
//       jDesktopPane1.add(ventana);
//       Dimension desktopSize = jDesktopPane1.getSize();
//       Dimension FrameSize = ventana.getSize();
//       ventana.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
    }//GEN-LAST:event_AsignacionesAplicacionesPerfilActionPerformed

    private void salirSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirSistemaActionPerformed
        // TODO add your handling code here:
                 // Cerrar otros JInternalFrame antes de abrir uno nuevo//MISHEL
for (javax.swing.JInternalFrame frame : jDesktopPane1.getAllFrames()) {
    frame.dispose(); // Cierra cada ventana abierta
}
//        
        int valor=JOptionPane.showConfirmDialog(this,"¿Està seguro de cerrar?", "Advertencia", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                    if (valor==JOptionPane.YES_OPTION) 
                    {
                        JOptionPane.showMessageDialog(null, "Gracias por su visita, hasta pronto", "Gracias", JOptionPane.INFORMATION_MESSAGE);
                        System.exit(0);
                    }
    }//GEN-LAST:event_salirSistemaActionPerformed

    private void MantenimientoBancosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MantenimientoBancosActionPerformed
       
          // TODO add your handling code here:
        //       MantenimientoBitacora ventana = new MantenimientoBitacora();
       for (javax.swing.JInternalFrame frame : jDesktopPane1.getAllFrames()) {
            frame.dispose(); 
       }
       MantenimientoBancos ventana = new MantenimientoBancos();
       jDesktopPane1.add(ventana);
       Dimension desktopSize = jDesktopPane1.getSize();
       Dimension FrameSize = ventana.getSize();
       ventana.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
    }//GEN-LAST:event_MantenimientoBancosActionPerformed

    private void MantenimientoTipo_cuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MantenimientoTipo_cuentaActionPerformed
        // TODO add your handling code here:
               
          // TODO add your handling code here:
        //       MantenimientoBitacora ventana = new MantenimientoBitacora();
       for (javax.swing.JInternalFrame frame : jDesktopPane1.getAllFrames()) {
            frame.dispose(); 
       }
       MantenimientoTipo_cuenta ventana = new MantenimientoTipo_cuenta();
       jDesktopPane1.add(ventana);
       Dimension desktopSize = jDesktopPane1.getSize();
       Dimension FrameSize = ventana.getSize();
       ventana.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        
    }//GEN-LAST:event_MantenimientoTipo_cuentaActionPerformed

    private void MantenimientoTipoOperacionBancariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MantenimientoTipoOperacionBancariaActionPerformed
        // TODO add your handling code here:
        for (javax.swing.JInternalFrame frame : jDesktopPane1.getAllFrames()) {
            frame.dispose(); 
       }
       MantenimientoTipo_operacion_bancaria ventana = new MantenimientoTipo_operacion_bancaria();
       jDesktopPane1.add(ventana);
       Dimension desktopSize = jDesktopPane1.getSize();
       Dimension FrameSize = ventana.getSize();
       ventana.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
    }//GEN-LAST:event_MantenimientoTipoOperacionBancariaActionPerformed

    private void MenuMantenimientos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuMantenimientos1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuMantenimientos1ActionPerformed

    private void salirSistema1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirSistema1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salirSistema1ActionPerformed

    private void MantenimientoTipoMonedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MantenimientoTipoMonedaActionPerformed
        // TODO add your handling code here:
         // TODO add your handling code here:
        for (javax.swing.JInternalFrame frame : jDesktopPane1.getAllFrames()) {
            frame.dispose(); 
       }
       MantenimientoTipo_moneda ventana = new MantenimientoTipo_moneda();
       jDesktopPane1.add(ventana);
       Dimension desktopSize = jDesktopPane1.getSize();
       Dimension FrameSize = ventana.getSize();
       ventana.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
    }//GEN-LAST:event_MantenimientoTipoMonedaActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(MdiGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MdiGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MdiGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MdiGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MdiGeneral().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AsignacionAplicacionesUsuario;
    private javax.swing.JMenuItem AsignacionPerfilUsuario;
    private javax.swing.JMenuItem AsignacionesAplicacionesPerfil;
    private javax.swing.JMenu Bitacora;
    private javax.swing.JMenuItem ConsultaBitacora;
    private javax.swing.JMenuItem MantenimientoAplicaciones;
    private javax.swing.JMenuItem MantenimientoBancos;
    private javax.swing.JMenuItem MantenimientoPerfiles;
    private javax.swing.JMenuItem MantenimientoTipoMoneda;
    private javax.swing.JMenuItem MantenimientoTipoOperacionBancaria;
    private javax.swing.JMenuItem MantenimientoTipo_cuenta;
    private javax.swing.JMenuItem MantenimientoUsuarios;
    private javax.swing.JMenu MenuGeneralSeguridad;
    private javax.swing.JMenu MenuGeneralSeguridad1;
    private javax.swing.JMenu MenuMantenimientos;
    private javax.swing.JMenu MenuMantenimientos1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenu mnuAsignaciones;
    private javax.swing.JMenuItem salirSistema;
    private javax.swing.JMenuItem salirSistema1;
    // End of variables declaration//GEN-END:variables
}
