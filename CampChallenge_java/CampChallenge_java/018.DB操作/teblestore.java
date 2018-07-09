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
public class teblestore {
    public static void main (String[] args){
        Connection db_con = null;
        PreparedStatement db_st = null;
        PreparedStatement db_in = null;
        ResultSet db_data = null;
        try{
            db_con = DriverManager.getConnection("jdbc:mysql://localhost:3306/challenge_db?characterEncoding=UTF-8&serverTimezone=JST","keach","keach0501");
            db_st = db_con.prepareStatement("select * from profiles where age = ?");
            db_st.setInt(1, 30);
            System.out.println(db_st);
            db_data = db_st.executeQuery();
            while(db_data.next()){
                System.out.println(
                        "名前:" + db_data.getString("name") + "<br>");
                System.out.println(
                        "tel:" + db_data.getString("tel"));
            }
            db_in = db_con.prepareStatement(
                    "INSERT INTO profiles VALUES(?,?,?,?,?)");
            db_in.setInt(1,5);
            db_in.setString(2, "高橋 清");
            db_in.setString(3, "090-9900-1234");
            db_in.setInt(4, 24);
            db_in.setString(5, "2000-12-24");
            int result = db_in.executeUpdate();
            System.out.println(result + "行が追加されました。");
        }catch(SQLException e_sql){
            System.out.println("接続時にエラーが発生しました:" + e_sql.toString());
        }catch(Exception e){
            System.out.println("接続時にエラーが発生しました:" + e.toString());
        }finally {
            if(db_con != null) {
                try{
                    db_data.close();
                    db_in.close();
                    db_st.close();
                    db_con.close();
                }catch (SQLException e_con){
                    System.out.println(e_con.getMessage());
                }
            }
        }
    }
}
