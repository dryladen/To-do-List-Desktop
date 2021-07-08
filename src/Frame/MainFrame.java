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

        backgroundPanel = new javax.swing.JPanel();
        mainPanel = new javax.swing.JPanel();
        homePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnlKategori = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        pnlDetail = new javax.swing.JTextArea();
        btnTambahKategori = new Frame.CButton();
        btnUbahKategori = new Frame.CButton();
        btnHapusKategori = new Frame.CButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("To-do List");

        backgroundPanel.setBackground(new java.awt.Color(51, 255, 204));
        backgroundPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(0, 204, 204)));

        mainPanel.setBackground(new java.awt.Color(51, 255, 204));
        mainPanel.setLayout(new javax.swing.BoxLayout(mainPanel, javax.swing.BoxLayout.LINE_AXIS));

        homePanel.setBackground(new java.awt.Color(51, 255, 204));

        pnlKategori.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "KATEGORI", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        pnlKategori.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pnlKategori.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlKategoriMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(pnlKategori);

        pnlDetail.setEditable(false);
        pnlDetail.setColumns(20);
        pnlDetail.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pnlDetail.setLineWrap(true);
        pnlDetail.setRows(5);
        pnlDetail.setText("Tanggal : \n-\n\nDeskripsi :\n-\n"); // NOI18N
        pnlDetail.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detail", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        pnlDetail.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setViewportView(pnlDetail);

        btnTambahKategori.setBackground(new java.awt.Color(204, 255, 255));
        btnTambahKategori.setText("Kategori Baru");
        btnTambahKategori.setBorderColor(new java.awt.Color(153, 153, 153));
        btnTambahKategori.setColorClick(new java.awt.Color(102, 153, 255));
        btnTambahKategori.setRadius(10);
        btnTambahKategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahKategoriActionPerformed(evt);
            }
        });

        btnUbahKategori.setBackground(new java.awt.Color(204, 255, 255));
        btnUbahKategori.setText("Ubah Kategori");
        btnUbahKategori.setBorderColor(new java.awt.Color(153, 153, 153));
        btnUbahKategori.setColorClick(new java.awt.Color(102, 153, 255));
        btnUbahKategori.setRadius(10);
        btnUbahKategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahKategoriActionPerformed(evt);
            }
        });

        btnHapusKategori.setBackground(new java.awt.Color(204, 255, 255));
        btnHapusKategori.setText("Hapus Kategori");
        btnHapusKategori.setBorderColor(new java.awt.Color(153, 153, 153));
        btnHapusKategori.setColorClick(new java.awt.Color(102, 153, 255));
        btnHapusKategori.setRadius(10);
        btnHapusKategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusKategoriActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout homePanelLayout = new javax.swing.GroupLayout(homePanel);
        homePanel.setLayout(homePanelLayout);
        homePanelLayout.setHorizontalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addComponent(btnTambahKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUbahKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHapusKategori, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane2)
            .addComponent(jScrollPane1)
        );
        homePanelLayout.setVerticalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambahKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUbahKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHapusKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        mainPanel.add(homePanel);

        backgroundPanel.add(mainPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnHapusKategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusKategoriActionPerformed
        if(pnlKategori.isSelectionEmpty()){
            JOptionPane.showMessageDialog(null, "Pilih kategori dulu");
        } else {
            try {
                String index = dataIdKategori.get(pnlKategori.getSelectedIndex());
                String sql = "DELETE FROM kategoriTable WHERE idKategori=?";
                Connection cn = koneksi.getKoneksi();
                PreparedStatement pst = cn.prepareStatement(sql);
                pst.setString(1, index);
                pst.execute();
                getData();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Gagal membuat kategori baru : "+ex);
            }
            
        }
    }//GEN-LAST:event_btnHapusKategoriActionPerformed

    private void btnUbahKategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahKategoriActionPerformed
        if(pnlKategori.isSelectionEmpty()){
            JOptionPane.showMessageDialog(null, "Pilih kategori dulu");
        } else {
            InputKategoriFrame input = new InputKategoriFrame(true,dataIdKategori.get(pnlKategori.getSelectedIndex()));
            input.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnUbahKategoriActionPerformed

    private void btnTambahKategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahKategoriActionPerformed
        InputKategoriFrame inputFrame = new InputKategoriFrame();
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
                String tanggal = "-",deskripsi="-";
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
                String detail = "Tanggal : \n"+ tanggal+ "\n\nDeskripsi : \n"+ deskripsi;
                pnlDetail.setText(detail);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_pnlKategoriMouseClicked

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
    private javax.swing.JPanel backgroundPanel;
    private Frame.CButton btnHapusKategori;
    private Frame.CButton btnTambahKategori;
    private Frame.CButton btnUbahKategori;
    public static javax.swing.JPanel homePanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextArea pnlDetail;
    private javax.swing.JList<String> pnlKategori;
    // End of variables declaration//GEN-END:variables

    private void getData(){
        try{
            modelKategori.removeAllElements();
            Connection cn = koneksi.getKoneksi();
            Statement stm = cn.createStatement();
            ResultSet result = stm.executeQuery("SELECT * FROM kategoriTable");
            while(result.next()){
                modelKategori.addElement(result.getString(2));
                dataIdKategori.add(result.getString(1));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error : "+ ex);
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
} 
