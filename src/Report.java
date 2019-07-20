/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Felix
 */
import java.awt.event.KeyEvent;
import java.sql.*;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;
public class Report extends javax.swing.JFrame {
    /**
     * Creates new form Report
     */
    private String monthStartDate;
    private String yearStartDate;
    private String monthEndDate;
    private String yearEndDate;
    private int totalPemasukan;
    private int totalPengeluaran;
    private String sql;
    public Report() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jtabPemasukan = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtabPengeluaran = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfMonthStartDate = new javax.swing.JTextField();
        tfYearStartDate = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfYearEndDate = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tfMonthEndDate = new javax.swing.JTextField();
        lblTotalPemasukan = new javax.swing.JLabel();
        lblTotalPengeluaran = new javax.swing.JLabel();
        btnOK = new javax.swing.JButton();
        menuBar1 = new javax.swing.JMenuBar();
        jMenuManajemen = new javax.swing.JMenu();
        menuItemTambahPemasukan = new javax.swing.JMenuItem();
        menuItemTambahPengeluaran = new javax.swing.JMenuItem();
        jMenuTampilkan = new javax.swing.JMenu();
        menuItemHistory = new javax.swing.JMenuItem();
        jMenuUser = new javax.swing.JMenu();
        menuItemBuatUserBaru = new javax.swing.JMenuItem();
        menuItemGantiPassword = new javax.swing.JMenuItem();
        menuItemLogout = new javax.swing.JMenuItem();
        jMenuAbout = new javax.swing.JMenu();
        menuItemDeveloper = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Money Manager - History");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setText("STUDENT MONEY MANAGER");

        lblNamaUser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNamaUser.setText("Login sebagai:");

        jtabPemasukan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Jenis", "Tanggal", "Deskripsi", "Jumlah"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtabPemasukan);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("Pemasukan");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("Pengeluaran");

        jtabPengeluaran.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Jenis", "Tanggal", "Deskripsi", "Jumlah"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jtabPengeluaran);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("End Date:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Start Date:");

