
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class Koneksi {

    public static Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private Connection koneksi;
    public Connection con;
    public Statement stm;
public Connection connect(){
    try{ Class.forName("com.mysql.cj.jdbc.Driver");
    System.out.println("koneksi berhasil");
    }
    catch (ClassNotFoundException ex){
        System.out.println("koneksi Gagal"+ex);
    }
    String url="jdbc:mysql://localhost/gereja";
    try{koneksi = DriverManager.getConnection(url,"root","");
    System.out.print("berhasil koneksi database");
    }
    catch(SQLException ex){
        System.out.print("gagal koneksi database");
       
    }
    return koneksi;
}

    public void config() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
