/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AtmPackage;

import javax.swing.JFrame;

/**
 *
 * @author ERIC
 */
public class Logout {
    public static void logout(JFrame context, LoginForm loginScreen){
        LoginPage.isLoggedIn = false;
        context.setVisible(false);
        loginScreen.setVisible(true);
    }
    
}
