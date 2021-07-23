package Frame;

import javax.swing.DefaultListModel;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Laden
 */
public class MainFrame extends javax.swing.JFrame {
    DefaultListModel modelKategori;
    ArrayList<String> dataIdKategori = new ArrayList();
    ArrayList<Kegiatan> dataKategori = new ArrayList();
    private final Koneksi koneksi = new Koneksi();
    private int x,y;
    
    public MainFrame() {
        initComponents();
        modelKategori = new DefaultListModel();
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
        colorChooser = new javax.swing.JMenu();
        warnaMerah = new javax.swing.JMenuItem();
        warnaHijau = new javax.swing.JMenuItem();
        warnaKuning = new javax.swing.JMenuItem();
        homePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnlKategori = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        pnlTanggal = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        pnlDeskripsi = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
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

        colorChooser.setText("Ubah warna");

        warnaMerah.setForeground(new java.awt.Color(255, 0, 0));
        warnaMerah.setText("Merah");
        colorChooser.add(warnaMerah);

        warnaHijau.setForeground(new java.awt.Color(0, 255, 0));
        warnaHijau.setText("Hijau");
        colorChooser.add(warnaHijau);

        warnaKuning.setForeground(new java.awt.Color(255, 255, 0));
        warnaKuning.setText("Kuning");
        colorChooser.add(warnaKuning);

        klikKanan.add(colorChooser);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("To-do List");
        setAutoRequestFocus(false);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                tutupFrame(evt);
            }
        });

        homePanel.setBackground(new java.awt.Color(51, 204, 255));

        pnlKategori.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "KATEGORI", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        pnlKategori.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pnlKategori.setToolTipText("Klik 2x untuk melihat kegiatan");
        pnlKategori.setComponentPopupMenu(klikKanan);
        pnlKategori.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlKategori.setDoubleBuffered(true);
        pnlKategori.setDragEnabled(true);
        pnlKategori.setDropMode(javax.swing.DropMode.INSERT);
        pnlKategori.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlKategoriMouseClicked(evt);
            }
        });
        pnlKategori.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pnlKategoriKeyTyped(evt);
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
        pnlDeskripsi.setFocusable(false);
        pnlDeskripsi.setRequestFocusEnabled(false);
        pnlDeskripsi.setSelectionColor(new java.awt.Color(51, 255, 51));
        jScrollPane2.setViewportView(pnlDeskripsi);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
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
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnHapusKategori, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnTambahKategori1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(btnUbahKategori, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout homePanelLayout = new javax.swing.GroupLayout(homePanel);
        homePanel.setLayout(homePanelLayout);
        homePanelLayout.setHorizontalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        homePanelLayout.setVerticalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homePanelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(homePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnUbahKategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahKategoriActionPerformed
        if(pnlKategori.isSelectionEmpty()){
            JOptionPane.showMessageDialog(null, "Pilih kategori dulu");
        } else {
            InputFrame input = new InputFrame(true,dataIdKategori.get(pnlKategori.getSelectedIndex()),true);
            input.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnUbahKategoriActionPerformed
    
    private void pnlKategoriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlKategoriMouseClicked
        if(evt.getClickCount() == 2){
            TaskFrame task = new TaskFrame(dataIdKategori.get(pnlKategori.getSelectedIndex()));
            task.setVisible(true);
            this.dispose();
        }
        if(!pnlKategori.isSelectionEmpty() && evt.getButton() == 1){
            try {
                int index = pnlKategori.getSelectedIndex();
                String sql = "SELECT * FROM kategoriTable WHERE idKategori=?";
                Connection cn = koneksi.getKoneksi();
                PreparedStatement pst = cn.prepareStatement(sql);
                pst.setString(1, dataIdKategori.get(index));
                ResultSet result = pst.executeQuery();
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
                JOptionPane.showMessageDialog(null, ex);
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_pnlKategoriMouseClicked

    private void pnlKategoriKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pnlKategoriKeyTyped
        if(!pnlKategori.isSelectionEmpty() && evt.getKeyChar() == 10){
            TaskFrame task = new TaskFrame(dataIdKategori.get(pnlKategori.getSelectedIndex()));
            task.setVisible(true);
            this.dispose();
        } 
    }//GEN-LAST:event_pnlKategoriKeyTyped

    private void btnHapusKategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusKategoriActionPerformed
        if(pnlKategori.isSelectionEmpty()){
            JOptionPane.showMessageDialog(null, "Pilih kategori dulu");
        } else {
            try {
                // menghapus item kategori
                String index = dataIdKategori.get(pnlKategori.getSelectedIndex());
                String sql = "DELETE FROM kategoriTable WHERE idKategori=?";
                Connection cn = koneksi.getKoneksi();
                PreparedStatement pst = cn.prepareStatement(sql);
                pst.setString(1, index);
                pst.execute();
                // menghapus item kegiatan
                sql = "DELETE FROM kegiatanTable WHERE idKategori=?";
                PreparedStatement pst1 = cn.prepareStatement(sql);
                pst1.setString(1, index);
                pst1.execute();
                dataIdKategori.remove(index);
                getData();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Gagal menghapus kategori : "+ex);
            }
        }
    }//GEN-LAST:event_btnHapusKategoriActionPerformed

    private void tutupFrame(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_tutupFrame
//        setData();
    }//GEN-LAST:event_tutupFrame

    private void moveUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moveUpActionPerformed
        int index = pnlKategori.getSelectedIndex();
        String value = pnlKategori.getSelectedValue();
        if(!pnlKategori.isSelectionEmpty() && index > 0){
            koneksi.moveItem(dataKategori, dataIdKategori, index, index-1,true);
            modelKategori.remove(index);
            modelKategori.add(index-1, value);
            dataKategori.get(index).setIdKategori(dataIdKategori.get(index-1));
            dataKategori.get(index-1).setIdKategori(dataIdKategori.get(index));
            dataKategori.add(index-1, dataKategori.get(index));
            dataKategori.remove(index+1);
            pnlKategori.setSelectedIndex(index-1);
        } else if(pnlKategori.isSelectionEmpty()){
            JOptionPane.showMessageDialog(null, "Pilih kategori dulu");
        }
    }//GEN-LAST:event_moveUpActionPerformed

    private void moveDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moveDownActionPerformed
        int index = pnlKategori.getSelectedIndex();
        String value = pnlKategori.getSelectedValue();
        if(!pnlKategori.isSelectionEmpty() && index < modelKategori.getSize()-1){
            koneksi.moveItem(dataKategori, dataIdKategori, index, index+1,true);
            dataKategori.get(index).setIdKategori(dataIdKategori.get(index+1));
            dataKategori.get(index+1).setIdKategori(dataIdKategori.get(index));
            dataKategori.add(index+2, dataKategori.get(index));
            dataKategori.remove(index);
            modelKategori.remove(index);
            modelKategori.add(index+1, value);
            pnlKategori.setSelectedIndex(index+1);
        } else if (pnlKategori.isSelectionEmpty()){
            JOptionPane.showMessageDialog(null, "Pilih kategori dulu");
        }
    }//GEN-LAST:event_moveDownActionPerformed

    private void btnTambahKategori1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahKategori1ActionPerformed
        InputFrame inputFrame = new InputFrame(true);
        inputFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnTambahKategori1ActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int xx = evt.getXOnScreen();
        int yy = evt.getYOnScreen();
        this.setLocation(xx-x,yy-y);
    }//GEN-LAST:event_jPanel1MouseDragged

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
    private Frame.CButton btnExit;
    private Frame.CButton btnHapusKategori;
    private Frame.CButton btnTambahKategori1;
    private Frame.CButton btnUbahKategori;
    private javax.swing.JMenu colorChooser;
    public static javax.swing.JPanel homePanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPopupMenu klikKanan;
    private javax.swing.JMenuItem moveDown;
    private javax.swing.JMenu moveKategori;
    private javax.swing.JMenuItem moveUp;
    private javax.swing.JTextArea pnlDeskripsi;
    private javax.swing.JList<String> pnlKategori;
    private javax.swing.JTextPane pnlTanggal;
    private javax.swing.JMenuItem warnaHijau;
    private javax.swing.JMenuItem warnaKuning;
    private javax.swing.JMenuItem warnaMerah;
    // End of variables declaration//GEN-END:variables

    private void getData(){
        try{
            modelKategori.removeAllElements();
            Connection cn = koneksi.getKoneksi();
            Statement stm = cn.createStatement();
            ResultSet rst = stm.executeQuery("SELECT * FROM kategoriTable");
            while(rst.next()){
                modelKategori.addElement(rst.getString(2));
                dataIdKategori.add(rst.getString(1));
                dataKategori.add(new Kegiatan(rst.getString(1),"",rst.getString(2),rst.getString(3),rst.getString(4)));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error : "+ ex);
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
}