/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AtmPackage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ERIC
 */
public class Operations {
    public static boolean isLogin(String cardNo, String pincode, String Usertype,JFrame frame ){
      try{
          Connection myCon = MYSQLConnections.getConnection();
          String mysqlQuery = "select*from client where CardID = '" + cardNo +"' and Pincode = '" + pincode +"'";
          PreparedStatement preStatement = myCon.prepareStatement(mysqlQuery);
          ResultSet rs = preStatement.executeQuery();
          
          while(rs.next()){
              LoginPage.ClientID = rs.getInt("ClientID");
              LoginPage.CardID = rs.getInt("CardID");
              LoginPage.Pincode = rs.getInt("Pincode");
              LoginPage.Fast_name = rs.getString("Fast_name");
              LoginPage.Last_name = rs.getString("Last_name");
             
              //LoginPage.UserType = rs.getString("UserType");
//              LoginPage.UserType = rs.getString("Fast_name");

              
              return true;
              
                      
                      
          }
      }  catch(Exception e){
          JOptionPane.showMessageDialog(frame, "an error occured while connecting" + e.getMessage());
      }
        
        return false;
        
        
    }
    
}
