/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classe;

/**
 *
 * @author moisemb
 */
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Date;
import java.time.LocalDate;
import pack2.classeconnexion;
import java.time.temporal.ChronoUnit;

public class Reservation {

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }
    private int id;
    private Date dateDebut;
    private Date dateFin;
    private Client client =new Client();
    private Voiture voiture=new Voiture();
    private int prixLocation;
    private boolean etatReservation;
    private int delta;

    public Reservation() {
    }

    public Reservation(Date dateDebut, Date dateFin, Client client, Voiture voiture, int prixLocation, boolean etatReservation) {
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.client = client;
        this.voiture = voiture;
        this.prixLocation = prixLocation;
        this.etatReservation = etatReservation;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client nomClient) {
        this.client = nomClient;
    }

    public Voiture getVoiture() {
        return voiture;
    }

    public void setVoiture(Voiture Voiture) {
        this.voiture = Voiture;
    }

    public int getPrixLocation() {
        return prixLocation;
    }

    public void setPrixLocation(int prixLocation) {
        this.prixLocation = prixLocation;
    }

    public boolean isEtatReservation() {
        return etatReservation;
    }

    public void setEtatReservation(boolean etatReservation) {
        this.etatReservation = etatReservation;
    }
    
    
        
 
    public void ajouterReservation(String mat, int m) {
    voiture.setMatriculation(mat);
    client.setCin(m);
    
    if (!voiture.Voitureexiste() || !client.clientexiste()) {
        if (!voiture.Voitureexiste()) {
            JOptionPane.showMessageDialog(null, "Le numéro d'immatriculation renseigné pour la voiture n'existe pas.");
        }
        if (!client.clientexiste()) {
            JOptionPane.showMessageDialog(null, "Le CIN renseigné pour le client n'existe pas.");
        }
        return;
    }
    
    if (!voiture.isDisponible()) {
        JOptionPane.showMessageDialog(null, "La voiture n'est pas disponible.");
        return;
    }
    
    LocalDate db = dateDebut.toLocalDate();
    LocalDate fn = dateFin.toLocalDate();
    
  int duree = (int)(ChronoUnit.DAYS.between(db, fn));
    
    if (duree < 0) {
        JOptionPane.showMessageDialog(null, "Erreur : la date de fin ne peut pas être antérieure à la date de début.");
        return;
    } else if (duree == 0) {
        
        prixLocation = voiture.getPrix_location();
    
    } else 
        
    {
        
        
        prixLocation = voiture.getPrix_location() * duree;
        
        
    }

    
    try {
        
        classeconnexion conn = new classeconnexion();
        PreparedStatement prepare = conn.conn.prepareStatement("INSERT INTO Reservation(client,voiture,prix_total,debut,fin,agent,valider) VALUES (?,?,?,?,?,?,false)");
        prepare.setInt(1, this.client.getIdClient());
            prepare.setInt(2, this.voiture.getIdVoiture());
            prepare.setInt(3, prixLocation);
            prepare.setDate(4, this.dateDebut);
            prepare.setDate(5, this.dateFin);
            prepare.setInt(6, 1);
        int rst = prepare.executeUpdate();
        if (rst >0) {
            JOptionPane.showMessageDialog(null, "La réservation a été enregistrée avec succès.");
            int pr=conn.conn.prepareStatement("update Voiture set disponible=0 where idVoiture="+this.voiture.getIdVoiture()).executeUpdate();
            
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Erreur : " + e.getMessage());
    }
}

     public void RechercheReservation(String mat, int m) {
    voiture.setMatriculation(mat);
    client.setCin(m);
    
    if (!voiture.Voitureexiste() || !client.clientexiste()) {
        if (!voiture.Voitureexiste()) {
            JOptionPane.showMessageDialog(null, "Le numéro d'immatriculation renseigné pour la voiture n'existe pas.");
        }
        if (!client.clientexiste()) {
            JOptionPane.showMessageDialog(null, "Le CIN renseigné pour le client n'existe pas.");
        }
        return;
    }
    
    
    

    
    try {
        classeconnexion conn = new classeconnexion();
        PreparedStatement prepare = conn.conn.prepareStatement("select * from Reservation where client=? and voiture=?");
        prepare.setInt(1, this.client.getIdClient());
        prepare.setInt(2, this.voiture.getIdVoiture());
            
        ResultSet rst = prepare.executeQuery();
        if (rst.next()) {
        
          this.id=rst.getInt("idReservation");
          this.dateDebut=rst.getDate("debut");
          this.dateFin=rst.getDate("fin");
          this.etatReservation=rst.getBoolean("valider");
          this.prixLocation=rst.getInt("prix_total");
            
          LocalDate db = dateDebut.toLocalDate();
          LocalDate fn = dateFin.toLocalDate();
    
         int duree = (int)(ChronoUnit.DAYS.between(db, fn));
    
         this.delta=duree;

          
            
        }else{
        JOptionPane.showMessageDialog(null, "Le Client n'a pas efectuer une reservation pour cette voiture" );
        return;
        
            
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Erreur : " + e.getMessage());
    }
}   
     
     
     
     
 public void modifierReservation(String mat, int m) {
    voiture.setMatriculation(mat);
    client.setCin(m);
    
    if (!voiture.Voitureexiste()) {
    JOptionPane.showMessageDialog(null, "Le numéro d'immatriculation renseigné pour la voiture n'existe pas.");
    return;
}
if (!client.clientexiste()) {
    JOptionPane.showMessageDialog(null, "Le CIN renseigné pour le client n'existe pas.");
    return;
}

LocalDate db = dateDebut.toLocalDate();
LocalDate fn = dateFin.toLocalDate();

int duree = (int)(ChronoUnit.DAYS.between(db, fn));

if (duree < 0) {
    JOptionPane.showMessageDialog(null, "Erreur : la date de fin ne peut pas être antérieure à la date de début.");
    return;
} else if (duree == 0) {
    prixLocation = voiture.getPrix_location();
} else {
    prixLocation = voiture.getPrix_location() * duree;
}


try {
    classeconnexion conn = new classeconnexion();
    PreparedStatement prepare = conn.conn.prepareStatement("update Reservation set prix_total=?, debut=?, fin=?, valider=? where client=? and voiture=?");
    prepare.setInt(1, prixLocation);
    prepare.setDate(2, java.sql.Date.valueOf(db));
    prepare.setDate(3, java.sql.Date.valueOf(fn));
    prepare.setBoolean(4, etatReservation);
    prepare.setInt(5, this.client.getIdClient());
    prepare.setInt(6, this.voiture.getIdVoiture());
    int rst = prepare.executeUpdate();
    if (rst > 0) {
        JOptionPane.showMessageDialog(null, "La Modification a été enregistrée avec succès.");
    }
} catch (SQLException e) {
    JOptionPane.showMessageDialog(null, "Erreur : " + e.getMessage());
}

     }   
 
 
 
 public void supprimerReservation(String mat, int m) {
    voiture.setMatriculation(mat);
    client.setCin(m);
    
    if (!voiture.Voitureexiste()) {
    JOptionPane.showMessageDialog(null, "Le numéro d'immatriculation renseigné pour la voiture n'existe pas.");
    return;
}
if (!client.clientexiste()) {
    JOptionPane.showMessageDialog(null, "Le CIN renseigné pour le client n'existe pas.");
    return;
}






try {
    classeconnexion conn = new classeconnexion();
    PreparedStatement prepare = conn.conn.prepareStatement("delete from Reservation where client=? and voiture=?");

    prepare.setInt(1, this.client.getIdClient());
    prepare.setInt(2, this.voiture.getIdVoiture());
    int rst = prepare.executeUpdate();
    if (rst > 0) {
        JOptionPane.showMessageDialog(null, "Suppression terminer avec succès.");
    }
} catch (SQLException e) {
    JOptionPane.showMessageDialog(null, "Erreur : " + e.getMessage());
}

     }   

}
