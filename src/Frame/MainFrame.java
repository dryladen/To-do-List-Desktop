package Frame;

import javax.swing.DefaultListModel;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Laden
 */
public class MainFrame extends javax.swing.JFrame {
    DefaultListModel modelKategori;
    ArrayList<String> dataIdKategori = new ArrayList();
    ArrayList<Kegiatan> dataKategori = new ArrayList();
    PreparedStatement pst;
    Statement stm;
    ResultSet result;
    private final Koneksi koneksi = new Koneksi();
    private int x,y;
    
    public MainFrame() {
        initComponents();
        setIconImage(new ImageIcon("to-do-list.png").getImage());
        getLokasi();
        modelKategori = new DefaultListModel();
        pnlKategori.setCellRenderer(new Renderer(true));
        pnlKategori.setModel(modelKategori);
        getData();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        klikKanan = new javax.swing.JPopupMenu();
        moveKategori = new javax.swing.JMenu();
        moveUp = new javax.swing.JMenuItem();
        moveDown = new javax.swing.JMenuItem();
        aturUkuran = new javax.swing.JPopupMenu();
        ukuran = new javax.swing.JMenu();
        ukuran1 = new javax.swing.JMenuItem();
        ukuran2 = new javax.swing.JMenuItem();
        ukuran3 = new javax.swing.JMenuItem();
        homePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnlKategori = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        pnlTanggal = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        pnlDeskripsi = new javax.swing.JTextArea();
        jtaskBar = new javax.swing.JPanel();
        btnExit = new Frame.CButton();
        btnHapusKategori = new Frame.CButton();
        btnTambahKategori1 = new Frame.CButton();
        btnUbahKategori = new Frame.CButton();

        klikKanan.setComponentPopupMenu(klikKanan);

        moveKategori.setText("Pindah posisi");

        moveUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/up-arrow (1).png"))); // NOI18N
        moveUp.setText("Ke atas");
        moveUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveUpActionPerformed(evt);
            }
        });
        moveKategori.add(moveUp);

        moveDown.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/down-arrow (1).png"))); // NOI18N
        moveDown.setText("Ke bawah");
        moveDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveDownActionPerformed(evt);
            }
        });
        moveKategori.add(moveDown);

        klikKanan.add(moveKategori);

        ukuran.setText("Atur Ukuran");

        ukuran1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ukuran1.setText("600x500");
        ukuran1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ukuran1ActionPerformed(evt);
            }
        });
        ukuran.add(ukuran1);

        ukuran2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ukuran2.setText("312x386");
        ukuran2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ukuran2ActionPerformed(evt);
            }
        });
        ukuran.add(ukuran2);

        ukuran3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ukuran3.setText("200x386");
        ukuran3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ukuran3ActionPerformed(evt);
            }
        });
        ukuran.add(ukuran3);

        aturUkuran.add(ukuran);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("To-do List");
        setAutoRequestFocus(false);
        setLocationByPlatform(true);
        setUndecorated(true);

        homePanel.setBackground(new java.awt.Color(51, 204, 255));
        homePanel.setPreferredSize(new java.awt.Dimension(312, 386));

        pnlKategori.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "KATEGORI", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        pnlKategori.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pnlKategori.setToolTipText("Klik 2x untuk melihat kegiatan");
        pnlKategori.setAutoscrolls(false);
        pnlKategori.setComponentPopupMenu(klikKanan);
        pnlKategori.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlKategori.setDoubleBuffered(true);
        pnlKategori.setDragEnabled(true);
        pnlKategori.setDropMode(javax.swing.DropMode.INSERT);
        pnlKategori.setMinimumSize(new java.awt.Dimension(80, 0));
        pnlKategori.setRequestFocusEnabled(false);
        pnlKategori.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlKategoriMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(pnlKategori);

        pnlTanggal.setEditable(false);
        pnlTanggal.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tanggal", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 1, 13))); // NOI18N
        jScrollPane3.setViewportView(pnlTanggal);

        pnlDeskripsi.setEditable(false);
        pnlDeskripsi.setColumns(5);
        pnlDeskripsi.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pnlDeskripsi.setLineWrap(true);
        pnlDeskripsi.setRows(2);
        pnlDeskripsi.setAutoscrolls(false);
        pnlDeskripsi.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Deskripsi", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 1, 13))); // NOI18N
        pnlDeskripsi.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setViewportView(pnlDeskripsi);

        jtaskBar.setBackground(new java.awt.Color(0, 153, 153));
        jtaskBar.setToolTipText("Klik kanan untuk mengatur ukuran");
        jtaskBar.setComponentPopupMenu(aturUkuran);
        jtaskBar.setMinimumSize(new java.awt.Dimension(150, 386));
        jtaskBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jtaskBarMouseDragged(evt);
            }
        });
        jtaskBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtaskBarMousePressed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(0, 153, 153));
        btnExit.setBorder(null);
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/cancel.png"))); // NOI18N
        btnExit.setBorderColor(new java.awt.Color(0, 153, 153));
        btnExit.setBorderPainted(false);
        btnExit.setColor(new java.awt.Color(0, 153, 153));
        btnExit.setColorOver(new java.awt.Color(255, 0, 0));
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnHapusKategori.setBackground(new java.awt.Color(0, 153, 153));
        btnHapusKategori.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/trash.png"))); // NOI18N
        btnHapusKategori.setBorderColor(new java.awt.Color(0, 153, 153));
        btnHapusKategori.setColor(new java.awt.Color(0, 153, 153));
        btnHapusKategori.setColorClick(new java.awt.Color(102, 153, 255));
        btnHapusKategori.setMaximumSize(new java.awt.Dimension(105, 23));
        btnHapusKategori.setMinimumSize(new java.awt.Dimension(105, 23));
        btnHapusKategori.setPreferredSize(new java.awt.Dimension(105, 23));
        btnHapusKategori.setRadius(10);
        btnHapusKategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusKategoriActionPerformed(evt);
            }
        });

        btnTambahKategori1.setBackground(new java.awt.Color(0, 153, 153));
        btnTambahKategori1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/plus-sign.png"))); // NOI18N
        btnTambahKategori1.setBorderColor(new java.awt.Color(0, 153, 153));
        btnTambahKategori1.setColor(new java.awt.Color(0, 153, 153));
        btnTambahKategori1.setColorClick(new java.awt.Color(102, 153, 255));
        btnTambahKategori1.setMaximumSize(new java.awt.Dimension(105, 23));
        btnTambahKategori1.setMinimumSize(new java.awt.Dimension(105, 23));
        btnTambahKategori1.setPreferredSize(new java.awt.Dimension(105, 23));
        btnTambahKategori1.setRadius(10);
        btnTambahKategori1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahKategori1ActionPerformed(evt);
            }
        });

        btnUbahKategori.setBackground(new java.awt.Color(0, 153, 153));
        btnUbahKategori.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/edit.png"))); // NOI18N
        btnUbahKategori.setBorderColor(new java.awt.Color(0, 153, 153));
        btnUbahKategori.setColor(new java.awt.Color(0, 153, 153));
        btnUbahKategori.setColorClick(new java.awt.Color(102, 153, 255));
        btnUbahKategori.setMaximumSize(new java.awt.Dimension(105, 23));
        btnUbahKategori.setMinimumSize(new java.awt.Dimension(105, 23));
        btnUbahKategori.setPreferredSize(new java.awt.Dimension(105, 23));
        btnUbahKategori.setRadius(10);
        btnUbahKategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahKategoriActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jtaskBarLayout = new javax.swing.GroupLayout(jtaskBar);
        jtaskBar.setLayout(jtaskBarLayout);
        jtaskBarLayout.setHorizontalGroup(
            jtaskBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jtaskBarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnTambahKategori1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUbahKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHapusKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jtaskBarLayout.setVerticalGroup(
            jtaskBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnHapusKategori, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnUbahKategori, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jtaskBarLayout.createSequentialGroup()
                .addGroup(jtaskBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTambahKategori1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout homePanelLayout = new javax.swing.GroupLayout(homePanel);
        homePanel.setLayout(homePanelLayout);
        homePanelLayout.setHorizontalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1))
                .addContainerGap())
            .addComponent(jtaskBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        homePanelLayout.setVerticalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homePanelLayout.createSequentialGroup()
                .addComponent(jtaskBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // button ubah kategori
    private void btnUbahKategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahKategoriActionPerformed
        if(pnlKategori.isSelectionEmpty()){
            JOptionPane.showMessageDialog(pnlKategori, "Pilih kategori dulu");
        } else {
            InputFrame input = new InputFrame(true,dataIdKategori.get(pnlKategori.getSelectedIndex()),true);
            input.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnUbahKategoriActionPerformed
    // event panel kategori ketika di klik
    private void pnlKategoriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlKategoriMouseClicked
        if(evt.getClickCount() == 2){ // event klik 2x untuk masuk ke TaskFrame
            setLokasi();
            TaskFrame task = new TaskFrame(dataIdKategori.get(pnlKategori.getSelectedIndex()));
            task.setVisible(true);
            this.dispose();
        }
        if(!pnlKategori.isSelectionEmpty() && evt.getButton() == 1){ // untuk menampilkan tanggal dan deskripsi
            try {
                int index = pnlKategori.getSelectedIndex();
                String sql = "SELECT * FROM kategoriTable WHERE idKategori=?";
                Connection cn = koneksi.getKoneksi();
                pst = cn.prepareStatement(sql);
                pst.setString(1, dataIdKategori.get(index));
                result = pst.executeQuery();
                String tanggal = null,deskripsi=null;
                pnlDeskripsi.setText("");
                while(result.next()){
                    tanggal = result.getString(3);
                    deskripsi = result.getString(4);
                }
                if(tanggal == null || tanggal.equals("")){
                    tanggal = "-";
                }
                if(deskripsi == null || deskripsi.equals("")){
                    deskripsi = "-";
                }
                pnlTanggal.setText(tanggal);
                pnlDeskripsi.setText(deskripsi);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(pnlKategori, ex);
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    result.close();
                    pst.close();
                } catch (SQLException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            } 
        }
    }//GEN-LAST:event_pnlKategoriMouseClicked
    // button hapus
    private void btnHapusKategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusKategoriActionPerformed
        if(pnlKategori.isSelectionEmpty()){ // message jika tidak ada kategori yang di select
            JOptionPane.showMessageDialog(pnlKategori, "Pilih kategori dulu");
        } else {
            try {
                // menghapus item kategori
                String index = dataIdKategori.get(pnlKategori.getSelectedIndex());
                String sql = "DELETE FROM kategoriTable WHERE idKategori=?";
                Connection cn = koneksi.getKoneksi();
                pst = cn.prepareStatement(sql);
                pst.setString(1, index);
                pst.execute();
                // menghapus item kegiatan
                sql = "DELETE FROM kegiatanTable WHERE idKategori=?";
                PreparedStatement pst1 = cn.prepareStatement(sql);
                pst1.setString(1, index);
                pst1.execute();
                dataIdKategori.remove(index);
                pnlTanggal.setText("-");
                pnlDeskripsi.setText("-");
                getData();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(pnlKategori, "Gagal menghapus kategori : "+ex);
            } finally {
                try {
                    pst.close();
                } catch (SQLException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            } 
        }
    }//GEN-LAST:event_btnHapusKategoriActionPerformed
    // event memindahkan item ke atas
    private void moveUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moveUpActionPerformed
        if(!pnlKategori.isSelectionEmpty()){
            int index = pnlKategori.getSelectedIndex();
            String value = dataKategori.get(index).getNamaKegiatan();
            if(index > 0){
                koneksi.moveItem(dataKategori, dataIdKategori, index, index-1,true);
                modelKategori.remove(index);
                modelKategori.add(index-1, new JlistCustom(value, ""));
                dataKategori.get(index).setIdKategori(dataIdKategori.get(index-1));
                dataKategori.get(index-1).setIdKategori(dataIdKategori.get(index));
                dataKategori.add(index-1, dataKategori.get(index));
                dataKategori.remove(index+1);
                pnlKategori.setSelectedIndex(index-1);
            }
        } else if(pnlKategori.isSelectionEmpty()){ // message jika tidak ada kategori yang di select
            JOptionPane.showMessageDialog(pnlKategori, "Pilih kategori dulu");
        }
    }//GEN-LAST:event_moveUpActionPerformed
    // event memindahkan item ke bawah
    private void moveDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moveDownActionPerformed
        if(!pnlKategori.isSelectionEmpty()){
            int index = pnlKategori.getSelectedIndex();
            String value = dataKategori.get(index).getNamaKegiatan();
            if(index < modelKategori.getSize()-1){
                koneksi.moveItem(dataKategori, dataIdKategori, index, index+1,true);
                dataKategori.get(index).setIdKategori(dataIdKategori.get(index+1));
                dataKategori.get(index+1).setIdKategori(dataIdKategori.get(index));
                dataKategori.add(index+2, dataKategori.get(index));
                dataKategori.remove(index);
                modelKategori.remove(index);
                modelKategori.add(index+1, new JlistCustom(value, ""));
                pnlKategori.setSelectedIndex(index+1);
            }
        } else if (pnlKategori.isSelectionEmpty()){ // message jika tidak ada kategori yang di select
            JOptionPane.showMessageDialog(pnlKategori, "Pilih kategori dulu");
        }
    }//GEN-LAST:event_moveDownActionPerformed
    // button tambah kategori
    private void btnTambahKategori1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahKategori1ActionPerformed
        // pindah ke TaskFRame
        setLokasi();
        InputFrame inputFrame = new InputFrame(true);
        inputFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnTambahKategori1ActionPerformed
    // button exit
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        setLokasi();
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed
    // event untuk memindahkan lokasi frame
    private void jtaskBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtaskBarMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jtaskBarMousePressed
    // event untuk memindahkan lokasi frame
    private void jtaskBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtaskBarMouseDragged
        int xx = evt.getXOnScreen();
        int yy = evt.getYOnScreen();
        if(yy-y < 40){
            this.setLocation(xx-x,0);
        } else {
            this.setLocation(xx-x,yy-y);
        }
    }//GEN-LAST:event_jtaskBarMouseDragged
    // event mengatur ukuran frame
    private void ukuran1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ukuran1ActionPerformed
        setSize(600, 500);
    }//GEN-LAST:event_ukuran1ActionPerformed
    private void ukuran2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ukuran2ActionPerformed
        setSize(312, 386);
    }//GEN-LAST:event_ukuran2ActionPerformed
    private void ukuran3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ukuran3ActionPerformed
        setSize(200, 386);
    }//GEN-LAST:event_ukuran3ActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MainFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPopupMenu aturUkuran;
    private Frame.CButton btnExit;
    private Frame.CButton btnHapusKategori;
    private Frame.CButton btnTambahKategori1;
    private Frame.CButton btnUbahKategori;
    public static javax.swing.JPanel homePanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel jtaskBar;
    private javax.swing.JPopupMenu klikKanan;
    private javax.swing.JMenuItem moveDown;
    private javax.swing.JMenu moveKategori;
    private javax.swing.JMenuItem moveUp;
    private javax.swing.JTextArea pnlDeskripsi;
    private javax.swing.JList<String> pnlKategori;
    private javax.swing.JTextPane pnlTanggal;
    private javax.swing.JMenu ukuran;
    private javax.swing.JMenuItem ukuran1;
    private javax.swing.JMenuItem ukuran2;
    private javax.swing.JMenuItem ukuran3;
    // End of variables declaration//GEN-END:variables
    
    // fungsi untuk mengambil data dari database dan ditampilkan ke panel kategori
    private void getData(){
        try{
            modelKategori.removeAllElements();
            dataKategori.clear();
            Connection cn = koneksi.getKoneksi();
            stm = cn.createStatement();
            result = stm.executeQuery("SELECT * FROM kategoriTable");
            while(result.next()){
                modelKategori.addElement(new JlistCustom(result.getString(2), ""));
                dataIdKategori.add(result.getString(1));
                dataKategori.add(new Kegiatan(result.getString(1),"",result.getString(2),result.getString(3),result.getString(4),""));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(pnlKategori, "Error : "+ ex);
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                result.close();
                stm.close();
            } catch (SQLException ex) {
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
    }
    // method untuk menyimpan lokasi kedalam database
    private void setLokasi() {
        try{
            String sql = "UPDATE lokasiTable SET getX=?,getY=?,width=?,height=?";
            Connection cn = koneksi.getKoneksi();
            pst = cn.prepareStatement(sql);
            pst.setInt(1, getX());
            pst.setInt(2, getY());
            pst.setInt(3, getWidth());
            pst.setInt(4, getHeight());
            pst.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(pnlKategori, "Error : "+ ex);
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                result.close();
                pst.close();
            } catch (SQLException ex) {
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
    }
    // method untuk mengambil lokasi dari dalam database
    private void getLokasi() {
        try {
            Connection cn = koneksi.getKoneksi();
            stm = cn.createStatement();
            result = stm.executeQuery("SELECT * FROM lokasiTable");
            while (result.next()) {
                this.setBounds(result.getInt(1), result.getInt(2), result.getInt(3), result.getInt(4));
            }
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                result.close();
                stm.close();
            } catch (SQLException ex) {
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
    }
}