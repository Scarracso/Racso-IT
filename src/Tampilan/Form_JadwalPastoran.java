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
import com.sun.glass.events.KeyEvent;
import java.awt.event.ActionEvent;
/**
 *
 * @author oscar
 */
public class Form_JadwalPastoran extends javax.swing.JFrame {
private Connection conn = new Koneksi().connect();
private DefaultTableModel tabmode;
     public Form_JadwalPastoran() {
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
jam.setText("");
nma_imam.setText("");
tmp_pelayanan.setText("");
ket.setText("");
nma_imam.requestFocus();
//tglpelayanan.setCalendar(null);
}

 protected void aktif(){
nma_imam.requestFocus();
id.setEnabled(false);

}
 
 public void removeTable(){
    try{
         for(int t=tabmode.getRowCount();t>0;t--) {tabmode.removeRow(0);}    }
    catch(Exception ex){ System.out.println(ex);  } }
 
 protected void datatable(){
      removeTable();
        int jumdata=0;
     Object[] Baris = {"ID Jadwal", "Hari dan Tanggal", "Jam", "Nama Imam/Diakon", "Tempat Pelayanan", "Keterangan"};
    tabmode = new DefaultTableModel(null, Baris);
    Table.setModel(tabmode);
    String sql = "select * from pembuatan_jadwal";
    try{
        java.sql.Statement stat = conn.createStatement();
        ResultSet hasil = stat.executeQuery(sql);
         while (hasil.next()){
            String a    = hasil.getString("ID_jadwal");
            String b    = hasil.getString("tglpelayanan");
            String c    = hasil.getString("jam");
            String d    = hasil.getString("nma_imam");
            String e    = hasil.getString("tmp_pelayanan");
            String f    = hasil.getString("ket");
           
            String data[]={a,b,c,d,e,f};
            tabmode.addRow(data);
            jumdata=jumdata+1;
            }
        }
    
    catch(SQLException sqle){
        jumdata=0;
        JOptionPane.showMessageDialog(null,"Data Gagal Masuk Tabel"+sqle);
        }
    
 jml.setText(jumdata+ " Jadwal");
}
 
protected void autonumber(){
 try{
 String sql = "SELECT ID_jadwal FROM pembuatan_jadwal order by ID_jadwal asc";
 Statement stat = conn.createStatement();
 ResultSet rs=stat.executeQuery(sql);

 while(rs.next()){
 String ID_jadwal = rs.getString("ID_jadwal").substring(2);
 int nomor = Integer.parseInt(ID_jadwal) + 1;
 String nol = "";

 if (nomor<10)
 {nol = "000";}
 else if (nomor<100)
 {nol = "00";}
 else if (nomor<1000)
 {nol = "";}

 id.setText("" + nol + nomor);
 }
 }
 catch (Exception e){
      JOptionPane.showMessageDialog(null,"Penomoran Salah" + e);
 }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        id = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tglpelayanan = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jam = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        nma_imam = new javax.swing.JTextField();
        panelAlpha2 = new Tampilan.panelAlpha();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        tmp_pelayanan = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ket = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        jml = new javax.swing.JLabel();
        Simpan = new javax.swing.JButton();
        Ubah = new javax.swing.JButton();
        Hapus = new javax.swing.JButton();
        Batal = new javax.swing.JButton();
        Kembali = new javax.swing.JButton();
        Cari2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        id.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 249, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ID Jadwal");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 130, -1));

        tglpelayanan.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        tglpelayanan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tglpelayananKeyPressed(evt);
            }
        });
        getContentPane().add(tglpelayanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 249, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Hari / Tanggal");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 110, -1));

        jam.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jamActionPerformed(evt);
            }
        });
        jam.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jamKeyPressed(evt);
            }
        });
        getContentPane().add(jam, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 250, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Jam");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 40, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nama Imam / Diakon");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, 160, -1));

        jComboBox2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "P. Ruben Ruruk Sandalajuk, MSA", "P. Romanus, MSA", "P. Blass, MSA", "P. Ebit, MSA", "P. Frans, MSA", "Diakon" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 80, 151, -1));

        nma_imam.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        nma_imam.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nma_imamKeyPressed(evt);
            }
        });
        getContentPane().add(nma_imam, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 80, 163, -1));

        panelAlpha2.setBackground(new java.awt.Color(153, 255, 153));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("FORM JADWAL PASTORAN");

        javax.swing.GroupLayout panelAlpha2Layout = new javax.swing.GroupLayout(panelAlpha2);
        panelAlpha2.setLayout(panelAlpha2Layout);
        panelAlpha2Layout.setHorizontalGroup(
            panelAlpha2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAlpha2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelAlpha2Layout.setVerticalGroup(
            panelAlpha2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAlpha2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap())
        );

        getContentPane().add(panelAlpha2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tempat Pelayanan");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, -1, -1));

        jComboBox1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gereja Paroki Pakumbang", "Gereja Stasi Pinyaho", "Gereja Stasi Jame ", "Gereja Stasi Betung", "Gereja Stasi Tebing Tinggi", "Gereja Stasi Mangaro", "Gereja Stasi Sungai Pinang", "Gereja Stasi Semugih", "Gereja Stasi Sompak", "Gereja Stasi Galar", "Gereja Stasi Sadok", "Gereja Stasi Dago", "Gereja Stasi Emang", "Gereja Stasi Kencok", "Gereja Stasi Berinang", "Gereja Stasi Lutukng", "Gereja Stasi Seba", "Gereja Stasi Tengge", "Gereja Stasi Pojok", "Gereja Stasi Tapakng" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 120, -1, -1));

        tmp_pelayanan.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        tmp_pelayanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmp_pelayananActionPerformed(evt);
            }
        });
        tmp_pelayanan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tmp_pelayananKeyPressed(evt);
            }
        });
        getContentPane().add(tmp_pelayanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 120, 163, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Keterangan");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 113, -1));

        ket.setColumns(20);
        ket.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        ket.setRows(5);
        ket.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ketKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(ket);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 160, 320, -1));

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

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 950, 210));

        jml.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jml.setText("Jumlah");
        getContentPane().add(jml, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 290, -1, -1));

        Simpan.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Simpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Foto/icons-save-.png"))); // NOI18N
        Simpan.setText("SIMPAN");
        Simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SimpanActionPerformed(evt);
            }
        });
        getContentPane().add(Simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 530, -1, -1));

        Ubah.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Ubah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Foto/icons-edit.png"))); // NOI18N
        Ubah.setText("UBAH");
        Ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UbahActionPerformed(evt);
            }
        });
        getContentPane().add(Ubah, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 530, -1, -1));

        Hapus.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Hapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Foto/icons-delete.png"))); // NOI18N
        Hapus.setText("HAPUS");
        Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusActionPerformed(evt);
            }
        });
        getContentPane().add(Hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 530, -1, -1));

        Batal.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Batal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Foto/icons-cancel.png"))); // NOI18N
        Batal.setText("BATAL");
        Batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BatalActionPerformed(evt);
            }
        });
        getContentPane().add(Batal, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 530, -1, -1));

        Kembali.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Kembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Foto/icons-back.png"))); // NOI18N
        Kembali.setText("KEMBALI");
        Kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KembaliActionPerformed(evt);
            }
        });
        getContentPane().add(Kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 530, -1, -1));

        Cari2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Cari2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Cari2KeyReleased(evt);
            }
        });
        getContentPane().add(Cari2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 260, 30));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Jumlah :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 290, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Foto/icons-search.png"))); // NOI18N
        jLabel10.setText("Pencarian :");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Foto/Background Form kecil.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 570));

        setSize(new java.awt.Dimension(971, 607));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SimpanActionPerformed
        // TODO add your handling code here:
       SimpleDateFormat sda = new SimpleDateFormat("EEEEE dd MMMMM yyyy");
       String tpl= sda.format(tglpelayanan.getDate());     
       
        String sql ="insert into pembuatan_jadwal values (?,?,?,?,?,?)";
        try{ PreparedStatement stat= conn.prepareStatement(sql);
            stat.setString (1, id.getText());
            stat.setString (2, tpl);
            stat.setString (3, jam.getText());
            stat.setString (4, nma_imam.getText());
            stat.setString (5, tmp_pelayanan.getText());
            stat.setString (6, ket.getText());
            
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
    }//GEN-LAST:event_SimpanActionPerformed

    private void UbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UbahActionPerformed
        // TODO add your handling code here:
 try{
 SimpleDateFormat sda = new SimpleDateFormat("EEEE dd MMMMM yyyy");
 String tpl= sda.format(tglpelayanan.getDate()); 
       
          String sql="update pembuatan_jadwal set tglpelayanan=?, jam=?, nma_imam=?, tmp_pelayanan=?, ket=? where ID_jadwal='"+id.getText()+"'";
            PreparedStatement stat = conn.prepareStatement(sql);
            //stat.setString (1, id.getText());
            stat.setString (1, tpl);
            stat.setString (2, jam.getText());
            stat.setString (3, nma_imam.getText());
            stat.setString (4, tmp_pelayanan.getText());
            stat.setString (5, ket.getText());
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
            String sql= "delete from pembuatan_jadwal where ID_jadwal ='"+id.getText()+"'";
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

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMouseClicked
        // TODO add your handling code here:
        int br=Table.getSelectedRow();
        String a=Table.getValueAt(br,0).toString();
        String b=Table.getValueAt(br,1).toString();
        String c=Table.getValueAt(br,2).toString();
        String d=Table.getValueAt(br,3).toString();
        String e=Table.getValueAt(br,4).toString();
        String f=Table.getValueAt(br,5).toString();

        id.setText(a);
        tglpelayanan.setDateFormatString(b);
        jam.setText(c);
        nma_imam.setText(d);
        tmp_pelayanan.setText(e);
        ket.setText(f);
    }//GEN-LAST:event_TableMouseClicked

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
        String text;
        text = (String)jComboBox2.getSelectedItem();
        nma_imam.setText(text);
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        String text;
        text = (String)jComboBox1.getSelectedItem();
        tmp_pelayanan.setText(text);
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void ketKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ketKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            prosesActionPerformed(new ActionEvent(evt.getSource(), evt.getID(), "Key Press proses"));
        }
    }//GEN-LAST:event_ketKeyPressed

    private void tmp_pelayananKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tmp_pelayananKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            ket.requestFocus();
        }
    }//GEN-LAST:event_tmp_pelayananKeyPressed

    private void tmp_pelayananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmp_pelayananActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tmp_pelayananActionPerformed

    private void nma_imamKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nma_imamKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            tmp_pelayanan.requestFocus();
        }
    }//GEN-LAST:event_nma_imamKeyPressed

    private void jamKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jamKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            nma_imam.requestFocus();
        }
    }//GEN-LAST:event_jamKeyPressed

    private void tglpelayananKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tglpelayananKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jam.requestFocus();
        }
    }//GEN-LAST:event_tglpelayananKeyPressed

    private void jamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jamActionPerformed

    private void Cari2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Cari2KeyReleased
        // TODO add your handling code here:
        String cari1= Cari2.getText();
 int jumdata=0;
 removeTable();
 String sql ="SELECT * FROM pembuatan_jadwal where ID_jadwal like '%"+cari1+"%' or nma_imam like '%"+cari1+"%' order by ID_jadwal asc";
 System.out.println(sql);

   try{
        java.sql.Statement stat = conn.createStatement();
        ResultSet hasil = stat.executeQuery(sql);
         while (hasil.next()){
            String a    = hasil.getString("ID_jadwal");
            String b    = hasil.getString("tglpelayanan");
            String c    = hasil.getString("jam");
            String d    = hasil.getString("nma_imam");
            String e    = hasil.getString("tmp_pelayanan");
            String f    = hasil.getString("ket");
           
            String data[]={a,b,c,d,e,f};
            tabmode.addRow(data);
            jumdata=jumdata+1;
            }

 }catch(SQLException sqle){
 jumdata=0;
 JOptionPane.showMessageDialog(null,"Data Gagal Masuk Tabel"+sqle);
 }
 jml.setText(jumdata+" Jadwal");
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
            java.util.logging.Logger.getLogger(Form_JadwalPastoran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_JadwalPastoran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_JadwalPastoran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_JadwalPastoran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_JadwalPastoran().setVisible(true);
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
    private javax.swing.JTextField id;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jam;
    private javax.swing.JLabel jml;
    private javax.swing.JTextArea ket;
    private javax.swing.JTextField nma_imam;
    private Tampilan.panelAlpha panelAlpha2;
    private com.toedter.calendar.JDateChooser tglpelayanan;
    private javax.swing.JTextField tmp_pelayanan;
    // End of variables declaration//GEN-END:variables

    private void cetak() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void prosesActionPerformed(ActionEvent actionEvent) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
