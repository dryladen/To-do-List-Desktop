package Frame;

/**
 *
 * @author Laden
 */
public class TaskFrame extends javax.swing.JFrame {

    public TaskFrame() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HomePanel = new javax.swing.JPanel();
        pnlKegiatan = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        btnKembali = new Frame.CButton();
        btnUbahKategori = new Frame.CButton();
        btnHapusKategori = new Frame.CButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        pnlDetail = new javax.swing.JTextArea();
        btnUbahKategori1 = new Frame.CButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 255, 204));

        HomePanel.setBackground(new java.awt.Color(51, 255, 204));

        jList1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Kegiatan", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        pnlKegiatan.setViewportView(jList1);

        btnKembali.setBackground(new java.awt.Color(204, 255, 255));
        btnKembali.setText("Menu Awal");
        btnKembali.setBorderColor(new java.awt.Color(153, 153, 153));
        btnKembali.setColorClick(new java.awt.Color(102, 153, 255));
        btnKembali.setRadius(10);
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });

        btnUbahKategori.setBackground(new java.awt.Color(204, 255, 255));
        btnUbahKategori.setText("Ubah");
        btnUbahKategori.setBorderColor(new java.awt.Color(153, 153, 153));
        btnUbahKategori.setColorClick(new java.awt.Color(102, 153, 255));
        btnUbahKategori.setRadius(10);
        btnUbahKategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahKategoriActionPerformed(evt);
            }
        });

        btnHapusKategori.setBackground(new java.awt.Color(204, 255, 255));
        btnHapusKategori.setText("Tambah");
        btnHapusKategori.setBorderColor(new java.awt.Color(153, 153, 153));
        btnHapusKategori.setColorClick(new java.awt.Color(102, 153, 255));
        btnHapusKategori.setRadius(10);
        btnHapusKategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusKategoriActionPerformed(evt);
            }
        });

        pnlDetail.setEditable(false);
        pnlDetail.setColumns(20);
        pnlDetail.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pnlDetail.setLineWrap(true);
        pnlDetail.setRows(5);
        pnlDetail.setText("Deadline : \n-\n\nDeskripsi :\n-\n"); // NOI18N
        pnlDetail.setAutoscrolls(false);
        pnlDetail.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detail", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        pnlDetail.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnlDetail.setSelectionColor(new java.awt.Color(51, 255, 51));
        jScrollPane2.setViewportView(pnlDetail);

        btnUbahKategori1.setBackground(new java.awt.Color(204, 255, 255));
        btnUbahKategori1.setText("Hapus");
        btnUbahKategori1.setBorderColor(new java.awt.Color(153, 153, 153));
        btnUbahKategori1.setColorClick(new java.awt.Color(102, 153, 255));
        btnUbahKategori1.setRadius(10);
        btnUbahKategori1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahKategori1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout HomePanelLayout = new javax.swing.GroupLayout(HomePanel);
        HomePanel.setLayout(HomePanelLayout);
        HomePanelLayout.setHorizontalGroup(
            HomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(HomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlKegiatan, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomePanelLayout.createSequentialGroup()
                        .addComponent(btnKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnHapusKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUbahKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnUbahKategori1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        HomePanelLayout.setVerticalGroup(
            HomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlKegiatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(HomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnKembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUbahKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHapusKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUbahKategori1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HomePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HomePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        InputKategoriFrame inputFrame = new InputKategoriFrame();
        inputFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnKembaliActionPerformed

    private void btnUbahKategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahKategoriActionPerformed
        
    }//GEN-LAST:event_btnUbahKategoriActionPerformed

    private void btnHapusKategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusKategoriActionPerformed
        
    }//GEN-LAST:event_btnHapusKategoriActionPerformed

    private void btnUbahKategori1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahKategori1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUbahKategori1ActionPerformed

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
            java.util.logging.Logger.getLogger(TaskFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TaskFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TaskFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TaskFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TaskFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel HomePanel;
    private Frame.CButton btnHapusKategori;
    private Frame.CButton btnKembali;
    private Frame.CButton btnUbahKategori;
    private Frame.CButton btnUbahKategori1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea pnlDetail;
    private javax.swing.JScrollPane pnlKegiatan;
    // End of variables declaration//GEN-END:variables
}
