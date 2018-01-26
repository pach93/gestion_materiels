/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import Mapping.*;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author DIOUF ABBAS
 */
public class FournisseurBean {
    
    public static ArrayList findAll() throws Exception {
       
        ArrayList lpo=null;
        Fournisseur po=null;
        try {
            String sql = "select * from Fournisseur";
            ResultSet rs = DB.getInstance().my_executeQuery(sql);
            lpo= new ArrayList() ;
            while (rs.next()) {
               po = new Fournisseur();
                po.setId(rs.getInt(1));
                po.setNom(rs.getString(2));
                po.setAd(rs.getString(3));
                po.setTel(rs.getString(4));
                lpo.add(po);
                
            }
        } catch (Exception e) {
            throw e;
        }
return lpo;
    }
    
}
