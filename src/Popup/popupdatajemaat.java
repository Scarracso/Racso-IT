/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Popup;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Database.Koneksi;
import Tampilan.Form_Pemasukan;
import Tampilan.Form_PendataanJemaat;
import java.sql.PreparedStatement;
/**
 *
 * @author oscar
 */
public class popupdatajemaat extends javax.swing.JFrame {
private Connection conn = new Koneksi().connect();
private DefaultTableModel tabmode;
public Form_PendataanJemaat jemaat = null;
    /**
     * Creates new form popupdatajemaat
     */
    public popupdatajemaat() {
        initComponents();
        datatable();
    }

     public void removeTable(){
    try{
         for(int t=tabmode.getRowCount();t>0;t--) {tabmode.removeRow(0);}    }
    catch(Exception ex){ System.out.println(ex);  } }
     
     protected void datatable(){
      removeTable();
        int jumdata=0;
     Object[] Baris = {"ID Jemaat", "Nama Baptis", "Nama", "Tempat Lahir", "Tanggal Lahir", "Jenis Kelamin","Status Dalam Keluarga", "Tempat Baptis", "Tanggal Baptis", "Pendidikan", "Pekerjaan", "Lingkungan", "Alamat"};
    tabmode = new DefaultTableModel(null, Baris);
    Table.setModel(tabmode);
    String sql = "select * from data_jemaatgereja";
    try{
        java.sql.Statement stat = conn.createStatement();
        ResultSet hasil = stat.executeQuery(sql);
         while (hasil.next()){
            String a    = hasil.getString("ID_jemaat");
            String b    = hasil.getString("nma_Baptis");
            String c    = hasil.getString("nama");
            String d    = hasil.getString("tmp_lahir");
            String e    = hasil.getString("tgllahir");
            String f    = hasil.getString("jenis_kelamin");
            String g    = hasil.getString("status");
            String h    = hasil.getString("tmp_baptis");
            String i    = hasil.getString("tglbaptis");
            String j    = hasil.getString("pendidikan");
            String k    = hasil.getString("pekerjaan");
            String l    = hasil.getString("lingkungan2");
            String m    = hasil.getString("alamat");
            
            String data[]={a,b,c,d,e,f,g,h,i,j,k,l,m};
            tabmode.addRow(data);
            jumdata=jumdata+1;
            }
        }
    
    catch(SQLException sqle){
        jumdata=0;
        JOptionPane.showMessageDialog(null,"Data Gagal Masuk Tabel"+sqle);
        }
    
 jml.setText(jumdata+" Jemaat");
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        jml = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Cari2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jScrollPane1.setViewportView(Table);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 1000, 310));

        jml.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jml.setText("Jml");
        getContentPane().add(jml, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 160, -1, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Jumlah Jemaat :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 160, -1, -1));

        jLabel3.setFont(new java.awt.Font("Goudy Stout", 0, 24)); // NOI18N
        jLabel3.setText("DATA JEMAAT GEREJA");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

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
        getContentPane().add(Cari2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 240, 30));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Foto/icons-back.png"))); // NOI18N
        jButton1.setText("KEMBALI");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Foto/icons-search.png"))); // NOI18N
        jLabel4.setText("Pencarian :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Foto/Background popup lebar.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMouseClicked
        // TODO add your handling code here:
        int tebel1 = Table.getSelectedRow();
jemaat.idjemaat= Table.getValueAt(tebel1, 0).toString();
jemaat.popupdatajemaat();
this.dispose();
    }//GEN-LAST:event_TableMouseClicked

    private void Cari2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cari2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cari2ActionPerformed

    private void Cari2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Cari2KeyReleased
        // TODO add your handling code here:
        String cari1= Cari2.getText();
 int jumdata=0;
 removeTable();
 String sql ="SELECT * FROM data_jemaatgereja where ID_jemaat like '%"+cari1+"%' or nma_baptis like '%"+cari1+"%' order by ID_jemaat asc";
 System.out.println(sql);

   try{
        java.sql.Statement stat = conn.createStatement();
        ResultSet hasil = stat.executeQuery(sql);
         while (hasil.next()){
            String a    = hasil.getString("ID_jemaat");
            String b    = hasil.getString("nma_Baptis");
            String c    = hasil.getString("nama");
            String d    = hasil.getString("tmp_lahir");
            String e    = hasil.getString("tgllahir");
            String f    = hasil.getString("jenis_kelamin");
            String g    = hasil.getString("status");
            String h    = hasil.getString("tmp_baptis");
            String i    = hasil.getString("tglbaptis");
            String j    = hasil.getString("pendidikan");
            String k    = hasil.getString("pekerjaan");
            String l    = hasil.getString("lingkungan2");
            String m    = hasil.getString("alamat");
            
            String data[]={a,b,c,d,e,f,g,h,i,j,k,l,m};
            tabmode.addRow(data);
            jumdata=jumdata+1;
            }

 }catch(SQLException sqle){
 jumdata=0;
 JOptionPane.showMessageDialog(null,"Data Gagal Masuk Tabel"+sqle);
 }
 jml.setText(jumdata+" Jemaat Gereja");
    }//GEN-LAST:event_Cari2KeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(popupdatajemaat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(popupdatajemaat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(popupdatajemaat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(popupdatajemaat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new popupdatajemaat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Cari2;
    private javax.swing.JTable Table;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jml;
    // End of variables declaration//GEN-END:variables
}