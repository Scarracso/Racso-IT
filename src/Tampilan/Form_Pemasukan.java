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
import javax.swing.JFrame;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import Popup.popupadmin1;
import Popup.popupkolekte;
/**
 *
 * @author oscar
 */
public class Form_Pemasukan extends javax.swing.JFrame {
public String kolekte,nominaljml;
public String idadmin;
private Connection conn = new Koneksi().connect();
private DefaultTableModel tabmode;


    public Form_Pemasukan() {
        initComponents();
        datatable();
        kosong();
        aktif();
        autonumber();
        Locale locale = new Locale ("id","ID");
        Locale.setDefault(locale);    
      
    }

    protected void kosong(){
id_pemasukan.setText("");
id_admin.setText("");
tglpemasukan.setCalendar(null);
nma_pemasukan.setText("");
jns_pemasukan.setText("");
jml_pemasukan.setText("");
ket_pemasukan.setText("");
}

 protected void aktif(){
jml_pemasukan.requestFocus();
id_pemasukan.setEnabled(false);  
//Ubah.setEnabled(false);  
}

 public void popupadmin1(){
     popupadmin1 Pp = new popupadmin1();
     Pp.adm1 = this;
     id_admin.setText(idadmin);
     }

 public void popupkolekte(){
     popupkolekte Pp = new popupkolekte();
     Pp.kol = this;
     nma_pemasukan.setText(kolekte);
     jml_pemasukan.setText(nominaljml);
 }
 
protected void autonumber(){
 try{
 String sql = "SELECT ID_pemasukan FROM data_pemasukan order by ID_pemasukan asc";
 Statement stat = conn.createStatement();
 ResultSet rs=stat.executeQuery(sql);

 while(rs.next()){
 String ID_pemasukan = rs.getString("ID_pemasukan").substring(2);
 int nomor = Integer.parseInt(ID_pemasukan) + 1;
 String nol = "";

 if (nomor<10)
 {nol = "000";}
 else if (nomor<100)
 {nol = "00";}
 else if (nomor<1000)
 {nol = "";}

 id_pemasukan.setText("PP" + nol + nomor);
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
     Object[] Baris = {"ID Pemasukan", "ID Admin", "Hari/Tanggal", "Nama Pemasukan", "Jumlah Pemasukan", "Jenis Pemasukan", "Keterangan"};
    tabmode = new DefaultTableModel(null, Baris);
    Table.setModel(tabmode);
    String sql = "select * from data_pemasukan";
    try{
        java.sql.Statement stat = conn.createStatement();
        ResultSet hasil = stat.executeQuery(sql);
         while (hasil.next()){
            String a    = hasil.getString("ID_pemasukan");
            String b    = hasil.getString("id_admin");
            String c    = hasil.getString("tglpemasukan");
            String d    = hasil.getString("nma_pemasukan");
            String e    = hasil.getString("jml_pemasukan");
            String f    = hasil.getString("jns_pemasukan");
            String g    = hasil.getString("ket_pemasukan");
           
            String data[]={a,b,c,d,e,f,g};
            tabmode.addRow(data);
            jumdata=jumdata+1;
            }
        }
    
    catch(SQLException sqle){
        JOptionPane.showMessageDialog(null,"Data Gagal Masuk Tabel"+sqle);
        }
    jml.setText(jumdata+" Pemasukan");
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        id_pemasukan = new javax.swing.JTextField();
        id_admin = new javax.swing.JTextField();
        cari_admin = new javax.swing.JButton();
        tglpemasukan = new com.toedter.calendar.JDateChooser();
        nma_pemasukan = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jns_pemasukan = new javax.swing.JTextField();
        jml_pemasukan = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ket_pemasukan = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Cari2 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        panelAlpha2 = new Tampilan.panelAlpha();
        jLabel7 = new javax.swing.JLabel();
        Simpan = new javax.swing.JButton();
        Hapus = new javax.swing.JButton();
        Kembali = new javax.swing.JButton();
        Ubah = new javax.swing.JButton();
        Batal = new javax.swing.JButton();
        jml = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        id_pemasukan.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        getContentPane().add(id_pemasukan, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 261, -1));

        id_admin.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        getContentPane().add(id_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 261, -1));

        cari_admin.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cari_admin.setText("Cari Data");
        cari_admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cari_adminActionPerformed(evt);
            }
        });
        getContentPane().add(cari_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, -1, -1));

        tglpemasukan.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        getContentPane().add(tglpemasukan, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 261, -1));

        nma_pemasukan.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        getContentPane().add(nma_pemasukan, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 261, -1));

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton1.setText("Cari Data");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, -1, -1));

        jComboBox1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Barang", "Uang" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 80, 114, -1));

        jns_pemasukan.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        getContentPane().add(jns_pemasukan, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 80, 141, -1));

        jml_pemasukan.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        getContentPane().add(jml_pemasukan, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 260, -1));

        ket_pemasukan.setColumns(20);
        ket_pemasukan.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        ket_pemasukan.setRows(5);
        jScrollPane1.setViewportView(ket_pemasukan);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 120, 260, 90));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID Pemasukan");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("ID Admin");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Hari / Tanggal");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nama Pemasukan");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Jenis Pemasukan");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Jumlah Pemasukan");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Keterangan");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 120, -1, -1));

        Cari2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Cari2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Cari2KeyReleased(evt);
            }
        });
        getContentPane().add(Cari2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 323, 250, 30));

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

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 950, 161));

        panelAlpha2.setBackground(new java.awt.Color(153, 255, 153));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("FORM PEMASUKAN");

        javax.swing.GroupLayout panelAlpha2Layout = new javax.swing.GroupLayout(panelAlpha2);
        panelAlpha2.setLayout(panelAlpha2Layout);
        panelAlpha2Layout.setHorizontalGroup(
            panelAlpha2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAlpha2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
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

        Simpan.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Simpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Foto/icons-save-.png"))); // NOI18N
        Simpan.setText("SIMPAN");
        Simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SimpanActionPerformed(evt);
            }
        });
        getContentPane().add(Simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 530, -1, -1));

        Hapus.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Hapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Foto/icons-delete.png"))); // NOI18N
        Hapus.setText("HAPUS");
        Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusActionPerformed(evt);
            }
        });
        getContentPane().add(Hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 530, -1, -1));

        Kembali.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Kembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Foto/icons-back.png"))); // NOI18N
        Kembali.setText("KEMBALI");
        Kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KembaliActionPerformed(evt);
            }
        });
        getContentPane().add(Kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 530, -1, -1));

        Ubah.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Ubah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Foto/icons-edit.png"))); // NOI18N
        Ubah.setText("UBAH");
        Ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UbahActionPerformed(evt);
            }
        });
        getContentPane().add(Ubah, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 530, -1, -1));

        Batal.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Batal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Foto/icons-cancel.png"))); // NOI18N
        Batal.setText("BATAL");
        Batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BatalActionPerformed(evt);
            }
        });
        getContentPane().add(Batal, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 530, -1, -1));

        jml.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jml.setText("Jml");
        getContentPane().add(jml, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 340, -1, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setText("Jumlah :");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 340, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Foto/icons-search.png"))); // NOI18N
        jLabel10.setText("Pencarian :");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 315, -1, 40));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 0, 0));
        jLabel12.setText("*Bila tidak Ada Keterangan, cukup di isi dengan strip (-)");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 250, -1, 20));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 0, 0));
        jLabel13.setText("Catatan :");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 230, -1, -1));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 0, 0));
        jLabel14.setText("*Sumbangan Dana/barang dari Jemaat  di luar data kolekte");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 280, -1, -1));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 0, 0));
        jLabel15.setText(" harus di input tanpa menggunakan cari data di nama pemasukan");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 300, 370, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Foto/Background Form kecil.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setSize(new java.awt.Dimension(971, 612));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SimpanActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat sda = new SimpleDateFormat("EEEEE dd MMMMM yyyy");
       String tpl= sda.format(tglpemasukan.getDate());     
       
        String sql ="insert into data_pemasukan values (?,?,?,?,?,?,?)";
        try{ PreparedStatement stat= conn.prepareStatement(sql);
            stat.setString (1, id_pemasukan.getText());
            stat.setString (2, id_admin.getText());
            stat.setString (3, tpl);
            stat.setString (4, nma_pemasukan.getText());
            stat.setString (5, jml_pemasukan.getText());
            stat.setString (6, jns_pemasukan.getText());
            stat.setString (7, ket_pemasukan.getText());
            
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null,"data berhasil disimpan");
        }
        catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Error"+e);
        }
         kosong();
         datatable();
         autonumber();
    }//GEN-LAST:event_SimpanActionPerformed

    private void UbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UbahActionPerformed
        // TODO add your handling code here:
        try{
 SimpleDateFormat sda = new SimpleDateFormat("EEEE dd MMMMM yyyy");
 String tpl= sda.format(tglpemasukan.getDate()); 
       
          String sql="update data_pemasukan set id_admin=?, tglpemasukan=?, nma_pemasukan=?, jml_pemasukan=?, jns_pemasukan=?, ket_pemasukan=? where ID_pemasukan='"+id_pemasukan.getText()+"'";
            PreparedStatement stat = conn.prepareStatement(sql);
            //stat.setString (1, id_pemasukan.getText());
            stat.setString (1, id_admin.getText());
            stat.setString (2, tpl);
            stat.setString (3, nma_pemasukan.getText());
            stat.setString (4, jml_pemasukan.getText());
            stat.setString (5, jns_pemasukan.getText());
            stat.setString (6, ket_pemasukan.getText());
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

    private void HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusActionPerformed
        // TODO add your handling code here:
        int j=JOptionPane.showConfirmDialog(null,"Delete","konfirmasiDialog",JOptionPane.YES_NO_OPTION);
        if (j==0){
            String sql= "delete from data_pemasukan where ID_pemasukan ='"+id_pemasukan.getText()+"'";
            try{
                PreparedStatement stat= conn.prepareStatement(sql);
                stat.executeUpdate();
                JOptionPane.showMessageDialog(null,"Data dihapus");
                kosong();
                id_pemasukan.requestFocus();
            }
            catch(SQLException x){
                JOptionPane.showMessageDialog(null,"Data Gagagl dihapus"+x);
            }
            kosong();
            datatable();
            autonumber();
        } 
    }//GEN-LAST:event_HapusActionPerformed

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
        
