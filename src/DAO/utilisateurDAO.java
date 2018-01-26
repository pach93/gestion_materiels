/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import Mapping.*;
import DAO.*;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author DIOUF ABBAS
 */
public class utilisateurDAO {
    
    public static ArrayList findAll() throws Exception {
       
        ArrayList lpo=null;
       utilisateur po=null;
        try {
            String sql = "select * from utilisateur";
            ResultSet rs = DB.getInstance().my_executeQuery(sql);
            lpo= new ArrayList() ;
            while (rs.next()) {
               po = new utilisateur();
                po.setId(rs.getInt(1));
                po.setNom(rs.getString(2));
                po.setLogin(rs.getString(3));
                po.setPass(rs.getString(4));
                po.setPoste(rs.getString(5));
                lpo.add(po);
                
            }
        } catch (Exception e) {
            throw e;
        }
return lpo;
    }
    
    public static utilisateur Logon(String login, String pwd, String nompo) throws Exception {
        utilisateur emp = null;
        try {
            String sql = "select * from utilisateur where login = ? and pass = ? and poste = ?";
            DB.getInstance().initPreparedQuery(sql);
            DB.getInstance().getPstmt().setString(1, login);
            DB.getInstance().getPstmt().setString(2, pwd);
            DB.getInstance().getPstmt().setString(3, nompo);
            ResultSet rs = DB.getInstance().my_executePreparedQuery();
            if (rs.next()) {
                emp = new utilisateur();
                emp.setId(rs.getInt(1));
                emp.setNom(rs.getString(2));
                emp.setLogin(rs.getString(3));
                emp.setPass(rs.getString(4));
                emp.setPoste(rs.getString(5));
                
            }

        } catch (Exception e) {
            throw e;
        }
        return emp;
    }
}
