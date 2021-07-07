package Frame;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Laden
 */
public class Koneksi {
    private Connection connect;
    
    private final String driverName = "com.mysql.jdbc.Driver";
    private final String url = "jdbc:mysql://localhost:3306/todolistdesktop";
    private final String username = "root";
    private final String password = "";
    
    public Connection getKoneksi(){
        if (connect == null){
            try{
                Class.forName(driverName);
                System.out.println("Driver ditemukan");
                connect = DriverManager.getConnection(url,username,password);
            } catch(ClassNotFoundException | SQLException ex){
                Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE,null,ex);
            }
        }
        return connect;
    }
}
