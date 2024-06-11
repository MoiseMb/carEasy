/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classe;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Statement;
import pack2.classeconnexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JOptionPane;
import pack2.classeconnexion;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author moisemb
 */
public class Voiture {

    public int getPrix_location() {
        return prix_location;
    }

    public void setPrix_location(int prix_location) {
        this.prix_location = prix_location;
    }

    public String getMatriculation() {
        return matriculation;
    }

    public void setMatriculation(String matriculation) {
        this.matriculation = matriculation;
    }
    
    
    public Voiture(){}
    
    public Voiture( String matriculation, String modele ,String marque,int annee,int place,int kilometrage,boolean disponible,Enumcarburant carburant,int prix_location  ){
    this.matriculation = matriculation;
    this.marque = marque;
     this.modele = modele;
     this.annee = annee;
     this.place = place;
     this.kilometrage = kilometrage;
     this.disponible = disponible;
     this.carburant = carburant;
     this.prix_location=prix_location;
    
    }

    public int getIdVoiture() {
        return idVoiture;
    }

    public void setIdVoiture(int idVoiture) {
        this.idVoiture = idVoiture;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public int getKilometrage() {
        return kilometrage;
    }

    public void setKilometrage(int kilometrage) {
        this.kilometrage = kilometrage;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public Enumcarburant getCarburant() {
        return carburant;
    }

    public void setCarburant(Enumcarburant carburant) {
        this.carburant = carburant;
    }
    
    private String matriculation;
    private int idVoiture;
    private String marque;
    private String modele;
    private int annee;
    private int kilometrage;
    private  boolean disponible;
    private int place;
    private Enumcarburant carburant;
    private int prix_location;
    
     PreparedStatement prepare;
     ResultSet rst,rst2;
     
     



    

public void ajouterVoiture() {
    try {
        classeconnexion conn = new classeconnexion();
        Statement rsm = conn.conn.createStatement();
        rst2 = rsm.executeQuery("select * from Voiture where immatriculation = \"" + matriculation + "\"");

        if (rst2.next()) {
            JOptionPane.showMessageDialog(null, "Erreur ! Cette voiture existe déjà");
        } else {
            PreparedStatement prepare = conn.conn.prepareStatement(
                "insert into Voiture(marque, modele, annee, kilometrage, nombre_places, carburant, immatriculation, disponible, prix_location) " +
                "values(?, ?, ?, ?, ?, ?, ?, ?, ?)"
            );
            prepare.setString(1, marque);
            prepare.setString(2, modele);
            prepare.setInt(3, annee);
            prepare.setInt(4, kilometrage);
            prepare.setInt(5, place);
            prepare.setString(6, carburant.toString());
            prepare.setString(7, matriculation);
            prepare.setBoolean(8, disponible);
            prepare.setInt(9, prix_location);
            prepare.executeUpdate();
            prepare.close();

            JOptionPane.showMessageDialog(null, "Voiture ajoutée avec succès !");
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Erreur : " + e.getMessage());
    }
}

public void rechercherVoiture() {
    classeconnexion conn = new classeconnexion();
    Voiture voiture = null;
    try {
        PreparedStatement prepare = conn.conn.prepareStatement("select * from Voiture where immatriculation=?");
        prepare.setString(1, matriculation);
        ResultSet rst = prepare.executeQuery();
        if (rst.next()) {
           
               this.setIdVoiture(rst.getInt("idVoiture"));
            this.setMarque(rst.getString("marque"));
            this.setModele(rst.getString("modele"));
            this.setAnnee(rst.getInt("annee"));
            this.setKilometrage(rst.getInt("kilometrage"));
            this.setPlace(rst.getInt("nombre_places"));

            Enumcarburant car= Enumcarburant.valueOf(rst.getString("carburant"));
            this.setCarburant(car);
            this.setMatriculation(matriculation);
            this.setDisponible(rst.getBoolean("disponible"));
            this.setPrix_location(rst.getInt("prix_location"));
        } else {
            JOptionPane.showMessageDialog(null, "La voiture n'a pas été trouvée !");
        }
        prepare.close();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Erreur dans la recherche de la voiture : " + e.getMessage());
    }
   
}

public boolean Voitureexiste() {
    classeconnexion conn = new classeconnexion();
    try {
        PreparedStatement prepare = conn.conn.prepareStatement("select * from Voiture where immatriculation=?");
        prepare.setString(1, matriculation);
        ResultSet rst = prepare.executeQuery();
        if (rst.next()) {
           
            this.setIdVoiture(rst.getInt("idVoiture"));
            
            this.setDisponible(rst.getBoolean("disponible"));
            this.setPrix_location(rst.getInt("prix_location"));
            this.setMarque(rst.getString("marque"));
            this.setModele(rst.getString("modele"));
            return true;
        } else {
          return false;
           
        }
 
    } catch (SQLException e) {
     
    }
   return false;
}


public void modifierVoiture() {
    classeconnexion conn = new classeconnexion();
    Voiture voiture = null;
    try {
        PreparedStatement prepare = conn.conn.prepareStatement("UPDATE Voiture SET marque=?, modele=?, annee=?, kilometrage=?,"
                + "nombre_places=?, carburant=?, disponible=?, prix_location=? WHERE immatriculation=?");
       
        prepare.setString(1, marque);
        prepare.setString(2, modele);
        prepare.setInt(3, annee);
        prepare.setInt(4, kilometrage);
        prepare.setInt(5, place);
        prepare.setString(6, carburant.toString());
        prepare.setString(9, matriculation);
        prepare.setBoolean(7, disponible);
        prepare.setInt(8, prix_location);
       int rst = prepare.executeUpdate();
       
        if (rst>0) {
           
      
 
            JOptionPane.showMessageDialog(null, "Modification terminer avec succes");

           
        } else {
            JOptionPane.showMessageDialog(null, "Erreur Modification !");
        }
        prepare.close();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Erreur Lors de Modification de la voiture : " + e.getMessage());
    }
   
}


public void supprimerVoiture() {
    classeconnexion conn = new classeconnexion();
    Voiture voiture = null;
    try {
        PreparedStatement prepare = conn.conn.prepareStatement("delete from Voiture WHERE immatriculation=?");
       

        prepare.setString(1, matriculation);

       int rst = prepare.executeUpdate();
       
        if (rst>0) {
           
      
 
            JOptionPane.showMessageDialog(null, "Supression terminer avec succes");

           
        } else {
            JOptionPane.showMessageDialog(null, "Erreur suppression !");
        }
        prepare.close();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Erreur Lors de lors de la suppression de la voiture : " + e.getMessage());
    }
   
}

    
    
    
    
    
    
    
  
}
