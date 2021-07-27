package Frame;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Laden
 */
public class TaskFrame extends javax.swing.JFrame {
    DefaultListModel modelKegiatan;
    ArrayList<String> dataIdKegiatan = new ArrayList();
    ArrayList<Kegiatan> dataKegiatan = new ArrayList();
    private final Koneksi koneksi = new Koneksi();
    private String idKategori = "";
    private int x,y;
    
    public TaskFrame() {
        initComponents();
        setIconImage(new ImageIcon("to-do-list.png").getImage());
        getLokasi();
        modelKegiatan = new DefaultListModel();
        pnlKegiatan.setCellRenderer(new Renderer(false));
        pnlKegiatan.setModel(modelKegiatan);
        getData();
    }
    
    public TaskFrame(String idKategori) {
        initComponents();
        setIconImage(new ImageIcon("to-do-list.png").getImage());
        getLokasi();
        this.idKategori = idKategori;
        modelKegiatan = new DefaultListModel();
        pnlKegiatan.setCellRenderer(new Renderer(false));
        pnlKegiatan.setModel(modelKegiatan);
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
        mainPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnlKegiatan = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        pnlDetail = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        pnlTanggal = new javax.swing.JTextPane();
        jPanel1 = new javax.swing.JPanel();
        btnMenuAwal = new Frame.CButton();
        btnTambahKegiatan = new Frame.CButton();
        btnUbahKegiatan = new Frame.CButton();
        btnHapusKegiatan = new Frame.CButton();
        btnExit = new Frame.CButton();

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
        setBackground(new java.awt.Color(51, 255, 204));
        setUndecorated(true);

        mainPanel.setBackground(new java.awt.Color(51, 204, 255));

        pnlKegiatan.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "KEGIATAN", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        pnlKegiatan.setComponentPopupMenu(klikKanan);
        pnlKegiatan.setDoubleBuffered(true);
        pnlKegiatan.setDragEnabled(true);
        pnlKegiatan.setDropMode(javax.swing.DropMode.INSERT);
        pnlKegiatan.setMinimumSize(new java.awt.Dimension(80, 0));
        pnlKegiatan.setRequestFocusEnabled(false);
        pnlKegiatan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlKegiatanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(pnlKegiatan);

        pnlDetail.setEditable(false);
        pnlDetail.setColumns(20);
        pnlDetail.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pnlDetail.setLineWrap(true);
        pnlDetail.setRows(2);
        pnlDetail.setAutoscrolls(false);
        pnlDetail.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Deskripsi", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 1, 13))); // NOI18N
        pnlDetail.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnlDetail.setFocusable(false);
        pnlDetail.setPreferredSize(new java.awt.Dimension(116, 61));
        pnlDetail.setRequestFocusEnabled(false);
        pnlDetail.setSelectionColor(new java.awt.Color(51, 255, 51));
        jScrollPane2.setViewportView(pnlDetail);

        pnlTanggal.setEditable(false);
        pnlTanggal.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tanggal", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 1, 13))); // NOI18N
        jScrollPane3.setViewportView(pnlTanggal);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setComponentPopupMenu(aturUkuran);
        jPanel1.setMinimumSize(new java.awt.Dimension(150, 386));
        jPanel1.setPreferredSize(new java.awt.Dimension(151, 30));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        btnMenuAwal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/arrow.png"))); // NOI18N
        btnMenuAwal.setBorderColor(new java.awt.Color(0, 153, 153));
        btnMenuAwal.setColor(new java.awt.Color(0, 153, 153));
        btnMenuAwal.setColorClick(new java.awt.Color(0, 153, 153));
        btnMenuAwal.setMaximumSize(new java.awt.Dimension(105, 23));
        btnMenuAwal.setMinimumSize(new java.awt.Dimension(105, 23));
        btnMenuAwal.setPreferredSize(new java.awt.Dimension(105, 23));
        btnMenuAwal.setRadius(10);
        btnMenuAwal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuAwalActionPerformed(evt);
            }
        });

        btnTambahKegiatan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/plus-sign.png"))); // NOI18N
        btnTambahKegiatan.setBorderColor(new java.awt.Color(0, 153, 153));
        btnTambahKegiatan.setColor(new java.awt.Color(0, 153, 153));
        btnTambahKegiatan.setColorClick(new java.awt.Color(0, 153, 153));
        btnTambahKegiatan.setMaximumSize(new java.awt.Dimension(105, 23));
        btnTambahKegiatan.setMinimumSize(new java.awt.Dimension(105, 23));
        btnTambahKegiatan.setPreferredSize(new java.awt.Dimension(105, 23));
        btnTambahKegiatan.setRadius(10);
        btnTambahKegiatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahKegiatanActionPerformed(evt);
            }
        });

        btnUbahKegiatan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/edit.png"))); // NOI18N
        btnUbahKegiatan.setBorderColor(new java.awt.Color(0, 153, 153));
        btnUbahKegiatan.setColor(new java.awt.Color(0, 153, 153));
        btnUbahKegiatan.setColorClick(new java.awt.Color(0, 153, 153));
        btnUbahKegiatan.setMaximumSize(new java.awt.Dimension(105, 23));
        btnUbahKegiatan.setMinimumSize(new java.awt.Dimension(105, 23));
        btnUbahKegiatan.setPreferredSize(new java.awt.Dimension(105, 23));
        btnUbahKegiatan.setRadius(10);
        btnUbahKegiatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahKegiatanActionPerformed(evt);
            }
        });

        btnHapusKegiatan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/trash.png"))); // NOI18N
        btnHapusKegiatan.setBorderColor(new java.awt.Color(0, 153, 153));
        btnHapusKegiatan.setColor(new java.awt.Color(0, 153, 153));
        btnHapusKegiatan.setColorClick(new java.awt.Color(0, 153, 153));
        btnHapusKegiatan.setMaximumSize(new java.awt.Dimension(105, 23));
        btnHapusKegiatan.setMinimumSize(new java.awt.Dimension(105, 23));
        btnHapusKegiatan.setPreferredSize(new java.awt.Dimension(105, 23));
        btnHapusKegiatan.setRadius(10);
        btnHapusKegiatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusKegiatanActionPerformed(evt);
            }
        });

        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/cancel.png"))); // NOI18N
        btnExit.setBorderColor(new java.awt.Color(0, 153, 153));
        btnExit.setColor(new java.awt.Color(0, 153, 153));
        btnExit.setColorClick(new java.awt.Color(0, 153, 153));
        btnExit.setColorOver(new java.awt.Color(255, 0, 0));
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnMenuAwal, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTambahKegiatan, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUbahKegiatan, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHapusKegiatan, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMenuAwal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTambahKegiatan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUbahKegiatan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHapusKegiatan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuAwalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuAwalActionPerformed
        setLokasi();
        MainFrame main = new MainFrame();
        main.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMenuAwalActionPerformed

    private void btnTambahKegiatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahKegiatanActionPerformed
        setLokasi();
        InputFrame input = new InputFrame(false,idKategori);
        input.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnTambahKegiatanActionPerformed

    private void btnUbahKegiatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahKegiatanActionPerformed
        if(pnlKegiatan.isSelectionEmpty()){
            JOptionPane.showMessageDialog(pnlKegiatan, "Pilih kegiatan dulu");
        } else {
            InputFrame input = new InputFrame(true,idKategori,dataIdKegiatan.get(pnlKegiatan.getSelectedIndex()),false);
            input.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnUbahKegiatanActionPerformed

    private void btnHapusKegiatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusKegiatanActionPerformed
        if(pnlKegiatan.isSelectionEmpty()){
            JOptionPane.showMessageDialog(pnlKegiatan, "Pilih kegiatan dulu");
        } else {
            try {
                String index = dataIdKegiatan.get(pnlKegiatan.getSelectedIndex());
                String sql = "DELETE FROM kegiatanTable WHERE idKegiatan=?";
                Connection cn = koneksi.getKoneksi();
                PreparedStatement pst = cn.prepareStatement(sql);
                pst.setString(1, index);
                pst.execute();
                getData();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(pnlKegiatan, "Gagal menghapus kegiatan : "+ex);
            }
        }
    }//GEN-LAST:event_btnHapusKegiatanActionPerformed

    private void pnlKegiatanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlKegiatanMouseClicked
        if(evt.getClickCount() == 2){
            try {
                int index = pnlKegiatan.getSelectedIndex();
                String sql = "UPDATE kegiatanTable SET isCheck=1 WHERE idKegiatan=?";
                if(dataKegiatan.get(index).getIsCheck().equals("1")){
                    sql = "UPDATE kegiatanTable SET isCheck=0 WHERE idKegiatan=?";
                    dataKegiatan.get(index).setIsCheck("0");
                } else {
                    dataKegiatan.get(index).setIsCheck("1");
                }
                Connection cn = koneksi.getKoneksi();
                PreparedStatement pst = cn.prepareStatement(sql);
                pst.setString(1, dataIdKegiatan.get(index));
                pst.execute();
                getData();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(pnlKegiatan, ex);
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(!pnlKegiatan.isSelectionEmpty()){
            try {
                
                int index = pnlKegiatan.getSelectedIndex();
                String sql = "SELECT * FROM kegiatanTable WHERE idKegiatan=?";
                Connection cn = koneksi.getKoneksi();
                PreparedStatement pst = cn.prepareStatement(sql);
                pst.setString(1, dataIdKegiatan.get(index));
                ResultSet result = pst.executeQuery();
                String tanggal = null,deskripsi=null;
                pnlDetail.setText("");
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
                pnlDetail.setText(deskripsi);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(pnlKegiatan, ex);
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_pnlKegiatanMouseClicked

    private void moveUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moveUpActionPerformed
        int index = pnlKegiatan.getSelectedIndex();
        String value = pnlKegiatan.getSelectedValue();
        if(!pnlKegiatan.isSelectionEmpty() && index > 0){
            koneksi.moveItem(dataKegiatan, dataIdKegiatan, index, index-1,false);
            modelKegiatan.remove(index);
            modelKegiatan.add(index-1, value);
            dataKegiatan.get(index).setIdKategori(dataIdKegiatan.get(index-1));
            dataKegiatan.get(index-1).setIdKategori(dataIdKegiatan.get(index));
            dataKegiatan.add(index-1, dataKegiatan.get(index));
            dataKegiatan.remove(index+1);
            pnlKegiatan.setSelectedIndex(index-1);
        } else if (pnlKegiatan.isSelectionEmpty()){
            JOptionPane.showMessageDialog(pnlKegiatan, "Pilih kegiatan dulu");
        }
    }//GEN-LAST:event_moveUpActionPerformed

    private void moveDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moveDownActionPerformed
        int index = pnlKegiatan.getSelectedIndex();
        String value = pnlKegiatan.getSelectedValue();
        if(!pnlKegiatan.isSelectionEmpty() && index < modelKegiatan.getSize()-1){
            koneksi.moveItem(dataKegiatan, dataIdKegiatan, index, index+1,false);
            dataKegiatan.get(index).setIdKategori(dataIdKegiatan.get(index+1));
            dataKegiatan.get(index+1).setIdKategori(dataIdKegiatan.get(index));
            dataKegiatan.add(index+2, dataKegiatan.get(index));
            dataKegiatan.remove(index);
            modelKegiatan.remove(index);
            modelKegiatan.add(index+1, value);
            pnlKegiatan.setSelectedIndex(index+1);
        } else if (pnlKegiatan.isSelectionEmpty()){
            JOptionPane.showMessageDialog(pnlKegiatan, "Pilih kegiatan dulu");
        }
    }//GEN-LAST:event_moveDownActionPerformed

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int xx = evt.getXOnScreen();
        int yy = evt.getYOnScreen();
        if(yy-y < 40){
            this.setLocation(xx-x,0);
        } else {
            this.setLocation(xx-x,yy-y);
        }
    }//GEN-LAST:event_jPanel1MouseDragged

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        setLokasi();
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TaskFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPopupMenu aturUkuran;
    private Frame.CButton btnExit;
    private Frame.CButton btnHapusKegiatan;
    private Frame.CButton btnMenuAwal;
    private Frame.CButton btnTambahKegiatan;
    private Frame.CButton btnUbahKegiatan;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPopupMenu klikKanan;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JMenuItem moveDown;
    private javax.swing.JMenu moveKategori;
    private javax.swing.JMenuItem moveUp;
    private javax.swing.JTextArea pnlDetail;
    private javax.swing.JList<String> pnlKegiatan;
    private javax.swing.JTextPane pnlTanggal;
    private javax.swing.JMenu ukuran;
    private javax.swing.JMenuItem ukuran1;
    private javax.swing.JMenuItem ukuran2;
    private javax.swing.JMenuItem ukuran3;
    // End of variables declaration//GEN-END:variables

    private void getData() {
        try{
            modelKegiatan.removeAllElements();
            String sql = "SELECT * FROM kegiatanTable WHERE idKategori=?";
            Connection cn = koneksi.getKoneksi();
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, idKategori);
            ResultSet rst = pst.executeQuery();
            while(rst.next()){
                modelKegiatan.addElement(new JlistCustom(rst.getString(2), rst.getString(6)));
                dataIdKegiatan.add(rst.getString(1));
                dataKegiatan.add(new Kegiatan(rst.getString(1),"",rst.getString(2),rst.getString(3),rst.getString(4),rst.getString(6)));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(pnlKegiatan, "Error : "+ ex);
        } 
    }
    
    private void setLokasi() {
        try{
            String sql = "UPDATE lokasiTable SET getX=?,getY=?,width=?,height=?";
            Connection cn = koneksi.getKoneksi();
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setInt(1, getX());
            pst.setInt(2, getY());
            pst.setInt(3, getWidth());
            pst.setInt(4, getHeight());
            pst.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(pnlKegiatan, "Error : "+ ex);
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    private void getLokasi() {
        try {
            Connection cn = koneksi.getKoneksi();
            Statement stm = cn.createStatement();
            ResultSet rst = stm.executeQuery("SELECT * FROM lokasiTable");
            while (rst.next()) {
                this.setBounds(rst.getInt(1), rst.getInt(2), rst.getInt(3), rst.getInt(4));
            }
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
