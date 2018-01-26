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
public class DetailsBonBean {
    
    public static int addDetBon(detailsBon mat) throws Exception {
        int i = 0;
        String sql = "insert into DetailsBon values(?,?,?,?)";
        try {
            DB.getInstance().initPreparedQuery(sql);
            DB.getInstance().getPstmt().setInt(1, mat.getIdChefDept());
            DB.getInstance().getPstmt().setInt(2, mat.getIdBnCmd());
             DB.getInstance().getPstmt().setInt(3, mat.getIdMat());
              DB.getInstance().getPstmt().setFloat(4, mat.getQte());
            i = DB.getInstance().my_executePreparedUpdate();

        } catch (Exception e) {
            throw e;
        }
        return i;
    }
}
