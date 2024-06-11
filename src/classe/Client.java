/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classe;

import pack2.classeconnexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author moisemb
 */
public class Client {

    public Enumsexe getSexe() {
        return sexe;
    }

    public void setSexe(Enumsexe sexe) {
        this.sexe = sexe;
    }

    public int getCin() {
        return cin;
    }

    public void setCin(int cin) {
        this.cin = cin;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }
    
  
    private String nom;
    private String prenom;
    private String adresse;
    private String telephone;
    private String email;
    private int idClient;
    private int cin;
    private Enumsexe sexe;

    public Client() {

    }

    public String getNom() {
        return nom;
    }
    public String getPrenom() {
        return prenom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean clientexiste(){
        
                classeconnexion conn=new classeconnexion();
    try {

        PreparedStatement prepare=conn.conn.prepareStatement("select * from Client where cin=?");
        prepare.setInt(1, cin);
        ResultSet rt=prepare.executeQuery();
        
        
        if(rt.next()){ // Si un client a été trouvé
            this.setIdClient(rt.getInt("idClient"));
            this.setNom(rt.getString("nom"));
            this.setPrenom(rt.getString("prenom"));
            return true;
        } else {
            return false;
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Erreur :"+e.getMessage());
    }
    return false;
}
}
