/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import java.sql.ResultSet;
import java.util.ArrayList;
import Mapping.*;
import DAO.*;

/**
 *
 * @author DIOUF ABBAS
 */
public class TypeSalBean {
    
    public static ArrayList findAll() throws Exception {
       
        ArrayList lpo=null;
        type_salle po=null;
        try {
            String sql = "select * from type_salle";
            ResultSet rs = DB.getInstance().my_executeQuery(sql);
            lpo= new ArrayList() ;
            while (rs.next()) {
               po = new type_salle();
                po.setId(rs.getInt(1));
                po.setNom(rs.getString(2));
                lpo.add(po);
                
            }
        } catch (Exception e) {
            throw e;
        }
return lpo;
    }
    
}
