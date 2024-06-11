/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pack2;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author moisemb
 */
public class classeconnexion {

  public  Connection conn;

    public classeconnexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); 
              conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/carEasy", "root", "");
//              JOptionPane.showMessageDialog(null, "Connexion reussie");
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Connexion serveur   echoue");
        }
    }
}
