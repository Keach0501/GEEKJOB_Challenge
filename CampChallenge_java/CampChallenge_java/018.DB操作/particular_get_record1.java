/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbcontrol;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author keygr
 */
public class particular_get_record1 {
    public static void main(String[] args){
        Connection db_con = null;
        PreparedStatement db_st = null;
        try{
            db_con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/challenge_db?characterEncoding=UTF-8&serverTimezone=JST","keach","keach0501");
            db_st = db_con.prepareStatement(
                "select * from profiles where profilesID = ?");
            db_st.setInt(1,1);
            ResultSet rs = db_st.executeQuery();
            while (rs.next()){
                System.out.println(
                    rs.getInt("profilesID") + "," 
                    + rs.getString("name") + ","
                    + rs.getString("tel") + ","
                    + rs.getInt("age") + ","
                    + rs.getDate("birthday"));
            }
        }catch(SQLException e_sql){
            System.out.println(
                "接続時にエラーが発生しました:" + e_sql.toString());
        }catch(Exception e){
            System.out.println(
                "接続時にエラーが発生しました:" + e.toString());
        }finally{
            if(db_con != null){    
                try{
                    db_st.close();
                    db_con.close();
                }catch (SQLException e_con){
                    System.out.println(e_con.getMessage());
                }
            }
        }
    }
}
