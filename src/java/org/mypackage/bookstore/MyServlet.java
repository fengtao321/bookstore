/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mypackage.bookstore;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author tao
 */
public class MyServlet extends HttpServlet {
    private String name;
    private String selectItem;
    private String result="";
    private String cartnum="Cart";
    private DBConnection mdbc;
    public MyServlet() {
    name = null;
     mdbc= new DBConnection ();
       mdbc.init();
    }

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
            throws ServletException, IOException, SQLException {
        
        if(request.getParameter("Mightier Than the Sword") != null)
        {
            int result=0;
            String title="Mightier Than the Sword";
            String table="bookfromhs";
            String column="title";
            ResultSet rs = mdbc.getCertainRow(title,table,column);
             while (rs.next())
        {
            String tempt=rs.getString("cart");;
          //  if(Integer.parseInt(tempt)>-1)
             result=Integer.parseInt(tempt)+1;   
                
        }
            mdbc.setCertainItem("\"Mightier Than the Sword\"", "bookfromhs","cart",String.valueOf(result));
            request.getRequestDispatcher("/index.jsp").forward(request, response); 
            return;
        }
        
        if(request.getParameter("His Very Convenient Bride") != null)
        {
            int result=0;
            String title="His Very Convenient Bride";
            String table="bookfromhs";
            String column="title";
            ResultSet rs = mdbc.getCertainRow(title,table,column);
             while (rs.next())
        {
            String tempt=rs.getString("cart");;
          //  if(Integer.parseInt(tempt)>-1)
             result=Integer.parseInt(tempt)+1;   
                
        }
            mdbc.setCertainItem("\"His Very Convenient Bride\"", "bookfromhs","cart",String.valueOf(result));
            request.getRequestDispatcher("/index.jsp").forward(request, response); 
            return;
        }
        
        
         if(request.getParameter("Dating the Enemy") != null)
        {
            int result=0;
            String title="Dating the Enemy";
            String table="bookfromhs";
            String column="title";
            ResultSet rs = mdbc.getCertainRow(title,table,column);
             while (rs.next())
        {
            String tempt=rs.getString("cart");;
          //  if(Integer.parseInt(tempt)>-1)
             result=Integer.parseInt(tempt)+1;   
                
        }
            mdbc.setCertainItem("\"Dating the Enemy\"", "bookfromhs","cart",String.valueOf(result));
            request.getRequestDispatcher("/index.jsp").forward(request, response); 
            return;
        }
       
        if(request.getParameter("Taming the French Tycoon") != null)
        {
            int result=0;
            String title="Taming the French Tycoon";
            String table="bookfromhs";
            String column="title";
            ResultSet rs = mdbc.getCertainRow(title,table,column);
             while (rs.next())
        {
            String tempt=rs.getString("cart");;
          //  if(Integer.parseInt(tempt)>-1)
             result=Integer.parseInt(tempt)+1;   
                
        }
            mdbc.setCertainItem("\"Taming the French Tycoon\"", "bookfromhs","cart",String.valueOf(result));
            request.getRequestDispatcher("/index.jsp").forward(request, response); 
            return;
        }
        
        
        
        /*
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            /*out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet MyServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet MyServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }*/
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(MyServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(MyServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
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
