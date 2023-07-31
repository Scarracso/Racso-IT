
package Tampilan;

public class Halaman_utama extends javax.swing.JFrame {

    
    public Halaman_utama() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        panelAlpha11 = new Tampilan.panelAlpha();
        panelAlpha4 = new Tampilan.panelAlpha();
        Form_baptis = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        panelAlpha2 = new Tampilan.panelAlpha();
        Form_pemasukan = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        panelAlpha5 = new Tampilan.panelAlpha();
        Form_jemaat = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        panelAlpha6 = new Tampilan.panelAlpha();
        Form_pengeluaran = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        panelAlpha8 = new Tampilan.panelAlpha();
        Form_kolekte = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        panelAlpha3 = new Tampilan.panelAlpha();
        Form_jadwal = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        panelAlpha9 = new Tampilan.panelAlpha();
        jLabel16 = new javax.swing.JLabel();
        tanggal = new javax.swing.JSpinner();
        panelAlpha10 = new Tampilan.panelAlpha();
        Form_Anggota = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        Laporan = new javax.swing.JButton();
        Keluar = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("jCheckBoxMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelAlpha11.setOpaque(false);

        panelAlpha4.setBackground(new java.awt.Color(153, 153, 255));
        panelAlpha4.setOpaque(false);

        Form_baptis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Foto/icon baptis.png"))); // NOI18N
        Form_baptis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Form_baptisActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Pendaftaran Baptis");

        javax.swing.GroupLayout panelAlpha4Layout = new javax.swing.GroupLayout(panelAlpha4);
        panelAlpha4.setLayout(panelAlpha4Layout);
        panelAlpha4Layout.setHorizontalGroup(
            panelAlpha4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAlpha4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Form_baptis, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAlpha4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(25, 25, 25))
        );
        panelAlpha4Layout.setVerticalGroup(
            panelAlpha4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAlpha4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Form_baptis)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelAlpha2.setBackground(new java.awt.Color(153, 153, 255));
        panelAlpha2.setOpaque(false);

        Form_pemasukan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Foto/icon pemasukan.png"))); // NOI18N
        Form_pemasukan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Form_pemasukanActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Pemasukan");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("Anggaran Gereja");

        javax.swing.GroupLayout panelAlpha2Layout = new javax.swing.GroupLayout(panelAlpha2);
        panelAlpha2.setLayout(panelAlpha2Layout);
        panelAlpha2Layout.setHorizontalGroup(
            panelAlpha2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAlpha2Layout.createSequentialGroup()
                .addGroup(panelAlpha2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAlpha2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Form_pemasukan, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelAlpha2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel9))
                    .addGroup(panelAlpha2Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelAlpha2Layout.setVerticalGroup(
            panelAlpha2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAlpha2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Form_pemasukan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelAlpha5.setBackground(new java.awt.Color(153, 153, 255));
        panelAlpha5.setOpaque(false);

        Form_jemaat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Foto/icon pendataan jemaat.png"))); // NOI18N
        Form_jemaat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Form_jemaatActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Pendataan");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("Jemaat Gereja");

        javax.swing.GroupLayout panelAlpha5Layout = new javax.swing.GroupLayout(panelAlpha5);
        panelAlpha5.setLayout(panelAlpha5Layout);
        panelAlpha5Layout.setHorizontalGroup(
            panelAlpha5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAlpha5Layout.createSequentialGroup()
                .addGroup(panelAlpha5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAlpha5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Form_jemaat, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelAlpha5Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel5))
                    .addGroup(panelAlpha5Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel10)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelAlpha5Layout.setVerticalGroup(
            panelAlpha5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAlpha5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Form_jemaat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelAlpha6.setBackground(new java.awt.Color(153, 153, 255));
        panelAlpha6.setOpaque(false);

        Form_pengeluaran.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Foto/icon pengeluaran.png"))); // NOI18N
        Form_pengeluaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Form_pengeluaranActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Pengeluaran ");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setText("Anggaran Gereja");

        javax.swing.GroupLayout panelAlpha6Layout = new javax.swing.GroupLayout(panelAlpha6);
        panelAlpha6.setLayout(panelAlpha6Layout);
        panelAlpha6Layout.setHorizontalGroup(
            panelAlpha6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAlpha6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Form_pengeluaran, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAlpha6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelAlpha6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(panelAlpha6Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel6)))
                .addGap(34, 34, 34))
        );
        panelAlpha6Layout.setVerticalGroup(
            panelAlpha6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAlpha6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Form_pengeluaran)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelAlpha8.setBackground(new java.awt.Color(153, 153, 255));
        panelAlpha8.setOpaque(false);

