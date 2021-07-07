package Frame;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/**
 *
 * @author Laden
 */
public class InputKategoriFrame extends javax.swing.JFrame {

    private final Koneksi koneksi = new Koneksi();
    public InputKategoriFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelNama = new javax.swing.JLabel();
        inputNama = new javax.swing.JTextField();
        jLabelDeskripsi = new javax.swing.JLabel();
        inputTanggal = new com.toedter.calendar.JDateChooser();
        jLabelTanggal = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        inputDeskripsi = new javax.swing.JTextArea();
        tambahKategori = new Frame.CButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 255, 204));

        jLabelNama.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        jLabelNama.setText("Masukan nama kategori");

        jLabelDeskripsi.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        jLabelDeskripsi.setText("Deskripsi");

        jLabelTanggal.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        jLabelTanggal.setText("Tanggal");

        inputDeskripsi.setColumns(20);
        inputDeskripsi.setRows(5);
        jScrollPane1.setViewportView(inputDeskripsi);

        tambahKategori.setBackground(new java.awt.Color(204, 255, 255));
        tambahKategori.setText("Tambah");
        tambahKategori.setColorClick(new java.awt.Color(102, 153, 255));
        tambahKategori.setRadius(10);
        tambahKategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahKategoriActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tambahKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                        .addComponent(jLabelTanggal)
                        .addComponent(jLabelDeskripsi)
                        .addComponent(jLabelNama)
                        .addComponent(inputNama)
                        .addComponent(inputTanggal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabelNama)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputNama, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelTanggal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelDeskripsi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tambahKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tambahKategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahKategoriActionPerformed
        try {
            String sql = "INSERT INTO kategori (namaKategori,tanggalKategori,deskripsiKategori) VALUES ('%s','%s','%s')";
            sql = String.format(sql, inputNama.getText(),((JTextField)inputTanggal.getDateEditor().getUiComponent()).getText(),inputDeskripsi.getText());
            Connection cn = koneksi.getKoneksi();
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.execute();
            MainFrame main = new MainFrame();
            main.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Gagal membuat kategori baru : "+ex);
        }
        
    }//GEN-LAST:event_tambahKategoriActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> {
            new InputKategoriFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextArea inputDeskripsi;
    public static javax.swing.JTextField inputNama;
    public static com.toedter.calendar.JDateChooser inputTanggal;
    private javax.swing.JLabel jLabelDeskripsi;
    private javax.swing.JLabel jLabelNama;
    private javax.swing.JLabel jLabelTanggal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private Frame.CButton tambahKategori;
    // End of variables declaration//GEN-END:variables
}
