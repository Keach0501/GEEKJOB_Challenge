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
public class seachserv extends HttpServlet {

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
            out.println("<title>Servlet seachserv</title>");           
            out.println("</head>");
            out.println("<body>");
            
            Connection db_con = null;
            PreparedStatement db_slct = null;
            try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            db_con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/challenge_db?characterEncoding=UTF-8&serverTimezone=JST","keach","keach0501");
            db_slct = db_con.prepareStatement(
                "SELECT * FROM profiles WHERE name LIKE ?");
            request.setCharacterEncoding("UTF-8");
            String name = request.getParameter("Name");
            db_slct.setString(1, "%" + name + "%");
            ResultSet rs = db_slct.executeQuery();
            while (rs.next()){
                out.println(
                    "ID:" + rs.getInt("profilesID") + "<br>"
                    + "name:" + rs.getString("name") + "<br>"
                    + "tel:" + rs.getString("tel") + "<br>"
                    + "age:" + rs.getInt("age") + "<br>"
                    + "birthday:" + rs.getDate("birthday"));
            }
            }catch(SQLException e_sql){
                out.println(
                    "接続時にエラーが発生しました:" + e_sql.toString());
            }catch(Exception e){
                out.println(
                    "接続時にエラーが発生しました:" + e.toString());
            }finally{
                if(db_con != null){    
                    try{
                        db_slct.close();
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
