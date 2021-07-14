package Frame;

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
    private final String driverName = "org.sqlite.JDBC";
    private final String url = "jdbc:sqlite:databasetodolist.db";
    
    public Connection getKoneksi(){
        if (connect == null){
            try{
                Class.forName(driverName);
                connect = DriverManager.getConnection(url);
            } catch(ClassNotFoundException | SQLException ex){
                JOptionPane.showMessageDialog(null, "Error22 : "+ ex);

                Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE,null,ex);
            }
        }
        return connect;
    }
    
    public void moveItem(ArrayList<Kegiatan> dataKategori,ArrayList<String> dataId, int index, int index0, boolean isKategori) {
        try {
            Connection cn = getKoneksi();
            String sql = "UPDATE kegiatanTable SET namaKegiatan=?,tanggalKegiatan=?,deskripsiKegiatan=? WHERE idKegiatan=?";
            if(isKategori == true){
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
            } 
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
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