id_pemasukan.setText(a);
id_admin.setText(b);
tglpemasukan.setDateFormatString(c);
nma_pemasukan.setText(d);
jml_pemasukan.setText(e); 
jns_pemasukan.setText(f); 
ket_pemasukan.setText(g);  
    }//GEN-LAST:event_TableMouseClicked

    private void cari_adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cari_adminActionPerformed
        // TODO add your handling code here:
        popupadmin1 Pp = new popupadmin1();
        Pp.adm1 = this;
        Pp.setVisible(true);
        Pp.setResizable(false);
    }//GEN-LAST:event_cari_adminActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        String text;
        text = (String)jComboBox1.getSelectedItem();
        jns_pemasukan.setText(text);
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        popupkolekte Pp = new popupkolekte();
        Pp.kol = this;
        Pp.setVisible(true);
        Pp.setResizable(false);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void Cari2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Cari2KeyReleased
        // TODO add your handling code here:
        String cari1= Cari2.getText();
 int jumdata=0;
 removeTable();
 String sql ="SELECT * FROM data_pemasukan where ID_pemasukan like '%"+cari1+"%' or nma_pemasukan like '%"+cari1+"%' order by ID_pemasukan asc";
 System.out.println(sql);

   try{
        java.sql.Statement stat = conn.createStatement();
        ResultSet hasil = stat.executeQuery(sql);
         while (hasil.next()){
            String a    = hasil.getString("ID_pemasukan");
            String b    = hasil.getString("id_admin");
            String c    = hasil.getString("tglpemasukan");
            String d    = hasil.getString("nma_pemasukan");
            String e    = hasil.getString("jml_pemasukan");
            String f    = hasil.getString("jns_pemasukan");
            String g    = hasil.getString("ket_pemasukan");
           
            String data[]={a,b,c,d,e,f,g};
            tabmode.addRow(data);
            jumdata=jumdata+1;
            }

 }catch(SQLException sqle){
 jumdata=0;
 JOptionPane.showMessageDialog(null,"Data Gagal Masuk Tabel"+sqle);
 }
 jml.setText(jumdata+" Pemasukan");
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
            java.util.logging.Logger.getLogger(Form_Pemasukan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_Pemasukan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_Pemasukan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_Pemasukan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_Pemasukan().setVisible(true);
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
    private javax.swing.JButton cari_admin;
    private javax.swing.JTextField id_admin;
    private javax.swing.JTextField id_pemasukan;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
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
    private javax.swing.JTextField jml_pemasukan;
    private javax.swing.JTextField jns_pemasukan;
    private javax.swing.JTextArea ket_pemasukan;
    private javax.swing.JTextField nma_pemasukan;
    private Tampilan.panelAlpha panelAlpha2;
    private com.toedter.calendar.JDateChooser tglpemasukan;
    // End of variables declaration//GEN-END:variables

    //private void initComponents() {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   // }
}
