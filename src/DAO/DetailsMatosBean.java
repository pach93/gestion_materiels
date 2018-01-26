/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import java.sql.ResultSet;
import Mapping.*;
import DAO.*;

/**
 *
 * @author DIOUF ABBAS
 */
public class DetailsMatosBean {
    
    public static DetailsMatos verif(int a, int b) throws Exception
    {
    DetailsMatos dtm = null;
       try {
           String sql = "select * from DetailsMatos where idMat=? and idSal=?";
           DB.getInstance().initPreparedQuery(sql);
            DB.getInstance().getPstmt().setInt(1, a);
            DB.getInstance().getPstmt().setInt(2, b);
            ResultSet rs = DB.getInstance().my_executePreparedQuery();
            
            if (rs.next()) {
                dtm = new DetailsMatos();
                dtm.setIdMat(rs.getInt(1));
                dtm.setIdSal(rs.getInt(2));
                dtm.setNbMatos(rs.getInt(3));
            }
       } catch (Exception e) {
           throw e;
       }
   
   return dtm;
    }
    
    public static int addDetMAT(DetailsMatos dtm) throws Exception{
    int i = 0;
        String sql = "insert into DetailsMatos values(?,?,?)";
        try {
            DB.getInstance().initPreparedQuery(sql);
            DB.getInstance().getPstmt().setInt(1, dtm.getIdMat());
            DB.getInstance().getPstmt().setInt(2, dtm.getIdSal());
            DB.getInstance().getPstmt().setInt(3, dtm.getNbMatos());
            i = DB.getInstance().my_executePreparedUpdate();

        } catch (Exception e) {
            throw e;
        }
        return i;
    
    }
    
    public static int UpDetMat(int mat, int sal, int id) throws Exception {
        int i = 0;
        String sql = "update DetailsMatos set nbMatos= ? where idMat= ? and idSal= ?";
        try {
            DB.getInstance().initPreparedQuery(sql);
            DB.getInstance().getPstmt().setInt(1, id);
            DB.getInstance().getPstmt().setInt(2, mat);
            DB.getInstance().getPstmt().setInt(3, sal);
            i = DB.getInstance().my_executePreparedUpdate();

        } catch (Exception e) {
            throw e;
        }
        return i;
    }
    
    public static int UpStock(int mat,int sal, int nb) throws Exception {
        int i = 0;
        String sql = "update DetailsMatos set nbMatos= ? where idMat= ? and idSal=?";
        try {
            DB.getInstance().initPreparedQuery(sql);
            DB.getInstance().getPstmt().setInt(1, nb);
            DB.getInstance().getPstmt().setInt(2, mat);
            DB.getInstance().getPstmt().setInt(3, sal);
            i = DB.getInstance().my_executePreparedUpdate();

        } catch (Exception e) {
            throw e;
        }
        return i;
    }
    
    public static int getStock(int mat,int sal) throws Exception
    {
    DetailsMatos dtm = null;
       try {
           String sql = "select * from DetailsMatos where idMat=? and idSal=?";
           DB.getInstance().initPreparedQuery(sql);
            DB.getInstance().getPstmt().setInt(1, mat);
            DB.getInstance().getPstmt().setInt(2, sal);
            ResultSet rs = DB.getInstance().my_executePreparedQuery();
            
            if (rs.next()) {
                dtm = new DetailsMatos();
                dtm.setIdMat(rs.getInt(1));
                dtm.setIdSal(rs.getInt(2));
                dtm.setNbMatos(rs.getInt(3));
            }
       } catch (Exception e) {
           throw e;
       }
   
   return dtm.getNbMatos();
    }
    
}
