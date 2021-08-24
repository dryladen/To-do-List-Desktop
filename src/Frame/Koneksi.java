package Frame;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
        }
//        if (connect == null){
//            try{
//                Class.forName(driverName);
//                connect = DriverManager.getConnection(url);
//            } catch(ClassNotFoundException | SQLException ex){
//                Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE,null,ex);
//            }
//        }
        return connect;
    }
    
    // method untuk mengubah posisi item di database
    public void moveItem(ArrayList<Kegiatan> dataKategori,ArrayList<String> dataId, int index, int index0, boolean isKategori) {
        try {
            Connection cn = getKoneksi();
            String sql = "UPDATE kegiatanTable SET namaKegiatan=?,tanggalKegiatan=?,deskripsiKegiatan=?,isCheck=? WHERE idKegiatan=?";
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
