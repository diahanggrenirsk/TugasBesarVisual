
package Form;

import Config.koneksi;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Pengembalian2 extends javax.swing.JDialog {
    koneksi con = new koneksi();
    
    public Pengembalian2(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        tabel();
        barangkembali();
    }
    
    DateFormat dateFormat = new SimpleDateFormat("EEEE, dd MMM yyyy");
    Calendar cal = Calendar.getInstance();
    
    DefaultTableModel model , model2;
    ResultSet rs;
    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(852, 524));

        jPanel1.setBackground(new java.awt.Color(153, 143, 182));

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Pengembalian");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setLayout(new java.awt.CardLayout());

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BOTTOM));
        jPanel3.setPreferredSize(new java.awt.Dimension(832, 416));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBackground(new java.awt.Color(153, 143, 182));
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
        jScrollPane1.setViewportView(jTable1);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 54, 808, 350));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        jPanel3.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 13, 177, 30));

        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Data Tidak Di Temukan");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 21, -1, -1));

        jPanel2.add(jPanel3, "card2");

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setBackground(new java.awt.Color(153, 143, 182));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTable2KeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 54, 808, 350));

        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });
        jPanel4.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 13, 177, 30));

        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("Data Tidak Di Temukan");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 21, -1, -1));

        jPanel2.add(jPanel4, "card3");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- PILIH OPSI-", "DATA BARANG YANG DIPINJAM", "DATA BARANG YANG DIKEMBALIKAN" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Kembalikan");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 832, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //pengembalian 
          String sql = "select * from inventaris where kode_inventaris='"+model.getValueAt(jTable1.getSelectedRow(),2)+"'" ;  
          String kembalikan = "Kembali";
          int tabel = jTable1.getSelectedRow();
          int id = Integer.parseInt(model.getValueAt(tabel, 0).toString());
          int konfirmasi = JOptionPane.showConfirmDialog(this, "Apakah Barang Akan Di Kembalikan?" ,"Pemberitahuan", JOptionPane.YES_NO_OPTION);
     if( konfirmasi == 0 ) {
          try {
           rs = con.ambilData(sql);
           if(rs.next()) {
               int jumlahpinjam = rs.getInt("jumlah_pinjam");
               int jumlahpinjamtb =  Integer.parseInt(model.getValueAt(jTable1.getSelectedRow(),5).toString());
               int hasil = jumlahpinjam - jumlahpinjamtb;
               con.simpanData("update inventaris set jumlah_pinjam='"+hasil+"' where kode_inventaris='"+model.getValueAt(jTable1.getSelectedRow(),2)+"' ");
               System.out.println( jumlahpinjam+ " "+ jumlahpinjamtb+" "+ hasil);
               System.out.println("Berhasil Edit Jumlah");
             
           }
               } catch (Exception e) {
              System.out.println(e);           
               }
      try {
        con.simpanData("update peminjaman set status_peminjaman='"+kembalikan+"' where id_peminjaman='"+id+"' "); 
       
        System.out.println("Berhasil Edit Status");
        tabel(); 
       
           }catch(Exception e) {
        System.out.println(e);
           }
                  tabel();
    } else {
             
         }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
       if (jComboBox1.getSelectedItem() == "DATA BARANG YANG DIPINJAM") {
             jPanel2.removeAll();
        jPanel2.repaint();
        jPanel2.revalidate();

        jPanel2.add(jPanel3);
        jPanel2.repaint();
        jPanel2.revalidate();
        jButton1.setVisible(true);
        tabel();
        barangkembali();
       } else if (jComboBox1.getSelectedItem() == "DATA BARANG YANG DIKEMBALIKAN") {
         jPanel2.removeAll();
        jPanel2.repaint();
        jPanel2.revalidate();

        jPanel2.add(jPanel4);
        jPanel2.repaint();
        jPanel2.revalidate();
        tabel();
        barangkembali();
        jButton1.setVisible(false);
           
       } else {
           
       }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        barangkembali();
    }//GEN-LAST:event_jTextField2KeyTyped

    private void jTable2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable2KeyTyped

    }//GEN-LAST:event_jTable2KeyTyped

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        tabel();
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(Pengembalian2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pengembalian2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pengembalian2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pengembalian2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Pengembalian2 dialog = new Pengembalian2(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

    private void tabel() {
        String[] judul = {"Id","Identitas Peminjam", "Kode Barang","Tanggal Pinjam","Tanggal Kembali","Jumlah Pinjam","Status Peminjaman"};
        model = new DefaultTableModel(judul,0);
        jTable1.setModel(model);
        
        
        String sql = "select * from peminjaman where status_peminjaman='Dipinjam' and identitas_peminjam like '%"+jTextField1.getText()+"%'";
        
        try {
            rs = con.ambilData(sql); 
            while(rs.next()) {
                String idpinjam = rs.getString("id_peminjaman");
                String identitas = rs.getString("identitas_peminjam");
                String kode = rs.getString("kode_inventaris");
                String tglpinjam = rs.getString("tanggal_pinjam");
                String tglkembali = rs.getString("tanggal_kembali");
                String jumlahpinjam = rs.getString("jumlah_pinjam");
                String status = rs.getString("status_peminjaman");
              
              
                
                
                String[] data = {idpinjam,identitas,kode,tglpinjam,tglkembali,jumlahpinjam,status};
                model.addRow(data);
               
            }
             
            int tabel = jTable1.getRowCount();
            if (tabel < 1) {
                jLabel3.setVisible(true);
            } else {
                jLabel3.setVisible(false);
            }
        
    }catch(Exception e) {
            System.out.println(e);
    
    }
    }

    private void barangkembali() {
        String[] judul = {"Id","Identitas Peminjam", "Kode Barang","Tanggal Pinjam","Tanggal Kembali","Jumlah Pinjam","Status Peminjaman"};
        model2 = new DefaultTableModel(judul,0);
        jTable2.setModel(model2);
        
        
        String sql = "select * from peminjaman where status_peminjaman='Kembali' and identitas_peminjam like '%"+jTextField2.getText()+"%' ";
        
        try {
            rs = con.ambilData(sql); 
            while(rs.next()) {
                String idpinjam = rs.getString("id_peminjaman");
                String identitas = rs.getString("identitas_peminjam");
                String kode = rs.getString("kode_inventaris");
                String tglpinjam = rs.getString("tanggal_pinjam");
                String tglkembali = rs.getString("tanggal_kembali");
                String jumlahpinjam = rs.getString("jumlah_pinjam");
                String status = rs.getString("status_peminjaman");
              
              
                
                
                String[] data = {idpinjam,identitas,kode,tglpinjam,tglkembali,jumlahpinjam,status};
                model2.addRow(data);
               
            }
              int tabel = jTable2.getRowCount();
            if (tabel < 1) {
                jLabel5.setVisible(true);
            } else {
                jLabel5.setVisible(false);
            }
            
        
    }catch(Exception e) {
            System.out.println(e);
    
    }
    }
    
}
