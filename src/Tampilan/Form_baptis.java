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
import java.util.HashMap;
import java.util.Locale;
import Database.Koneksi;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
/**
 *
 * @author oscar
 */
public class Form_baptis extends javax.swing.JFrame {
private Connection conn = new Koneksi().connect();
private DefaultTableModel tabmode;
    public Form_baptis() {
        initComponents();
        kosong();
        aktif();
        datatable();
        autonumber();
        Locale locale = new Locale ("id","ID");
        Locale.setDefault(locale);
    }

protected void kosong(){
id.setText("");
namacb.setText("");
tmplahir.setText("");
dbaptis.setText("");
tmpbaptis.setText("");
ayah.setText("");
ibu.setText("");
alamat.setText("");
tlpn.setText("");
namacb.requestFocus();
//tgllahir.setCalendar(null);
//tglbaptis.setCalendar(null);
}

 protected void aktif(){
namacb.requestFocus();
id.setEnabled(false);

}
 
 public void removeTable(){
    try{
         for(int t=tabmode.getRowCount();t>0;t--) {tabmode.removeRow(0);}    }
    catch(Exception ex){ System.out.println(ex);  } }

 protected void datatable(){
      removeTable();
        int jumdata=0;
     Object[] Baris = {"ID Baptis", "Nama Calon Baptis", "Tempat Lahir", "Tanggal Lahir", "Di Baptis", "Tempat Baptis", "Tanggal Baptis", "Nama Ayah", "Nama Ibu","Alamat", "No Telepon"};
    tabmode = new DefaultTableModel(null, Baris);
    Table.setModel(tabmode);
    String sql = "select * from data_baptis";
    try{
        java.sql.Statement stat = conn.createStatement();
        ResultSet hasil = stat.executeQuery(sql);
         while (hasil.next()){
            String a    = hasil.getString("ID_baptis");
            String b    = hasil.getString("namacb");
            String c    = hasil.getString("tmplahir");
            String d    = hasil.getString("tgllahir");
            String e    = hasil.getString("dbaptis");
            String f    = hasil.getString("tmpbaptis");
            String g    = hasil.getString("tglbaptis");
            String h    = hasil.getString("ayah");
            String i    = hasil.getString("ibu");
            String j    = hasil.getString("alamat");
            String k    = hasil.getString("tlpn");
            String data[]={a,b,c,d,e,f,g,h,i,j,k};
            tabmode.addRow(data);
            jumdata=jumdata+1;
            }
        }
    
    catch(SQLException sqle){
        jumdata=0;
        JOptionPane.showMessageDialog(null,"Data Gagal Masuk Tabel"+sqle);
        }
    
 jml.setText(jumdata+"  Calon baptis");
}

