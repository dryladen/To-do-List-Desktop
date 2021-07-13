package Frame;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
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
}
