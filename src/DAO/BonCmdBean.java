/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;
import DAO.*;
import Mapping.*;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author DIOUF ABBAS
 */
public class BonCmdBean {
    
    public static int nbChmp() throws Exception {
        int i = 0;
        ResultSet rs = null;
        String sql = "SELECT * FROM BonCmd";
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
    public static int addBon(BonCommande mat) throws Exception {
        int i = 0;
        String sql = "insert into BonCmd values(?,?,?)";
        try {
            DB.getInstance().initPreparedQuery(sql);
            DB.getInstance().getPstmt().setDate(1, mat.getDatecmd());
            DB.getInstance().getPstmt().setFloat(2, mat.getPrix());
            DB.getInstance().getPstmt().setFloat(3, mat.getEtat());
           
            i = DB.getInstance().my_executePreparedUpdate();

        } catch (Exception e) {
            throw e;
        }
        return i;
    }
    
  
    
    public static int BonAval(int id) throws Exception {
        int i = 0;
        ResultSet rs = null;
        String sql = "SELECT * FROM BonCmd where etat = ?";
        try {
            DB.getInstance().initPreparedQuery(sql);
            DB.getInstance().getPstmt().setInt(1, id);
            rs = DB.getInstance().my_executePreparedQuery();
            while (rs.next()) {
                i++;
            }
        } catch (Exception e) {
            throw (e);
        }
        return i;
    }
    
    public static int getIdBon(int id)throws Exception{
    int i = 0;
        ResultSet rs = null;
        String sql = "SELECT * FROM BonCmd where etat = ?";
        try {
            DB.getInstance().initPreparedQuery(sql);
             DB.getInstance().getPstmt().setInt(1, id);
             rs = DB.getInstance().my_executePreparedQuery();
            while (rs.next()) {
                i = rs.getInt(1);
            }
        } catch (Exception e) {
            throw (e);
        }
        return i;
    }
    
    public static ArrayList Bonbi(int id) throws Exception
    {
    int i = 0;
        ResultSet rs = null;
        ArrayList lbn = null;
        detailsBon bn = null;
        String sql = "SELECT * FROM DetailsBon where idBnCmd = ?";
        try {
            lbn = new ArrayList();
             DB.getInstance().initPreparedQuery(sql);
            DB.getInstance().getPstmt().setInt(1, id);
            
            rs = DB.getInstance().my_executePreparedQuery();
            
            while (rs.next()) {
                bn = new detailsBon();
                bn.setIdChefDept(rs.getInt(1));
                bn.setIdBnCmd(rs.getInt(2));
                bn.setIdMat(rs.getInt(3));
                bn.setQte(rs.getFloat(4));
                lbn.add(bn);
            }
        } catch (Exception e) {
            throw (e);
        }
        return lbn;
    }
    
    public static int TransBonSG(int id,int et) throws Exception
    {
    int i = 0;
        ResultSet rs = null;
        detailsBon bn = null;
        String sql = "update BonCmd set etat= ? where id = ?";
        try {
             DB.getInstance().initPreparedQuery(sql);
            DB.getInstance().getPstmt().setInt(1, et);
            DB.getInstance().getPstmt().setInt(2, id);
            
            i = DB.getInstance().my_executePreparedUpdate();
            
            
        } catch (Exception e) {
            throw (e);
        }
        return i;
    }
    
    public static BonCommande kaay(int id) throws Exception {
        int i = 0;
        ResultSet rs = null;
        BonCommande bn =null;
        String sql = "SELECT * FROM BonCmd where etat = ?";
        try {
            bn = new BonCommande();
            DB.getInstance().initPreparedQuery(sql);
            DB.getInstance().getPstmt().setInt(1, id);
            rs = DB.getInstance().my_executePreparedQuery();
            while (rs.next()) {
                bn.setId(rs.getInt(1));
                bn.setDatecmd(rs.getDate(2));
                bn.setPrix(rs.getFloat(3));
                bn.setEtat(rs.getInt(4));
            }
        } catch (Exception e) {
            throw (e);
        }
        return bn;
    }
}
