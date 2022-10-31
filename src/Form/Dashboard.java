package Form;


import Config.koneksi;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import static java.lang.Thread.sleep;
import java.sql.Connection;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author windows7
 */
public class Dashboard extends javax.swing.JFrame {
    koneksi con = new koneksi();
    DefaultTableModel model;
    ResultSet rs;
    
    JasperReport jasrep;
    JasperPrint jaspri;
    Map map = new HashMap();
    JasperDesign design;
    
    DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    Calendar cal = Calendar.getInstance();
    /**
     * Creates new form AllBooks
     */
    public Dashboard() {
        super("Dashboard");
        initComponents();
        tabel();
        hidetabel();
   
         this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowActivated(WindowEvent e) {
                tabel();
            }
        });
    }

        public void windowActivated(WindowEvent e) {
        System.out.println("Window Activated Event");
    }

    public void windowDeactivated(WindowEvent e) {
        System.out.println("Window Deactivated Event");
    }
    
    private void tabel() {
        String[] judul = {"ID","Kode Barang","Nama","Keterangan","Kondisi","Jumlah","Tanggal Masuk","Jenis","Ruang"};
        model = new DefaultTableModel(judul,0);
        jTable1.setModel(model);
        String sql = "SELECT inventaris.id_inventaris , inventaris.kode_inventaris , inventaris.nama ,inventaris.keterangan , inventaris.kondisi , inventaris.jumlah , inventaris.tanggal_register , ruang.nama_ruang , jenis.nama_jenis from inventaris INNER JOIN ruang USING (id_ruang) INNER JOIN jenis USING (id_jenis) ";
       
       try {
           rs = con.ambilData(sql);
           
           while(rs.next()) {
               String id = rs.getString("id_inventaris");
               String ruang = rs.getString("kode_inventaris");
               String nama = rs.getString("nama");         
               String ket = rs.getString("keterangan");   
               String kondisi = rs.getString("kondisi");               
               String jumlah = rs.getString("jumlah");   
                String tglmasuk = rs.getString("tanggal_register");               
               String idjenis = rs.getString("nama_jenis");
               String idruang = rs.getString("nama_ruang");
              
               
               String[] data = {id,ruang,nama,ket,kondisi,jumlah,tglmasuk,idjenis,idruang};
               model.addRow(data);
           }
           
       }catch(Exception e) {
           System.out.println(e);
       }
    }

    private void hidetabel() {
     jLabel5.hide();
     jLabel6.hide();
     jLabel7.hide();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBackground(new java.awt.Color(153, 143, 182));
        jTable1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTable1.setForeground(new java.awt.Color(153, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable1);

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 270));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 830, 310));

        jLabel8.setText("CARI");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, -1, 30));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 80, 210, 30));

        kGradientPanel2.setFocusable(false);
        kGradientPanel2.setkEndColor(new java.awt.Color(153, 143, 182));
        kGradientPanel2.setkStartColor(new java.awt.Color(255, 255, 255));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Peminjaman");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("Pengembalian");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setText("Laporan");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(316, Short.MAX_VALUE))
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(kGradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 70));

        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, -1, -1));

        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, -1, -1));

        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, -1, -1));

        jLabel10.setText("CARI");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 80, 40, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

    }//GEN-LAST:event_jTable1MouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        String[] judul = {"ID","Kode Barang","Nama","Keterangan","Kondisi","Jumlah","Tanggal Masuk","Jenis","Ruang"};
        model = new DefaultTableModel(judul,0);
        jTable1.setModel(model);
        String sql = "SELECT inventaris.id_inventaris , inventaris.kode_inventaris , inventaris.nama ,inventaris.keterangan , inventaris.kondisi , inventaris.jumlah , inventaris.tanggal_register , ruang.nama_ruang , jenis.nama_jenis from inventaris INNER JOIN ruang USING (id_ruang) INNER JOIN jenis USING (id_jenis) where kode_inventaris like '%"+jTextField1.getText()+"%' or nama like '%"+jTextField1.getText()+"%' ";
       
       try {
           rs = con.ambilData(sql);
           
           while(rs.next()) {
               String id = rs.getString("id_inventaris");
               String ruang = rs.getString("kode_inventaris");
               String nama = rs.getString("nama");         
               String ket = rs.getString("keterangan");   
               String kondisi = rs.getString("kondisi");               
               String jumlah = rs.getString("jumlah");   
                String tglmasuk = rs.getString("tanggal_register");               
               String idjenis = rs.getString("nama_jenis");
               String idruang = rs.getString("nama_ruang");
              
               
               String[] data = {id,ruang,nama,ket,kondisi,jumlah,tglmasuk,idjenis,idruang};
               model.addRow(data);
           }
           
       }catch(Exception e) {
           System.out.println(e);
       }
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        String[] judul = {"ID","Kode Barang","Nama","Keterangan","Kondisi","Jumlah","Tanggal Masuk","Jenis","Ruang"};
        model = new DefaultTableModel(judul,0);
        jTable1.setModel(model);
        String sql = "SELECT inventaris.id_inventaris , inventaris.kode_inventaris , inventaris.nama ,inventaris.keterangan , inventaris.kondisi , inventaris.jumlah , inventaris.tanggal_register , ruang.nama_ruang , jenis.nama_jenis from inventaris INNER JOIN ruang USING (id_ruang) INNER JOIN jenis USING (id_jenis) where kode_inventaris like '%"+jTextField1.getText()+"%' or nama like '%"+jTextField1.getText()+"%' ";
       
       try {
           rs = con.ambilData(sql);
           
           while(rs.next()) {
               String id = rs.getString("id_inventaris");
               String ruang = rs.getString("kode_inventaris");
               String nama = rs.getString("nama");         
               String ket = rs.getString("keterangan");   
               String kondisi = rs.getString("kondisi");               
               String jumlah = rs.getString("jumlah");   
                String tglmasuk = rs.getString("tanggal_register");               
               String idjenis = rs.getString("nama_jenis");
               String idruang = rs.getString("nama_ruang");
              
               
               String[] data = {id,ruang,nama,ket,kondisi,jumlah,tglmasuk,idjenis,idruang};
               model.addRow(data);
           }
           
       }catch(Exception e) {
           System.out.println(e);
       }
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Peminjaman().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new Pengembalian2(this, rootPaneCheckingEnabled).show();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new Laporan().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private keeptoo.KGradientPanel kGradientPanel2;
    // End of variables declaration//GEN-END:variables
}
