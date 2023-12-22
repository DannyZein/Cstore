/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;

/**
 *
 * @author Susi M
 */
import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class koneksi {
    public static Connection koneksi;
    public static Statement stm;
    
    public static Connection getConnection() throws SQLException {
        if (koneksi == null) {
            String dbName = "cstore";
            String userName = "root";
            String password = "";
            String url = "jdbc:mysql://localhost/"+dbName;


            try{
                new Driver();

                   koneksi = DriverManager.getConnection(url,userName,password);
                   stm = koneksi.createStatement();
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        return koneksi;
}

    public static Object getInstance() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public koneksi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public PreparedStatement prepareStatement(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
