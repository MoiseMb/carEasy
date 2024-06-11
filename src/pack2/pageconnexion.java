/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pack2;

import form.login;
import form.register;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import principale.main2;

/**
 *
 * @author moisemb
 */
public class pageconnexion extends javax.swing.JFrame {

    PreparedStatement prepare ;
    ResultSet rst;
    public pageconnexion() {
        initComponents();
        
        login login=new login();
        register register=new register();
            Slide1.setAnimate(50);
        Slide1.init(login,register);
        login.addEventRegister(new  ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                Slide1.show(1);
                register.Register();
                
            }
        });
        
        register.addEventconnect(new  ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                Slide1.show(0);
                login.Login();
                
            }
        });
        
        register.Actioninscription(new  ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
             String nom=register.getnom();
             String prenom=register.getprenom();
             String login=register.getlogin();
             String password1=register.getpassword1();
             String password2=register.getpassword2();
             
             try {
    if(nom.isBlank() || prenom.isBlank() || login.isBlank() || password1.isBlank() || password2.isBlank()){
        JOptionPane.showMessageDialog(null, "Veuillez remplir tous les champs !");
    } else if(!password1.equals(password2)) {
        JOptionPane.showMessageDialog(null, "Les mots de passe ne correspondent pas !");
    } else {
        classeconnexion conn= new classeconnexion(); //connexion à la base de données 
        PreparedStatement prepare = conn.conn.prepareStatement("INSERT INTO agent(prenom,nom,login,password) VALUES(?,?,?,?)");
        prepare.setString(1, prenom);
        prepare.setString(2, nom);
        prepare.setString(3, login);
        prepare.setString(4, password1);
        
        int result = prepare.executeUpdate(); // exécute la requête et retourne le nombre de lignes affectées
        if(result > 0){
            JOptionPane.showMessageDialog(null, "Ajout réussi"); 
            register.setprenom();
            register.setnom();
            register.setlogin();
            register.setpassword1();
            register.setpassword2();
            
        } else {
            JOptionPane.showMessageDialog(null, "Le login existe déjà");   
        }
    }
} catch (SQLException ed) {
    JOptionPane.showMessageDialog(null, "Erreur lors de l'insertion dans la base de données : " + ed.getMessage());
} catch (Exception er) {
    JOptionPane.showMessageDialog(null, "Erreur veuillez vérifier tous les champs");
}

             
             
             }
                
            
        });
        
        login.Actionconnexion(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
try {

        String log =login.getlogin();
        String pass=login.getpassword();
            if(log.isEmpty() || pass.isEmpty()){
            JOptionPane.showMessageDialog(null, "Champ invalide !");
            
            }else{
                classeconnexion conn= new classeconnexion(); //connexion a la base de donnees 
                prepare=conn.conn.prepareStatement("select * from agent where login=? and password=?");
                prepare.setString(1,log);
                prepare.setString(2,pass);
                rst=prepare.executeQuery();
                 if(!rst.isBeforeFirst()){ //c'est a dire le compte n'existe pas
                     
                     JOptionPane.showMessageDialog(null, "Compte introuvable !");
                     login.setlogin();
                     login.setpassword();
                 }else{
                 while(rst.next()){
                  pageconnexion.super.dispose();
                  main2 menu =new main2();
                  menu.setVisible(true );
                 }
                     
                     
                 }
            }
            
        } catch (Exception er) {
            er.printStackTrace(); 
        }            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        slide = new javax.swing.JPanel();
        Slide1 = new swing.PanelSlide();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1200, 1200));

        jPanel4.setPreferredSize(new java.awt.Dimension(1255, 1));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1200, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4, java.awt.BorderLayout.PAGE_START);

        jPanel5.setBackground(new java.awt.Color(0, 102, 204));
        jPanel5.setPreferredSize(new java.awt.Dimension(500, 1199));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/Car.easy (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(660, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(253, 253, 253))
        );

        getContentPane().add(jPanel5, java.awt.BorderLayout.LINE_START);

        slide.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout Slide1Layout = new javax.swing.GroupLayout(Slide1);
        Slide1.setLayout(Slide1Layout);
        Slide1Layout.setHorizontalGroup(
            Slide1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        Slide1Layout.setVerticalGroup(
            Slide1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1199, Short.MAX_VALUE)
        );

        slide.add(Slide1, java.awt.BorderLayout.CENTER);

        getContentPane().add(slide, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(pageconnexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pageconnexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pageconnexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pageconnexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pageconnexion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.PanelSlide Slide1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel slide;
    // End of variables declaration//GEN-END:variables
}
