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
public class utilisateur {
    private int id;
    private String nom;
    private String login;
    private String pass;
    private String poste;
    private static utilisateur us;

    public utilisateur() {
    }

    public static utilisateur getInstance(){
    if(us==null)
        us= new utilisateur();
    return us;
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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }
    
    public String toString()
    {
    return poste;
    }
    
}
