/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import Mapping.Chef_Dept;
import java.sql.ResultSet;

/**
 *
 * @author DIOUF ABBAS
 */
public class ChefBean {
    
    public static Chef_Dept Logon(String login, String pwd, String id) throws Exception {
        Chef_Dept emp = null;
        try {
            String sql = "select * from chef_dept where login = ? and pass = ? and id_dept = ?";
            DB.getInstance().initPreparedQuery(sql);
            DB.getInstance().getPstmt().setString(1, login);
            DB.getInstance().getPstmt().setString(2, pwd);
            DB.getInstance().getPstmt().setString(3, id);
            ResultSet rs = DB.getInstance().my_executePreparedQuery();
            if (rs.next()) {
                emp = new Chef_Dept();
                emp.setId(rs.getInt(1));
                emp.setNom(rs.getString(2));
                emp.setId_dept(rs.getString(3));
                emp.setLogin(rs.getString(4));
                emp.setPass(rs.getString(5));
                
            }

        } catch (Exception e) {
            throw e;
        }
        return emp;
    }

}