 protected void autonumber(){
 try{
 String sql = "SELECT ID_baptis FROM data_baptis order by ID_baptis asc";
 Statement stat = conn.createStatement();
 ResultSet rs=stat.executeQuery(sql);

 while(rs.next()){
 String ID_baptis = rs.getString("ID_baptis").substring(2);
 int nomor = Integer.parseInt(ID_baptis) + 1;
 String nol = "";

 if (nomor<10)
 {nol = "000";}
 else if (nomor<100)
 {nol = "00";}
 else if (nomor<1000)
 {nol = "";}

 id.setText("CB" + nol + nomor);
 }
 }
 catch (Exception e){
      JOptionPane.showMessageDialog(null,"Penomoran Salah" + e);
 }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Cari2 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        jml = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        KEMBALI = new javax.swing.JButton();
        HAPUS = new javax.swing.JButton();
        BATAL = new javax.swing.JButton();
        UBAH = new javax.swing.JButton();
        SIMPAN = new javax.swing.JButton();
        Cetak = new javax.swing.JButton();
        id = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        namacb = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tmplahir = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tgllahir = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        dbaptis = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        tmpbaptis = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ayah = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ibu = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        alamat = new javax.swing.JTextArea();
        tlpn = new javax.swing.JTextField();
        panelAlpha2 = new Tampilan.panelAlpha();
        jLabel9 = new javax.swing.JLabel();
        tglbaptis = new com.toedter.calendar.JDateChooser();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Cari2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Cari2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cari2ActionPerformed(evt);
            }
        });
        Cari2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Cari2KeyReleased(evt);
            }
        });
        getContentPane().add(Cari2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, 290, 30));

        Table.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Table.setModel(new javax.swing.table.DefaultTableModel(
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
        Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Table);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 420, 1200, 190));

        jml.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jml.setText("Jml");
        getContentPane().add(jml, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 400, -1, -1));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel14.setText("Jumlah :");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 400, -1, -1));

        KEMBALI.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        KEMBALI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Foto/icons-back.png"))); // NOI18N
        KEMBALI.setText("KEMBALI");
        KEMBALI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KEMBALIActionPerformed(evt);
            }
        });
        getContentPane().add(KEMBALI, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 620, -1, -1));

        HAPUS.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        HAPUS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Foto/icons-delete.png"))); // NOI18N
        HAPUS.setText("HAPUS");
        HAPUS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HAPUSActionPerformed(evt);
            }
        });
        getContentPane().add(HAPUS, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 620, -1, -1));

        BATAL.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BATAL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Foto/icons-cancel.png"))); // NOI18N
        BATAL.setText("BATAL");
        BATAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BATALActionPerformed(evt);
            }
        });
        getContentPane().add(BATAL, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 620, -1, -1));

        UBAH.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        UBAH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Foto/icons-edit.png"))); // NOI18N
        UBAH.setText("UBAH");
        UBAH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UBAHActionPerformed(evt);
            }
        });
        getContentPane().add(UBAH, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 620, 110, -1));

        SIMPAN.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        SIMPAN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Foto/icons-save-.png"))); // NOI18N
        SIMPAN.setText("SIMPAN");
        SIMPAN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SIMPANActionPerformed(evt);
            }
        });
        getContentPane().add(SIMPAN, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 620, -1, -1));

        Cetak.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Cetak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Foto/icons-print.png"))); // NOI18N
        Cetak.setText("CETAK");
        Cetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CetakActionPerformed(evt);
            }
        });
        getContentPane().add(Cetak, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 360, -1, -1));

        id.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 290, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ID Baptis");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        namacb.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        namacb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namacbActionPerformed(evt);
            }
        });
        getContentPane().add(namacb, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 290, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nama Calon Baptis");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        tmplahir.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        tmplahir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmplahirActionPerformed(evt);
            }
        });
        getContentPane().add(tmplahir, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 290, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tempat Lahir");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 108, 20));

        tgllahir.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        getContentPane().add(tgllahir, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 290, 25));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Tanggal Lahir");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        jComboBox1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "P. Ruben Ruruk Sandalajuk, MSA", "P. Romanus, MSA", "P. Blass, MSA", "P. Ebit, MSA", "P. Frans, MSA" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 126, -1));

        dbaptis.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        getContentPane().add(dbaptis, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, 160, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Di Baptis");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        jComboBox2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gereja Paroki Pakumbang", "Gereja Stasi Pinyaho", "Gereja Stasi Jame ", "Gereja Stasi Betung", "Gereja Stasi Tebing Tinggi", "Gereja Stasi Mangaro", "Gereja Stasi Sungai Pinang", "Gereja Stasi Semugih", "Gereja Stasi Sompak", "Gereja Stasi Galar", "Gereja Stasi Sadok", "Gereja Stasi Dago", "Gereja Stasi Emang", "Gereja Stasi Kencok", "Gereja Stasi Berinang", "Gereja Stasi Lutukng", "Gereja Stasi Seba", "Gereja Stasi Tengge", "Gereja Stasi Pojok", "Gereja Stasi Tapakng" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 124, -1));

        tmpbaptis.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        getContentPane().add(tmpbaptis, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 157, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Tempat Baptis");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Tanggal Baptis");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 80, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("No Telepon ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 310, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nama Ayah");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, -1, -1));

        ayah.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        ayah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ayahActionPerformed(evt);
            }
        });
        getContentPane().add(ayah, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 120, 257, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nama Ibu ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, -1, -1));

        ibu.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        ibu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ibuActionPerformed(evt);
            }
        });
        getContentPane().add(ibu, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 160, 257, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Alamat");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 200, -1, -1));

        alamat.setColumns(20);
        alamat.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        alamat.setRows(5);
        jScrollPane1.setViewportView(alamat);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 200, 257, -1));

        tlpn.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        tlpn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tlpnActionPerformed(evt);
            }
        });
        getContentPane().add(tlpn, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 310, 257, -1));

        panelAlpha2.setBackground(new java.awt.Color(102, 255, 102));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("FORM BAPTIS ");

        javax.swing.GroupLayout panelAlpha2Layout = new javax.swing.GroupLayout(panelAlpha2);
        panelAlpha2.setLayout(panelAlpha2Layout);
        panelAlpha2Layout.setHorizontalGroup(
            panelAlpha2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAlpha2Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(45, 45, 45))
        );
        panelAlpha2Layout.setVerticalGroup(
            panelAlpha2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAlpha2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(panelAlpha2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        tglbaptis.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        getContentPane().add(tglbaptis, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 80, 260, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Foto/icons-search.png"))); // NOI18N
        jLabel15.setText("Pencarian :");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Foto/Bacground form.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 660));

        setSize(new java.awt.Dimension(1209, 697));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Cari2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cari2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cari2ActionPerformed

    private void KEMBALIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KEMBALIActionPerformed
        // TODO add your handling code here:
        Halaman_utama Pp = new Halaman_utama();
        Pp.setVisible(true);
        Pp.setResizable(false);
        dispose();
    }//GEN-LAST:event_KEMBALIActionPerformed

    private void UBAHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UBAHActionPerformed
        // TODO add your handling code here:
                 try{
 SimpleDateFormat sda = new SimpleDateFormat("EEEE dd MMMMM yyyy");
 String ttl= sda.format(tgllahir.getDate());     
 String tbaptis= sda.format(tglbaptis.getDate());   
       
          String sql="update data_baptis set namacb=?, tmplahir=?, tgllahir=?, dbaptis=?, tmpbaptis=?, tglbaptis=?, ayah=?, ibu=?, alamat=?, tlpn=?  where ID_baptis='"+id.getText()+"'";
            PreparedStatement stat = conn.prepareStatement(sql);
            //stat.setString (1, id.getText());
            stat.setString (1, namacb.getText());
            stat.setString (2, tmplahir.getText());
            stat.setString (3, ttl);
            stat.setString (4, dbaptis.getText());
            stat.setString (5, tmpbaptis.getText());
            stat.setString (6, tbaptis);
            stat.setString (7, ayah.getText());
            stat.setString (8, ibu.getText());
            stat.setString (9, alamat.getText());
            stat.setString (10, tlpn.getText());
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null,"Data berhasil diubah");
           
        }
        catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Error"+e);
         
        }
         kosong();
        datatable();  
        autonumber();                                    
    }//GEN-LAST:event_UBAHActionPerformed

    private void tlpnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tlpnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tlpnActionPerformed

    private void ibuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ibuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ibuActionPerformed

    private void ayahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ayahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ayahActionPerformed

    private void tmplahirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmplahirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tmplahirActionPerformed

    private void namacbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namacbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namacbActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void SIMPANActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SIMPANActionPerformed
        // TODO add your handling code here:
                SimpleDateFormat sda = new SimpleDateFormat("EEEEE dd MMMMM yyyy");
       String ttl= sda.format(tgllahir.getDate());     
       String tbaptis= sda.format(tglbaptis.getDate());   
       
        String sql ="insert into data_baptis values (?,?,?,?,?,?,?,?,?,?,?)";
        try{ PreparedStatement stat= conn.prepareStatement(sql);
            stat.setString (1, id.getText());
            stat.setString (2, namacb.getText());
            stat.setString (3, tmplahir.getText());
            stat.setString (4, ttl);
            stat.setString (5, dbaptis.getText());
            stat.setString (6, tmpbaptis.getText());
            stat.setString (7, tbaptis);
            stat.setString (8, ayah.getText());
            stat.setString (9, ibu.getText());
            stat.setString (10, alamat.getText());
            stat.setString (11, tlpn.getText());
            
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null,"data berhasil disimpan");
            //cetak();
        }
        catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Error"+e);
        }
         kosong();
         datatable();
         autonumber();
    }//GEN-LAST:event_SIMPANActionPerformed

    private void HAPUSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HAPUSActionPerformed
        // TODO add your handling code here:
             int j=JOptionPane.showConfirmDialog(null,"Delete","konfirmasiDialog",JOptionPane.YES_NO_OPTION);
        if (j==0){
            String sql= "delete from data_baptis where ID_baptis ='"+id.getText()+"'";
            try{
                PreparedStatement stat= conn.prepareStatement(sql);
                stat.executeUpdate();
                JOptionPane.showMessageDialog(null,"Data dihapus");
                kosong();
                id.requestFocus();
            }
            catch(SQLException x){
                JOptionPane.showMessageDialog(null,"Data Gagagl dihapus"+x);
            }
            kosong();
            datatable();
            autonumber();
        } 
    }//GEN-LAST:event_HAPUSActionPerformed

    private void BATALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BATALActionPerformed
        // TODO add your handling code here:
       kosong();
       autonumber();
    }//GEN-LAST:event_BATALActionPerformed

    private void TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMouseClicked
        // TODO add your handling code here:
               int br=Table.getSelectedRow();
        String a=Table.getValueAt(br,0).toString();
        String b=Table.getValueAt(br,1).toString();
        String c=Table.getValueAt(br,2).toString();
        String d=Table.getValueAt(br,3).toString();
        String e=Table.getValueAt(br,4).toString();
        String f=Table.getValueAt(br,5).toString();
        String g=Table.getValueAt(br,6).toString();
        String h=Table.getValueAt(br,7).toString();
        String i=Table.getValueAt(br,8).toString();
        String j=Table.getValueAt(br,9).toString();
        String k=Table.getValueAt(br,10).toString();
        
        
