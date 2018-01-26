/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;
import Mapping.*;
/**
 *
 * @author DIOUF ABBAS
 */
public class DetailsCmdBean {
    
    public static int addDetCmd(detailCmd mat) throws Exception {
        int i = 0;
        String sql = "insert into detailsCmd values(?,?,?)";
        try {
            DB.getInstance().initPreparedQuery(sql);
            DB.getInstance().getPstmt().setInt(1, mat.getIdmat());
            DB.getInstance().getPstmt().setInt(2, mat.getIdCmd());
             DB.getInstance().getPstmt().setFloat(3, mat.getQte());
            i = DB.getInstance().my_executePreparedUpdate();

        } catch (Exception e) {
            throw e;
        }
        return i;
    }
}
