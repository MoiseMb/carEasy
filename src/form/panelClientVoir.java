/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package form;

import classe.Client;
import classe.Enumsexe;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JOptionPane;
import pack2.classeconnexion;
import pack2.pageconnexion;
import principale.main2;
import java.sql.SQLException;

/**
 *
 * @author moisemb
 */
public class panelClientVoir extends javax.swing.JPanel {

    /**
     * Creates new form panelClientAjout
     */
    PreparedStatement prepare ;
    ResultSet rst;
    
    public panelClientVoir() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        rechercher = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        nom = new javax.swing.JTextField();
        prenom = new javax.swing.JTextField();
        Adresse = new javax.swing.JTextField();
        Telephone = new javax.swing.JTextField();
        sexe = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cin = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 50)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Recherche CLIENT");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 470, 70));

        rechercher.setFont(new java.awt.Font("Helvetica Neue", 0, 20)); // NOI18N
        rechercher.setText("Rechercher");
        rechercher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rechercherActionPerformed(evt);
            }
        });
        add(rechercher, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 150, 160, 30));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 3, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NOM");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 74, 30));

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 3, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("PRENOM");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, -1, -1));

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 3, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ADRESSE");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 450, -1, -1));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 3, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("TELEPHONE");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 520, 140, 30));

        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 3, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("ID");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 90, -1));

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 3, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("EMAIL");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 120, 30));

        jLabel10.setFont(new java.awt.Font("Helvetica Neue", 3, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("sexe");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 640, 120, 50));

        nom.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        nom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomActionPerformed(evt);
            }
        });
        add(nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 300, 30));

        prenom.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        add(prenom, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, 300, 30));

        Adresse.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        add(Adresse, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 480, 300, 30));

        Telephone.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        add(Telephone, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 550, 300, 30));

        sexe.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        sexe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sexeActionPerformed(evt);
            }
        });
        add(sexe, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 680, 130, 30));

        email.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 300, 30));

        jLabel11.setFont(new java.awt.Font("Helvetica Neue", 3, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("CIN");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 590, 90, -1));

        cin.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        cin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cinActionPerformed(evt);
            }
        });
        add(cin, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 620, 300, 30));

        id.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 300, 30));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/form/background.jpeg"))); // NOI18N
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, -3, 860, 760));
    }// </editor-fold>//GEN-END:initComponents

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void sexeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sexeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sexeActionPerformed

    private void nomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomActionPerformed

    private void rechercherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rechercherActionPerformed
        
        
         try {
    if (email.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "VEuillez remplir le champs email !");
        email.setText("");
    } else {
        Client cl = new Client();
        cl.setEmail(email.getText());

        classeconnexion conn = new classeconnexion(); //connexion a la base de donnees 
        prepare = conn.conn.prepareStatement("SELECT * FROM Client WHERE email=?");
        prepare.setString(1, cl.getEmail());

        ResultSet rst = prepare.executeQuery();
        if (!rst.isBeforeFirst()) { //c'est a dire que le compte n'existe pas
            JOptionPane.showMessageDialog(null, "Client introuvable !");
        } else {
            while (rst.next()) {
                cl.setPrenom(rst.getString("prenom"));
                cl.setAdresse(rst.getString("adresse"));
                cl.setTelephone(rst.getString("telephone"));
                cl.setNom(rst.getString("nom"));
                cl.setIdClient(rst.getInt("idClient"));
                cl.setCin(rst.getInt("cin"));
               


                nom.setText(cl.getNom());
                prenom.setText(cl.getPrenom());
                id.setText(String.valueOf(cl.getIdClient()));
                Adresse.setText(cl.getAdresse());
                Telephone.setText(cl.getTelephone());
                cin.setText(String.valueOf(cl.getCin()));
                sexe.setText(rst.getString("sexe"));
            }
        }
    }
} catch (SQLException e) {
    JOptionPane.showMessageDialog(null, "Erreur lors de la recherche : " + e.getMessage());
}

    }//GEN-LAST:event_rechercherActionPerformed

    private void cinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cinActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Adresse;
    private javax.swing.JTextField Telephone;
    private javax.swing.JTextField cin;
    private javax.swing.JTextField email;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nom;
    private javax.swing.JTextField prenom;
    private javax.swing.JButton rechercher;
    private javax.swing.JTextField sexe;
    // End of variables declaration//GEN-END:variables
}
