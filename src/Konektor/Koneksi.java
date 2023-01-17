

package Konektor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author user
 */
public class Koneksi {
    private static Connection koneksi;
    
    public static Connection getKoneksi()throws SQLException{
        if(koneksi==null){
            try{
                String db = "jdbc:mysql://localhost:3306/Pemrograman2";
                String user = "root";
                String pass = "";
                
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi=(Connection) DriverManager.getConnection(db, user,pass);
                
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Gagal Terkoneksi");
            }
        }
            return koneksi;
        }
    
}
