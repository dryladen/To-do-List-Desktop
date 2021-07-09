package Frame;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/**
 *
 * @author Laden
 */
public class InputFrame extends javax.swing.JFrame {

    private final Koneksi koneksi = new Koneksi();
    private boolean isDataUpdate = false;
    private boolean isKategori = false;
    private String idKategori = null;
    private String sql = null;

    public InputFrame() {
        initComponents();
    }
    
    public InputFrame(boolean isKategori) {
        initComponents();
        this.isKategori = isKategori;
    }
    
    public InputFrame(boolean isKategori, String idKategori) {
        initComponents();
        this.isKategori = isKategori;
        this.idKategori = idKategori;
    }
    
    public InputFrame(boolean dataUpdate, String idKategori, boolean isKategori) {
        try {
            initComponents();
            this.isDataUpdate = dataUpdate;
            this.idKategori = idKategori;
            tambahKategori.setText("Ubah");
            getDataUpdate();
        } catch (ParseException ex) {
            Logger.getLogger(InputFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        jLabelNama = new javax.swing.JLabel();
        inputNama = new javax.swing.JTextField();
        jLabelDeskripsi = new javax.swing.JLabel();
        inputTanggal = new com.toedter.calendar.JDateChooser();
        jLabelTanggal = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        inputDeskripsi = new javax.swing.JTextArea();
        tambahKategori = new Frame.CButton();
        btnKembali = new Frame.CButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setBackground(new java.awt.Color(51, 255, 204));
        mainPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelNama.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        jLabelNama.setText("Masukan nama");

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

        btnKembali.setBackground(new java.awt.Color(204, 255, 255));
        btnKembali.setText("Kembali");
        btnKembali.setColorClick(new java.awt.Color(102, 153, 255));
        btnKembali.setRadius(10);
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(btnKembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tambahKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelTanggal)
                    .addComponent(jLabelDeskripsi)
                    .addComponent(jLabelNama)
                    .addComponent(inputTanggal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inputNama)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnKembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tambahKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tambahKategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahKategoriActionPerformed
        if(isKategori == true){
            if(!inputNama.getText().isEmpty()){
                if(isDataUpdate == false){
                        sql = "INSERT INTO kategoriTable (namaKategori,tanggalKategori,deskripsiKategori) VALUES ('%s','%s','%s')";
                        sql = String.format(sql, 
                                inputNama.getText(),
                                ((JTextField)inputTanggal.getDateEditor().getUiComponent()).getText(),
                                inputDeskripsi.getText());

                } else if (isDataUpdate = true){
                    sql = "UPDATE kategoriTable SET namaKategori='%s',tanggalKategori='%s',deskripsiKategori='%s' WHERE idKategori='%s'";
                    sql = String.format(sql, 
                            inputNama.getText(),
                            ((JTextField)inputTanggal.getDateEditor().getUiComponent()).getText(),
                            inputDeskripsi.getText(),
                            idKategori);
                }
                try {
                    Connection cn = koneksi.getKoneksi();
                    PreparedStatement pst = cn.prepareStatement(sql);
                    pst.execute();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Gagal membuat kategori baru : "+ex);
                }
                MainFrame main = new MainFrame();
                main.setVisible(true);
                this.dispose();
            }
        } else {
            if(!inputNama.getText().isEmpty()){
                if(isDataUpdate == false){
                        sql = "INSERT INTO kegiatanTable (idKategori,namaKegiatan,tanggalKegiatan,deskripsiKegiatan) VALUES ('%s','%s','%s','%s')";
                        sql = String.format(sql,
                                idKategori,
                                inputNama.getText(),
                                ((JTextField)inputTanggal.getDateEditor().getUiComponent()).getText(),
                                inputDeskripsi.getText());

                } else if (isDataUpdate = true){
                    sql = "UPDATE kegiatanTable SET namaKegiatan='%s',tanggalKegiatan='%s',deskripsiKegiatan='%s' WHERE idKegiatan='%s'";
                    sql = String.format(sql, 
                            inputNama.getText(),
                            ((JTextField)inputTanggal.getDateEditor().getUiComponent()).getText(),
                            inputDeskripsi.getText(),
                            idKategori);
                }
                try {
                    Connection cn = koneksi.getKoneksi();
                    PreparedStatement pst = cn.prepareStatement(sql);
                    pst.execute();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Gagal membuat kegiatan baru : "+ex);
                }
                TaskFrame task = new TaskFrame();
                task.setVisible(true);
                this.dispose();
            }
        }
    }//GEN-LAST:event_tambahKategoriActionPerformed

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        if(isKategori == true){
            MainFrame main = new MainFrame();
            main.setVisible(true);
            this.dispose();
        } else {
            TaskFrame task = new TaskFrame();
            task.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnKembaliActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new InputFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Frame.CButton btnKembali;
    public static javax.swing.JTextArea inputDeskripsi;
    public static javax.swing.JTextField inputNama;
    public static com.toedter.calendar.JDateChooser inputTanggal;
    private javax.swing.JLabel jLabelDeskripsi;
    private javax.swing.JLabel jLabelNama;
    private javax.swing.JLabel jLabelTanggal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainPanel;
    private Frame.CButton tambahKategori;
    // End of variables declaration//GEN-END:variables

    private void getDataUpdate() throws ParseException {
        try {
            SimpleDateFormat date = new SimpleDateFormat("MMM d, yyyy");
            String sql = "SELECT * FROM kategoriTable WHERE idKategori='%s'";
            sql = String.format(sql, this.idKategori);
            Connection cn = koneksi.getKoneksi();
            PreparedStatement pst = cn.prepareStatement(sql);
            ResultSet result = pst.executeQuery();
            while(result.next()){
                inputNama.setText(result.getString(2));
                if(!result.getString(3).equals("")){
                    inputTanggal.setDate(date.parse(result.getString(3)));
                }
                inputDeskripsi.setText(result.getString(4));
            }
        } catch (SQLException ex) {
            Logger.getLogger(InputFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