        tfMonthStartDate.setText("01");
        tfMonthStartDate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfMonthStartDateKeyPressed(evt);
            }
        });

        tfYearStartDate.setText("2016");
        tfYearStartDate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfYearStartDateKeyPressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("MM");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("YYYY");

        tfYearEndDate.setText("2016");
        tfYearEndDate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfYearEndDateKeyPressed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("MM");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("YYYY");

        tfMonthEndDate.setText("12");
        tfMonthEndDate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfMonthEndDateKeyPressed(evt);
            }
        });

        lblTotalPemasukan.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblTotalPemasukan.setText("Total: -");

        lblTotalPengeluaran.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblTotalPengeluaran.setText("Total: -");

        btnOK.setText("OK");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

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

        menuBar1.add(jMenuManajemen);

        jMenuTampilkan.setText("Tampilkan");

        menuItemHistory.setText("History");
        menuItemHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemHistoryActionPerformed(evt);
            }
        });
        jMenuTampilkan.add(menuItemHistory);

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
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 751, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 751, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfMonthStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(tfYearStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)))
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNamaUser)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tfMonthEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addComponent(tfYearEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnOK)))))
                        .addGap(190, 190, 190))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblTotalPengeluaran)
                        .addGap(132, 132, 132))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblTotalPemasukan)
                        .addGap(132, 132, 132))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNamaUser)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfMonthStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfYearStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(24, 24, 24))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tfMonthEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfYearEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8)
                                .addComponent(jLabel9)
                                .addComponent(btnOK)))))
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTotalPemasukan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTotalPengeluaran)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public String getTanggal(int idItem){
        sql="SELECT strftime('%d',tanggal) AS 'tanggal' FROM pemasukan WHERE id_pemasukan="+idItem;
        String tanggal=null;
        try{
            Connection con=ModuleDB.connectDB();
            Statement stmt=con.createStatement();
            ResultSet result=stmt.executeQuery(sql);
            result.next();
            tanggal=result.getString("tanggal");
            con.close();
        }
        catch(SQLException e){
            showMessageDialog(null,e.getMessage());
        }
        return tanggal;
    }
    
    public String getBulan(int idItem){
        sql="SELECT strftime('%m',tanggal) AS 'bulan' FROM pemasukan WHERE id_pemasukan="+idItem;
        String bulan=null;
        try{
            Connection con=ModuleDB.connectDB();
            Statement stmt=con.createStatement();
            ResultSet result=stmt.executeQuery(sql);
            result.next();
            bulan=result.getString("bulan");
            con.close();
        }
        catch(SQLException e){
            showMessageDialog(null,e.getMessage());
        }
        return bulan;
    }
    
    public String getTahun(int idItem){
        sql="SELECT strftime('%Y',tanggal) AS 'tahun' FROM pemasukan WHERE id_pemasukan="+idItem;
        String tahun=null;
        try{
            Connection con=ModuleDB.connectDB();
            Statement stmt=con.createStatement();
            ResultSet result=stmt.executeQuery(sql);
            result.next();
            tahun=result.getString("tahun");
            con.close();
        }
        catch(SQLException e){
            showMessageDialog(null,e.getMessage());
        }
        return tahun;
    }
    
    public void loadDataPemasukan(){
        try{
            sql="SELECT p.id_pemasukan,j.jenis,strftime('%d',p.tanggal) AS 'tgl',strftime('%m',p.tanggal) AS 'bln',strftime('%Y',p.tanggal) AS 'thn',p.keterangan,p.jumlah FROM jenis j,pemasukan p WHERE p.id_jenis=j.id_jenis AND id_user="+ModuleDB.idUser+" AND strftime('%Y-%m',p.tanggal) BETWEEN '"+yearStartDate+"-"+monthStartDate+"' AND '"+yearEndDate+"-"+monthEndDate+"' ORDER BY p.tanggal;";
            Connection con=ModuleDB.connectDB();
            Statement stmt=con.createStatement();
            ResultSet result=stmt.executeQuery(sql);
            DefaultTableModel model=(DefaultTableModel)jtabPemasukan.getModel();
            model.setRowCount(0);
            while(result.next()){
                String tgl=result.getString("tgl");
                String bln=result.getString("bln");
                String thn=result.getString("thn");
                String tanggalPemasukanLengkap=tgl+"-"+bln+"-"+thn;
                Vector row=new Vector();
                row.add(result.getString("id_pemasukan"));
                row.add(result.getString("jenis"));
                row.add(tanggalPemasukanLengkap);
                row.add(result.getString("keterangan"));
                row.add(result.getInt("jumlah"));
                totalPemasukan+=result.getInt("jumlah");
                model.addRow(row);
            }
            con.close();
            jtabPemasukan.setModel(model);
            lblTotalPemasukan.setText("Rp. "+totalPemasukan+",-");
        }
        catch(SQLException e){
            showMessageDialog(null,e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void loadDataPengeluaran(){
        try{
            sql="SELECT p.id_pengeluaran,j.jenis,strftime('%d',p.tanggal) AS 'tgl',strftime('%m',p.tanggal) AS 'bln',strftime('%Y',p.tanggal) AS 'thn',p.keterangan,p.jumlah FROM jenis j,pengeluaran p WHERE p.id_jenis=j.id_jenis AND id_user="+ModuleDB.idUser+" AND strftime('%Y-%m',p.tanggal) BETWEEN '"+yearStartDate+"-"+monthStartDate+"' AND '"+yearEndDate+"-"+monthEndDate+"' ORDER BY p.tanggal;";
            Connection con=ModuleDB.connectDB();
            Statement stmt=con.createStatement();
            ResultSet result=stmt.executeQuery(sql);
            DefaultTableModel model=(DefaultTableModel)jtabPengeluaran.getModel();
            model.setRowCount(0);
            while(result.next()){
                String tgl=result.getString("tgl");
                String bln=result.getString("bln");
                String thn=result.getString("thn");
                String tanggalPengeluaranLengkap=tgl+"-"+bln+"-"+thn;
                Vector row=new Vector();
                row.add(result.getInt("id_pengeluaran"));
                row.add(result.getString("jenis"));
                row.add(tanggalPengeluaranLengkap);
                row.add(result.getString("keterangan"));
                row.add(result.getInt("jumlah"));
                totalPengeluaran+=result.getInt("jumlah");
                model.addRow(row);
            }
            con.close();
            lblTotalPengeluaran.setText("Rp. "+totalPengeluaran+",-");
            jtabPengeluaran.setModel(model);
        }
        catch(SQLException e){
            showMessageDialog(null,e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void loadReportData(){
        monthStartDate=tfMonthStartDate.getText();
        yearStartDate=tfYearStartDate.getText();
        monthEndDate=tfMonthEndDate.getText();
        yearEndDate=tfYearEndDate.getText();
        loadDataPemasukan();
        loadDataPengeluaran();
    }
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setLocationRelativeTo(null);
        lblNamaUser.setText("Login sebagai: "+ModuleDB.nama);
        jtabPemasukan.getColumnModel().getColumn(0).setPreferredWidth(15);
        jtabPemasukan.getColumnModel().getColumn(1).setPreferredWidth(50);
        jtabPemasukan.getColumnModel().getColumn(2).setPreferredWidth(50);
        jtabPemasukan.getColumnModel().getColumn(3).setPreferredWidth(170);
        jtabPemasukan.getColumnModel().getColumn(4).setPreferredWidth(50);
        jtabPengeluaran.getColumnModel().getColumn(0).setPreferredWidth(15);
        jtabPengeluaran.getColumnModel().getColumn(1).setPreferredWidth(50);
        jtabPengeluaran.getColumnModel().getColumn(2).setPreferredWidth(50);
        jtabPengeluaran.getColumnModel().getColumn(3).setPreferredWidth(170);
        jtabPengeluaran.getColumnModel().getColumn(4).setPreferredWidth(50);
        totalPemasukan=0;
        totalPengeluaran=0;
        loadReportData();
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
        
    }//GEN-LAST:event_menuItemHistoryActionPerformed
    
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
    }//GEN-LAST:event_formWindowClosing

    private void menuItemGantiPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemGantiPasswordActionPerformed
        GantiPassword formGantiPassword=new GantiPassword();
        formGantiPassword.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        formGantiPassword.setVisible(true);
    }//GEN-LAST:event_menuItemGantiPasswordActionPerformed

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        loadReportData();
    }//GEN-LAST:event_btnOKActionPerformed

    private void tfMonthStartDateKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfMonthStartDateKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
            loadReportData();
        else if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
            tfYearStartDate.requestFocus();
    }//GEN-LAST:event_tfMonthStartDateKeyPressed

    private void tfYearStartDateKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfYearStartDateKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
            loadReportData();
        else if(evt.getKeyCode()==KeyEvent.VK_LEFT)
            tfMonthStartDate.requestFocus();
        else if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
            tfMonthEndDate.requestFocus();
    }//GEN-LAST:event_tfYearStartDateKeyPressed

    private void tfMonthEndDateKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfMonthEndDateKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
            loadReportData();
        else if(evt.getKeyCode()==KeyEvent.VK_LEFT)
            tfYearStartDate.requestFocus();
        else if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
            tfYearEndDate.requestFocus();
    }//GEN-LAST:event_tfMonthEndDateKeyPressed

    private void tfYearEndDateKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfYearEndDateKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
            loadReportData();
        else if(evt.getKeyCode()==KeyEvent.VK_LEFT)
            tfMonthEndDate.requestFocus();
    }//GEN-LAST:event_tfYearEndDateKeyPressed

    private void menuItemLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemLogoutActionPerformed
        ModuleDB.idUser=0;
        ModuleDB.nama=null;
        ModuleDB.password=null;
        ModuleDB.username=null;
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuItemLogoutActionPerformed

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
    private javax.swing.JButton btnOK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenuAbout;
    private javax.swing.JMenu jMenuManajemen;
    private javax.swing.JMenu jMenuTampilkan;
    private javax.swing.JMenu jMenuUser;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jtabPemasukan;
    private javax.swing.JTable jtabPengeluaran;
    private javax.swing.JLabel lblNamaUser;
    private javax.swing.JLabel lblTotalPemasukan;
    private javax.swing.JLabel lblTotalPengeluaran;
    private javax.swing.JMenuBar menuBar1;
    private javax.swing.JMenuItem menuItemBuatUserBaru;
    private javax.swing.JMenuItem menuItemDeveloper;
    private javax.swing.JMenuItem menuItemGantiPassword;
    private javax.swing.JMenuItem menuItemHistory;
    private javax.swing.JMenuItem menuItemLogout;
    private javax.swing.JMenuItem menuItemTambahPemasukan;
    private javax.swing.JMenuItem menuItemTambahPengeluaran;
    private javax.swing.JTextField tfMonthEndDate;
    private javax.swing.JTextField tfMonthStartDate;
    private javax.swing.JTextField tfYearEndDate;
    private javax.swing.JTextField tfYearStartDate;
    // End of variables declaration//GEN-END:variables
}
