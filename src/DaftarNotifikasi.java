/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Felix
 */
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Vector;
import javax.swing.*;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.*;
public class DaftarNotifikasi extends javax.swing.JFrame {
    /**
     * Creates new form TampilkanReminder
     */
    private String sql;
    public DaftarNotifikasi() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblNamaUser = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtabDaftarNotifikasi = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        menuBar1 = new javax.swing.JMenuBar();
        jMenuManajemen = new javax.swing.JMenu();
        menuItemTambahPemasukan = new javax.swing.JMenuItem();
        menuItemTambahPengeluaran = new javax.swing.JMenuItem();
        menuItemTambahReminderPemasukan = new javax.swing.JMenuItem();
        menuItemTambahReminderPengeluaran = new javax.swing.JMenuItem();
        jMenuTampilkan = new javax.swing.JMenu();
        menuItemHistory = new javax.swing.JMenuItem();
        menuItemReport = new javax.swing.JMenuItem();
        jMenuUser = new javax.swing.JMenu();
        menuItemBuatUserBaru = new javax.swing.JMenuItem();
        menuItemGantiPassword = new javax.swing.JMenuItem();
        menuItemLogout = new javax.swing.JMenuItem();
        jMenuAbout = new javax.swing.JMenu();
        menuItemDeveloper = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Money Manager - Daftar Notifikasi");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setText("STUDENT MONEY MANAGER");

        lblNamaUser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNamaUser.setText("Welcome, ");

        jtabDaftarNotifikasi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kategori", "Deadline", "Keterangan"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jtabDaftarNotifikasi);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("Daftar Notifikasi");

        jMenuManajemen.setText("Manajemen");

