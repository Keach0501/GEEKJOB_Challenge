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
public class particular_update_record {
    public static void main(String[] args){
        Connection db_con = null;
        PreparedStatement db_updt = null;
        PreparedStatement db_slct = null;
        try{
            db_con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/challenge_db?characterEncoding=UTF-8&serverTimezone=JST","keach","keach0501");
            db_updt = db_con.prepareStatement(
                "UPDATE profiles SET age = ? WHERE profilesID = ?");
            db_updt.setInt(1, 33);
            db_updt.setInt(2, 1);
            db_slct = db_con.prepareStatement(
                "select * from profiles");
            int count = db_updt.executeUpdate();
            ResultSet rs = db_slct.executeQuery();
            System.out.println("Update" + count);
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
                    db_slct.close();
                    db_con.close();
                }catch (SQLException e_con){
                    System.out.println(e_con.getMessage());
                }
            }
        }
    }
}
