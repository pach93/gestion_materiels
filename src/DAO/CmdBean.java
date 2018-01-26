/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import Mapping.*;
import java.sql.ResultSet;

/**
 *
 * @author DIOUF ABBAS
 */
public class CmdBean {
    
    public static int nbChmp() throws Exception {
        int i = 0;
        ResultSet rs = null;
        String sql = "SELECT * FROM commande";
        try {
            rs = DB.getInstance().my_executeQuery(sql);
            while (rs.next()) {
                i++;
            }
        } catch (Exception e) {
            throw (e);
        }
        return i;
    }
    public static int addCmd(Commande mat) throws Exception {
        int i = 0;
        String sql = "insert into commande values(?,?,?,?)";
        try {
            DB.getInstance().initPreparedQuery(sql);
            DB.getInstance().getPstmt().setFloat(1, mat.getPrix());
            DB.getInstance().getPstmt().setDate(2, mat.getDateCmd());
            DB.getInstance().getPstmt().setInt(3, mat.getIdBonCmd());
            DB.getInstance().getPstmt().setInt(4, mat.getIdFour());
            
           
            i = DB.getInstance().my_executePreparedUpdate();

        } catch (Exception e) {
            throw e;
        }
        return i;
    }
    
}