        menuItemTambahPemasukan.setText("Tambah Pemasukan");
        menuItemTambahPemasukan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemTambahPemasukanActionPerformed(evt);
            }
        });
        jMenuManajemen.add(menuItemTambahPemasukan);

        menuItemTambahPengeluaran.setText("Tambah Pengeluaran");
        menuItemTambahPengeluaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemTambahPengeluaranActionPerformed(evt);
            }
        });
        jMenuManajemen.add(menuItemTambahPengeluaran);

        menuItemTambahReminderPemasukan.setText("Tambah Reminder Pemasukan");
        menuItemTambahReminderPemasukan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemTambahReminderPemasukanActionPerformed(evt);
            }
        });
        jMenuManajemen.add(menuItemTambahReminderPemasukan);

        menuItemTambahReminderPengeluaran.setText("Tambah Reminder Pengeluaran");
        menuItemTambahReminderPengeluaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemTambahReminderPengeluaranActionPerformed(evt);
            }
        });
        jMenuManajemen.add(menuItemTambahReminderPengeluaran);

        menuBar1.add(jMenuManajemen);

        jMenuTampilkan.setText("Tampilkan");

        menuItemHistory.setText("History");
        menuItemHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemHistoryActionPerformed(evt);
            }
        });
        jMenuTampilkan.add(menuItemHistory);

        menuItemReport.setText("Report");
        menuItemReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemReportActionPerformed(evt);
            }
        });
        jMenuTampilkan.add(menuItemReport);

        menuBar1.add(jMenuTampilkan);

        jMenuUser.setText("User");

        menuItemBuatUserBaru.setText("Buat user baru");
        menuItemBuatUserBaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemBuatUserBaruActionPerformed(evt);
            }
        });
        jMenuUser.add(menuItemBuatUserBaru);

        menuItemGantiPassword.setText("Ganti password");
        menuItemGantiPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemGantiPasswordActionPerformed(evt);
            }
        });
        jMenuUser.add(menuItemGantiPassword);

        menuItemLogout.setText("Logout");
        menuItemLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemLogoutActionPerformed(evt);
            }
        });
        jMenuUser.add(menuItemLogout);

        menuBar1.add(jMenuUser);

        jMenuAbout.setText("About");

        menuItemDeveloper.setText("Developer");
        jMenuAbout.add(menuItemDeveloper);

        menuBar1.add(jMenuAbout);

        setJMenuBar(menuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNamaUser)
                            .addComponent(jLabel1))
                        .addGap(190, 190, 190))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addContainerGap(48, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNamaUser)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setJTabDaftarNotifikasiColumnWidth(){
        jtabDaftarNotifikasi.getColumnModel().getColumn(0).setPreferredWidth(50);
        jtabDaftarNotifikasi.getColumnModel().getColumn(1).setPreferredWidth(65);
        jtabDaftarNotifikasi.getColumnModel().getColumn(2).setPreferredWidth(180);
    }
    
    private void loadNotifikasi(){
        Calendar cal=Calendar.getInstance();
        DefaultTableModel model=(DefaultTableModel)jtabDaftarNotifikasi.getModel();
        model.setRowCount(0);
        //load reminder pengeluaran sekali saja
        try{
            Connection con=ModuleDB.connectDB();
            Statement stmt=con.createStatement();
            sql="SELECT k.kategori,strftime('%d',r.tanggal_deadline_sekali) AS 'tgl',strftime('%m',r.tanggal_deadline_sekali) AS 'bln',strftime('%Y',r.tanggal_deadline_sekali) AS 'thn',r.keterangan FROM reminder_pengeluaran r,kategori_reminder k WHERE r.id_kategori_reminder=1 AND r.id_kategori_reminder=k.id_kategori_reminder AND DATETIME('now')  >= r.tanggal_notifikasi_sekali AND DATETIME('now') <= r.tanggal_deadline_sekali AND id_user="+ModuleDB.idUser;
            ResultSet result=stmt.executeQuery(sql);
            while(result.next()){
                String tgl=result.getString("tgl");
                String bln=result.getString("bln");
                String thn=result.getString("thn");
                String tanggalDeadlineLengkap=tgl+"-"+bln+"-"+thn;
                Vector row=new Vector();
                row.add(result.getString("kategori"));
                row.add(tanggalDeadlineLengkap);
                row.add(result.getString("keterangan"));
                model.addRow(row);
            }
            //load reminder pengeluaran mingguan
            int idHariSkrg=cal.get(Calendar.DAY_OF_WEEK);
            if(idHariSkrg==1)
                idHariSkrg=7;
            else
                idHariSkrg-=1;
            sql="SELECT k.kategori,r.id_hari_notifikasi_mingguan,r.id_hari_deadline_mingguan,r.keterangan FROM reminder_pengeluaran r,kategori_reminder k WHERE r.id_kategori_reminder=2 AND r.id_kategori_reminder=k.id_kategori_reminder AND id_user="+ModuleDB.idUser;
            result=stmt.executeQuery(sql);
            while(result.next()){
                int idHariNotifikasi=result.getInt("id_hari_notifikasi_mingguan");
                int idHariDeadline=result.getInt("id_hari_deadline_mingguan");
                if(idHariNotifikasi<=idHariDeadline){
                    if(idHariSkrg>=idHariNotifikasi && idHariSkrg<=idHariDeadline){
                        String namaHariDeadline=null;
                        if(idHariDeadline==1)
                            namaHariDeadline="Senin";
                        else if(idHariDeadline==2)
                            namaHariDeadline="Selasa";
                        else if(idHariDeadline==3)
                            namaHariDeadline="Rabu";
                        else if(idHariDeadline==4)
                            namaHariDeadline="Kamis";
                        else if(idHariDeadline==5)
                            namaHariDeadline="Jumat";
                        else if(idHariDeadline==6)
                            namaHariDeadline="Sabtu";
                        else if(idHariDeadline==7)
                            namaHariDeadline="Minggu";
                        Vector row=new Vector();
                        row.add(result.getString("kategori"));
                        row.add(namaHariDeadline);
                        row.add(result.getString("keterangan"));
                        model.addRow(row);
                    }
                }
                else if(idHariNotifikasi>idHariDeadline){
                    if((idHariSkrg>=idHariNotifikasi && idHariSkrg<=7) || (idHariSkrg>=1 && idHariSkrg<=idHariDeadline)){
                        String namaHariDeadline=null;
                        if(idHariDeadline==1)
                            namaHariDeadline="Senin";
                        else if(idHariDeadline==2)
                            namaHariDeadline="Selasa";
                        else if(idHariDeadline==3)
                            namaHariDeadline="Rabu";
                        else if(idHariDeadline==4)
                            namaHariDeadline="Kamis";
                        else if(idHariDeadline==5)
                            namaHariDeadline="Jumat";
                        else if(idHariDeadline==6)
                            namaHariDeadline="Sabtu";
                        else if(idHariDeadline==7)
                            namaHariDeadline="Minggu";
                        Vector row=new Vector();
                        row.add(result.getString("kategori"));
                        row.add(namaHariDeadline);
                        row.add(result.getString("keterangan"));
                        model.addRow(row);
                    }
                }
            }
            //load reminder pengeluaran bulanan
            DateFormat dateFormat=new SimpleDateFormat("dd");
            int tglSkrg=Integer.parseInt(dateFormat.format(cal.getTime()));
            sql="SELECT k.kategori,r.tanggal_notifikasi_bulanan,r.tanggal_deadline_bulanan,r.keterangan FROM reminder_pengeluaran r,kategori_reminder k WHERE r.id_kategori_reminder=3 AND r.id_kategori_reminder=k.id_kategori_reminder AND id_user="+ModuleDB.idUser;
            result=stmt.executeQuery(sql);
            while(result.next()){
                int tglNotifikasi=result.getInt("tanggal_notifikasi_bulanan");
                int tglDeadline=result.getInt("tanggal_deadline_bulanan");
                if(tglNotifikasi<=tglDeadline){
                    if(tglSkrg>=tglNotifikasi && tglSkrg<=tglDeadline){
                        dateFormat=new SimpleDateFormat("MM-YYYY");
                        String tmpBulanDanTahun=dateFormat.format(cal.getTime());
                        String tglDeadlineLengkap=tglDeadline+"-"+tmpBulanDanTahun;
                        Vector row=new Vector();
                        row.add(result.getString("kategori"));
                        row.add(tglDeadlineLengkap);
                        row.add(result.getString("keterangan"));
                        model.addRow(row);
                    }
                }
                else if(tglNotifikasi>tglDeadline){
                    if(tglSkrg>=tglNotifikasi && tglSkrg<=31){
                        dateFormat=new SimpleDateFormat("MM");
                        int tmpBulan=Integer.parseInt(dateFormat.format(cal.getTime()))+1;
                        dateFormat=new SimpleDateFormat("YYYY");
                        int tmpTahun=Integer.parseInt(dateFormat.format(cal.getTime()));
                        if(tmpBulan==13){
                            tmpBulan=1;
                            tmpTahun++;
                        }
                        String tglDeadlineLengkap=tglDeadline+"-"+tmpBulan+"-"+tmpTahun;
                        Vector row=new Vector();
                        row.add(result.getString("kategori"));
                        row.add(tglDeadlineLengkap);
                        row.add(result.getString("keterangan"));
                        model.addRow(row);
                    }
                    else if(tglSkrg>=1 && tglSkrg<=tglDeadline){
                        dateFormat=new SimpleDateFormat("MM-YYYY");
                        String tmpBulanDanTahun=dateFormat.format(cal.getTime());
                        String tglDeadlineLengkap=tglDeadline+"-"+tmpBulanDanTahun;
                        Vector row=new Vector();
                        row.add(result.getString("kategori"));
                        row.add(tglDeadlineLengkap);
                        row.add(result.getString("keterangan"));
                        model.addRow(row);
                    }
                }
            }
            con.close();
            jtabDaftarNotifikasi.setModel(model);
        }
        catch(SQLException e){
            showMessageDialog(null,e.getMessage());
        }
    }
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setLocationRelativeTo(null);
        lblNamaUser.setText("Welcome, "+ModuleDB.nama);
        setJTabDaftarNotifikasiColumnWidth();
        loadNotifikasi();
    }//GEN-LAST:event_formWindowOpened

    private void menuItemBuatUserBaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemBuatUserBaruActionPerformed
        BuatUserBaru formBuatUserBaru=new BuatUserBaru();
        formBuatUserBaru.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        formBuatUserBaru.setVisible(true);
    }//GEN-LAST:event_menuItemBuatUserBaruActionPerformed

    private void menuItemTambahPemasukanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemTambahPemasukanActionPerformed
        TambahPemasukan formTambahPemasukan=new TambahPemasukan();
        formTambahPemasukan.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        formTambahPemasukan.setVisible(true);
    }//GEN-LAST:event_menuItemTambahPemasukanActionPerformed

    private void menuItemTambahPengeluaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemTambahPengeluaranActionPerformed
        TambahPengeluaran formTambahPengeluaran=new TambahPengeluaran();
        formTambahPengeluaran.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        formTambahPengeluaran.setVisible(true);
    }//GEN-LAST:event_menuItemTambahPengeluaranActionPerformed

    private void menuItemHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemHistoryActionPerformed
        History formHistory=new History();
        formHistory.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        formHistory.setVisible(true);
    }//GEN-LAST:event_menuItemHistoryActionPerformed

    private void menuItemGantiPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemGantiPasswordActionPerformed
        GantiPassword formGantiPassword=new GantiPassword();
        formGantiPassword.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        formGantiPassword.setVisible(true);
    }//GEN-LAST:event_menuItemGantiPasswordActionPerformed

    private void menuItemReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemReportActionPerformed
        Report formReport=new Report();
        formReport.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        formReport.setVisible(true);
    }//GEN-LAST:event_menuItemReportActionPerformed

    private void menuItemLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemLogoutActionPerformed
        ModuleDB.idUser=0;
        ModuleDB.nama=null;
        ModuleDB.password=null;
        ModuleDB.username=null;
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuItemLogoutActionPerformed

    private void menuItemTambahReminderPengeluaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemTambahReminderPengeluaranActionPerformed
        TambahReminderPengeluaran formTambahReminderPengeluaran=new TambahReminderPengeluaran();
        formTambahReminderPengeluaran.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        formTambahReminderPengeluaran.setVisible(true);
    }//GEN-LAST:event_menuItemTambahReminderPengeluaranActionPerformed

    private void menuItemTambahReminderPemasukanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemTambahReminderPemasukanActionPerformed
        TambahReminderPemasukan formTambahReminderPemasukan=new TambahReminderPemasukan();
        formTambahReminderPemasukan.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        formTambahReminderPemasukan.setVisible(true);
    }//GEN-LAST:event_menuItemTambahReminderPemasukanActionPerformed

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
            java.util.logging.Logger.getLogger(Beranda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Beranda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Beranda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Beranda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Beranda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenuAbout;
    private javax.swing.JMenu jMenuManajemen;
    private javax.swing.JMenu jMenuTampilkan;
    private javax.swing.JMenu jMenuUser;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jtabDaftarNotifikasi;
    private javax.swing.JLabel lblNamaUser;
    private javax.swing.JMenuBar menuBar1;
    private javax.swing.JMenuItem menuItemBuatUserBaru;
    private javax.swing.JMenuItem menuItemDeveloper;
    private javax.swing.JMenuItem menuItemGantiPassword;
    private javax.swing.JMenuItem menuItemHistory;
    private javax.swing.JMenuItem menuItemLogout;
    private javax.swing.JMenuItem menuItemReport;
    private javax.swing.JMenuItem menuItemTambahPemasukan;
    private javax.swing.JMenuItem menuItemTambahPengeluaran;
    private javax.swing.JMenuItem menuItemTambahReminderPemasukan;
    private javax.swing.JMenuItem menuItemTambahReminderPengeluaran;
    // End of variables declaration//GEN-END:variables
}
