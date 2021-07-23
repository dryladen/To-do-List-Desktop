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
    private String idKegiatan = null;
    private String sql = null;
    private int x,y;
    public InputFrame() {
        initComponents();
    }
    
    public InputFrame(boolean isKategori) {
        initComponents();
        this.isKategori = isKategori;
        jLabelNama.setText("Masukan nama kategori");
    }
    
    public InputFrame(boolean isKategori, String idKategori) {
        initComponents();
        this.isKategori = isKategori;
        this.idKategori = idKategori;
        jLabelNama.setText("Masukan nama kegiatan");
    }
    public InputFrame(boolean dataUpdate, String idKategori,boolean isKategori) {
        try {
            initComponents();
            this.isDataUpdate = dataUpdate;
            this.idKategori = idKategori;
            this.isKategori = isKategori;
            tambahKategori.setText("Ubah");
            jLabelNama.setText("Masukan nama kategori");
            getDataUpdate();
        } catch (ParseException ex) {
            Logger.getLogger(InputFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public InputFrame(boolean dataUpdate, String idKategori, String idKegiatan, boolean isKategori) {
        try {
            initComponents();
            this.isDataUpdate = dataUpdate;
            this.isKategori = isKategori;
            this.idKategori = idKategori;
            this.idKegiatan = idKegiatan;
            tambahKategori.setText("Ubah");
            jLabelNama.setText("Masukan nama kegiatan");
            getDataUpdate();
        } catch (ParseException ex) {
            Logger.getLogger(InputFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        mainPanel = new javax.swing.JPanel();
        jLabelNama = new javax.swing.JLabel();
        inputNama = new javax.swing.JTextField();
        jLabelDeskripsi = new javax.swing.JLabel();
        inputTanggal = new com.toedter.calendar.JDateChooser();
        jLabelTanggal = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        inputDeskripsi = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        btnKembali = new Frame.CButton();
        tambahKategori = new Frame.CButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        mainPanel.setBackground(new java.awt.Color(51, 204, 255));

        jLabelNama.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        jLabelNama.setText("Masukan nama");

        inputNama.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabelDeskripsi.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        jLabelDeskripsi.setText("Deskripsi");

        inputTanggal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabelTanggal.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        jLabelTanggal.setText("Tanggal");

        inputDeskripsi.setColumns(20);
        inputDeskripsi.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        inputDeskripsi.setRows(5);
        inputDeskripsi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jScrollPane1.setViewportView(inputDeskripsi);

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

        btnKembali.setBackground(new java.awt.Color(0, 153, 153));
        btnKembali.setBorder(null);
        btnKembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/arrow.png"))); // NOI18N
        btnKembali.setBorderColor(new java.awt.Color(0, 153, 153));
        btnKembali.setBorderPainted(false);
        btnKembali.setColor(new java.awt.Color(0, 153, 153));
        btnKembali.setColorClick(new java.awt.Color(0, 153, 153));
        btnKembali.setRadius(10);
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });

        tambahKategori.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/save.png"))); // NOI18N
        tambahKategori.setText("Simpan");
        tambahKategori.setToolTipText("Simpan");
        tambahKategori.setBorderColor(new java.awt.Color(0, 153, 153));
        tambahKategori.setColor(new java.awt.Color(0, 153, 153));
        tambahKategori.setColorClick(new java.awt.Color(0, 153, 153));
        tambahKategori.setPreferredSize(new java.awt.Dimension(34, 30));
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
                .addContainerGap()
                .addComponent(btnKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tambahKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnKembali, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tambahKategori, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputNama, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(inputTanggal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNama)
                            .addComponent(jLabelTanggal)
                            .addComponent(jLabelDeskripsi))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
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
            .addComponent(mainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                            idKegiatan);
                }
                try {
                    Connection cn = koneksi.getKoneksi();
                    PreparedStatement pst = cn.prepareStatement(sql);
                    pst.execute();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Gagal membuat kegiatan baru : "+ex);
                }
                TaskFrame task = new TaskFrame(idKategori);
                task.setVisible(true);
                this.dispose();
            }
        }
    }//GEN-LAST:event_tambahKategoriActionPerformed

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        if(this.isKategori == true){
            MainFrame main = new MainFrame();
            main.setVisible(true);
            this.dispose();
        } else {
            TaskFrame task = new TaskFrame(idKategori);
            task.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnKembaliActionPerformed

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int xx = evt.getXOnScreen();
        int yy = evt. getYOnScreen();
        this.setLocation(xx-x,yy-y);
    }//GEN-LAST:event_jPanel1MouseDragged

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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainPanel;
    private Frame.CButton tambahKategori;
    // End of variables declaration//GEN-END:variables

    private void getDataUpdate() throws ParseException {
        if(isKategori == true){
            sql = "SELECT * FROM kategoriTable WHERE idKategori='%s'";
            sql = String.format(sql,this.idKategori);
        } else {
            sql = "SELECT * FROM kegiatanTable WHERE idKegiatan='%s'";
            sql = String.format(sql,this.idKegiatan);
        }
        try {
            SimpleDateFormat date = new SimpleDateFormat("MMM d, yyyy");
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
