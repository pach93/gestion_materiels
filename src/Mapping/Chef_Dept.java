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
public class Chef_Dept {
    
    private int id;
    private String nom;
    private String id_dept;
    private String login;
    private String pass;
    private static Chef_Dept cdp;
    
    public static Chef_Dept getInstance(){
    if(cdp==null)
        cdp = new Chef_Dept();
    return cdp;
    }

    public Chef_Dept() {
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

    public String getId_dept() {
        return id_dept;
    }

    public void setId_dept(String id_dept) {
        this.id_dept = id_dept;
    }
    
    
}
