/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Mapping;

/**
 *
 * @author DIOUF ABBAS
 */
public class Salle {
    
    private int id;
    private String nom;
    private float superficie;
    private int idTpSal;

    public Salle() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public float getSuperficie() {
        return superficie;
    }

    public void setSuperficie(float superficie) {
        this.superficie = superficie;
    }

    public int getIdTpSal() {
        return idTpSal;
    }

    public void setIdTpSal(int idTpSal) {
        this.idTpSal = idTpSal;
    }
    
    @Override
    public String toString(){
    return nom;
    }
}
