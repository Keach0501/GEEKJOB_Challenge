/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbcontrol;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author keygr
 */
public class updateserv extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet updateserv</title>");            
            out.println("</head>");
            out.println("<body>");
            
            Connection db_con = null;
            PreparedStatement db_slct = null;
            PreparedStatement db_upd = null;
            try{
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            db_con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/challenge_db?characterEncoding=UTF-8&serverTimezone=JST","keach","keach0501");
            db_slct = db_con.prepareStatement(
                "SELECT * FROM profiles");
            db_upd = db_con.prepareStatement(
                "UPDATE profiles SET Name = ?, tel = ?, age = ?, birthday = ? WHERE profilesID = ?");
            request.setCharacterEncoding("UTF-8");
            String name = request.getParameter("Name");
            db_upd.setString(1,name);
            String tel = request.getParameter("tel");
            db_upd.setString(2,tel);
            int age = Integer.valueOf(request.getParameter("age"));
            db_upd.setInt(3, age);
            String birth = request.getParameter("birthday");
            db_upd.setString(4,birth);
            int ID = Integer.valueOf(request.getParameter("ID"));
            db_upd.setInt(5, ID);
            int count = db_upd.executeUpdate();
                out.println("UPDATE: ");
                out.println(count + "<br>");
            ResultSet rs = db_slct.executeQuery();
            while (rs.next()){
                out.println(
                    "ID:" + rs.getInt("profilesID") + "<br>"
                    + "name:" + rs.getString("name") + "<br>"
                    + "tel:" + rs.getString("tel") + "<br>"
                    + "age:" + rs.getInt("age") + "<br>"
                    + "birthday:" + rs.getDate("birthday") + "<br>");
            }
            db_upd.close();
            db_slct.close();
            }catch(SQLException e_sql){
                out.println(
                "接続時にエラーが発生しました:" + e_sql.toString());
            }catch(Exception e){
                out.println(
                "接続時にエラーが発生しました:" + e.toString());
            }finally{
                if(db_con != null){    
                    try{
                        db_con.close();
                    }catch (SQLException e_con){
                        out.println(e_con.getMessage());
                    }
                }
            }
            
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
