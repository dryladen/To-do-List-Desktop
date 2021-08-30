package Frame;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Laden
 */
public class Koneksi {
    private Connection connect;
    private final String url = "jdbc:sqlite:databasetodolist.db"; // nama database
    private String sql;
    public boolean isDatabaseExists(String dbFilePath){
        File database = new File(dbFilePath);
        return database.exists();
    }
    public Connection getKoneksi(){ // menghubungkan ke database
        String getFilePath = new File("").getAbsolutePath();
        String fileAbsolutePath = getFilePath.concat("\\databasetodolist.db");
        if(isDatabaseExists(fileAbsolutePath)){
            try {
                connect = DriverManager.getConnection(url);
            } catch (SQLException ex) {
                Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Error connect database : "+ ex);
            }
        } else {
            createNewDatabase();
            try {
                connect = DriverManager.getConnection(url);
            } catch (SQLException ex) {
                Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return connect;
    }
    // method untuk membuat database
    private void createNewDatabase() {
        Connection conn;
        try {
            conn = DriverManager.getConnection(url);
            if(conn != null){
                try {
                    sql = "CREATE TABLE \"kategoriTable\" (\n" +
                            "	\"idKategori\"	INTEGER NOT NULL,\n" +
                            "	\"namaKategori\"	TEXT DEFAULT NULL,\n" +
                            "	\"tanggalKategori\"	TEXT DEFAULT NULL,\n" +
                            "	\"deskripsiKategori\"	TEXT DEFAULT NULL,\n" +
                            "	PRIMARY KEY(\"idKategori\" AUTOINCREMENT)\n" +
                            ")";
                    Statement kategoriTable = conn.createStatement();
                    kategoriTable.execute(sql);
                    sql = "CREATE TABLE \"kegiatanTable\" (\n" +
                            "	\"idKegiatan\"	INTEGER NOT NULL,\n" +
                            "	\"namaKegiatan\"	TEXT DEFAULT NULL,\n" +
                            "	\"tanggalKegiatan\"	TEXT DEFAULT NULL,\n" +
                            "	\"deskripsiKegiatan\"	TEXT DEFAULT NULL,\n" +
                            "	\"idKategori\"	INTEGER NOT NULL,\n" +
                            "	\"isCheck\"	INTEGER DEFAULT 0,\n" +
                            "	FOREIGN KEY(\"idKategori\") REFERENCES \"kategoriTable\"(\"idKategori\"),\n" +
                            "	PRIMARY KEY(\"idKegiatan\" AUTOINCREMENT)\n" +
                            ")";
                    Statement kegiatanTable = conn.createStatement();
                    kegiatanTable.execute(sql);
                    sql = "CREATE TABLE \"lokasiTable\" (\n" +
                            "	\"getX\"	INTEGER DEFAULT NULL,\n" +
                            "	\"getY\"	INTEGER DEFAULT NULL,\n" +
                            "	\"width\"	INTEGER DEFAULT NULL,\n" +
                            "	\"height\"	INTEGER DEFAULT NULL\n" +
                            ")";
                    Statement lokasiTable = conn.createStatement();
                    lokasiTable.execute(sql);
                    sql = "INSERT INTO lokasiTable (getX,getY,width,height) VALUES (0,0,312,386)";
                    PreparedStatement pst = conn.prepareStatement(sql);
                    pst.execute();
                } catch (SQLException ex){
                    Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // method untuk mengubah posisi item di database
    public void moveItem(ArrayList<Kegiatan> dataKategori,ArrayList<String> dataId, int index, int index0, boolean isKategori) {
        try {
            Connection cn = getKoneksi();
            sql = "UPDATE kegiatanTable SET namaKegiatan=?,tanggalKegiatan=?,deskripsiKegiatan=?,isCheck=? WHERE idKegiatan=?";
            if(isKategori == true){ // untuk main frame
                sql = "UPDATE kegiatanTable SET idKategori=? WHERE idKategori=?";
                PreparedStatement pst1 = cn.prepareStatement(sql);
                pst1.setString(1, "99");
                pst1.setString(2, dataId.get(index0));
                pst1.execute();
                PreparedStatement pst2 = cn.prepareStatement(sql);
                pst2.setString(1, dataId.get(index0));
                pst2.setString(2, dataId.get(index));
                pst2.execute();
                PreparedStatement pst3 = cn.prepareStatement(sql);
                pst3.setString(1, dataId.get(index));
                pst3.setString(2, "99");
                pst3.execute();
                sql = "UPDATE kategoriTable SET namaKategori=?,tanggalKategori=?,deskripsiKategori=? WHERE idKategori=?";
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
            } else { // untuk task frame
                PreparedStatement pst = cn.prepareStatement(sql);
                pst.setString(1, dataKategori.get(index0).getNamaKegiatan());
                pst.setString(2, dataKategori.get(index0).getTanggalKegiatan());
                pst.setString(3, dataKategori.get(index0).getDeskripsiKegiatan());
                pst.setString(4, dataKategori.get(index0).getIsCheck());
                pst.setString(5, dataKategori.get(index).getIdKategori());
                pst.execute();
                PreparedStatement pst0 = cn.prepareStatement(sql);
                pst0.setString(1, dataKategori.get(index).getNamaKegiatan());
                pst0.setString(2, dataKategori.get(index).getTanggalKegiatan());
                pst0.setString(3, dataKategori.get(index).getDeskripsiKegiatan());
                pst0.setString(4, dataKategori.get(index).getIsCheck());
                pst0.setString(5, dataKategori.get(index0).getIdKategori());
                pst0.execute();
            }
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
