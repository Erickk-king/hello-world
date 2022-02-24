/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AtmPackage;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author ERIC
 */
public class MYSQLConnections {
    public static Connection getConnection() throws Exception{
        String dbRoot = "jdbc:mysql://";
        String hostName = "locahhost:3306/";
        String dbName = "atminterface";
        String dbUrl = "jdbc:mysql://localhost:3306/atminterface";
        
        String hostUserName = "root";
        String userPassword = "king360";
        
        //Class.forName("com.mysql.jdbc.Driver");
        Connection myConn = (Connection)DriverManager.getConnection(dbUrl, hostUserName, userPassword);
    return myConn;    
    }
    
}
