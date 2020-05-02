
package login_register;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Patryk
 */
public class ConnectionClass {
    
    private static String servername="localhost";
    private static String username="root";
    private static String dbname="my_db";
    private static Integer portnumber = 3306;
    private static String password="";
    
    public static Connection getConnection(){
        Connection con = null;
        
        MysqlDataSource datasource = new MysqlDataSource();
        datasource.setServerName(servername);
        datasource.setUser(username);
        datasource.setPassword(password);
        datasource.setDatabaseName(dbname);
        datasource.setPortNumber(portnumber);
        
        try {
            con = datasource.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(" Get "+ConnectionClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return con;
        
    }
}
