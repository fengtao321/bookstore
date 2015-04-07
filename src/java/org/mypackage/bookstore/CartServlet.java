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
public class CartServlet extends HttpServlet {
    private String name;
    private String selectItem;
    private String result="";
    private String cartnum="Cart";
    private DBConnection mdbc;
    
    public CartServlet() {
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
        
         if(request.getParameter("checkout") != null)
         {
              mdbc.setCertainItem("\"Dating the Enemy\"", "bookfromhs","cart",String.valueOf(0));
    mdbc.setCertainItem("\"His Very Convenient Bride\"", "bookfromhs","cart",String.valueOf(0));
        mdbc.setCertainItem("\"Mightier Than the Sword\"", "bookfromhs","cart",String.valueOf(0));
    mdbc.setCertainItem("\"Taming the French Tycoon\"", "bookfromhs","cart",String.valueOf(0));
    
    mdbc.setCertainItem("\"Best Friend to Wife and Mother?\"", "bookfrombs","cart",String.valueOf(0));
    mdbc.setCertainItem("\"The Good Dog\"", "bookfrombs","cart",String.valueOf(0));
        mdbc.setCertainItem("\"The Heiress Secret Baby\"", "bookfrombs","cart",String.valueOf(0));
    mdbc.setCertainItem("\"The Scandal Behind the Wedding\"", "bookfrombs","cart",String.valueOf(0));
    
    request.getRequestDispatcher("/checkout.jsp").forward(request, response); 
            return;
         }
        
         if(request.getParameter("deleths3") != null)
        {
            mdbc.setCertainItem("\"Mightier Than the Sword\"", "bookfromhs","cart",String.valueOf(0));
            request.getRequestDispatcher("/shoppingcart.jsp").forward(request, response); 
            return;
        }
         if(request.getParameter("deleths1") != null)
        {
            mdbc.setCertainItem("\"Dating the Enemy\"", "bookfromhs","cart",String.valueOf(0));
            request.getRequestDispatcher("/shoppingcart.jsp").forward(request, response); 
            return;
        }
         
        if(request.getParameter("deleths2") != null)
        {
            mdbc.setCertainItem("\"His Very Convenient Bride\"", "bookfromhs","cart",String.valueOf(0));
            request.getRequestDispatcher("/shoppingcart.jsp").forward(request, response); 
            return;
        }
        
        if(request.getParameter("deleths4") != null)
        {
            mdbc.setCertainItem("\"Taming the French Tycoon\"", "bookfromhs","cart",String.valueOf(0));
            request.getRequestDispatcher("/shoppingcart.jsp").forward(request, response); 
            return;
        }
        
        if(request.getParameter("deletbs1") != null)
        {
            mdbc.setCertainItem("\"Best Friend to Wife and Mother?\"", "bookfromhs","cart",String.valueOf(0));
            request.getRequestDispatcher("/shoppingcart.jsp").forward(request, response); 
            return;
        }
        
                if(request.getParameter("deletbs2") != null)
        {
            mdbc.setCertainItem("\"The Good Dog\"", "bookfromhs","cart",String.valueOf(0));
            request.getRequestDispatcher("/shoppingcart.jsp").forward(request, response); 
            return;
        }
                
        if(request.getParameter("deletbs3") != null)
        {
            mdbc.setCertainItem("\"The Heiress Secret Baby\"", "bookfromhs","cart",String.valueOf(0));
            request.getRequestDispatcher("/shoppingcart.jsp").forward(request, response); 
            return;
        }
                                
         if(request.getParameter("deletbs4") != null)
        {
            mdbc.setCertainItem("\"The Scandal Behind the Wedding\"", "bookfromhs","cart",String.valueOf(0));
            request.getRequestDispatcher("/shoppingcart.jsp").forward(request, response); 
            return;
        }                       
        
        if(request.getParameter("addhs3") != null)
        {
            int result=0;
            String title="Mightier Than the Sword";
            String table;
            table = "bookfromhs";
            String column="title";
            ResultSet rs = mdbc.getCertainRow(title,table,column);
             while (rs.next())
        {
            String tempt=rs.getString("cart");;
          //  if(Integer.parseInt(tempt)>-1)
             result=Integer.parseInt(tempt)+1;   
                
        }
            mdbc.setCertainItem("\"Mightier Than the Sword\"", "bookfromhs","cart",String.valueOf(result));
            request.getRequestDispatcher("/shoppingcart.jsp").forward(request, response); 
            return;
        }
        
        if(request.getParameter("addhs1") != null)
        {
            int result=0;
            String title="Dating the Enemy";
            String table;
            table = "bookfromhs";
            String column="title";
            ResultSet rs = mdbc.getCertainRow(title,table,column);
             while (rs.next())
        {
            String tempt=rs.getString("cart");;
          //  if(Integer.parseInt(tempt)>-1)
             result=Integer.parseInt(tempt)+1;   
                
        }
            mdbc.setCertainItem("\"Dating the Enemy\"", "bookfromhs","cart",String.valueOf(result));
            request.getRequestDispatcher("/shoppingcart.jsp").forward(request, response); 
            return;
        }
        
               if(request.getParameter("addhs2") != null)
        {
            int result=0;
            String title="His Very Convenient Bride";
            String table;
            table = "bookfromhs";
            String column="title";
            ResultSet rs = mdbc.getCertainRow(title,table,column);
             while (rs.next())
        {
            String tempt=rs.getString("cart");;
          //  if(Integer.parseInt(tempt)>-1)
             result=Integer.parseInt(tempt)+1;   
                
        }
            mdbc.setCertainItem("\"His Very Convenient Bride\"", "bookfromhs","cart",String.valueOf(result));
            request.getRequestDispatcher("/shoppingcart.jsp").forward(request, response); 
            return;
        }
               
                             if(request.getParameter("addhs4") != null)
        {
            int result=0;
            String title="Taming the French Tycoon";
            String table;
            table = "bookfromhs";
            String column="title";
            ResultSet rs = mdbc.getCertainRow(title,table,column);
             while (rs.next())
        {
            String tempt=rs.getString("cart");;
          //  if(Integer.parseInt(tempt)>-1)
             result=Integer.parseInt(tempt)+1;   
                
        }
            mdbc.setCertainItem("\"Taming the French Tycoon\"", "bookfromhs","cart",String.valueOf(result));
            request.getRequestDispatcher("/shoppingcart.jsp").forward(request, response); 
            return;
        }
                             
       if(request.getParameter("addbs4") != null)
        {
            int result=0;
            String title="The Scandal Behind the Wedding";
            String table;
            table = "bookfrombs";
            String column="title";
            ResultSet rs = mdbc.getCertainRow(title,table,column);
             while (rs.next())
        {
            String tempt=rs.getString("cart");;
          //  if(Integer.parseInt(tempt)>-1)
             result=Integer.parseInt(tempt)+1;   
                
        }
            mdbc.setCertainItem("\"The Scandal Behind the Wedding\"", "bookfromhs","cart",String.valueOf(result));
            request.getRequestDispatcher("/shoppingcart.jsp").forward(request, response); 
            return;
        }
       
             if(request.getParameter("addbs3") != null)
        {
            int result=0;
            String title="The Scandal Behind the Wedding";
            String table;
            table = "bookfrombs";
            String column="title";
            ResultSet rs = mdbc.getCertainRow(title,table,column);
             while (rs.next())
        {
            String tempt=rs.getString("cart");;
          //  if(Integer.parseInt(tempt)>-1)
             result=Integer.parseInt(tempt)+1;   
                
        }
            mdbc.setCertainItem("\"The Scandal Behind the Wedding\"", "bookfromhs","cart",String.valueOf(result));
            request.getRequestDispatcher("/shoppingcart.jsp").forward(request, response); 
            return;
        }
        
                         if(request.getParameter("addbs2") != null)
        {
            int result=0;
            String title="The Good Dog";
            String table;
            table = "bookfrombs";
            String column="title";
            ResultSet rs = mdbc.getCertainRow(title,table,column);
             while (rs.next())
        {
            String tempt=rs.getString("cart");;
          //  if(Integer.parseInt(tempt)>-1)
             result=Integer.parseInt(tempt)+1;   
                
        }
            mdbc.setCertainItem("\"The Good Dog\"", "bookfromhs","cart",String.valueOf(result));
            request.getRequestDispatcher("/shoppingcart.jsp").forward(request, response); 
            return;
        }
                         
                         if(request.getParameter("addbs1") != null)
        {
            int result=0;
            String title="Best Friend to Wife and Mother?";
            String table;
            table = "bookfrombs";
            String column="title";
            ResultSet rs = mdbc.getCertainRow(title,table,column);
             while (rs.next())
        {
            String tempt=rs.getString("cart");;
          //  if(Integer.parseInt(tempt)>-1)
             result=Integer.parseInt(tempt)+1;   
                
        }
            mdbc.setCertainItem("\"Best Friend to Wife and Mother?\"", "bookfromhs","cart",String.valueOf(result));
            request.getRequestDispatcher("/shoppingcart.jsp").forward(request, response); 
            return;
        }
                         
                         
        if(request.getParameter("minushs3") != null)
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
             result=Integer.parseInt(tempt)-1;   
                
        }
            mdbc.setCertainItem("\"Mightier Than the Sword\"", "bookfromhs","cart",String.valueOf(result));
            request.getRequestDispatcher("/shoppingcart.jsp").forward(request, response); 
            return;
        }
        
        
        
        
               if(request.getParameter("minushs1") != null)
        {
            int result=0;
            String title="Dating the Enemy";
            String table;
            table = "bookfromhs";
            String column="title";
            ResultSet rs = mdbc.getCertainRow(title,table,column);
             while (rs.next())
        {
            String tempt=rs.getString("cart");;
          //  if(Integer.parseInt(tempt)>-1)
             result=Integer.parseInt(tempt)-1;   
                
        }
            mdbc.setCertainItem("\"Dating the Enemy\"", "bookfromhs","cart",String.valueOf(result));
            request.getRequestDispatcher("/shoppingcart.jsp").forward(request, response); 
            return;
        }
        
               if(request.getParameter("minushs2") != null)
        {
            int result=0;
            String title="His Very Convenient Bride";
            String table;
            table = "bookfromhs";
            String column="title";
            ResultSet rs = mdbc.getCertainRow(title,table,column);
             while (rs.next())
        {
            String tempt=rs.getString("cart");;
          //  if(Integer.parseInt(tempt)>-1)
             result=Integer.parseInt(tempt)-1;   
                
        }
            mdbc.setCertainItem("\"His Very Convenient Bride\"", "bookfromhs","cart",String.valueOf(result));
            request.getRequestDispatcher("/shoppingcart.jsp").forward(request, response); 
            return;
        }
               
                             if(request.getParameter("minushs4") != null)
        {
            int result=0;
            String title="Taming the French Tycoon";
            String table;
            table = "bookfromhs";
            String column="title";
            ResultSet rs = mdbc.getCertainRow(title,table,column);
             while (rs.next())
        {
            String tempt=rs.getString("cart");;
          //  if(Integer.parseInt(tempt)>-1)
             result=Integer.parseInt(tempt)-1;   
                
        }
            mdbc.setCertainItem("\"Taming the French Tycoon\"", "bookfromhs","cart",String.valueOf(result));
            request.getRequestDispatcher("/shoppingcart.jsp").forward(request, response); 
            return;
        }
                             
       if(request.getParameter("minusbs4") != null)
        {
            int result=0;
            String title="The Scandal Behind the Wedding";
            String table;
            table = "bookfrombs";
            String column="title";
            ResultSet rs = mdbc.getCertainRow(title,table,column);
             while (rs.next())
        {
            String tempt=rs.getString("cart");;
          //  if(Integer.parseInt(tempt)>-1)
             result=Integer.parseInt(tempt)-1;   
                
        }
            mdbc.setCertainItem("\"The Scandal Behind the Wedding\"", "bookfromhs","cart",String.valueOf(result));
            request.getRequestDispatcher("/shoppingcart.jsp").forward(request, response); 
            return;
        }
       
             if(request.getParameter("minusbs3") != null)
        {
            int result=0;
            String title="The Scandal Behind the Wedding";
            String table;
            table = "bookfrombs";
            String column="title";
            ResultSet rs = mdbc.getCertainRow(title,table,column);
             while (rs.next())
        {
            String tempt=rs.getString("cart");;
          //  if(Integer.parseInt(tempt)>-1)
             result=Integer.parseInt(tempt)-1;   
                
        }
            mdbc.setCertainItem("\"The Scandal Behind the Wedding\"", "bookfromhs","cart",String.valueOf(result));
            request.getRequestDispatcher("/shoppingcart.jsp").forward(request, response); 
            return;
        }
        
                         if(request.getParameter("minusbs2") != null)
        {
            int result=0;
            String title="The Good Dog";
            String table;
            table = "bookfrombs";
            String column="title";
            ResultSet rs = mdbc.getCertainRow(title,table,column);
             while (rs.next())
        {
            String tempt=rs.getString("cart");;
          //  if(Integer.parseInt(tempt)>-1)
             result=Integer.parseInt(tempt)-1;   
                
        }
            mdbc.setCertainItem("\"The Good Dog\"", "bookfromhs","cart",String.valueOf(result));
            request.getRequestDispatcher("/shoppingcart.jsp").forward(request, response); 
            return;
        }
                         
                         if(request.getParameter("minusbs1") != null)
        {
            int result=0;
            String title="Best Friend to Wife and Mother?";
            String table;
            table = "bookfrombs";
            String column="title";
            ResultSet rs = mdbc.getCertainRow(title,table,column);
             while (rs.next())
        {
            String tempt=rs.getString("cart");;
          //  if(Integer.parseInt(tempt)>-1)
             result=Integer.parseInt(tempt)-1;   
                
        }
            mdbc.setCertainItem("\"Best Friend to Wife and Mother?\"", "bookfromhs","cart",String.valueOf(result));
            request.getRequestDispatcher("/shoppingcart.jsp").forward(request, response); 
            return;
        }
        /*
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
           /* out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CartServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CartServlet at " + request.getContextPath() + "</h1>");
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
            Logger.getLogger(CartServlet.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(CartServlet.class.getName()).log(Level.SEVERE, null, ex);
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
