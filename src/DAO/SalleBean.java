/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import Mapping.Materiel;
import Mapping.Salle;
import Mapping.type_salle;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author DIOUF ABBAS
 */
public class SalleBean {
    
    public static int addSal(Salle sal) throws Exception {
        int i = 0;
        String sql = "insert into salle values(?,?,?)";
        try {
            DB.getInstance().initPreparedQuery(sql);
            DB.getInstance().getPstmt().setString(1, sal.getNom());
            DB.getInstance().getPstmt().setFloat(2, sal.getSuperficie());
            DB.getInstance().getPstmt().setInt(3, sal.getIdTpSal());
            i = DB.getInstance().my_executePreparedUpdate();

        } catch (Exception e) {
            throw e;
        }
        return i;
    }
    
    public static ArrayList findAll() throws Exception {
       
        ArrayList lpo=null;
        Salle po=null;
        try {
            String sql = "select * from salle";
            ResultSet rs = DB.getInstance().my_executeQuery(sql);
            lpo= new ArrayList() ;
            while (rs.next()) {
               po = new Salle();
                po.setId(rs.getInt(1));
                po.setNom(rs.getString(2));
                po.setSuperficie(rs.getFloat(3));
                po.setIdTpSal(rs.getInt(4));
                lpo.add(po);
                
            }
        } catch (Exception e) {
            throw e;
        }
return lpo;
    }
}

    
