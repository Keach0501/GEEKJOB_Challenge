/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbcontrol;

import java.sql.*;

/**
 *
 * @author keygr
 */
public class errorhandring {
    public static void main(String[] args){
        Connection db_con = null;
        try{
            db_con = DriverManager.getConnection("jdbc:mysql://localhost:3306/challenge_db?characterEncoding=UTF-8&serverTimezone=JST","keach","keach0501");
            System.out.println("OK");
        }catch(SQLException e_sql){
            System.out.println("接続時にエラーが発生しました:" + e_sql.toString());
        }catch(Exception e){
            System.out.println("接続時にエラーが発生しました:" + e.toString());
        }finally {
            if(db_con != null) {
                try{
                    db_con.close();
                }catch (SQLException e_con){
                    System.out.println(e_con.getMessage());
                }
            }
        }
    }
}
