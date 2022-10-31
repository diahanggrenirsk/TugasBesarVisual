package Form;
import Config.koneksi;
import static java.lang.Thread.sleep;
import java.util.Calendar;
import java.util.GregorianCalendar;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author windows7
 */
public class Home extends javax.swing.JFrame {
    koneksi con = new koneksi();
    /**
     * Creates new form Home
     */
    public Home() {
        super("Inventaris System");
        initComponents();
        waktu();
        ChkMaster.setVisible(false);
        ChkTransaksi.setVisible(false);
        jenis.setVisible(false);
        jPanel2.setVisible(false);
        jPanel3.setVisible(false);
        ruangan.setVisible(false);
        inventaris.setVisible(false);
        detail.setVisible(false);
        jScrollPane3.setViewportView(new Dashboard().getContentPane());
        txtnama1.setVisible(false);
        txtnama.setVisible(false);
    }
    
    private void waktu() {
        
        Thread data;
        data = new Thread(){
           public void run(){
               for(;;){
                   
                   Calendar cal = new GregorianCalendar();
                   
                   int jam = cal.get(Calendar.HOUR);
                   int menit = cal.get(Calendar.MINUTE);
                   int detikna = cal.get(Calendar.SECOND);
                   int AM_PM = cal.get(Calendar.AM_PM);
                   
                   String night = "";
                   if(AM_PM == 1 ) {
                       night = "PM" ;
                   } else {
                       night = "AM";
                   }
                   String waktu = "PUKUL : " +jam + ":" + menit + ":" + detikna + " " + night ;
                   jLabel11.setText(waktu);
                   
                   try {
                       sleep(1000);
                   } catch (Exception e) {
                       System.out.println(e);
                   }
                   
               }
               
           }
       };
        data.start();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nama = new javax.swing.JLabel();
        email1 = new javax.swing.JLabel();
        user1 = new javax.swing.JLabel();
        txtnama = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        ChkMenu = new javax.swing.JCheckBox();
        ChkMaster = new javax.swing.JCheckBox();
        ChkTransaksi = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jenis = new javax.swing.JButton();
        inventaris = new javax.swing.JButton();
        ruangan = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        detail = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtnama1 = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();

        nama.setText("jLabel6");

        email1.setText("jLabel6");

        user1.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtnama.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        txtnama.setForeground(new java.awt.Color(255, 255, 255));
        txtnama.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnama.setBorder(null);
        txtnama.setEnabled(false);
        txtnama.setOpaque(false);
        txtnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnamaActionPerformed(evt);
            }
        });
        getContentPane().add(txtnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 50, 210, 20));

        jLabel1.setBackground(new java.awt.Color(0, 204, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 141, 230));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INVENTARIS SYSTEM");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 70));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 11, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 74, 1000, 12));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 11, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 100, 20));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jScrollPane3.setViewportView(jPanel1);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 850, 450));

        ChkMenu.setBackground(new java.awt.Color(153, 143, 182));
        ChkMenu.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        ChkMenu.setForeground(new java.awt.Color(255, 255, 255));
        ChkMenu.setText(".: Menu            ");
        ChkMenu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        ChkMenu.setBorderPainted(true);
        ChkMenu.setBorderPaintedFlat(true);
        ChkMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ChkMenu.setFocusPainted(false);
        ChkMenu.setFocusable(false);
        ChkMenu.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        ChkMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/uparrow2_m.png"))); // NOI18N
        ChkMenu.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/uparrow2_m.png"))); // NOI18N
        ChkMenu.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/downarrow2.png"))); // NOI18N
        ChkMenu.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/downarrow2.png"))); // NOI18N
        ChkMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChkMenuMouseClicked(evt);
            }
        });
        ChkMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkMenuActionPerformed(evt);
            }
        });
        getContentPane().add(ChkMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 130, 30));

        ChkMaster.setBackground(new java.awt.Color(153, 143, 182));
        ChkMaster.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        ChkMaster.setForeground(new java.awt.Color(255, 255, 255));
        ChkMaster.setText(".: Master     ");
        ChkMaster.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        ChkMaster.setBorderPainted(true);
        ChkMaster.setBorderPaintedFlat(true);
        ChkMaster.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ChkMaster.setFocusPainted(false);
        ChkMaster.setFocusable(false);
        ChkMaster.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        ChkMaster.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/uparrow2_m.png"))); // NOI18N
        ChkMaster.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/uparrow2_m.png"))); // NOI18N
        ChkMaster.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/downarrow2.png"))); // NOI18N
        ChkMaster.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/downarrow2.png"))); // NOI18N
        ChkMaster.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChkMasterMouseClicked(evt);
            }
        });
        ChkMaster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkMasterActionPerformed(evt);
            }
        });
        getContentPane().add(ChkMaster, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 110, 30));

        ChkTransaksi.setBackground(new java.awt.Color(153, 143, 182));
        ChkTransaksi.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        ChkTransaksi.setForeground(new java.awt.Color(255, 255, 255));
        ChkTransaksi.setText(".: Transaksi ");
        ChkTransaksi.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        ChkTransaksi.setBorderPainted(true);
        ChkTransaksi.setBorderPaintedFlat(true);
        ChkTransaksi.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ChkTransaksi.setFocusPainted(false);
        ChkTransaksi.setFocusable(false);
        ChkTransaksi.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        ChkTransaksi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/uparrow2_m.png"))); // NOI18N
        ChkTransaksi.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/uparrow2_m.png"))); // NOI18N
        ChkTransaksi.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/downarrow2.png"))); // NOI18N
        ChkTransaksi.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/downarrow2.png"))); // NOI18N
        ChkTransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChkTransaksiMouseClicked(evt);
            }
        });
        ChkTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkTransaksiActionPerformed(evt);
            }
        });
        getContentPane().add(ChkTransaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 110, 30));

        jPanel2.setBackground(new java.awt.Color(153, 143, 182));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jenis.setText("JENIS");
        jenis.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jenisActionPerformed(evt);
            }
        });
        jPanel2.add(jenis, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 90, 20));

        inventaris.setText("INVENTARIS");
        inventaris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inventarisActionPerformed(evt);
            }
        });
        jPanel2.add(inventaris, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 70, 100, 20));

        ruangan.setText("RUANGAN");
        ruangan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ruangan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ruanganActionPerformed(evt);
            }
        });
        jPanel2.add(ruangan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, 20));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 110, 100));

        jPanel3.setBackground(new java.awt.Color(153, 143, 182));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        detail.setText("DETAIL");
        detail.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        detail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detailActionPerformed(evt);
            }
        });
        jPanel3.add(detail, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, 20));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 110, 40));

        jLabel11.setFont(new java.awt.Font("Ravie", 0, 11)); // NOI18N
        jLabel11.setText("jLabel11");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 0, 230, 40));

        txtnama1.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        txtnama1.setForeground(new java.awt.Color(255, 255, 255));
        txtnama1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnama1.setBorder(null);
        txtnama1.setEnabled(false);
        txtnama1.setOpaque(false);
        txtnama1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnama1ActionPerformed(evt);
            }
        });
        getContentPane().add(txtnama1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 50, 210, 20));

        jMenu1.setText("File");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem2.setText("Logout");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem1.setText("Exit");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("View");
        jMenu3.setToolTipText("");

        jMenuItem3.setText("Profile");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenu2.setText("List");

        jMenuItem4.setText("List of Borrowers");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("Employee List");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenu3.add(jMenu2);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("About");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        setVisible(false);
        Login ob = new Login();
        ob.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void ruanganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ruanganActionPerformed
        jScrollPane3.setViewportView(new ruangan().getContentPane());
    }//GEN-LAST:event_ruanganActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        About ob = new About();
        ob.setVisible(true);
    }//GEN-LAST:event_jMenu4MouseClicked

    private void jenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jenisActionPerformed
        // TODO add your handling code here:
       jScrollPane3.setViewportView(new Jenisbarang().getContentPane());
    }//GEN-LAST:event_jenisActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        try{
            String sql="select petugas.username, nama_petugas from petugas";
            java.sql.ResultSet res = con.ambilData(sql);
            if(res.next()){
                Form.Profile ma = new Form.Profile();
                ma.setVisible(true);
                Form.Profile.user.setText(res.getString("petugas.username"));
                Form.Profile.userJl.setText(Form.Home.user1.getText());
                Form.Profile.nama.setText(res.getString("petugas.nama_petugas"));
                Form.Profile.nameJl.setText(Form.Home.nama.getText());
            }
    }catch(Exception e){
            
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void inventarisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventarisActionPerformed
        // TODO add your handling code here:
        jScrollPane3.setViewportView(new Inventaris().getContentPane());
    }//GEN-LAST:event_inventarisActionPerformed

    private void ChkMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChkMenuMouseClicked
        // TODO add your handling code here:
        if(ChkMenu.isSelected()){
            ChkMaster.setVisible(true);
            ChkTransaksi.setVisible(true);
        } else {
            ChkMaster.setVisible(false);
            ChkTransaksi.setVisible(false);
            jPanel2.setVisible(false);
            jPanel3.setVisible(false);
            detail.setVisible(false);
            ruangan.setVisible(false);
            jenis.setVisible(false);
            inventaris.setVisible(false);
        }
    }//GEN-LAST:event_ChkMenuMouseClicked

    private void ChkMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkMenuActionPerformed
        jScrollPane3.setViewportView(new Dashboard().getContentPane());
    }//GEN-LAST:event_ChkMenuActionPerformed

    private void ChkMasterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChkMasterMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkMasterMouseClicked

    private void ChkMasterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkMasterActionPerformed
        // TODO add your handling code here:
        if(ChkMaster.isSelected()){
            jPanel2.setVisible(true);
            ruangan.setVisible(true);
            jenis.setVisible(true);
            inventaris.setVisible(true);
        } else {
            jPanel2.setVisible(false);
            ruangan.setVisible(false);
            jenis.setVisible(false);
            inventaris.setVisible(false);
        }
    }//GEN-LAST:event_ChkMasterActionPerformed

    private void ChkTransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChkTransaksiMouseClicked
        // TODO add your handling code here:
        if(ChkTransaksi.isSelected()){
            detail.setVisible(true);
            jPanel3.setVisible(true);
        } else {
            jPanel3.setVisible(false);
            detail.setVisible(false);
        }
    }//GEN-LAST:event_ChkTransaksiMouseClicked

    private void ChkTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkTransaksiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkTransaksiActionPerformed

    private void detailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detailActionPerformed
        // TODO add your handling code here:
        jScrollPane3.setViewportView(new Detail().getContentPane());
    }//GEN-LAST:event_detailActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        //setVisible(false);
        new DaftarPinjam().setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        DaftarPegawai1 ob = new DaftarPegawai1();
        ob.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void txtnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnamaActionPerformed

    private void txtnama1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnama1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnama1ActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox ChkMaster;
    private javax.swing.JCheckBox ChkMenu;
    private javax.swing.JCheckBox ChkTransaksi;
    private javax.swing.JButton detail;
    public static javax.swing.JLabel email1;
    private javax.swing.JButton inventaris;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jenis;
    public static javax.swing.JLabel nama;
    private javax.swing.JButton ruangan;
    public static javax.swing.JTextField txtnama;
    public static javax.swing.JTextField txtnama1;
    public static javax.swing.JLabel user1;
    // End of variables declaration//GEN-END:variables
}