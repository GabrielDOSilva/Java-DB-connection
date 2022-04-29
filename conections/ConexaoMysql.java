package conections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author PC
 */
public class ConexaoMysql {

    private static String url = "jdbc:mysql://licalhost:3306/dbhlovers";
    private static String user = "root";
    private static String pw = "G#briel0796";
    private static String driver = "com.mysql.cj.jdbc.Driver";
    
    public Connection getConnection() throws SQLException{
        try {
            Class.forName(driver);
            return DriverManager.getConnection(url,user,pw);
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
    

    
}
