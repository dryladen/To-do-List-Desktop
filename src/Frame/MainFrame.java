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
    public MainFrame() {
        initComponents();
        modelKategori = new DefaultListModel();
        pnlKategori.setModel(modelKategori);
        getData();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        homePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnlKategori = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        pnlTanggal = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        pnlDeskripsi = new javax.swing.JTextArea();
        btnTambahKategori = new Frame.CButton();
        btnUbahKategori = new Frame.CButton();
        btnHapusKategori = new Frame.CButton();
        btnMoveUp = new Frame.CButton();
        btnMoveDown = new Frame.CButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("To-do List");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                tutupFrame(evt);
            }
        });

        homePanel.setBackground(new java.awt.Color(51, 255, 204));

        pnlKategori.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "KATEGORI", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        pnlKategori.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pnlKategori.setToolTipText("Tekan Enter untuk melihat kegiatan");
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
        pnlDeskripsi.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detail", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 1, 13))); // NOI18N
        pnlDeskripsi.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnlDeskripsi.setFocusable(false);
        pnlDeskripsi.setRequestFocusEnabled(false);
        pnlDeskripsi.setSelectionColor(new java.awt.Color(51, 255, 51));
        jScrollPane2.setViewportView(pnlDeskripsi);

        btnTambahKategori.setBackground(new java.awt.Color(204, 255, 255));
        btnTambahKategori.setText("Kategori Baru");
        btnTambahKategori.setBorderColor(new java.awt.Color(153, 153, 153));
        btnTambahKategori.setColorClick(new java.awt.Color(102, 153, 255));
        btnTambahKategori.setMaximumSize(new java.awt.Dimension(105, 23));
        btnTambahKategori.setMinimumSize(new java.awt.Dimension(105, 23));
        btnTambahKategori.setPreferredSize(new java.awt.Dimension(105, 23));
        btnTambahKategori.setRadius(10);
        btnTambahKategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahKategoriActionPerformed(evt);
            }
        });

        btnUbahKategori.setBackground(new java.awt.Color(204, 255, 255));
        btnUbahKategori.setText("Ubah");
        btnUbahKategori.setBorderColor(new java.awt.Color(153, 153, 153));
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

        btnHapusKategori.setBackground(new java.awt.Color(204, 255, 255));
        btnHapusKategori.setText("Hapus");
        btnHapusKategori.setBorderColor(new java.awt.Color(153, 153, 153));
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

        btnMoveUp.setBackground(new java.awt.Color(204, 255, 255));
        btnMoveUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/up-arrow (1).png"))); // NOI18N
        btnMoveUp.setBorderColor(new java.awt.Color(153, 153, 153));
        btnMoveUp.setColorClick(new java.awt.Color(102, 153, 255));
        btnMoveUp.setMaximumSize(new java.awt.Dimension(105, 23));
        btnMoveUp.setMinimumSize(new java.awt.Dimension(105, 23));
        btnMoveUp.setPreferredSize(new java.awt.Dimension(105, 23));
        btnMoveUp.setRadius(10);
        btnMoveUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoveUpActionPerformed(evt);
            }
        });

        btnMoveDown.setBackground(new java.awt.Color(204, 255, 255));
        btnMoveDown.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/down-arrow (1).png"))); // NOI18N
        btnMoveDown.setBorderColor(new java.awt.Color(153, 153, 153));
        btnMoveDown.setColorClick(new java.awt.Color(102, 153, 255));
        btnMoveDown.setMaximumSize(new java.awt.Dimension(105, 23));
        btnMoveDown.setMinimumSize(new java.awt.Dimension(105, 23));
        btnMoveDown.setPreferredSize(new java.awt.Dimension(105, 23));
        btnMoveDown.setRadius(10);
        btnMoveDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoveDownActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout homePanelLayout = new javax.swing.GroupLayout(homePanel);
        homePanel.setLayout(homePanelLayout);
        homePanelLayout.setHorizontalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, homePanelLayout.createSequentialGroup()
                        .addComponent(btnTambahKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUbahKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnHapusKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addGroup(homePanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnMoveUp, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMoveDown, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addContainerGap())
        );
        homePanelLayout.setVerticalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(homePanelLayout.createSequentialGroup()
                        .addComponent(btnMoveUp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMoveDown, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambahKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUbahKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHapusKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btnTambahKategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahKategoriActionPerformed
        InputFrame inputFrame = new InputFrame(true);
        inputFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnTambahKategoriActionPerformed
    
    private void pnlKategoriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlKategoriMouseClicked
        if(!pnlKategori.isSelectionEmpty()){
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
                getData();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Gagal menghapus kategori : "+ex);
            }
        }
    }//GEN-LAST:event_btnHapusKategoriActionPerformed

    private void btnMoveUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoveUpActionPerformed
        int index = pnlKategori.getSelectedIndex();
        String value = pnlKategori.getSelectedValue();
        if(!pnlKategori.isSelectionEmpty() && index > 0){
            moveItem(index, index-1);
            modelKategori.remove(index);
            modelKategori.add(index-1, value);
            dataKategori.get(index).setIdKategori(dataIdKategori.get(index-1));
            dataKategori.get(index-1).setIdKategori(dataIdKategori.get(index));
            dataKategori.add(index-1, dataKategori.get(index));
            dataKategori.remove(index+1);
            pnlKategori.setSelectedIndex(index-1);
        }
    }//GEN-LAST:event_btnMoveUpActionPerformed

    private void btnMoveDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoveDownActionPerformed
        int index = pnlKategori.getSelectedIndex();
        String value = pnlKategori.getSelectedValue();
        if(!pnlKategori.isSelectionEmpty() && index < modelKategori.getSize()){
            moveItem(index,index+1);
            dataKategori.get(index).setIdKategori(dataIdKategori.get(index+1));
            dataKategori.get(index+1).setIdKategori(dataIdKategori.get(index));
            dataKategori.add(index+2, dataKategori.get(index));
            dataKategori.remove(index);
            modelKategori.remove(index);
            modelKategori.add(index+1, value);
            pnlKategori.setSelectedIndex(index+1);
        }
    }//GEN-LAST:event_btnMoveDownActionPerformed

    private void tutupFrame(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_tutupFrame
//        setData();
    }//GEN-LAST:event_tutupFrame

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
    private Frame.CButton btnHapusKategori;
    private Frame.CButton btnMoveDown;
    private Frame.CButton btnMoveUp;
    private Frame.CButton btnTambahKategori;
    private Frame.CButton btnUbahKategori;
    public static javax.swing.JPanel homePanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea pnlDeskripsi;
    private javax.swing.JList<String> pnlKategori;
    private javax.swing.JTextPane pnlTanggal;
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

    private void moveItem(int index, int index0) {
        try {
            Connection cn = koneksi.getKoneksi();
            String sql = "UPDATE kategoriTable SET namaKategori=?,tanggalKategori=?,deskripsiKategori=? WHERE idKategori=?";
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, dataKategori.get(index0).getNamaKegiatan());
            pst.setString(2, dataKategori.get(index0).getTanggalKegiatan());
            pst.setString(3, dataKategori.get(index0).getDeskripsiKegiatan());
            pst.setString(4, dataKategori.get(index).getIdKategori());
            pst.execute();
            PreparedStatement pst0 = cn.prepareStatement(sql);
            pst0.setString(1, dataKategori.get(index).getNamaKegiatan());
            pst0.setString(2, dataKategori.get(index).getTanggalKegiatan());
            pst0.setString(3, dataKategori.get(index).getDeskripsiKegiatan());
            pst0.setString(4, dataKategori.get(index0).getIdKategori());
            pst0.execute();
            sql = "UPDATE kegiatanTable SET idKategori=? WHERE idKategori=?";
            PreparedStatement pst1 = cn.prepareStatement(sql);
            pst1.setString(1, "99");
            pst1.setString(2, dataIdKategori.get(index0));
            pst1.execute();
            PreparedStatement pst2 = cn.prepareStatement(sql);
            pst2.setString(1, dataIdKategori.get(index0));
            pst2.setString(2, dataIdKategori.get(index));
            pst2.execute();
            PreparedStatement pst3 = cn.prepareStatement(sql);
            pst3.setString(1, dataIdKategori.get(index));
            pst3.setString(2, "99");
            pst3.execute();
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}