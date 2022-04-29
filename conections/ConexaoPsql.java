
package conections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 
public class ConexaoPsql {
  public static void main(String[] args) {
    
    String url = "";
    String user = "";
    String pw = "";
    String driver = "";
     
    try {
      Class.forName(driver).newInstance();
      Connection conn = DriverManager.getConnection(url, user, pw);
      System.out.println("Conexão obtida com sucesso.");
    }
    catch (SQLException ex) {
      System.out.println("SQLException: " + ex.getMessage());
      System.out.println("SQLState: " + ex.getSQLState());
      System.out.println("VendorError: " + ex.getErrorCode());
    }
    catch (Exception e) {
      System.out.println("Problemas ao tentar conectar com o banco de dados: " + e);
    }      
  }
}
