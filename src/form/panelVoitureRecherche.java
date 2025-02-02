/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package form;

import classe.Enumcarburant;
import classe.Voiture;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author moisemb
 */
public class panelVoitureRecherche extends javax.swing.JPanel {

    /**
     * Creates new form panelVoitureAjout
     */
    public panelVoitureRecherche() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        annee = new javax.swing.JTextField();
        prix = new javax.swing.JTextField();
        immatriculation = new javax.swing.JTextField();
        kilometrage = new javax.swing.JTextField();
        marque = new javax.swing.JTextField();
        modele = new javax.swing.JTextField();
        rechercher = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        image = new javax.swing.JLabel();
        carburant = new javax.swing.JTextField();
        disponible = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        place = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Recherche Voiture");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 370, 50));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 3, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Marque");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, -1, -1));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 3, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Modele");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 3, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Annee");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 240, -1, -1));

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 3, 22)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Kilometrage");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, -1, 50));

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 3, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Immatriculation");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, 40));

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 3, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Disponiblite");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 610, 160, 30));

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 3, 22)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Prix location");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 310, -1, 30));

        annee.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        add(annee, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 270, 200, 30));
        add(prix, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 340, 200, 30));

        immatriculation.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        add(immatriculation, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 260, 30));

        kilometrage.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        add(kilometrage, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 200, 30));

        marque.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        add(marque, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 200, 30));

        modele.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        add(modele, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 200, 200, 30));

        rechercher.setText("Rechercher");
        rechercher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rechercherActionPerformed(evt);
            }
        });
        add(rechercher, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, 120, 30));

        jLabel10.setFont(new java.awt.Font("Helvetica Neue", 3, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("CFA");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 350, -1, 30));

        jLabel11.setFont(new java.awt.Font("Helvetica Neue", 3, 22)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Carburant");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, -1, 30));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(image, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(image, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 580, 330));
        add(carburant, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 200, 30));

        disponible.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        disponible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disponibleActionPerformed(evt);
            }
        });
        add(disponible, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 660, 140, 30));

        jLabel12.setFont(new java.awt.Font("Helvetica Neue", 3, 22)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("nombre place");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 420, -1, 30));

        place.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        place.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeActionPerformed(evt);
            }
        });
        add(place, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 450, 60, 30));

        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 3, 22)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("ID");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 510, 40, 30));

        id.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 540, 140, 30));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/form/background.jpeg"))); // NOI18N
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, -3, 860, 820));
    }// </editor-fold>//GEN-END:initComponents

    private void rechercherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rechercherActionPerformed
       
        
        try {
            if(immatriculation.getText().isBlank()){
            
            JOptionPane.showMessageDialog(null, "Erreur veuillez renseigner le champ immatriculation");
            
            }else{
                
                Voiture v=new Voiture();
                v.setMatriculation(immatriculation.getText());
                
                v.rechercherVoiture();
                String m=String.valueOf(v.getCarburant());
                
                
                if(m.equals("null"))return;
                
                
               marque.setText(v.getMarque());
               modele.setText(v.getModele());
               kilometrage.setText(String.valueOf(v.getKilometrage()));
               annee.setText(String.valueOf(v.getAnnee()));
               carburant.setText(m);
               place.setText(String.valueOf(v.getPlace()));
               prix.setText(String.valueOf(v.getPrix_location()));
               id.setText(String.valueOf(v.getIdVoiture()));
                
               if(v.isDisponible()){
                 disponible.setText("Disponible");  
               
               }else{
               disponible.setText("louer");
               }
               
               
               
          
//          

        BufferedImage image2 = null;
        try {
            image2 = ImageIO.read(new File("photoVoiture/"+immatriculation.getText()+".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        ImageIcon icon = new ImageIcon(image2);
        image.setIcon(icon);

          
            }
            
           
            
        } catch (Exception ex) {
            Logger.getLogger(panelVoitureRecherche.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_rechercherActionPerformed

    private void disponibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disponibleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_disponibleActionPerformed

    private void placeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_placeActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField annee;
    private javax.swing.JTextField carburant;
    private javax.swing.JTextField disponible;
    private javax.swing.JTextField id;
    private javax.swing.JLabel image;
    private javax.swing.JTextField immatriculation;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField kilometrage;
    private javax.swing.JTextField marque;
    private javax.swing.JTextField modele;
    private javax.swing.JTextField place;
    private javax.swing.JTextField prix;
    private javax.swing.JButton rechercher;
    // End of variables declaration//GEN-END:variables
}
