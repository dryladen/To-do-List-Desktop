package Frame;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
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
        setIconImage(new ImageIcon("to-do-list.png").getImage());
        getLokasi();
        this.isKategori = isKategori;
    }
    
    public InputFrame(boolean isKategori, String idKategori) {
        initComponents();
        setIconImage(new ImageIcon("to-do-list.png").getImage());
        getLokasi();
        this.isKategori = isKategori;
        this.idKategori = idKategori;
    }
    public InputFrame(boolean dataUpdate, String idKategori,boolean isKategori) {
        try {
            initComponents();
            setIconImage(new ImageIcon("to-do-list.png").getImage());
            getLokasi();
            this.isDataUpdate = dataUpdate;
            this.idKategori = idKategori;
            this.isKategori = isKategori;
            tambahKategori.setText("Ubah");
            getDataUpdate();
        } catch (ParseException ex) {
            Logger.getLogger(InputFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public InputFrame(boolean dataUpdate, String idKategori, String idKegiatan, boolean isKategori) {
        try {
            initComponents();
            setIconImage(new ImageIcon("to-do-list.png").getImage());
            getLokasi();
            this.isDataUpdate = dataUpdate;
            this.isKategori = isKategori;
            this.idKategori = idKategori;
            this.idKegiatan = idKegiatan;
            tambahKategori.setText("Ubah");
            getDataUpdate();
        } catch (ParseException ex) {
            Logger.getLogger(InputFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        aturUkuran = new javax.swing.JPopupMenu();
        ukuran = new javax.swing.JMenu();
        ukuran1 = new javax.swing.JMenuItem();
        ukuran2 = new javax.swing.JMenuItem();
        ukuran3 = new javax.swing.JMenuItem();
        mainPanel = new javax.swing.JPanel();
        inputNama = new javax.swing.JTextField();
        inputTanggal = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        inputDeskripsi = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        btnKembali = new Frame.CButton();
        tambahKategori = new Frame.CButton();

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
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(312, 386));

        mainPanel.setBackground(new java.awt.Color(51, 204, 255));
        mainPanel.setPreferredSize(new java.awt.Dimension(312, 386));

        inputNama.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nama Kategori / Kegiatan", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 1, 13))); // NOI18N

        inputTanggal.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tanggal", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 1, 13))); // NOI18N

        inputDeskripsi.setColumns(1);
        inputDeskripsi.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        inputDeskripsi.setRows(5);
        inputDeskripsi.setAutoscrolls(false);
        inputDeskripsi.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Deskripsi", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 1, 13))); // NOI18N
        inputDeskripsi.setMinimumSize(new java.awt.Dimension(116, 46));
        jScrollPane1.setViewportView(inputDeskripsi);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setComponentPopupMenu(aturUkuran);
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 176, Short.MAX_VALUE)
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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(inputTanggal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputNama, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE))
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
                    JOptionPane.showMessageDialog(inputTanggal, "Gagal membuat kategori baru : "+ex);
                }
                setLokasi();
                MainFrame main = new MainFrame();
                main.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(inputTanggal, "Kategori belum mempunyai nama");
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
                    JOptionPane.showMessageDialog(inputTanggal, "Gagal membuat kegiatan baru : "+ex);
                }
                setLokasi();
                TaskFrame task = new TaskFrame(idKategori);
                task.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(inputTanggal, "Kegiatan belum mempunyai nama");
            }
        }
    }//GEN-LAST:event_tambahKategoriActionPerformed

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        if(this.isKategori == true){
            setLokasi();
            MainFrame main = new MainFrame();
            main.setVisible(true);
            this.dispose();
        } else {
            setLokasi();
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
        if(yy-y < 40){
            this.setLocation(xx-x,0);
        } else {
            this.setLocation(xx-x,yy-y);
        }
    }//GEN-LAST:event_jPanel1MouseDragged

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
        java.awt.EventQueue.invokeLater(() -> {
            new InputFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPopupMenu aturUkuran;
    private Frame.CButton btnKembali;
    public static javax.swing.JTextArea inputDeskripsi;
    public static javax.swing.JTextField inputNama;
    public static com.toedter.calendar.JDateChooser inputTanggal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainPanel;
    private Frame.CButton tambahKategori;
    private javax.swing.JMenu ukuran;
    private javax.swing.JMenuItem ukuran1;
    private javax.swing.JMenuItem ukuran2;
    private javax.swing.JMenuItem ukuran3;
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
    
    private void setLokasi() {
        try{
            sql = "UPDATE lokasiTable SET getX=?,getY=?,width=?,height=?";
            Connection cn = koneksi.getKoneksi();
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setInt(1, getX());
            pst.setInt(2, getY());
            pst.setInt(3, getWidth());
            pst.setInt(4, getHeight());
            pst.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error : "+ ex);
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
