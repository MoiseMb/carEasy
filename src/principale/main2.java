/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package principale;

import form.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import menu.MenuItem;
import pack2.pageconnexion;


/**
 *
 * @author moisemb
 */
public class main2 extends javax.swing.JFrame {

    /**
     * Creates new form main2
     */
    public main2() {
        initComponents();
//        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        executer();
    }
    
    
   
    private void executer(){
        
        ImageIcon iconMenu= new ImageIcon(getClass().getResource("/menu/menu.png"));
        ImageIcon iconVoiture= new ImageIcon(getClass().getResource("/menu/voiture.png"));
        ImageIcon iconVisite= new ImageIcon(getClass().getResource("/menu/uchiha.png"));
        ImageIcon iconUser= new ImageIcon(getClass().getResource("/menu/user.png"));
        ImageIcon iconReservation= new ImageIcon(getClass().getResource("/menu/reservation.png"));
        ImageIcon iconsousMenu= new ImageIcon(getClass().getResource("/menu/next.png"));
        
        //creation des sous menu client
        
        MenuItem menuClient1=new MenuItem(iconsousMenu, "Ajouter Client", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            
              panelBody.removeAll();
                panelBody.add(new panelClientAjout());
                panelBody.repaint();
                panelBody.revalidate();
                 
                
            }
        });
         MenuItem menuClient2=new MenuItem(iconsousMenu, "Modifier Client",new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelBody.removeAll();
                panelBody.add(new panelClientModifier());
                panelBody.repaint();
                panelBody.revalidate();
                    
                
            }
        });
         
          MenuItem menuClient3=new MenuItem(iconsousMenu, "Rechercher Client",new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelBody.removeAll();
                panelBody.add(new panelClientVoir());
                panelBody.repaint();
                panelBody.revalidate();
                    
                
            }
        });
           MenuItem menuClient4=new MenuItem(iconsousMenu, "Supprimer Client",new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelBody.removeAll();
                panelBody.add(new panelClientSupprimer());
                panelBody.repaint();
                panelBody.revalidate();
                    
                
            }
        });
           
           
            //creation des sous menu voiture
            
        MenuItem menuVoiture1=new MenuItem(iconsousMenu, "Ajouter Voiture",new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                panelBody.removeAll();
                panelBody.add(new panelVoitureAjout());
                panelBody.repaint();
                panelBody.revalidate();
                    
                
            }
        });
        MenuItem menuVoiture2=new MenuItem(iconsousMenu, "Modifier Voiture",new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                panelBody.removeAll();
                panelBody.removeAll();
                panelBody.add(new panelVoitureModifier());
                panelBody.repaint();
                panelBody.revalidate();
                    
                
            }
        });
                
                
        MenuItem menuVoiture3=new MenuItem(iconsousMenu, "Rechercher Voiture",new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                panelBody.removeAll();
                panelBody.removeAll();
                panelBody.add(new panelVoitureRecherche());
                panelBody.repaint();
                panelBody.revalidate();
                    
                
            }
        });
        MenuItem menuVoiture4=new MenuItem(iconsousMenu, "Supprimer Voiture",new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                panelBody.removeAll();
                panelBody.removeAll();
                panelBody.add(new panelVoitureSupprimer());
                panelBody.repaint();
                panelBody.revalidate();
                    
                
            }
        });
        
         //creation des sous menu Reservation
         
        MenuItem menuReservation1=new MenuItem(iconsousMenu, "Ajouter Reservation",new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                panelBody.removeAll();
                panelBody.removeAll();
                panelBody.add(new panelReservationAjout());
                panelBody.repaint();
                panelBody.revalidate();
                    
                
            }
        });
                
                
         MenuItem menuReservation2=new MenuItem(iconsousMenu, "Modifier Reservation",new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                panelBody.removeAll();
                panelBody.removeAll();
                panelBody.add(new panelReservationModification());
                panelBody.repaint();
                panelBody.revalidate();
                    
                
            }
        });
                 
                 
                 
          MenuItem menuReservation3=new MenuItem(iconsousMenu, "Rechercher Reservation",new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                panelBody.removeAll();
                panelBody.removeAll();
                panelBody.add(new panelReservationRecherche());
                panelBody.repaint();
                panelBody.revalidate();
                    
                
            }
        });
           MenuItem menuReservation4=new MenuItem(iconsousMenu, "Supprimer Reservation",new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                panelBody.removeAll();
                panelBody.removeAll();
                panelBody.add(new panelReservationSuppression());
                panelBody.repaint();
                panelBody.revalidate();
                    
                
            }
        });
           
            //creation des sous menu Visilaiser
            
           MenuItem menuVisite1=new MenuItem(iconsousMenu, "Voiture Disponible",new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                panelBody.removeAll();
                panelBody.add(new visualiser1());
                panelBody.repaint();
                panelBody.revalidate();
                    
                
            }
        });
           MenuItem menuVisite2=new MenuItem(iconsousMenu, "Voiture en cours de location",new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                panelBody.removeAll();
                panelBody.add(new visualiser1());
                panelBody.repaint();
                panelBody.revalidate();
                    
                
            }
        });
          
        
        MenuItem menuMenu=new MenuItem(iconMenu, "ACCEUILL",new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                panelBody.removeAll();
                panelBody.add(new Acceuil());
                panelBody.repaint();
                panelBody.revalidate();
                    
                
            }
        });
        MenuItem menuClient=new MenuItem(iconUser, "CLIENT",null,menuClient1,menuClient2,menuClient3,menuClient4 );
        MenuItem menuVoiture=new MenuItem(iconVoiture, "Voiture",null,menuVoiture1,menuVoiture2,menuVoiture3,menuVoiture4 );
        MenuItem menuReservation=new MenuItem(iconReservation, "RESERVATION",null,menuReservation1,menuReservation2,menuReservation3,menuReservation4 );
        MenuItem menuVisite=new MenuItem(iconVisite, "Visualiser",null,menuVisite1,menuVisite2  );
        
        ajouterMenu(menuMenu,menuClient,menuVoiture,menuReservation,menuVisite);
     
    
    }

    
    private void ajouterMenu(MenuItem ...menu){
    
    for(int i=0;i<menu.length;i++){
        
        menus.add(menu[i]);
        ArrayList<MenuItem>sousMenu=menu[i].getSubMenu(); 
        
        for(MenuItem m:sousMenu){
            
            ajouterMenu(m); 
        }
    }
    menus.revalidate();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        panelIcon = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        scrollPaneWin111 = new raven.scroll.win11.ScrollPaneWin11();
        menus = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelBody = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        acceuil1 = new form.Acceuil();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(100, 1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1200, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(0, 102, 204));
        jPanel2.setPreferredSize(new java.awt.Dimension(350, 591));

        panelIcon.setBackground(new java.awt.Color(0, 102, 204));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/carEasy_menu.png"))); // NOI18N

        javax.swing.GroupLayout panelIconLayout = new javax.swing.GroupLayout(panelIcon);
        panelIcon.setLayout(panelIconLayout);
        panelIconLayout.setHorizontalGroup(
            panelIconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIconLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );
        panelIconLayout.setVerticalGroup(
            panelIconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIconLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(0, 102, 204));

        scrollPaneWin111.setBackground(new java.awt.Color(0, 102, 204));
        scrollPaneWin111.setBorder(null);

        menus.setBackground(new java.awt.Color(0, 102, 204));
        menus.setLayout(new javax.swing.BoxLayout(menus, javax.swing.BoxLayout.Y_AXIS));
        scrollPaneWin111.setViewportView(menus);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPaneWin111, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPaneWin111, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 868, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(204, 0, 51));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/singout.png"))); // NOI18N
        jLabel1.setText("SE DECONNECTER");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(panelIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.LINE_START);

        panelBody.setBackground(new java.awt.Color(255, 255, 255));
        panelBody.setLayout(new java.awt.BorderLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setForeground(new java.awt.Color(51, 51, 51));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel5.add(acceuil1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        panelBody.add(jPanel5, java.awt.BorderLayout.CENTER);

        getContentPane().add(panelBody, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(1200, 1200));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        
        
       main2.super.dispose();
                  pageconnexion principale =new pageconnexion(); //Pour retourner a l 'acceuil
                  principale.setVisible(true );
    }//GEN-LAST:event_jLabel1MouseClicked

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
            java.util.logging.Logger.getLogger(main2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private form.Acceuil acceuil1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel menus;
    private javax.swing.JPanel panelBody;
    private javax.swing.JPanel panelIcon;
    private raven.scroll.win11.ScrollPaneWin11 scrollPaneWin111;
    // End of variables declaration//GEN-END:variables
}
