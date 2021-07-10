package Frame;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Laden
 */
public class TaskFrame extends javax.swing.JFrame {
    DefaultListModel modelKegiatan;
    ArrayList<String> dataIdKegiatan = new ArrayList();
    private final Koneksi koneksi = new Koneksi();
    private String idKategori = "";
    
    public TaskFrame() {
        initComponents();
        modelKegiatan = new DefaultListModel();
        pnlKegiatan.setModel(modelKegiatan);
        getData();
    }
    
    public TaskFrame(String idKategori) {
        initComponents();
        this.idKategori = idKategori;
        modelKegiatan = new DefaultListModel();
        pnlKegiatan.setModel(modelKegiatan);
        getData();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnlKegiatan = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        pnlDetail = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        pnlTanggal = new javax.swing.JTextPane();
        btnMenuAwal = new Frame.CButton();
        btnTambahKegiatan = new Frame.CButton();
        btnUbahKegiatan = new Frame.CButton();
        btnHapusKegiatan = new Frame.CButton();
        btnUbahKegiatan1 = new Frame.CButton();
        btnUbahKegiatan2 = new Frame.CButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 255, 204));

        mainPanel.setBackground(new java.awt.Color(51, 255, 204));

        pnlKegiatan.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "KEGIATAN", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        pnlKegiatan.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        pnlKegiatan.setValueIsAdjusting(true);
        pnlKegiatan.setVerifyInputWhenFocusTarget(false);
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
        pnlDetail.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detail", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 1, 13))); // NOI18N
        pnlDetail.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnlDetail.setSelectionColor(new java.awt.Color(51, 255, 51));
        jScrollPane2.setViewportView(pnlDetail);

        pnlTanggal.setEditable(false);
        pnlTanggal.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tanggal", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 1, 13))); // NOI18N
        jScrollPane3.setViewportView(pnlTanggal);

        btnMenuAwal.setBackground(new java.awt.Color(204, 255, 255));
        btnMenuAwal.setText("Menu Awal");
        btnMenuAwal.setBorderColor(new java.awt.Color(153, 153, 153));
        btnMenuAwal.setColorClick(new java.awt.Color(102, 153, 255));
        btnMenuAwal.setMaximumSize(new java.awt.Dimension(105, 23));
        btnMenuAwal.setMinimumSize(new java.awt.Dimension(105, 23));
        btnMenuAwal.setPreferredSize(new java.awt.Dimension(105, 23));
        btnMenuAwal.setRadius(10);
        btnMenuAwal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuAwalActionPerformed(evt);
            }
        });

        btnTambahKegiatan.setBackground(new java.awt.Color(204, 255, 255));
        btnTambahKegiatan.setText("Tambah");
        btnTambahKegiatan.setBorderColor(new java.awt.Color(153, 153, 153));
        btnTambahKegiatan.setColorClick(new java.awt.Color(102, 153, 255));
        btnTambahKegiatan.setMaximumSize(new java.awt.Dimension(105, 23));
        btnTambahKegiatan.setMinimumSize(new java.awt.Dimension(105, 23));
        btnTambahKegiatan.setPreferredSize(new java.awt.Dimension(105, 23));
        btnTambahKegiatan.setRadius(10);
        btnTambahKegiatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahKegiatanActionPerformed(evt);
            }
        });

        btnUbahKegiatan.setBackground(new java.awt.Color(204, 255, 255));
        btnUbahKegiatan.setText("Ubah");
        btnUbahKegiatan.setBorderColor(new java.awt.Color(153, 153, 153));
        btnUbahKegiatan.setColorClick(new java.awt.Color(102, 153, 255));
        btnUbahKegiatan.setMaximumSize(new java.awt.Dimension(105, 23));
        btnUbahKegiatan.setMinimumSize(new java.awt.Dimension(105, 23));
        btnUbahKegiatan.setPreferredSize(new java.awt.Dimension(105, 23));
        btnUbahKegiatan.setRadius(10);
        btnUbahKegiatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahKegiatanActionPerformed(evt);
            }
        });

        btnHapusKegiatan.setBackground(new java.awt.Color(204, 255, 255));
        btnHapusKegiatan.setText("Hapus");
        btnHapusKegiatan.setBorderColor(new java.awt.Color(153, 153, 153));
        btnHapusKegiatan.setColorClick(new java.awt.Color(102, 153, 255));
        btnHapusKegiatan.setMaximumSize(new java.awt.Dimension(105, 23));
        btnHapusKegiatan.setMinimumSize(new java.awt.Dimension(105, 23));
        btnHapusKegiatan.setPreferredSize(new java.awt.Dimension(105, 23));
        btnHapusKegiatan.setRadius(10);
        btnHapusKegiatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusKegiatanActionPerformed(evt);
            }
        });

        btnUbahKegiatan1.setBackground(new java.awt.Color(204, 255, 255));
        btnUbahKegiatan1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/up-arrow (1).png"))); // NOI18N
        btnUbahKegiatan1.setBorderColor(new java.awt.Color(153, 153, 153));
        btnUbahKegiatan1.setColorClick(new java.awt.Color(102, 153, 255));
        btnUbahKegiatan1.setMaximumSize(new java.awt.Dimension(105, 23));
        btnUbahKegiatan1.setMinimumSize(new java.awt.Dimension(105, 23));
        btnUbahKegiatan1.setPreferredSize(new java.awt.Dimension(105, 23));
        btnUbahKegiatan1.setRadius(10);
        btnUbahKegiatan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahKegiatan1ActionPerformed(evt);
            }
        });

        btnUbahKegiatan2.setBackground(new java.awt.Color(204, 255, 255));
        btnUbahKegiatan2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/down-arrow (1).png"))); // NOI18N
        btnUbahKegiatan2.setBorderColor(new java.awt.Color(153, 153, 153));
        btnUbahKegiatan2.setColorClick(new java.awt.Color(102, 153, 255));
        btnUbahKegiatan2.setMaximumSize(new java.awt.Dimension(105, 23));
        btnUbahKegiatan2.setMinimumSize(new java.awt.Dimension(105, 23));
        btnUbahKegiatan2.setPreferredSize(new java.awt.Dimension(105, 23));
        btnUbahKegiatan2.setRadius(10);
        btnUbahKegiatan2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahKegiatan2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                                .addComponent(btnMenuAwal, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnTambahKegiatan, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUbahKegiatan, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnHapusKegiatan, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(jScrollPane3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnUbahKegiatan1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnUbahKegiatan2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(btnUbahKegiatan1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnUbahKegiatan2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMenuAwal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTambahKegiatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUbahKegiatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHapusKegiatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuAwalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuAwalActionPerformed
        MainFrame main = new MainFrame();
        main.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMenuAwalActionPerformed

    private void btnTambahKegiatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahKegiatanActionPerformed
        InputFrame input = new InputFrame(false,idKategori);
        input.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnTambahKegiatanActionPerformed

    private void btnUbahKegiatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahKegiatanActionPerformed
        if(pnlKegiatan.isSelectionEmpty()){
            JOptionPane.showMessageDialog(null, "Pilih kegiatan dulu");
        } else {
            InputFrame input = new InputFrame(true,idKategori,dataIdKegiatan.get(pnlKegiatan.getSelectedIndex()),false);
            input.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnUbahKegiatanActionPerformed

    private void btnHapusKegiatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusKegiatanActionPerformed
        if(pnlKegiatan.isSelectionEmpty()){
            JOptionPane.showMessageDialog(null, "Pilih kegiatan dulu");
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
                JOptionPane.showMessageDialog(null, "Gagal menghapus kegiatan : "+ex);
            }
        }
    }//GEN-LAST:event_btnHapusKegiatanActionPerformed

    private void pnlKegiatanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlKegiatanMouseClicked
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
                JOptionPane.showMessageDialog(null, ex);
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_pnlKegiatanMouseClicked

    private void btnUbahKegiatan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahKegiatan1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUbahKegiatan1ActionPerformed

    private void btnUbahKegiatan2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahKegiatan2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUbahKegiatan2ActionPerformed

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
    private Frame.CButton btnHapusKegiatan;
    private Frame.CButton btnMenuAwal;
    private Frame.CButton btnTambahKegiatan;
    private Frame.CButton btnUbahKegiatan;
    private Frame.CButton btnUbahKegiatan1;
    private Frame.CButton btnUbahKegiatan2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextArea pnlDetail;
    private javax.swing.JList<String> pnlKegiatan;
    private javax.swing.JTextPane pnlTanggal;
    // End of variables declaration//GEN-END:variables

    private void getData() {
        try{
            modelKegiatan.removeAllElements();
            String sql = "SELECT * FROM kegiatanTable WHERE idKategori=?";
            Connection cn = koneksi.getKoneksi();
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, idKategori);
            ResultSet result = pst.executeQuery();
            while(result.next()){
                modelKegiatan.addElement(result.getString(2));
                dataIdKegiatan.add(result.getString(1));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error : "+ ex);
        } 
    }
}
