package onelock;

import com.jtattoo.plaf.fast.FastLookAndFeel;
import connectmysql.Conexion;
import java.awt.Color;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import static onelock.login.usuarioActual;

/**
 * Pestaña de los aplicativos
 *
 * @author EiderAndrésGonzálezS
 */
public class onelock extends javax.swing.JFrame {

    Conexion cx;
    String dataToSendUser;
    String dataToSendPass;

    public onelock() {
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/img/logo-removebg-preview.png")).getImage());
        cx = new Conexion();
        cx.conectar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        poliedro_r1 = new javax.swing.JButton();
        poliedro_r2 = new javax.swing.JButton();
        poliedro_r3 = new javax.swing.JButton();
        poliedro_r4 = new javax.swing.JButton();
        id_vision = new javax.swing.JButton();
        visor = new javax.swing.JButton();
        otp = new javax.swing.JButton();
        biometrica = new javax.swing.JButton();
        caliexpress = new javax.swing.JButton();
        lecta = new javax.swing.JButton();
        integra = new javax.swing.JButton();
        myapp = new javax.swing.JButton();
        notus = new javax.swing.JButton();
        agendamiento = new javax.swing.JButton();
        myit = new javax.swing.JButton();
        crm = new javax.swing.JButton();
        escritorio = new javax.swing.JButton();
        notus_osm = new javax.swing.JButton();
        dime = new javax.swing.JButton();
        peog = new javax.swing.JButton();
        contacto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplicativos Bogota");
        setResizable(false);

        panel.setBackground(new java.awt.Color(255, 255, 255));
        panel.setForeground(new java.awt.Color(0, 0, 51));
        panel.setToolTipText("");
        panel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panel.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N

        jLabel1.setBackground(new java.awt.Color(0, 0, 255));
        jLabel1.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("APLICATIVOS ");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/MicrosoftTeams-image__6_-removebg-preview.png"))); // NOI18N

        poliedro_r1.setBackground(new java.awt.Color(102, 102, 255));
        poliedro_r1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        poliedro_r1.setForeground(new java.awt.Color(255, 255, 255));
        poliedro_r1.setText("Claro Poliedro R1");
        poliedro_r1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        poliedro_r1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                poliedro_r1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                poliedro_r1MouseExited(evt);
            }
        });
        poliedro_r1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                poliedro_r1ActionPerformed(evt);
            }
        });

        poliedro_r2.setBackground(new java.awt.Color(102, 102, 255));
        poliedro_r2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        poliedro_r2.setForeground(new java.awt.Color(255, 255, 255));
        poliedro_r2.setText("Claro Poliedro R2");
        poliedro_r2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        poliedro_r2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                poliedro_r2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                poliedro_r2MouseExited(evt);
            }
        });
        poliedro_r2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                poliedro_r2ActionPerformed(evt);
            }
        });

        poliedro_r3.setBackground(new java.awt.Color(102, 102, 255));
        poliedro_r3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        poliedro_r3.setForeground(new java.awt.Color(255, 255, 255));
        poliedro_r3.setText("Claro Poliedro R3");
        poliedro_r3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        poliedro_r3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                poliedro_r3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                poliedro_r3MouseExited(evt);
            }
        });
        poliedro_r3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                poliedro_r3ActionPerformed(evt);
            }
        });

        poliedro_r4.setBackground(new java.awt.Color(102, 102, 255));
        poliedro_r4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        poliedro_r4.setForeground(new java.awt.Color(255, 255, 255));
        poliedro_r4.setText("Claro Poliedro R4");
        poliedro_r4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        poliedro_r4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                poliedro_r4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                poliedro_r4MouseExited(evt);
            }
        });
        poliedro_r4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                poliedro_r4ActionPerformed(evt);
            }
        });

        id_vision.setBackground(new java.awt.Color(102, 102, 255));
        id_vision.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        id_vision.setForeground(new java.awt.Color(255, 255, 255));
        id_vision.setText("Claro ID  Vision");
        id_vision.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        id_vision.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                id_visionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                id_visionMouseExited(evt);
            }
        });
        id_vision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_visionActionPerformed(evt);
            }
        });

        visor.setBackground(new java.awt.Color(102, 102, 255));
        visor.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        visor.setForeground(new java.awt.Color(255, 255, 255));
        visor.setText("Visor");
        visor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        visor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                visorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                visorMouseExited(evt);
            }
        });
        visor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visorActionPerformed(evt);
            }
        });

        otp.setBackground(new java.awt.Color(102, 102, 255));
        otp.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        otp.setForeground(new java.awt.Color(255, 255, 255));
        otp.setText("OTP Interno");
        otp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        otp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                otpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                otpMouseExited(evt);
            }
        });
        otp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otpActionPerformed(evt);
            }
        });

        biometrica.setBackground(new java.awt.Color(102, 102, 255));
        biometrica.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        biometrica.setForeground(new java.awt.Color(255, 255, 255));
        biometrica.setText("Biometria Facial");
        biometrica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        biometrica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                biometricaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                biometricaMouseExited(evt);
            }
        });
        biometrica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                biometricaActionPerformed(evt);
            }
        });

        caliexpress.setBackground(new java.awt.Color(102, 102, 255));
        caliexpress.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        caliexpress.setForeground(new java.awt.Color(255, 255, 255));
        caliexpress.setText("Cali express");
        caliexpress.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        caliexpress.setEnabled(false);
        caliexpress.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                caliexpressMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                caliexpressMouseExited(evt);
            }
        });
        caliexpress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caliexpressActionPerformed(evt);
            }
        });

        lecta.setBackground(new java.awt.Color(102, 102, 255));
        lecta.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lecta.setForeground(new java.awt.Color(255, 255, 255));
        lecta.setText("Lecta");
        lecta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lecta.setEnabled(false);
        lecta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lectaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lectaMouseExited(evt);
            }
        });
        lecta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lectaActionPerformed(evt);
            }
        });

        integra.setBackground(new java.awt.Color(102, 102, 255));
        integra.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        integra.setForeground(new java.awt.Color(255, 255, 255));
        integra.setText("Integra");
        integra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        integra.setEnabled(false);
        integra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                integraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                integraMouseExited(evt);
            }
        });
        integra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                integraActionPerformed(evt);
            }
        });

        myapp.setBackground(new java.awt.Color(102, 102, 255));
        myapp.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        myapp.setForeground(new java.awt.Color(255, 255, 255));
        myapp.setText("My APP");
        myapp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        myapp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                myappMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                myappMouseExited(evt);
            }
        });
        myapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myappActionPerformed(evt);
            }
        });

        notus.setBackground(new java.awt.Color(102, 102, 255));
        notus.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        notus.setForeground(new java.awt.Color(255, 255, 255));
        notus.setText("Notus Agente");
        notus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        notus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                notusMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                notusMouseExited(evt);
            }
        });
        notus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notusActionPerformed(evt);
            }
        });

        agendamiento.setBackground(new java.awt.Color(102, 102, 255));
        agendamiento.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        agendamiento.setForeground(new java.awt.Color(255, 255, 255));
        agendamiento.setText("Agendamiento");
        agendamiento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        agendamiento.setMaximumSize(new java.awt.Dimension(159, 30));
        agendamiento.setMinimumSize(new java.awt.Dimension(159, 30));
        agendamiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                agendamientoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                agendamientoMouseExited(evt);
            }
        });
        agendamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agendamientoActionPerformed(evt);
            }
        });

        myit.setBackground(new java.awt.Color(102, 102, 255));
        myit.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        myit.setForeground(new java.awt.Color(255, 255, 255));
        myit.setText("MY IT");
        myit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        myit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                myitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                myitMouseExited(evt);
            }
        });
        myit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myitActionPerformed(evt);
            }
        });

        crm.setBackground(new java.awt.Color(102, 102, 255));
        crm.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        crm.setForeground(new java.awt.Color(255, 255, 255));
        crm.setText("CRM");
        crm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        crm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                crmMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                crmMouseExited(evt);
            }
        });
        crm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crmActionPerformed(evt);
            }
        });

        escritorio.setBackground(new java.awt.Color(102, 102, 255));
        escritorio.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        escritorio.setForeground(new java.awt.Color(255, 255, 255));
        escritorio.setText("Notus OMS Back");
        escritorio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        escritorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                escritorioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                escritorioMouseExited(evt);
            }
        });
        escritorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escritorioActionPerformed(evt);
            }
        });

        notus_osm.setBackground(new java.awt.Color(102, 102, 255));
        notus_osm.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        notus_osm.setForeground(new java.awt.Color(255, 255, 255));
        notus_osm.setText("Notus Consulta Back ");
        notus_osm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        notus_osm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                notus_osmMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                notus_osmMouseExited(evt);
            }
        });
        notus_osm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notus_osmActionPerformed(evt);
            }
        });

        dime.setBackground(new java.awt.Color(102, 102, 255));
        dime.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        dime.setForeground(new java.awt.Color(255, 255, 255));
        dime.setText("Dime");
        dime.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dime.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dimeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dimeMouseExited(evt);
            }
        });
        dime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dimeActionPerformed(evt);
            }
        });

        peog.setBackground(new java.awt.Color(102, 102, 255));
        peog.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        peog.setForeground(new java.awt.Color(255, 255, 255));
        peog.setText("PEOG");
        peog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                peogMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                peogMouseExited(evt);
            }
        });
        peog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                peogActionPerformed(evt);
            }
        });

        contacto.setBackground(new java.awt.Color(102, 102, 255));
        contacto.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        contacto.setForeground(new java.awt.Color(255, 255, 255));
        contacto.setText("Contacto Virtual");
        contacto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        contacto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                contactoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                contactoMouseExited(evt);
            }
        });
        contacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(153, 153, 153))
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(crm, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(myapp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(caliexpress, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(visor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(poliedro_r4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(poliedro_r1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(dime, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(poliedro_r2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(id_vision, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(otp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lecta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(notus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(myit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(peog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(poliedro_r3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(biometrica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(integra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(agendamiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(notus_osm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(contacto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(20, 20, 20))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(poliedro_r2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(poliedro_r1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(poliedro_r3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(id_vision, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(biometrica, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(poliedro_r4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(otp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(visor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(integra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lecta)
                    .addComponent(agendamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caliexpress))
                .addGap(20, 20, 20)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(notus, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(myapp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(notus_osm, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(myit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(crm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(peog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(contacto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Abre la pestaña de campaña
     *
     * @param evt
     */
    private void poliedro_r1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_poliedro_r1ActionPerformed
        try {
            String query = "SELECT poliedro, contraseña_poliedro FROM Usuarios WHERE usuario_onelock=?";
            PreparedStatement ps = cx.conectar().prepareStatement(query);
            ps.setString(1, usuarioActual);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                dataToSendUser = rs.getString("poliedro");
                dataToSendPass = rs.getString("contraseña_poliedro");
                if (dataToSendUser != null && !dataToSendUser.isEmpty() && dataToSendPass != null && !dataToSendPass.isEmpty()) {
                    this.setExtendedState(1);
                    String command = "C:\\selenium\\auto_poliedro.exe " + dataToSendUser + " " + dataToSendPass;
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
    }//GEN-LAST:event_poliedro_r1ActionPerformed

    /**
     * Consulta el usuario y contraseña de biometria facial y coloca los datos
     * en sus respectivos campos para el ingreso a la plataforma.
     *
     * @param evt
     */
    private void biometricaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_biometricaActionPerformed
        try {
            String query = "SELECT * FROM Aplicativos WHERE complemento='Biometria'";
            Statement st = cx.conectar().createStatement();
            ResultSet rs = st.executeQuery(query);
            if (rs.next()) {
                dataToSendUser = rs.getString("usuario");
                dataToSendPass = rs.getString("contraseña");
                this.setExtendedState(1);
                String command = "C:\\selenium\\auto_biometria.exe " + dataToSendUser + " " + dataToSendPass;
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
                JOptionPane.showMessageDialog(null, "ERROR");
            }
        } catch (SQLException | IOException | InterruptedException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_biometricaActionPerformed

    /**
     * Abre la pestaña de ingreso_idvision
     *
     * @param evt
     */
    private void id_visionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_visionActionPerformed
        try {
            String query = "SELECT id_vision, contraseña_idvision FROM Usuarios WHERE usuario_onelock=?";
            PreparedStatement ps = cx.conectar().prepareStatement(query);
            ps.setString(1, usuarioActual);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                dataToSendUser = rs.getString("id_vision");
                dataToSendPass = rs.getString("contraseña_idvision");

                if (dataToSendUser != null && !dataToSendUser.isEmpty() && dataToSendPass != null && !dataToSendPass.isEmpty()) {
                    this.setExtendedState(1);
                    String command = "C:\\selenium\\auto_id_vision.exe " + dataToSendUser + " " + dataToSendPass;
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
    }//GEN-LAST:event_id_visionActionPerformed

    /**
     * Consulta el usuario y contraseña de logytech y coloca los datos en sus
     * respectivos campos para el ingreso a la plataforma.
     *
     * @param evt
     */
    private void notusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notusActionPerformed
        try {
            String query = "SELECT * FROM Aplicativos WHERE complemento='Logytech'";
            Statement st = cx.conectar().createStatement();
            ResultSet rs = st.executeQuery(query);
            if (rs.next()) {
                dataToSendUser = rs.getString("usuario");
                dataToSendPass = rs.getString("contraseña");
                this.setExtendedState(1);
                String command = "C:\\selenium\\auto_notus.exe " + dataToSendUser + " " + dataToSendPass;
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
                JOptionPane.showMessageDialog(null, "ERROR");
            }
        } catch (SQLException | IOException | InterruptedException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_notusActionPerformed

    /**
     * Estos comandos de codigo le agragan un evento a los botones segun pasemos
     * y alejemos en cursor al acercarse se pondrán de color naranja y al alejar
     * el cursor vuleve a su color originar
     *
     * @param evt
     */
    private void poliedro_r1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_poliedro_r1MouseEntered
        poliedro_r1.setBackground(new Color(253, 82, 0));
    }//GEN-LAST:event_poliedro_r1MouseEntered

    private void poliedro_r1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_poliedro_r1MouseExited
        poliedro_r1.setBackground(new Color(102, 102, 255));
    }//GEN-LAST:event_poliedro_r1MouseExited

    private void poliedro_r2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_poliedro_r2MouseEntered
        poliedro_r2.setBackground(new Color(253, 82, 0));
    }//GEN-LAST:event_poliedro_r2MouseEntered

    private void poliedro_r2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_poliedro_r2MouseExited
        poliedro_r2.setBackground(new Color(102, 102, 255));
    }//GEN-LAST:event_poliedro_r2MouseExited

    private void poliedro_r3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_poliedro_r3MouseExited
        poliedro_r3.setBackground(new Color(102, 102, 255));
    }//GEN-LAST:event_poliedro_r3MouseExited

    private void poliedro_r3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_poliedro_r3MouseEntered
        poliedro_r3.setBackground(new Color(253, 82, 0));
    }//GEN-LAST:event_poliedro_r3MouseEntered

    private void poliedro_r4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_poliedro_r4MouseEntered
        poliedro_r4.setBackground(new Color(253, 82, 0));
    }//GEN-LAST:event_poliedro_r4MouseEntered

    private void poliedro_r4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_poliedro_r4MouseExited
        poliedro_r4.setBackground(new Color(102, 102, 255));
    }//GEN-LAST:event_poliedro_r4MouseExited

    private void id_visionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_id_visionMouseEntered
        id_vision.setBackground(new Color(253, 82, 0));
    }//GEN-LAST:event_id_visionMouseEntered

    private void id_visionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_id_visionMouseExited
        id_vision.setBackground(new Color(102, 102, 255));
    }//GEN-LAST:event_id_visionMouseExited

    private void otpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_otpMouseEntered
        otp.setBackground(new Color(253, 82, 0));
    }//GEN-LAST:event_otpMouseEntered

    private void otpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_otpMouseExited
        otp.setBackground(new Color(102, 102, 255));
    }//GEN-LAST:event_otpMouseExited

    private void biometricaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_biometricaMouseEntered
        biometrica.setBackground(new Color(253, 82, 0));
    }//GEN-LAST:event_biometricaMouseEntered

    private void biometricaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_biometricaMouseExited
        biometrica.setBackground(new Color(102, 102, 255));
    }//GEN-LAST:event_biometricaMouseExited

    private void caliexpressMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_caliexpressMouseEntered
        caliexpress.setBackground(new Color(253, 82, 0));
    }//GEN-LAST:event_caliexpressMouseEntered

    private void caliexpressMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_caliexpressMouseExited
        caliexpress.setBackground(new Color(102, 102, 255));
    }//GEN-LAST:event_caliexpressMouseExited

    private void lectaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lectaMouseEntered
        lecta.setBackground(new Color(253, 82, 0));
    }//GEN-LAST:event_lectaMouseEntered

    private void lectaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lectaMouseExited
        lecta.setBackground(new Color(102, 102, 255));
    }//GEN-LAST:event_lectaMouseExited

    private void integraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_integraMouseEntered
        integra.setBackground(new Color(253, 82, 0));
    }//GEN-LAST:event_integraMouseEntered

    private void integraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_integraMouseExited
        integra.setBackground(new Color(102, 102, 255));
    }//GEN-LAST:event_integraMouseExited

    private void myappMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myappMouseEntered
        myapp.setBackground(new Color(253, 82, 0));
    }//GEN-LAST:event_myappMouseEntered

    private void myappMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myappMouseExited
        myapp.setBackground(new Color(102, 102, 255));
    }//GEN-LAST:event_myappMouseExited

    private void notusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_notusMouseEntered
        notus.setBackground(new Color(253, 82, 0));
    }//GEN-LAST:event_notusMouseEntered

    private void notusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_notusMouseExited
        notus.setBackground(new Color(102, 102, 255));
    }//GEN-LAST:event_notusMouseExited

    private void agendamientoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agendamientoMouseEntered
        agendamiento.setBackground(new Color(253, 82, 0));
    }//GEN-LAST:event_agendamientoMouseEntered

    private void agendamientoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agendamientoMouseExited
        agendamiento.setBackground(new Color(102, 102, 255));
    }//GEN-LAST:event_agendamientoMouseExited

    private void crmMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crmMouseEntered
        crm.setBackground(new Color(253, 82, 0));
    }//GEN-LAST:event_crmMouseEntered

    private void crmMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crmMouseExited
        crm.setBackground(new Color(102, 102, 255));
    }//GEN-LAST:event_crmMouseExited

    private void myitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myitMouseEntered
        myit.setBackground(new Color(253, 82, 0));
    }//GEN-LAST:event_myitMouseEntered

    private void myitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myitMouseExited
        myit.setBackground(new Color(102, 102, 255));
    }//GEN-LAST:event_myitMouseExited
    /**
     * Hasta este punto se termina los codificacion de los botones.
     *
     * @param evt
     */

    private void poliedro_r2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_poliedro_r2ActionPerformed
        try {
            String query = "SELECT poliedro, contraseña_poliedro FROM Usuarios WHERE usuario_onelock=?";
            PreparedStatement ps = cx.conectar().prepareStatement(query);
            ps.setString(1, usuarioActual);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                dataToSendUser = rs.getString("poliedro");
                dataToSendPass = rs.getString("contraseña_poliedro");
                if (dataToSendUser != null && !dataToSendUser.isEmpty() && dataToSendPass != null && !dataToSendPass.isEmpty()) {
                    this.setExtendedState(1);
                    String command = "C:\\selenium\\auto_poliedro.exe " + dataToSendUser + " " + dataToSendPass;
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
    }//GEN-LAST:event_poliedro_r2ActionPerformed

    private void poliedro_r3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_poliedro_r3ActionPerformed
        try {
            String query = "SELECT poliedro, contraseña_poliedro FROM Usuarios WHERE usuario_onelock=?";
            PreparedStatement ps = cx.conectar().prepareStatement(query);
            ps.setString(1, usuarioActual);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                dataToSendUser = rs.getString("poliedro");
                dataToSendPass = rs.getString("contraseña_poliedro");
                if (dataToSendUser != null && !dataToSendUser.isEmpty() && dataToSendPass != null && !dataToSendPass.isEmpty()) {
                    this.setExtendedState(1);
                    String command = "C:\\selenium\\auto_poliedro.exe " + dataToSendUser + " " + dataToSendPass;
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
    }//GEN-LAST:event_poliedro_r3ActionPerformed

    private void poliedro_r4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_poliedro_r4ActionPerformed
        try {
            String query = "SELECT poliedro, contraseña_poliedro FROM Usuarios WHERE usuario_onelock=?";
            PreparedStatement ps = cx.conectar().prepareStatement(query);
            ps.setString(1, usuarioActual);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                dataToSendUser = rs.getString("poliedro");
                dataToSendPass = rs.getString("contraseña_poliedro");
                if (dataToSendUser != null && !dataToSendUser.isEmpty() && dataToSendPass != null && !dataToSendPass.isEmpty()) {
                    this.setExtendedState(1);
                    String command = "C:\\selenium\\auto_poliedro.exe " + dataToSendUser + " " + dataToSendPass;
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
    }//GEN-LAST:event_poliedro_r4ActionPerformed

    private void agendamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agendamientoActionPerformed
        try {
            String query = "SELECT agendamiento, contraseña_agendamiento FROM Usuarios WHERE usuario_onelock=?";
            PreparedStatement ps = cx.conectar().prepareStatement(query);
            ps.setString(1, usuarioActual);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                dataToSendUser = rs.getString("agendamiento");
                dataToSendPass = rs.getString("contraseña_agendamiento");

                if (dataToSendUser != null && !dataToSendUser.isEmpty() && dataToSendPass != null && !dataToSendPass.isEmpty()) {
                    this.setExtendedState(1);
                    String command = "C:\\selenium\\auto_agendamiento.exe " + dataToSendUser + " " + dataToSendPass;
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
    }//GEN-LAST:event_agendamientoActionPerformed

    private void crmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crmActionPerformed
        this.setExtendedState(1);
        crms crms = new crms();
        crms.setVisible(true);
    }//GEN-LAST:event_crmActionPerformed

    private void visorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_visorMouseExited
        visor.setBackground(new Color(102, 102, 255));
    }//GEN-LAST:event_visorMouseExited

    private void visorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_visorMouseEntered
        visor.setBackground(new Color(253, 82, 0));
    }//GEN-LAST:event_visorMouseEntered

    private void visorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visorActionPerformed
        try {
            String query = "SELECT visor, contraseña_visor FROM Usuarios WHERE usuario_onelock=?";
            PreparedStatement ps = cx.conectar().prepareStatement(query);
            ps.setString(1, usuarioActual);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                dataToSendUser = rs.getString("visor");
                dataToSendPass = rs.getString("contraseña_visor");

                if (dataToSendUser != null && !dataToSendUser.isEmpty() && dataToSendPass != null && !dataToSendPass.isEmpty()) {
                    this.setExtendedState(1);
                    String command = "C:\\selenium\\auto_visor.exe " + dataToSendUser + " " + dataToSendPass;
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
    }//GEN-LAST:event_visorActionPerformed

    private void myappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myappActionPerformed
        try {
            String query = "SELECT my_app, contraseña_myapp FROM Usuarios WHERE usuario_onelock=?";
            PreparedStatement ps = cx.conectar().prepareStatement(query);
            ps.setString(1, usuarioActual);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                dataToSendUser = rs.getString("my_app");
                dataToSendPass = rs.getString("contraseña_myapp");

                if (dataToSendUser != null && !dataToSendUser.isEmpty() && dataToSendPass != null && !dataToSendPass.isEmpty()) {
                    this.setExtendedState(1);
                    String command = "C:\\selenium\\auto_my_app.exe " + dataToSendUser + " " + dataToSendPass;
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
    }//GEN-LAST:event_myappActionPerformed

    private void myitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myitActionPerformed
        try {
            String query = "SELECT my_it, contraseña_myit FROM Usuarios WHERE usuario_onelock=?";
            PreparedStatement ps = cx.conectar().prepareStatement(query);
            ps.setString(1, usuarioActual);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                dataToSendUser = rs.getString("my_it");
                dataToSendPass = rs.getString("contraseña_myit");
                if (dataToSendUser != null && !dataToSendUser.isEmpty() && dataToSendPass != null && !dataToSendPass.isEmpty()) {
                    this.setExtendedState(1);
                    String command = "C:\\selenium\\auto_myit.exe " + dataToSendUser + " " + dataToSendPass;
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
    }//GEN-LAST:event_myitActionPerformed

    private void caliexpressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caliexpressActionPerformed
        try {
            String query = "SELECT * FROM Aplicativos WHERE complemento='Cali_express'";
            Statement st = cx.conectar().createStatement();
            ResultSet rs = st.executeQuery(query);
            if (rs.next()) {
                dataToSendUser = rs.getString("usuario");
                dataToSendPass = rs.getString("contraseña");
                this.setExtendedState(1);
                String command = "C:\\selenium\\auto_cali_expres.exe " + dataToSendUser + " " + dataToSendPass;
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
                JOptionPane.showMessageDialog(null, "ERROR");
            }
        } catch (SQLException | IOException | InterruptedException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_caliexpressActionPerformed

    private void lectaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lectaActionPerformed
        try {
            String query = "SELECT contraseña FROM Aplicativos WHERE complemento='Lecta'";
            Statement st = cx.conectar().createStatement();
            ResultSet rs = st.executeQuery(query);
            if (rs.next()) {
                dataToSendPass = rs.getString("contraseña");
                this.setExtendedState(1);
                String command = "C:\\selenium\\auto_lecta.exe " + dataToSendPass;
                Process process = Runtime.getRuntime().exec(command);
                System.out.println(dataToSendPass);

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
                JOptionPane.showMessageDialog(null, "ERROR");
            }
        } catch (SQLException | IOException | InterruptedException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_lectaActionPerformed

    private void integraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_integraActionPerformed
        try {
            String query = "SELECT * FROM Aplicativos WHERE complemento='Integra'";
            Statement st = cx.conectar().createStatement();
            ResultSet rs = st.executeQuery(query);
            if (rs.next()) {
                dataToSendUser = rs.getString("usuario");
                dataToSendPass = rs.getString("contraseña");
                this.setExtendedState(1);
                String command = "C:\\selenium\\auto_integra.exe " + dataToSendUser + " " + dataToSendPass;
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
                JOptionPane.showMessageDialog(null, "ERROR");
            }
        } catch (SQLException | IOException | InterruptedException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_integraActionPerformed

    private void escritorioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_escritorioMouseEntered
        escritorio.setBackground(new Color(253, 82, 0));
    }//GEN-LAST:event_escritorioMouseEntered

    private void escritorioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_escritorioMouseExited
        escritorio.setBackground(new Color(102, 102, 255));
    }//GEN-LAST:event_escritorioMouseExited

    private void escritorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escritorioActionPerformed
        try {
            String query = "SELECT notus, contraseña_notus FROM Usuarios WHERE usuario_onelock=?";
            PreparedStatement ps = cx.conectar().prepareStatement(query);
            ps.setString(1, usuarioActual);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                dataToSendUser = rs.getString("notus");
                dataToSendPass = rs.getString("contraseña_notus");
                if (dataToSendUser != null && !dataToSendUser.isEmpty() && dataToSendPass != null && !dataToSendPass.isEmpty()) {
                    this.setExtendedState(1);
                    String command = "C:\\selenium\\auto_notus.exe " + dataToSendUser + " " + dataToSendPass;
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
    }//GEN-LAST:event_escritorioActionPerformed

    private void otpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otpActionPerformed
        this.setExtendedState(1);
    }//GEN-LAST:event_otpActionPerformed

    private void notus_osmMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_notus_osmMouseEntered
        notus_osm.setBackground(new Color(253, 82, 0));
    }//GEN-LAST:event_notus_osmMouseEntered

    private void notus_osmMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_notus_osmMouseExited
        notus_osm.setBackground(new Color(102, 102, 255));
    }//GEN-LAST:event_notus_osmMouseExited

    private void notus_osmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notus_osmActionPerformed
        try {
            String query = "SELECT notus, contraseña_notus FROM Usuarios WHERE usuario_onelock=?";
            PreparedStatement ps = cx.conectar().prepareStatement(query);
            ps.setString(1, usuarioActual);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                dataToSendUser = rs.getString("notus");
                dataToSendPass = rs.getString("contraseña_notus");
                if (dataToSendUser != null && !dataToSendUser.isEmpty() && dataToSendPass != null && !dataToSendPass.isEmpty()) {
                    this.setExtendedState(1);
                    String command = "C:\\selenium\\auto_notus.exe " + dataToSendUser + " " + dataToSendPass;
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
    }//GEN-LAST:event_notus_osmActionPerformed

    private void dimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dimeActionPerformed
        try {
            String query = "SELECT dime, contraseña_dime FROM Usuarios WHERE usuario_onelock=?";
            PreparedStatement ps = cx.conectar().prepareStatement(query);
            ps.setString(1, usuarioActual);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                dataToSendUser = rs.getString("dime");
                dataToSendPass = rs.getString("contraseña_dime");
                if (dataToSendUser != null && !dataToSendUser.isEmpty() && dataToSendPass != null && !dataToSendPass.isEmpty()) {
                    this.setExtendedState(1);
                    String command = "C:\\selenium\\auto_dime.exe " + dataToSendUser + " " + dataToSendPass;
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
    }//GEN-LAST:event_dimeActionPerformed

    private void dimeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dimeMouseEntered
        dime.setBackground(new Color(253, 82, 0));
    }//GEN-LAST:event_dimeMouseEntered

    private void dimeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dimeMouseExited
        dime.setBackground(new Color(102, 102, 255));
    }//GEN-LAST:event_dimeMouseExited

    private void peogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_peogActionPerformed
        try {
            String query = "SELECT peog, contraseña_peog FROM Usuarios WHERE usuario_onelock=?";
            PreparedStatement ps = cx.conectar().prepareStatement(query);
            ps.setString(1, usuarioActual);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                dataToSendUser = rs.getString("peog");
                dataToSendPass = rs.getString("contraseña_peog");
                if (dataToSendUser != null && !dataToSendUser.isEmpty() && dataToSendPass != null && !dataToSendPass.isEmpty()) {
                    this.setExtendedState(1);
                    String command = "C:\\selenium\\auto_peog.exe " + dataToSendUser + " " + dataToSendPass;
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
    }//GEN-LAST:event_peogActionPerformed

    private void peogMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_peogMouseEntered
        peog.setBackground(new Color(253, 82, 0));
    }//GEN-LAST:event_peogMouseEntered

    private void peogMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_peogMouseExited
        peog.setBackground(new Color(102, 102, 255));
    }//GEN-LAST:event_peogMouseExited

    private void contactoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contactoMouseEntered
        contacto.setBackground(new Color(253, 82, 0));
    }//GEN-LAST:event_contactoMouseEntered

    private void contactoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contactoMouseExited
        contacto.setBackground(new Color(102, 102, 255));
    }//GEN-LAST:event_contactoMouseExited

    private void contactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactoActionPerformed
        try {
            String query = "SELECT contacto, contraseña_contacto FROM Usuarios WHERE usuario_onelock=?";
            PreparedStatement ps = cx.conectar().prepareStatement(query);
            ps.setString(1, usuarioActual);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                dataToSendUser = rs.getString("contacto");
                dataToSendPass = rs.getString("contraseña_contacto");
                if (dataToSendUser != null && !dataToSendUser.isEmpty() && dataToSendPass != null && !dataToSendPass.isEmpty()) {
                    this.setExtendedState(1);
                    String command = "C:\\selenium\\auto_contacto.exe " + dataToSendUser + " " + dataToSendPass;
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
    }//GEN-LAST:event_contactoActionPerformed

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
            java.util.logging.Logger.getLogger(onelock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(onelock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(onelock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(onelock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JButton agendamiento;
    private javax.swing.JButton biometrica;
    private javax.swing.JButton caliexpress;
    private javax.swing.JButton contacto;
    private javax.swing.JButton crm;
    private javax.swing.JButton dime;
    private javax.swing.JButton escritorio;
    private javax.swing.JButton id_vision;
    private javax.swing.JButton integra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton lecta;
    private javax.swing.JButton myapp;
    private javax.swing.JButton myit;
    private javax.swing.JButton notus;
    private javax.swing.JButton notus_osm;
    private javax.swing.JButton otp;
    private javax.swing.JPanel panel;
    private javax.swing.JButton peog;
    private javax.swing.JButton poliedro_r1;
    private javax.swing.JButton poliedro_r2;
    private javax.swing.JButton poliedro_r3;
    private javax.swing.JButton poliedro_r4;
    private javax.swing.JButton visor;
    // End of variables declaration//GEN-END:variables
}
