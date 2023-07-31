/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tampilan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.text.SimpleDateFormat;
import java.util.Locale;
import Database.Koneksi;
import java.util.HashMap;
import java.sql.DriverManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;


/**
 *
 * @author oscar
 */

public class Form_KolekteMinggu extends javax.swing.JFrame {
private Connection conn = new Koneksi().connect();
private DefaultTableModel tabmode;
    

    public Form_KolekteMinggu() {
        initComponents();
        kosong();
        aktif();
        autonumber();
        datatable();
        Locale locale = new Locale ("id","ID");
        Locale.setDefault(locale);
    }

protected void kosong(){
id_kolekte.setText("");
nma_gereja.setText("");
tglminggu.setCalendar(null);
mingguke.setText("");
nominal.setText("");
kolekteke.setText("");
}

 protected void aktif(){
nma_gereja.requestFocus();
id_kolekte.setEnabled(false);  
}

protected void autonumber(){
 try{
 String sql = "SELECT ID_kolekte FROM data_kolekte order by id_kolekte asc";
 Statement stat = conn.createStatement();
 ResultSet rs=stat.executeQuery(sql);

 while(rs.next()){
 String ID_kolekte = rs.getString("ID_kolekte").substring(2);
 int nomor = Integer.parseInt(ID_kolekte) + 1;
 String nol = "";

 if (nomor<10)
 {nol = "000";}
 else if (nomor<100)
 {nol = "00";}
 else if (nomor<1000)
 {nol = "";}

 id_kolekte.setText("KM" + nol + nomor);
 }
 }
 catch (Exception e){
      JOptionPane.showMessageDialog(null,"Penomoran Salah" + e);
 }
}

public void removeTable(){
    try{
         for(int t=tabmode.getRowCount();t>0;t--) {tabmode.removeRow(0);}    }
    catch(Exception ex){ System.out.println(ex);  } }

protected void datatable(){
      removeTable();
        int jumdata=0;
     Object[] Baris = {"ID Kolekte", "Nama Gereja", "Hari dan Tanggal", "Kolekte Ke", "Minggu Ke", "Nominal Kolekte"};
    tabmode = new DefaultTableModel(null, Baris);
    Table.setModel(tabmode);
    String sql = "select * from data_kolekte";
    try{
        java.sql.Statement stat = conn.createStatement();
        ResultSet hasil = stat.executeQuery(sql);
         while (hasil.next()){
            String a    = hasil.getString("ID_kolekte");
            String b    = hasil.getString("nma_gereja");
            String c    = hasil.getString("tglminggu");
            String d    = hasil.getString("kolekteke");
            String e    = hasil.getString("mingguke");
            String f    = hasil.getString("nominal");
            
            String data[]={a,b,c,d,e,f};
            tabmode.addRow(data);
            jumdata=jumdata+1;
            }
        }
    
    catch(SQLException sqle){
        jumdata=0;
        JOptionPane.showMessageDialog(null,"Data Gagal Masuk Tabel"+sqle);
        } 
 jml.setText(jumdata+" Kolekte Minggu");
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Kembali = new javax.swing.JButton();
        Batal = new javax.swing.JButton();
        Hapus = new javax.swing.JButton();
        Ubah = new javax.swing.JButton();
        Simpan = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        nma_gereja = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tglminggu = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        id_kolekte = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        nominal = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        mingguke1 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        kolekteke = new javax.swing.JTextField();
        panelAlpha2 = new Tampilan.panelAlpha();
        jLabel7 = new javax.swing.JLabel();
        mingguke = new javax.swing.JTextField();
        jml = new javax.swing.JLabel();
        Cari2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Kembali.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Kembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Foto/icons-back.png"))); // NOI18N
        Kembali.setText("KEMBALI");
        Kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KembaliActionPerformed(evt);
            }
        });
        getContentPane().add(Kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 530, -1, -1));

        Batal.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Batal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Foto/icons-cancel.png"))); // NOI18N
        Batal.setText("BATAL");
        Batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BatalActionPerformed(evt);
            }
        });
        getContentPane().add(Batal, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 530, -1, -1));

        Hapus.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Hapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Foto/icons-delete.png"))); // NOI18N
        Hapus.setText("HAPUS");
        Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusActionPerformed(evt);
            }
        });
        getContentPane().add(Hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 530, -1, -1));

        Ubah.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Ubah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Foto/icons-edit.png"))); // NOI18N
        Ubah.setText("UBAH");
        Ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UbahActionPerformed(evt);
            }
        });
        getContentPane().add(Ubah, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 530, -1, -1));

        Simpan.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Simpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Foto/icons-save-.png"))); // NOI18N
        Simpan.setText("SIMPAN");
        Simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SimpanActionPerformed(evt);
            }
        });
        getContentPane().add(Simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 530, -1, -1));

        Table.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID Kolekte", "Nama Gereja", "Hari dan Tanggal", "Kolekte Ke", "Minggu ke", "Nominal"
            }
        ));
        Table.setToolTipText("");
        Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Table);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 308, 950, 210));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Hari dan Tanggal");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jComboBox1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gereja Paroki Pakumbang", "Gereja Stasi Pinyaho", "Gereja Stasi Jame ", "Gereja Stasi Betung", "Gereja Stasi Tebing Tinggi", "Gereja Stasi Mangaro", "Gereja Stasi Sungai Pinang", "Gereja Stasi Semugih", "Gereja Stasi Sompak", "Gereja Stasi Galar", "Gereja Stasi Sadok", "Gereja Stasi Dago", "Gereja Stasi Emang", "Gereja Stasi Kencok", "Gereja Stasi Berinang", "Gereja Stasi Lutukng", "Gereja Stasi Seba", "Gereja Stasi Tengge", "Gereja Stasi Pojok", "Gereja Stasi Tapakng" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, -1, -1));

        nma_gereja.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        getContentPane().add(nma_gereja, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 138, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nama Gereja");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        tglminggu.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        getContentPane().add(tglminggu, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 290, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID Kolekte");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        id_kolekte.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        getContentPane().add(id_kolekte, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 300, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nominal Kolekte");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, -1, -1));

        nominal.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        nominal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nominalActionPerformed(evt);
            }
        });
        getContentPane().add(nominal, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 160, 237, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Minggu Ke");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, 90, -1));

        mingguke1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        mingguke1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Minggu 1", "Minggu 2", "Minggu 3", "Minggu 4" }));
        mingguke1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mingguke1ActionPerformed(evt);
            }
        });
        getContentPane().add(mingguke1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 120, 90, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Kolekte Ke");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, -1, -1));

        jComboBox2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kolekte 1", "Kolekte 2" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 80, 91, -1));

        kolekteke.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        kolekteke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kolektekeActionPerformed(evt);
            }
        });
        getContentPane().add(kolekteke, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 80, 140, -1));

        panelAlpha2.setBackground(new java.awt.Color(153, 255, 153));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("FORM KOLEKTE MINGGU");

        javax.swing.GroupLayout panelAlpha2Layout = new javax.swing.GroupLayout(panelAlpha2);
        panelAlpha2.setLayout(panelAlpha2Layout);
        panelAlpha2Layout.setHorizontalGroup(
            panelAlpha2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAlpha2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelAlpha2Layout.setVerticalGroup(
            panelAlpha2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAlpha2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(panelAlpha2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        mingguke.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        getContentPane().add(mingguke, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 120, 140, -1));

        jml.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jml.setText("Jumlah");
        getContentPane().add(jml, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 280, -1, -1));

        Cari2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Cari2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Cari2KeyReleased(evt);
            }
        });
        getContentPane().add(Cari2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 310, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Foto/icons-search.png"))); // NOI18N
        jLabel9.setText("Pencarian");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, -1, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setText("Jumlah :");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 280, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Foto/Background Form kecil.jpg"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(955, 574));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 570));

        setSize(new java.awt.Dimension(970, 608));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SimpanActionPerformed
        // TODO add your handling code here:
       SimpleDateFormat sda = new SimpleDateFormat("EEEEE dd MMMMM yyyy");
       String tglm = sda.format(tglminggu.getDate());
       
        String sql ="insert into data_kolekte values (?,?,?,?,?,?)";
        try{ 
            PreparedStatement stat2 = conn.prepareStatement(sql);
            stat2.setString (1, id_kolekte.getText());
            stat2.setString (2, nma_gereja.getText());
            stat2.setString (3, tglm);
            stat2.setString (4, kolekteke.getText());
            stat2.setString (5, mingguke.getText());
            stat2.setString (6, nominal.getText());
            
            stat2.executeUpdate();
            JOptionPane.showMessageDialog(null, "data berhasil disimpan");
            
        }
        catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Error"+e);
        }
        kosong();
        autonumber();
        datatable();
    }//GEN-LAST:event_SimpanActionPerformed

    private void HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusActionPerformed
        // TODO add your handling code here:
        int j=JOptionPane.showConfirmDialog(null,"Delete","konfirmasiDialog",JOptionPane.YES_NO_OPTION);
        if (j==0){
            String sql= "delete from data_kolekte where ID_kolekte ='"+id_kolekte.getText()+"'";
            try{
                PreparedStatement stat= conn.prepareStatement(sql);
                stat.executeUpdate();
                JOptionPane.showMessageDialog(null,"Data dihapus");
                
            }
            catch(SQLException x){
                JOptionPane.showMessageDialog(null,"Data Gagagl dihapus"+x);
            }
            kosong();
            autonumber();
            datatable();
        }
    }//GEN-LAST:event_HapusActionPerformed

    private void UbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UbahActionPerformed
        // TODO add your handling code here:
        try{
        SimpleDateFormat sda = new SimpleDateFormat("EEEE dd MMMMM yyyy");
        String tglm= sda.format(tglminggu.getDate());
        
        String sql="update data_kolekte set nma_gereja=?, tglminggu=?, kolekteke=?, mingguke=?, nominal=? where ID_kolekte='"+id_kolekte.getText()+"'";
            PreparedStatement stat = conn.prepareStatement(sql);
            //stat.setString (1, id_kolekte.getText());
            stat.setString (1, nma_gereja.getText());
            stat.setString (2, tglm);
            stat.setString (3, kolekteke.getText());
            stat.setString (4, mingguke.getText());
            stat.setString (5, nominal.getText());
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null,"Data berhasil diubah");
           
        }
        catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Error"+e);
         
        }
        kosong();
        datatable();  
        autonumber();  
 
    }//GEN-LAST:event_UbahActionPerformed

    private void BatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BatalActionPerformed
        // TODO add your handling code here:
       kosong();
       autonumber();
    }//GEN-LAST:event_BatalActionPerformed

    private void KembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KembaliActionPerformed
        // TODO add your handling code here:
        Halaman_utama Pp = new Halaman_utama();
        Pp.setVisible(true);
        Pp.setResizable(false);
        dispose();
    }//GEN-LAST:event_KembaliActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        String text;
        text = (String)jComboBox1.getSelectedItem();
        nma_gereja.setText(text);
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
        String text;
        text = (String)jComboBox2.getSelectedItem();
        kolekteke.setText(text);
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void kolektekeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kolektekeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kolektekeActionPerformed

    private void nominalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nominalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nominalActionPerformed

    private void mingguke1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mingguke1ActionPerformed
        // TODO add your handling code here:
        String text;
        text = (String)mingguke1.getSelectedItem();
        mingguke.setText(text);
    }//GEN-LAST:event_mingguke1ActionPerformed

    private void TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMouseClicked
        // TODO add your handling code here:
        int br=Table.getSelectedRow();
        String a=Table.getValueAt(br,0).toString();
        String b=Table.getValueAt(br,1).toString();
        String c=Table.getValueAt(br,2).toString();
        String d=Table.getValueAt(br,3).toString();
        String e=Table.getValueAt(br,4).toString();
        String f=Table.getValueAt(br,5).toString();
        
        id_kolekte.setText(a);
        nma_gereja.setText(b);
        tglminggu.setDateFormatString(c);
        kolekteke.setText(d);
        mingguke.setText(e);
        nominal.setText(f);
    }//GEN-LAST:event_TableMouseClicked

    private void Cari2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Cari2KeyReleased
        // TODO add your handling code here:
        String cari1= Cari2.getText();
 int jumdata=0;
 removeTable();
 String sql ="SELECT * FROM data_kolekte where ID_kolekte like '%"+cari1+"%' or kolekteke like '%"+cari1+"%' order by id_kolekte asc";
 System.out.println(sql);

   try{
        java.sql.Statement stat = conn.createStatement();
        ResultSet hasil = stat.executeQuery(sql);
         while (hasil.next()){
            String a    = hasil.getString("ID_kolekte");
            String b    = hasil.getString("nma_gereja");
            String c    = hasil.getString("tglminggu");
            String d    = hasil.getString("kolekteke");
            String e    = hasil.getString("mingguke");
            String f    = hasil.getString("nominal");
            
            String data[]={a,b,c,d,e,f};
            tabmode.addRow(data);
            jumdata=jumdata+1;
            }

 }catch(SQLException sqle){
 jumdata=0;
 JOptionPane.showMessageDialog(null,"Data Gagal Masuk Tabel"+sqle);
 }
 jml.setText(jumdata+" Kolekte Minggu");
    }//GEN-LAST:event_Cari2KeyReleased

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
            java.util.logging.Logger.getLogger(Form_KolekteMinggu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_KolekteMinggu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_KolekteMinggu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_KolekteMinggu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_KolekteMinggu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Batal;
    private javax.swing.JTextField Cari2;
    private javax.swing.JButton Hapus;
    private javax.swing.JButton Kembali;
    private javax.swing.JButton Simpan;
    private javax.swing.JTable Table;
    private javax.swing.JButton Ubah;
    private javax.swing.JTextField id_kolekte;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jml;
    private javax.swing.JTextField kolekteke;
    private javax.swing.JTextField mingguke;
    private javax.swing.JComboBox<String> mingguke1;
    private javax.swing.JTextField nma_gereja;
    private javax.swing.JTextField nominal;
    private Tampilan.panelAlpha panelAlpha2;
    private com.toedter.calendar.JDateChooser tglminggu;
    // End of variables declaration//GEN-END:variables
}
