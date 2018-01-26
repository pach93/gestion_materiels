/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Mapping;

import java.sql.Date;

/**
 *
 * @author DIOUF ABBAS
 */
public class Commande {
    
    private int numCmd;
    private float prix;
    private Date dateCmd;
    private int idBonCmd;
    private int idFour;

    public Commande() {
    }

    public int getNumCmd() {
        return numCmd;
    }

    public void setNumCmd(int numCmd) {
        this.numCmd = numCmd;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public Date getDateCmd() {
        return dateCmd;
    }

    public void setDateCmd(Date dateCmd) {
        this.dateCmd = dateCmd;
    }

    public int getIdBonCmd() {
        return idBonCmd;
    }

    public void setIdBonCmd(int idBonCmd) {
        this.idBonCmd = idBonCmd;
    }

    public int getIdFour() {
        return idFour;
    }

    public void setIdFour(int idFour) {
        this.idFour = idFour;
    }
    
    
    
}
