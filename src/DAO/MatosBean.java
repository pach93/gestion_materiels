/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Mapping.Materiel;
import Mapping.type_salle;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author DIOUF ABBAS
 */
public class MatosBean {

    public static int addMatos(Materiel mat) throws Exception {
        int i = 0;
        String sql = "insert into materiel values(?,?)";
        try {
            DB.getInstance().initPreparedQuery(sql);
            DB.getInstance().getPstmt().setString(1, mat.getNom());
            DB.getInstance().getPstmt().setFloat(2, mat.getPrix());
            i = DB.getInstance().my_executePreparedUpdate();

        } catch (Exception e) {
            throw e;
        }
        return i;
    }
    
    public static ArrayList findAll() throws Exception {
       
        ArrayList lpo=null;
        Materiel po=null;
        try {
            String sql = "select * from materiel";
            ResultSet rs = DB.getInstance().my_executeQuery(sql);
            lpo= new ArrayList() ;
            while (rs.next()) {
               po = new Materiel();
                po.setId(rs.getInt(1));
                po.setNom(rs.getString(2));
                po.setPrix(rs.getFloat(3));
                lpo.add(po);
                
            }
        } catch (Exception e) {
            throw e;
        }
return lpo;
    }
    
    public static Materiel rechById(int a) throws Exception {
       
        Materiel po=null;
        try {
            String sql = "select * from materiel where id=?";
                        DB.getInstance().initPreparedQuery(sql);
            DB.getInstance().getPstmt().setInt(1, a);
            ResultSet rs = DB.getInstance().my_executePreparedQuery();
            while (rs.next()) {
               po = new Materiel();
                po.setId(rs.getInt(1));
                po.setNom(rs.getString(2));
                po.setPrix(rs.getFloat(3));
                
            }
        } catch (Exception e) {
            throw e;
        }
return po;
    }
}
