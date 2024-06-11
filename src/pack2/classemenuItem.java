/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pack2;

import javax.swing.JButton;

/**
 *
 * @author moisemb
 */
public class classemenuItem extends JButton {

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public boolean isSousmenuactive() {
        return sousmenuactive;
    }

    public void setSousmenuactive(boolean sousmenuactive) {
        this.sousmenuactive = sousmenuactive;
    }

    public int getSousmenuindex() {
        return sousmenuindex;
    }

    public void setSousmenuindex(int sousmenuindex) {
        this.sousmenuindex = sousmenuindex;
    }

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

  
    
    private int index;
    private boolean sousmenuactive;
    
    //sous menu
    
    private int sousmenuindex;
    private int taille;
    
    public classemenuItem( String nom,int index,boolean sousmenuactive){
        super(nom);
        this.index=index;
        this.sousmenuactive=sousmenuactive;
    }
    
    public void initSousMenu(int sousmenuindex,int taille){
        this.sousmenuindex=sousmenuindex;
        this.taille=taille;
        setContentAreaFilled(false);
        
    }
}
