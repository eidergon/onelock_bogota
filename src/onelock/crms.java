package onelock;

import com.jtattoo.plaf.fast.FastLookAndFeel;
import connectmysql.Conexion;
import java.awt.Color;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import static onelock.login.usuarioActual;

public class crms extends javax.swing.JFrame {
    Conexion cx;
    String dataToSendUser;
    String dataToSendPass;
    
    public crms() {
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/img/logo-removebg-preview.png")).getImage());
        cx = new Conexion();
        cx.conectar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        crm_bogota = new javax.swing.JButton();
        crm_medellin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CRM");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setFocusCycleRoot(true);

        jLabel1.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Elija el CRM a ingresar");

        crm_bogota.setBackground(new java.awt.Color(102, 102, 255));
        crm_bogota.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        crm_bogota.setForeground(new java.awt.Color(255, 255, 255));
        crm_bogota.setText("CRM BOGOTA");
        crm_bogota.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        crm_bogota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                crm_bogotaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                crm_bogotaMouseExited(evt);
            }
        });
        crm_bogota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crm_bogotaActionPerformed(evt);
            }
        });

        crm_medellin.setBackground(new java.awt.Color(102, 102, 255));
        crm_medellin.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        crm_medellin.setForeground(new java.awt.Color(255, 255, 255));
        crm_medellin.setText("CRM MEDELLIN");
        crm_medellin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        crm_medellin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                crm_medellinMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                crm_medellinMouseExited(evt);
            }
        });
        crm_medellin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crm_medellinActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(crm_bogota)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(crm_medellin)))
                .addGap(71, 71, 71))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(crm_medellin)
                    .addComponent(crm_bogota, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crm_bogotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crm_bogotaActionPerformed
        try {
            String query = "SELECT crm, contraseña_crm FROM Usuarios WHERE usuario_onelock=?";
            PreparedStatement ps = cx.conectar().prepareStatement(query);
            ps.setString(1, usuarioActual);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                dataToSendUser = rs.getString("crm");
                dataToSendPass = rs.getString("contraseña_crm");

                if (dataToSendUser != null && !dataToSendUser.isEmpty() && dataToSendPass != null && !dataToSendPass.isEmpty()) {
                    this.setExtendedState(1);
                    String command = "C:\\selenium\\auto_crm_bog.exe " + dataToSendUser + " " + dataToSendPass;
                    Process process = Runtime.getRuntime().exec(command);

                    // Esperar a que el proceso de AutoIt termine antes de continuar
                    int exitCode = process.waitFor();

                    if (exitCode == 0) {
                        // El proceso de AutoIt se completó con éxito
                        System.out.println("Proceso de AutoIt completado correctamente.");
                    } else {
                        // El proceso de AutoIt terminó con un código de error
                        System.err.println("Proceso de AutoIt terminado con código de error: " + exitCode);
                    }
                } else {
                    Icon x = new ImageIcon(getClass().getResource("/img/letterx_83737.png"));
                    JOptionPane.showMessageDialog(null, "No tienes acceso al aplicativo", "ERROR", JOptionPane.INFORMATION_MESSAGE, x);
                }
            } else {
                Icon x = new ImageIcon(getClass().getResource("/img/letterx_83737.png"));
                JOptionPane.showMessageDialog(null, "Documento No Valido", "ERROR", JOptionPane.INFORMATION_MESSAGE, x);
            }
        } catch (SQLException | IOException | InterruptedException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_crm_bogotaActionPerformed

    private void crm_medellinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crm_medellinActionPerformed
        try {
            String query = "SELECT crm, contraseña_crm FROM Usuarios WHERE usuario_onelock=?";
            PreparedStatement ps = cx.conectar().prepareStatement(query);
            ps.setString(1, usuarioActual);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                dataToSendUser = rs.getString("crm");
                dataToSendPass = rs.getString("contraseña_crm");

                if (dataToSendUser != null && !dataToSendUser.isEmpty() && dataToSendPass != null && !dataToSendPass.isEmpty()) {
                    this.setExtendedState(1);
                    String command = "C:\\selenium\\auto_crm.exe " + dataToSendUser + " " + dataToSendPass;
                    Process process = Runtime.getRuntime().exec(command);

                    // Esperar a que el proceso de AutoIt termine antes de continuar
                    int exitCode = process.waitFor();

                    if (exitCode == 0) {
                        // El proceso de AutoIt se completó con éxito
                        System.out.println("Proceso de AutoIt completado correctamente.");
                    } else {
                        // El proceso de AutoIt terminó con un código de error
                        System.err.println("Proceso de AutoIt terminado con código de error: " + exitCode);
                    }
                } else {
                    Icon x = new ImageIcon(getClass().getResource("/img/letterx_83737.png"));
                    JOptionPane.showMessageDialog(null, "No tienes acceso al aplicativo", "ERROR", JOptionPane.INFORMATION_MESSAGE, x);
                }
            } else {
                Icon x = new ImageIcon(getClass().getResource("/img/letterx_83737.png"));
                JOptionPane.showMessageDialog(null, "Documento No Valido", "ERROR", JOptionPane.INFORMATION_MESSAGE, x);
            }
        } catch (SQLException | IOException | InterruptedException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_crm_medellinActionPerformed

    private void crm_bogotaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crm_bogotaMouseEntered
        crm_bogota.setBackground(new Color(253, 82, 0));
    }//GEN-LAST:event_crm_bogotaMouseEntered

    private void crm_bogotaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crm_bogotaMouseExited
        crm_bogota.setBackground(new Color(102, 102, 255));
    }//GEN-LAST:event_crm_bogotaMouseExited

    private void crm_medellinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crm_medellinMouseEntered
        crm_medellin.setBackground(new Color(253, 82, 0));
    }//GEN-LAST:event_crm_medellinMouseEntered

    private void crm_medellinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crm_medellinMouseExited
        crm_medellin.setBackground(new Color(102, 102, 255));
    }//GEN-LAST:event_crm_medellinMouseExited

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
            java.util.logging.Logger.getLogger(crms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(crms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(crms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(crms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(new FastLookAndFeel());
                    new onelock().setVisible(true);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(onelock.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton crm_bogota;
    private javax.swing.JButton crm_medellin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