id.setText(a);
namacb.setText(b);
tmplahir.setText(c);
tgllahir.setDateFormatString(d); 
dbaptis.setText(e); 
tmpbaptis.setText(f);
tglbaptis.setDateFormatString(g);
ayah.setText(h);
ibu.setText(i); 
alamat.setText(j);
tlpn.setText(k);
    }//GEN-LAST:event_TableMouseClicked

    private void Cari2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Cari2KeyReleased
        // TODO add your handling code here:
        String cari1= Cari2.getText();
 int jumdata=0;
 removeTable();
 String sql ="SELECT * FROM data_baptis where ID_baptis like '%"+cari1+"%' or namacb like '%"+cari1+"%' order by ID_baptis asc";
 System.out.println(sql);

   try{
        java.sql.Statement stat = conn.createStatement();
        ResultSet hasil = stat.executeQuery(sql);
         while (hasil.next()){
            String a    = hasil.getString("ID_baptis");
            String b    = hasil.getString("namacb");
            String c    = hasil.getString("tmplahir");
            String d    = hasil.getString("tgllahir");
            String e    = hasil.getString("dbaptis");
            String f    = hasil.getString("tmpbaptis");
            String g    = hasil.getString("tglbaptis");
            String h    = hasil.getString("ayah");
            String i    = hasil.getString("ibu");
            String j    = hasil.getString("alamat");
            String k    = hasil.getString("tlpn");
            String data[]={a,b,c,d,e,f,g,h,i,j,k};
            tabmode.addRow(data);
            jumdata=jumdata+1;
            }

 }catch(SQLException sqle){
 jumdata=0;
 JOptionPane.showMessageDialog(null,"Data Gagal Masuk Tabel"+sqle);
 }
 jml.setText(jumdata+" baptis");
    }//GEN-LAST:event_Cari2KeyReleased

    private void CetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CetakActionPerformed
        // TODO add your handling code here:
        try {
            String path="C:\\Users\\oscar\\Documents\\NetBeansProjects\\Gerejaproject\\src\\Laporan\\suratbaptis.jasper";
            HashMap parameter = new HashMap();
            parameter.put("baptis",id.getText());
            JasperPrint print = JasperFillManager.fillReport(path,parameter,conn);
            JasperViewer.viewReport(print, false);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane,"Dokumen Tidak Ada "+ex);
        }
    }//GEN-LAST:event_CetakActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        String text;
        text = (String)jComboBox1.getSelectedItem();
        dbaptis.setText(text);
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
        String text;
        text = (String)jComboBox2.getSelectedItem();
        tmpbaptis.setText(text);
    }//GEN-LAST:event_jComboBox2ActionPerformed

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
            java.util.logging.Logger.getLogger(Form_baptis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_baptis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_baptis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_baptis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_baptis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BATAL;
    private javax.swing.JTextField Cari2;
    private javax.swing.JButton Cetak;
    private javax.swing.JButton HAPUS;
    private javax.swing.JButton KEMBALI;
    private javax.swing.JButton SIMPAN;
    private javax.swing.JTable Table;
    private javax.swing.JButton UBAH;
    private javax.swing.JTextArea alamat;
    private javax.swing.JTextField ayah;
    private javax.swing.JTextField dbaptis;
    private javax.swing.JTextField ibu;
    private javax.swing.JTextField id;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jml;
    private javax.swing.JTextField namacb;
    private Tampilan.panelAlpha panelAlpha2;
    private com.toedter.calendar.JDateChooser tglbaptis;
    private com.toedter.calendar.JDateChooser tgllahir;
    private javax.swing.JTextField tlpn;
    private javax.swing.JTextField tmpbaptis;
    private javax.swing.JTextField tmplahir;
    // End of variables declaration//GEN-END:variables

    private void cetak() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