        Form_kolekte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Foto/icon data kolekte.png"))); // NOI18N
        Form_kolekte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Form_kolekteActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Data Kolekte ");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setText("Hari Minggu");

        javax.swing.GroupLayout panelAlpha8Layout = new javax.swing.GroupLayout(panelAlpha8);
        panelAlpha8.setLayout(panelAlpha8Layout);
        panelAlpha8Layout.setHorizontalGroup(
            panelAlpha8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAlpha8Layout.createSequentialGroup()
                .addGroup(panelAlpha8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAlpha8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Form_kolekte, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelAlpha8Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(panelAlpha8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel12))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelAlpha8Layout.setVerticalGroup(
            panelAlpha8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAlpha8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Form_kolekte)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addContainerGap())
        );

        panelAlpha3.setBackground(new java.awt.Color(153, 153, 255));
        panelAlpha3.setOpaque(false);

        Form_jadwal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Foto/icon jadwal.png"))); // NOI18N
        Form_jadwal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Form_jadwalActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Pembuatan");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel14.setText("Jadwal Pelayanan Gereja");

        javax.swing.GroupLayout panelAlpha3Layout = new javax.swing.GroupLayout(panelAlpha3);
        panelAlpha3.setLayout(panelAlpha3Layout);
        panelAlpha3Layout.setHorizontalGroup(
            panelAlpha3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAlpha3Layout.createSequentialGroup()
                .addGroup(panelAlpha3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAlpha3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Form_jadwal, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelAlpha3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel14))
                    .addGroup(panelAlpha3Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelAlpha3Layout.setVerticalGroup(
            panelAlpha3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAlpha3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Form_jadwal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelAlpha9.setBackground(new java.awt.Color(153, 255, 153));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel16.setText("HALAMAN UTAMA");

        javax.swing.GroupLayout panelAlpha9Layout = new javax.swing.GroupLayout(panelAlpha9);
        panelAlpha9.setLayout(panelAlpha9Layout);
        panelAlpha9Layout.setHorizontalGroup(
            panelAlpha9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAlpha9Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jLabel16)
                .addContainerGap(92, Short.MAX_VALUE))
        );
        panelAlpha9Layout.setVerticalGroup(
            panelAlpha9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAlpha9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tanggal.setModel(new javax.swing.SpinnerDateModel());

        panelAlpha10.setBackground(new java.awt.Color(153, 153, 255));
        panelAlpha10.setOpaque(false);

        Form_Anggota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Foto/Anggota.png"))); // NOI18N
        Form_Anggota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Form_AnggotaActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setText("Anggota DPP");

        javax.swing.GroupLayout panelAlpha10Layout = new javax.swing.GroupLayout(panelAlpha10);
        panelAlpha10.setLayout(panelAlpha10Layout);
        panelAlpha10Layout.setHorizontalGroup(
            panelAlpha10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAlpha10Layout.createSequentialGroup()
                .addGroup(panelAlpha10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAlpha10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Form_Anggota, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelAlpha10Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel13)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelAlpha10Layout.setVerticalGroup(
            panelAlpha10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAlpha10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Form_Anggota)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Laporan.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Laporan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Foto/icon_laporan_1-removebg-preview.png"))); // NOI18N
        Laporan.setText("LAPORAN");
        Laporan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LaporanActionPerformed(evt);
            }
        });

        Keluar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Keluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Foto/icon_close-removebg-preview.png"))); // NOI18N
        Keluar.setText("KELUAR");
        Keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KeluarActionPerformed(evt);
            }
        });

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Laporan/Logo.jpg"))); // NOI18N

        javax.swing.GroupLayout panelAlpha11Layout = new javax.swing.GroupLayout(panelAlpha11);
        panelAlpha11.setLayout(panelAlpha11Layout);
        panelAlpha11Layout.setHorizontalGroup(
            panelAlpha11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAlpha11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAlpha11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelAlpha11Layout.createSequentialGroup()
                        .addGroup(panelAlpha11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Keluar, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Laporan))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                        .addComponent(panelAlpha4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelAlpha6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(panelAlpha11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelAlpha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelAlpha5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(panelAlpha11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelAlpha8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelAlpha10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addComponent(panelAlpha3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108))
            .addGroup(panelAlpha11Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel17)
                .addGroup(panelAlpha11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAlpha11Layout.createSequentialGroup()
                        .addGap(348, 348, 348)
                        .addComponent(panelAlpha9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelAlpha11Layout.createSequentialGroup()
                        .addGap(475, 475, 475)
                        .addComponent(tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelAlpha11Layout.setVerticalGroup(
            panelAlpha11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAlpha11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelAlpha9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(panelAlpha11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAlpha11Layout.createSequentialGroup()
                        .addGroup(panelAlpha11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(panelAlpha5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelAlpha4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelAlpha10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(25, 25, 25)
                        .addGroup(panelAlpha11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelAlpha8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelAlpha2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelAlpha6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAlpha11Layout.createSequentialGroup()
                        .addComponent(panelAlpha3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(166, 166, 166))))
            .addGroup(panelAlpha11Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addComponent(Laporan)
                .addGap(18, 18, 18)
                .addComponent(Keluar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(panelAlpha11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 590));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Foto/bg menu utama.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 590));

        setSize(new java.awt.Dimension(1213, 630));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Form_baptisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Form_baptisActionPerformed
        // TODO add your handling code here:
        new Form_baptis().setVisible(true);
        dispose();
    }//GEN-LAST:event_Form_baptisActionPerformed

    private void Form_jemaatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Form_jemaatActionPerformed
        // TODO add your handling code here:
        new Form_PendataanJemaat().setVisible(true);
        dispose();
    }//GEN-LAST:event_Form_jemaatActionPerformed

    private void Form_pengeluaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Form_pengeluaranActionPerformed
        // TODO add your handling code here:
        new Form_Pengeluaran().setVisible(true);
        dispose();
    }//GEN-LAST:event_Form_pengeluaranActionPerformed

    private void Form_pemasukanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Form_pemasukanActionPerformed
        // TODO add your handling code here:
        new Form_Pemasukan().setVisible(true);
        dispose();
    }//GEN-LAST:event_Form_pemasukanActionPerformed

    private void Form_kolekteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Form_kolekteActionPerformed
        // TODO add your handling code here:
        new Form_KolekteMinggu().setVisible(true);
        dispose();
    }//GEN-LAST:event_Form_kolekteActionPerformed

    private void Form_jadwalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Form_jadwalActionPerformed
        // TODO add your handling code here:
        new Form_JadwalPastoran().setVisible(true);
        dispose();
    }//GEN-LAST:event_Form_jadwalActionPerformed

    private void Form_AnggotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Form_AnggotaActionPerformed
        // TODO add your handling code here:
        new Form_Anggota_DPP().setVisible(true);
        dispose();
    }//GEN-LAST:event_Form_AnggotaActionPerformed

    private void LaporanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LaporanActionPerformed
        // TODO add your handling code here:
        new Laporan().setVisible(true);
        dispose();
    }//GEN-LAST:event_LaporanActionPerformed

    private void KeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KeluarActionPerformed
        // TODO add your handling code here:
        new Login().setVisible(true);
        dispose();
    }//GEN-LAST:event_KeluarActionPerformed

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
            java.util.logging.Logger.getLogger(Halaman_utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Halaman_utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Halaman_utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Halaman_utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Halaman_utama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Form_Anggota;
    private javax.swing.JButton Form_baptis;
    private javax.swing.JButton Form_jadwal;
    private javax.swing.JButton Form_jemaat;
    private javax.swing.JButton Form_kolekte;
    private javax.swing.JButton Form_pemasukan;
    private javax.swing.JButton Form_pengeluaran;
    private javax.swing.JButton Keluar;
    private javax.swing.JButton Laporan;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private Tampilan.panelAlpha panelAlpha10;
    private Tampilan.panelAlpha panelAlpha11;
    private Tampilan.panelAlpha panelAlpha2;
    private Tampilan.panelAlpha panelAlpha3;
    private Tampilan.panelAlpha panelAlpha4;
    private Tampilan.panelAlpha panelAlpha5;
    private Tampilan.panelAlpha panelAlpha6;
    private Tampilan.panelAlpha panelAlpha8;
    private Tampilan.panelAlpha panelAlpha9;
    private javax.swing.JSpinner tanggal;
    // End of variables declaration//GEN-END:variables
}
