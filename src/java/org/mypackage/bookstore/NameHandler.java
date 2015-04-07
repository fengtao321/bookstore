/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tao
 */
package org.mypackage.bookstore;

import java.sql.ResultSet;
import java.sql.SQLException;

public class NameHandler {
    private String name;
    private String selectItem;
    private String result="";
    private String cartnum="Cart";
    private DBConnection mdbc;
    
    public NameHandler() {
    name = null;
     mdbc= new DBConnection ();
       mdbc.init();
    }

    /**
     * @return the name
     */
    public String getShoppingcart() throws SQLException{
        String result="";
        int firsttime=0;
        int subtotal=0;
        int total=-100;
        
        String name = "Mightier Than the Sword";
        String selectItem="title";
        ResultSet rs = mdbc.getCertainRow(name,"bookfromhs",selectItem);
        
        //while the resultant username has more information, it is appended to the end of the string
        while (rs.next())
        {
            int tempt;
            tempt = Integer.parseInt(rs.getString("cart"));
            if((tempt>0)&&(firsttime==0))
            {
               firsttime=1;  
               result+="<table class=\"table\" border=\"1\" align=\"center\" style=\"background-color: #0f0403>\n" +
"             <thead>\n" +
"                 <tr style=\"height: 40px\">\n" +
"                     <th>Book Cover</th>\n" +
"                     <th>Book Title</th>\n" +
"                     <th>Price($)\n" +
"                         per Book</th>\n" +
"                     <th>Quantity</th>\n" +
"                     <th>Subtotal</th>\n" +
"                     <th>Operation</th>\n" +
"                 </tr>\n" +
"             </thead>\n" +
"             <tbody>";
               
            }
            
            if(tempt>0)
            {
                subtotal=tempt*55;
                total+=subtotal;
              
              result+="                 <tr>\n" +
"                     <td align=\"right\">\n" +
"                        <div class=\"image_panel\"><a href=\"book-MightierSword.jsp\"><img \n" +
"src=\"images/templatemo_image_01.jpg\" alt=\"CSS Template\" width=\"85\" height=\"130\" /></a></div>\n" +
"                     </td>\n" +
"                     <td>Mightier Than the Sword</td>\n" +
"                     <td align=\"center\">55</td>\n" +
"                     <td>\n" +
"                         <form action=\"CartServlet\" method=\"post\">\n" +
"                       <input type=\"submit\" value=\" - \" name=\"minushs3\" />\n" +
"                       <input type=\"text\" name=\"Mightier Than the Sword\" value=\""+
                      rs.getString("cart")+"\" size=\"3\" \n" +
"style=\"text-align: center\" />\n" +
"                       <input type=\"submit\" value=\"+\" name=\"addhs3\" />\n" +
"                        </form>\n" +
"                     </td>\n" +
"                     <td align=\"center\">"+String.valueOf(subtotal)+"</td>\n" +
"                     <td>\n" +
"                          <form action=\"CartServlet\" method=\"get\">\n" +
"                         <input type=\"submit\" value=\"Delete\" name=\"deleths3\" />\n" +
"                         </form>\n" +
"                     </td>\n" +
"                 </tr>";
            }
        }
        
        name = "Dating the Enemy";
        selectItem="title";
        rs = mdbc.getCertainRow(name,"bookfromhs",selectItem);
        
        //while the resultant username has more information, it is appended to the end of the string
        while (rs.next())
        {
            int tempt;
            tempt = Integer.parseInt(rs.getString("cart"));
            if((tempt>0)&&(firsttime==0))
            {
               firsttime=1;  
               result+="<table class=\"table\" border=\"1\" align=\"center\" style=\"background-color: #0f0403>\n" +
"             <thead>\n" +
"                 <tr style=\"height: 40px\">\n" +
"                     <th>Book Cover</th>\n" +
"                     <th>Book Title</th>\n" +
"                     <th>Price($)\n" +
"                         per Book</th>\n" +
"                     <th>Quantity</th>\n" +
"                     <th>Subtotal</th>\n" +
"                     <th>Operation</th>\n" +
"                 </tr>\n" +
"             </thead>\n" +
"             <tbody>";
               
            }
            
            if(tempt>0)
            {
                             subtotal=tempt*65;
                total+=subtotal; 
              result+="<tr>\n" +
"                     <td align=\"right\">\n" +
"                        <div class=\"image_panel\"><a href=\"book-DatingEnemy.jsp\"><img \n" +
"src=\"images/templatemo_image_03.jpg\" alt=\"CSS Template\" width=\"85\" height=\"130\" /></a></div>\n" +
"                     </td>\n" +
"                     <td>Mightier Than the Sword</td>\n" +
"                     <td align=\"center\">65</td>\n" +
"                     <td>\n" +
"                         <form action=\"CartServlet\" method=\"post\">\n" +
"                       <input type=\"submit\" value=\" - \" name=\"minushs1\" />\n" +
"                       <input type=\"text\" name=\"Dating the Enemy\" value=\""+
                      rs.getString("cart")+"\" size=\"3\" \n" +
"style=\"text-align: center\" />\n" +
"                       <input type=\"submit\" value=\"+\" name=\"addhs1\" />\n" +
"                        </form>\n" +
"                     </td>\n" +
"                     <td align=\"center\">"+String.valueOf(subtotal)+"</td>\n" +
"                     <td>\n" +
"                          <form action=\"CartServlet\" method=\"get\">\n" +
"                         <input type=\"submit\" value=\"Delete\" name=\"deleths1\" />\n" +
"                         </form>\n" +
"                     </td>\n" +
"                 </tr>";
            }
        }
        
        name = "His Very Convenient Bride";
        selectItem="title";
        rs = mdbc.getCertainRow(name,"bookfromhs",selectItem);
        
        //while the resultant username has more information, it is appended to the end of the string
        while (rs.next())
        {
            int tempt;
            tempt = Integer.parseInt(rs.getString("cart"));
            if((tempt>0)&&(firsttime==0))
            {
               firsttime=1;  
               result+="<table class=\"table\" border=\"1\" align=\"center\" style=\"background-color: #0f0403>\n" +
"             <thead>\n" +
"                 <tr style=\"height: 40px\">\n" +
"                     <th>Book Cover</th>\n" +
"                     <th>Book Title</th>\n" +
"                     <th>Price($)\n" +
"                         per Book</th>\n" +
"                     <th>Quantity</th>\n" +
"                     <th>Subtotal</th>\n" +
"                     <th>Operation</th>\n" +
"                 </tr>\n" +
"             </thead>\n" +
"             <tbody>";
               
            }
            
            if(tempt>0)
            {
                subtotal=tempt*35;
                total+=subtotal;
              result+="<tr>\n" +
"                     <td align=\"right\">\n" +
"                        <div class=\"image_panel\"><a href=\"book-ConvenientBride.jsp\"><img \n" +
"src=\"images/templatemo_image_02.jpg\" alt=\"CSS Template\" width=\"85\" height=\"130\" /></a></div>\n" +
"                     </td>\n" +
"                     <td>His Very Convenient Bride</td>\n" +
"                     <td align=\"center\">35</td>\n" +
"                     <td>\n" +
"                         <form action=\"CartServlet\" method=\"post\">\n" +
"                       <input type=\"submit\" value=\" - \" name=\"minushs2\" />\n" +
"                       <input type=\"text\" name=\"His Very Convenient Bride\" value=\""+
                      rs.getString("cart")+"\" size=\"3\" \n" +
"style=\"text-align: center\" />\n" +
"                       <input type=\"submit\" value=\"+\" name=\"addhs2\" />\n" +
"                        </form>\n" +
"                     </td>\n" +
"                     <td align=\"center\">"+String.valueOf(subtotal)+"</td>\n" +
"                     <td>\n" +
"                          <form action=\"CartServlet\" method=\"get\">\n" +
"                         <input type=\"submit\" value=\"Delete\" name=\"deleths2\" />\n" +
"                         </form>\n" +
"                     </td>\n" +
"                 </tr>";
            }
        }
        
         name = "Taming the French Tycoon";
        selectItem="title";
        rs = mdbc.getCertainRow(name,"bookfromhs",selectItem);
        
        //while the resultant username has more information, it is appended to the end of the string
        while (rs.next())
        {
            int tempt;
            tempt = Integer.parseInt(rs.getString("cart"));
            if((tempt>0)&&(firsttime==0))
            {
               firsttime=1;  
               result+="<table class=\"table\" border=\"1\" align=\"center\" style=\"background-color: #0f0403>\n" +
"             <thead>\n" +
"                 <tr style=\"height: 40px\">\n" +
"                     <th>Book Cover</th>\n" +
"                     <th>Book Title</th>\n" +
"                     <th>Price($)\n" +
"                         per Book</th>\n" +
"                     <th>Quantity</th>\n" +
"                     <th>Subtotal</th>\n" +
"                     <th>Operation</th>\n" +
"                 </tr>\n" +
"             </thead>\n" +
"             <tbody>";
               
            }
            
            if(tempt>0)
            {
                subtotal=tempt*45;
                total+=subtotal;
                
              result+="<tr>\n" +
"                     <td align=\"right\">\n" +
"                        <div class=\"image_panel\"><a href=\"book-TamingTycoon.jsp\"><img \n" +
"src=\"images/templatemo_image_04.jpg\" alt=\"CSS Template\" width=\"85\" height=\"130\" /></a></div>\n" +
"                     </td>\n" +
"                     <td>Taming the French Tycoon</td>\n" +
"                     <td align=\"center\">45</td>\n" +
"                     <td>\n" +
"                         <form action=\"CartServlet\" method=\"post\">\n" +
"                       <input type=\"submit\" value=\" - \" name=\"minushs4\" />\n" +
"                       <input type=\"text\" name=\"Taming the French Tycoon\" value=\""+
                      rs.getString("cart")+"\" size=\"3\" \n" +
"style=\"text-align: center\" />\n" +
"                       <input type=\"submit\" value=\"+\" name=\"addhs4\" />\n" +
"                        </form>\n" +
"                     </td>\n" +
"                     <td align=\"center\">"+String.valueOf(subtotal)+"</td>\n" +
"                     <td>\n" +
"                          <form action=\"CartServlet\" method=\"get\">\n" +
"                         <input type=\"submit\" value=\"Delete\" name=\"deleths4\" />\n" +
"                         </form>\n" +
"                     </td>\n" +
"                 </tr>";
            }
        }
        
        name = "Best Friend to Wife and Mother?";
        selectItem="title";
        rs = mdbc.getCertainRow(name,"bookfrombs",selectItem);
        
        //while the resultant username has more information, it is appended to the end of the string
        while (rs.next())
        {
            int tempt;
            tempt = Integer.parseInt(rs.getString("cart"));
            if((tempt>0)&&(firsttime==0))
            {
               firsttime=1;  
               result+="<table class=\"table\" border=\"1\" align=\"center\" style=\"background-color: #0f0403>\n" +
"             <thead>\n" +
"                 <tr style=\"height: 40px\">\n" +
"                     <th>Book Cover</th>\n" +
"                     <th>Book Title</th>\n" +
"                     <th>Price($)\n" +
"                         per Book</th>\n" +
"                     <th>Quantity</th>\n" +
"                     <th>Subtotal</th>\n" +
"                     <th>Operation</th>\n" +
"                 </tr>\n" +
"             </thead>\n" +
"             <tbody>";
               
            }
            
            if(tempt>0)
            {
                subtotal=tempt*45;
                total+=subtotal;
                
              result+="<tr>\n" +
"                     <td align=\"right\">\n" +
"                        <div class=\"image_panel\"><a href=\"book-BestFriend.jsp\"><img \n" +
"src=\"images/templatemo_image_07.jpg\" alt=\"CSS Template\" width=\"85\" height=\"130\" /></a></div>\n" +
"                     </td>\n" +
"                     <td>Best Friend to Wife and Mother?</td>\n" +
"                     <td align=\"center\">45</td>\n" +
"                     <td>\n" +
"                         <form action=\"CartServlet\" method=\"post\">\n" +
"                       <input type=\"submit\" value=\" - \" name=\"minubhs1\" />\n" +
"                       <input type=\"text\" name=\"Best Friend to Wife and Mother?\" value=\""+
                      rs.getString("cart")+"\" size=\"3\" \n" +
"style=\"text-align: center\" />\n" +
"                       <input type=\"submit\" value=\"+\" name=\"addbs1\" />\n" +
"                        </form>\n" +
"                     </td>\n" +
"                     <td align=\"center\">"+String.valueOf(subtotal)+"</td>\n" +
"                     <td>\n" +
"                          <form action=\"CartServlet\" method=\"get\">\n" +
"                         <input type=\"submit\" value=\"Delete\" name=\"deletbs1\" />\n" +
"                         </form>\n" +
"                     </td>\n" +
"                 </tr>";
            }
        }
        
         name = "The Good Dog";
        selectItem="title";
        rs = mdbc.getCertainRow(name,"bookfrombs",selectItem);
        
        //while the resultant username has more information, it is appended to the end of the string
        while (rs.next())
        {
            int tempt;
            tempt = Integer.parseInt(rs.getString("cart"));
            if((tempt>0)&&(firsttime==0))
            {
               firsttime=1;  
               result+="<table class=\"table\" border=\"1\" align=\"center\" style=\"background-color: #0f0403>\n" +
"             <thead>\n" +
"                 <tr style=\"height: 40px\">\n" +
"                     <th>Book Cover</th>\n" +
"                     <th>Book Title</th>\n" +
"                     <th>Price($)\n" +
"                         per Book</th>\n" +
"                     <th>Quantity</th>\n" +
"                     <th>Subtotal</th>\n" +
"                     <th>Operation</th>\n" +
"                 </tr>\n" +
"             </thead>\n" +
"             <tbody>";
               
            }
            
            if(tempt>0)
            {
                subtotal=tempt*45;
                total+=subtotal;
                
              result+="<tr>\n" +
"                     <td align=\"right\">\n" +
"                        <div class=\"image_panel\"><a href=\"book-TheGoodDog.jsp\"><img \n" +
"src=\"images/templatemo_image_08.jpg\" alt=\"CSS Template\" width=\"85\" height=\"130\" /></a></div>\n" +
"                     </td>\n" +
"                     <td>The Good Dog</td>\n" +
"                     <td align=\"center\">45</td>\n" +
"                     <td>\n" +
"                         <form action=\"CartServlet\" method=\"post\">\n" +
"                       <input type=\"submit\" value=\" - \" name=\"minubhs2\" />\n" +
"                       <input type=\"text\" name=\"The Good Dog\" value=\""+
                      rs.getString("cart")+"\" size=\"3\" \n" +
"style=\"text-align: center\" />\n" +
"                       <input type=\"submit\" value=\"+\" name=\"addbs2\" />\n" +
"                        </form>\n" +
"                     </td>\n" +
"                     <td align=\"center\">"+String.valueOf(subtotal)+"</td>\n" +
"                     <td>\n" +
"                          <form action=\"CartServlet\" method=\"get\">\n" +
"                         <input type=\"submit\" value=\"Delete\" name=\"deletbs2\" />\n" +
"                         </form>\n" +
"                     </td>\n" +
"                 </tr>";
            }
        }
        
        
        name = "The Heiress Secret Baby";
        selectItem="title";
        rs = mdbc.getCertainRow(name,"bookfrombs",selectItem);
        
        //while the resultant username has more information, it is appended to the end of the string
        while (rs.next())
        {
            int tempt;
            tempt = Integer.parseInt(rs.getString("cart"));
            if((tempt>0)&&(firsttime==0))
            {
               firsttime=1;  
               result+="<table class=\"table\" border=\"1\" align=\"center\" style=\"background-color: #0f0403>\n" +
"             <thead>\n" +
"                 <tr style=\"height: 40px\">\n" +
"                     <th>Book Cover</th>\n" +
"                     <th>Book Title</th>\n" +
"                     <th>Price($)\n" +
"                         per Book</th>\n" +
"                     <th>Quantity</th>\n" +
"                     <th>Subtotal</th>\n" +
"                     <th>Operation</th>\n" +
"                 </tr>\n" +
"             </thead>\n" +
"             <tbody>";
               
            }
            
            if(tempt>0)
            {
                subtotal=tempt*45;
                total+=subtotal;
                
              result+="<tr>\n" +
"                     <td align=\"right\">\n" +
"                        <div class=\"image_panel\"><a href=\"book-TheTheBaby.jsp\"><img \n" +
"src=\"images/templatemo_image_06.jpg\" alt=\"CSS Template\" width=\"85\" height=\"130\" /></a></div>\n" +
"                     </td>\n" +
"                     <td>The Heiress's Secret Baby</td>\n" +
"                     <td align=\"center\">45</td>\n" +
"                     <td>\n" +
"                         <form action=\"CartServlet\" method=\"post\">\n" +
"                       <input type=\"submit\" value=\" - \" name=\"minubhs3\" />\n" +
"                       <input type=\"text\" name=\"The Heiress's Secret Baby\" value=\""+
                      rs.getString("cart")+"\" size=\"3\" \n" +
"style=\"text-align: center\" />\n" +
"                       <input type=\"submit\" value=\"+\" name=\"addbs3\" />\n" +
"                        </form>\n" +
"                     </td>\n" +
"                     <td align=\"center\">"+String.valueOf(subtotal)+"</td>\n" +
"                     <td>\n" +
"                          <form action=\"CartServlet\" method=\"get\">\n" +
"                         <input type=\"submit\" value=\"Delete\" name=\"deletbs3\" />\n" +
"                         </form>\n" +
"                     </td>\n" +
"                 </tr>";
            }
        }
        
          
        name = "The Scandal Behind the Wedding";
        selectItem="title";
        rs = mdbc.getCertainRow(name,"bookfrombs",selectItem);
        
        //while the resultant username has more information, it is appended to the end of the string
        while (rs.next())
        {
            int tempt;
            tempt = Integer.parseInt(rs.getString("cart"));
            if((tempt>0)&&(firsttime==0))
            {
               firsttime=1;  
               result+="<table class=\"table\" border=\"1\" align=\"center\" style=\"background-color: #0f0403>\n" +
"             <thead>\n" +
"                 <tr style=\"height: 40px\">\n" +
"                     <th>Book Cover</th>\n" +
"                     <th>Book Title</th>\n" +
"                     <th>Price($)\n" +
"                         per Book</th>\n" +
"                     <th>Quantity</th>\n" +
"                     <th>Subtotal</th>\n" +
"                     <th>Operation</th>\n" +
"                 </tr>\n" +
"             </thead>\n" +
"             <tbody>";
               
            }
            
            if(tempt>0)
            {
                subtotal=tempt*45;
                total+=subtotal;
                
              result+="<tr>\n" +
"                     <td align=\"right\">\n" +
"                        <div class=\"image_panel\"><a href=\"book-ScandalWedding.jsp\"><img \n" +
"src=\"images/templatemo_image_05.jpg\" alt=\"CSS Template\" width=\"85\" height=\"130\" /></a></div>\n" +
"                     </td>\n" +
"                     <td>The Scandal Behind the Wedding</td>\n" +
"                     <td align=\"center\">45</td>\n" +
"                     <td>\n" +
"                         <form action=\"CartServlet\" method=\"post\">\n" +
"                       <input type=\"submit\" value=\" - \" name=\"minubhs4\" />\n" +
"                       <input type=\"text\" name=\"The Scandal Behind the Wedding\" value=\""+
                      rs.getString("cart")+"\" size=\"3\" \n" +
"style=\"text-align: center\" />\n" +
"                       <input type=\"submit\" value=\"+\" name=\"addbs4\" />\n" +
"                        </form>\n" +
"                     </td>\n" +
"                     <td align=\"center\">"+String.valueOf(subtotal)+"</td>\n" +
"                     <td>\n" +
"                          <form action=\"CartServlet\" method=\"get\">\n" +
"                         <input type=\"submit\" value=\"Delete\" name=\"deletbs4\" />\n" +
"                         </form>\n" +
"                     </td>\n" +
"                 </tr>";
            }
        }
//---------------------------------------------------------------------------------------
    if(firsttime==0)
    {
              result="<h2>"+"No direct matches were found."+"</h2>";
              result+="<h2>"+"<a href='#'>Ask a clerk</font></a>"+"</h2>";
              result+="<h2>"+"<a href='#'>Make a Suggestion to Purchase</font></a>"+"</h2>";
              result+=" <form action=\"index.jsp\">\n" +
"          <input type=\"submit\" rhef=\"#\" value=\"Continue shopping\" style=\"float: right; font-weight: bold;background-color: #9F8727; border-color: #9F8727; color: #FFFFFF; text-\" name=\"Continue Shopping\" />\n" +
"         </form> ";

    }
    else
    {
        
        result+="             </tbody>\n" +
"         </table>\n" +
"         <p>&nbsp;</p>\n" +
"         <h2 align=\"right\">Total Price: $1"+String.valueOf(total)+"</h2>\n" +
"\n" +
"\n" +
" <form action=\"CartServlet\">\n" +
"          <input type=\"submit\" rhef=\"#\" value=\"Proceed to checkout\" style=\"float: right; font-weight: bold;background-color: #7f003f; border-color: #7f003f; color: #FFFFFF; text-\" name=\"checkout\" />\n" +
"         </form> \n" +
"          <form action=\"index.jsp\">\n" +
"          <input type=\"submit\" rhef=\"#\" value=\"Continue shopping\" style=\"float: right; font-weight: bold;background-color: #9F8727; border-color: #9F8727; color: #FFFFFF; text-\" name=\"Continue Shopping\" />\n" +
"         </form> ";
    }
    return result;
    }
    
    
    public String getCartnum() throws SQLException {
        String table="bookfromhs";
        String column="cart";
        String num="%";
         ResultSet rs = mdbc.getCertainRow(num,table,column);
         int result=0;
          while (rs.next())
        {
            String tempt="";
            tempt = rs.getString(column);
            int number=Integer.parseInt(tempt);
            if(number>0)
            {
              result+=number;             
            }
        }
          table="bookfrombs";
          rs = mdbc.getCertainRow(num,table,column);
           while (rs.next())
        {
            String tempt="";
            tempt = rs.getString(column);
            int number=Integer.parseInt(tempt);
            if(number>0)
            {
              result+=number;             
            }
        }
          String returnResult;
          returnResult="<a href='shoppingcart.jsp' class='current' class=\"treeUnselected\">Shopping Cart ("+String.valueOf(result)+")</a>";
        return returnResult;
    }
    
      public void setCartnum(String cartnum) {
        this.cartnum=cartnum;
    }
      
    public String getName() {
        return result;
    }

    /**
     * @param name the name to set
     */
    public void setSelectItem(String selectItem)
    {
        this.selectItem=selectItem;
    }
    
    public void setName(String name) throws SQLException {
        
        this.name = name;
        result="";

        int firsttime=0;
                    
        ResultSet rs = mdbc.getCertainRow(name,"bookfrombs",selectItem);
        
        //while the resultant username has more information, it is appended to the end of the string
        while (rs.next())
        {
            String tempt="";
            tempt = rs.getString("title");
            if((firsttime==0)&&(tempt.equals("")))
            {
              firsttime=1;             
            }
            if((firsttime==0)&&(!tempt.equals("")))
            {
              firsttime=2;
              result="<h1>Search Result of '"+name+"' in Politics"+"</h1>";
            }
            
            if(tempt.equals("Best Friend to Wife and Mother?"))
            {
              firsttime=2;
              result+="<div class='image_panel'><a href='book-BestFriend.jsp'><img src='images/templatemo_image_07.jpg' alt='CSS Template' width='85' height='130' /></a></div>"+
          "<h2><a href='book-BestFriend.jsp'>Best Friend to Wife and Mother?</a></h2>"+
            "<ul><li>By Anderson, Caroline <div class='buy_now_button'><a href='book-BestFriend.jsp'>Buy Now</a></div></li>"+
            	"<li>January 2015</li>"+
                "<li>Price: $55<div class='detail_button'><a href='book-BestFriend.jsp'>Detail</a></div></li>"+
                "<li>ISBN: 9781250034519</li>"+
                "<li> <p>Rating: <img src='images/gold-star1.jpg' alt='rating star' width='15' height='15' />"+
                        "<img src='images/gold-star1.jpg' alt='rating star' width='15' height='15' />"+
                        "<img src='images/gold-star1.jpg' alt='rating star' width='15' height='15' />"+
                        "<img src='images/gold-star1.jpg' alt='rating star' width='15' height='15' />"+
                       " <img src='images/gold-star1.jpg' alt='rating star' width='15' height='15' /></p></li>"+
            "</ul>";
            }
            else if(tempt.equals("The Good Dog"))
            {
                firsttime=2;
                result+="<div class=\"image_panel\"><a href=\"book-TheGoodDog.jsp\"><img src=\"images/templatemo_image_08.jpg\" alt=\"CSS Template\" width=\"85\" height=\"130\" /></a></div>\n" +
"          <h2><a href=\"book-TheGoodDog.jsp\">The Good Dog</a></h2>\n" +
"            <ul>\n" +
"	            <li>By avid DiBenedetto <div class=\"buy_now_button\"><a href=\"shoppingcart.jsp\">Buy Now</a></div></li>\n" +
"            	<li>January 2015</li>\n" +
"                <li>Price: $45<div class=\"detail_button\"><a href=\"book-TheGoodDog.jsp\">Detail</a></div></li>\n" +
"                <li>ISBN: 9780062242358</li>\n" +
"                               <p></p>\n" +
"                <li> <p>\n" +
"                        Rating: <img src=\"images/gold-star1.jpg\" alt=\"rating star\" width=\"15\" height=\"15\" />\n" +
"                        <img src=\"images/gold-star1.jpg\" alt=\"rating star\" width=\"15\" height=\"15\" />\n" +
"                        <img src=\"images/gold-star1.jpg\" alt=\"rating star\" width=\"15\" height=\"15\" />\n" +
"                        <img src=\"images/gold-star1.jpg\" alt=\"rating star\" width=\"15\" height=\"15\" />\n" +
"                       </p></li>\n" +
"            </ul>";
            }
            else if(tempt.equals("The Heiress Secret Baby"))
            {
                firsttime=2;
                result+="<div class=\"image_panel\"><a href=\"book-TheTheBaby.jsp\"><img src=\"images/templatemo_image_06.jpg\" alt=\"CSS Template\" width=\"85\" height=\"130\" /></a></div>\n" +
"          <h2><a href=\"book-TheTheBaby.jsp\">The Heiress's Secret Baby</a></h2>\n" +
"            <ul>\n" +
"	            <li>By Pembroke, Sophie <div class=\"buy_now_button\"><a href=\"shoppingcart.jsp\">Buy Now</a></div></li>\n" +
"            	<li>January 2015</li>\n" +
"                <li>Price: $35<div class=\"detail_button\"><a href=\"book-TheTheBaby.jsp\">Detail</a></div></li>\n" +
"                <li>ISBN: 9780263257410</li>\n" +
"                   <p></p>\n" +
"                <li> <p>\n" +
"                        Rating: <img src=\"images/gold-star1.jpg\" alt=\"rating star\" width=\"15\" height=\"15\" />\n" +
"                        <img src=\"images/gold-star1.jpg\" alt=\"rating star\" width=\"15\" height=\"15\" />\n" +
"                        <img src=\"images/gold-star1.jpg\" alt=\"rating star\" width=\"15\" height=\"15\" />\n" +
"                        <img src=\"images/gold-star1.jpg\" alt=\"rating star\" width=\"15\" height=\"15\" />\n" +
"                        <img src=\"images/gold-star1.jpg\" alt=\"rating star\" width=\"15\" height=\"15\" /></p></li>\n" +
"            </ul>";
            }
            else if(tempt.equals("The Scandal Behind the Wedding"))
            {
                firsttime=2;
                result+="<div class=\"image_panel\"><a href=\"book-ScandalWedding.jsp\"><img src=\"images/templatemo_image_05.jpg\" alt=\"CSS Template\" width=\"85\" height=\"130\" /></a></div>\n" +
"          <h2><a href=\"book-ScandalWedding.jsp\">The Scandal Behind the Wedding</a></h2>\n" +
"            <ul>\n" +
"	            <li>By Frances. Bella <div class=\"buy_now_button\"><a href=\"shoppingcart.jsp\">Buy Now</a></div></li>\n" +
"            	<li>January 2015</li>\n" +
"                <li>Price: $65<div class=\"detail_button\"><a href=\"book-ScandalWedding.jsp\">Detail</a></div></li>\n" +
"                <li>ISBN:  9780263257243</li>\n" +
"                               <p></p>\n" +
"                <li> <p>\n" +
"                        Rating: <img src=\"images/gold-star1.jpg\" alt=\"rating star\" width=\"15\" height=\"15\" />\n" +
"                        <img src=\"images/gold-star1.jpg\" alt=\"rating star\" width=\"15\" height=\"15\" />\n" +
"                        <img src=\"images/gold-star1.jpg\" alt=\"rating star\" width=\"15\" height=\"15\" />\n" +
"                        <img src=\"images/gold-star1.jpg\" alt=\"rating star\" width=\"15\" height=\"15\" />\n" +
"                        </p></li>\n" +
"            </ul>";
            }
            else
            {
            result+="<h2>"+"title : "+tempt+"</h2>";
            firsttime=2;
            }
        }
        
         rs = mdbc.getCertainRow(name,"bookfromhs",selectItem);
        
        //while the resultant username has more information, it is appended to the end of the string
        while (rs.next())
        {
            String tempt="";
            tempt = rs.getString("title");
            if(((firsttime==1)&&(tempt.equals("")))||((firsttime==0)&&(tempt.equals(""))))
            {
              firsttime=1;             
            }
            if((firsttime!=3)&&(!tempt.equals("")))
            {
              firsttime=3;
              result+="<h1>Search Result of '"+name+"' in History"+"</h1>";
            }
            
            if(tempt.equals("Dating the Enemy"))
            {
              firsttime=3;
              result+="<div class=\"image_panel\"><a href=\"book-DatingEnemy.jsp\"><img src=\"images/templatemo_image_03.jpg\" alt=\"CSS Template\" width=\"85\" height=\"130\" /></a></div>\n" +
"          <h2><a href=\"book-DatingEnemy.jsp\">Dating the Enemy</a></h2>\n" +
"            <ul>\n" +
"	            <li>By Page.Amber <div class=\"buy_now_button\"><a href=\"shoppingcart.jsp\">Buy Now</a></div></li>\n" +
"            	<li>January 2015</li>\n" +
"                <li>Price: $65<div class=\"detail_button\"><a href=\"book-DatingEnemy.jsp\">Detail</a></div></li>\n" +
"                <li>ISBN: 9780263257250</li>\n" +
"                <li> <p>Rating: <img src=\"images/gold-star1.jpg\" alt=\"rating star\" width=\"15\" height=\"15\" />\n" +
"                        <img src=\"images/gold-star1.jpg\" alt=\"rating star\" width=\"15\" height=\"15\" />\n" +
"                        <img src=\"images/gold-star1.jpg\" alt=\"rating star\" width=\"15\" height=\"15\" />\n" +
"                        <img src=\"images/gold-star1.jpg\" alt=\"rating star\" width=\"15\" height=\"15\" />\n" +
"                        </p></li>\n" +
"            </ul>";
            }
            else if(tempt.equals("His Very Convenient Bride"))
            {
                firsttime=3;
                result+="<div class=\"image_panel\"><a href=\"book-ConvenientBride.jsp\"><img src=\"images/templatemo_image_02.jpg\" alt=\"CSS Template\" width=\"85\" height=\"130\" /></a></div>\n" +
"          <h2><a href=\"book-ConvenientBride.jsp\">His Very Convenient Bride</a></h2>\n" +
"            <ul>\n" +
"	            <li>By Pembroke, Sophie <div class=\"buy_now_button\"><a href=\"shoppingcart.jsp\">Buy Now</a></div></li>\n" +
"            	<li>January 2015</li>\n" +
"                <li>Price: $35<div class=\"detail_button\"><a href=\"book-ConvenientBride.jsp\">Detail</a></div></li>\n" +
"                <li>ISBN: 9780263257274</li>\n" +
"                <li> <p>Rating: <img src=\"images/gold-star1.jpg\" alt=\"rating star\" width=\"15\" height=\"15\" />\n" +
"                        <img src=\"images/gold-star1.jpg\" alt=\"rating star\" width=\"15\" height=\"15\" />\n" +
"                        <img src=\"images/gold-star1.jpg\" alt=\"rating star\" width=\"15\" height=\"15\" />\n" +
"                        <img src=\"images/gold-star1.jpg\" alt=\"rating star\" width=\"15\" height=\"15\" />\n" +
"                        <img src=\"images/gold-star1.jpg\" alt=\"rating star\" width=\"15\" height=\"15\" /></p></li>\n" +
"            </ul>";
            }
            else if(tempt.equals("Mightier Than the Sword"))
            {
                firsttime=3;
                result+="<div class=\"image_panel\"><a href=\"book-MightierSword.jsp\"><img src=\"images/templatemo_image_01.jpg\" alt=\"CSS Template\" width=\"85\" height=\"130\" /></a></div>\n" +
"          <h2><a href=\"book-MightierSword.jsp\">Mightier Than the Sword</a></h2>\n" +
"            <ul>\n" +
"	            <li>By Archer.Jeffrey <div class=\"buy_now_button\"><a href=\"shoppingcart.jsp\">Buy Now</a></div></li>\n" +
"            	<li>January 2015</li>\n" +
"                <li>Price: $55<div class=\"detail_button\"><a href=\"book-MightierSword.jsp\">Detail</a></div></li>\n" +
"                <li>ISBN: 9781250034519</li>\n" +
"                <li> <p>Rating: <img src=\"images/gold-star1.jpg\" alt=\"rating star\" width=\"15\" height=\"15\" />\n" +
"                        <img src=\"images/gold-star1.jpg\" alt=\"rating star\" width=\"15\" height=\"15\" />\n" +
"                        <img src=\"images/gold-star1.jpg\" alt=\"rating star\" width=\"15\" height=\"15\" />\n" +
"                        <img src=\"images/gold-star1.jpg\" alt=\"rating star\" width=\"15\" height=\"15\" />\n" +
"                        <img src=\"images/gold-star1.jpg\" alt=\"rating star\" width=\"15\" height=\"15\" /></p></li>\n" +
"            </ul>";
            }
            else if(tempt.equals("Taming the French Tycoon"))
            {
                firsttime=3;
                result+="<div class=\"image_panel\"><a href=\"book-TamingTycoon.jsp\"><img src=\"images/templatemo_image_04.jpg\" alt=\"CSS Template\" width=\"85\" height=\"130\" /></a></div>\n" +
"          <h2><a href=\"book-TamingTycoon.jsp\">Taming the French Tycoon</a></h2>\n" +
"            <ul>\n" +
"	            <li>By Winters.Rebecca <div class=\"buy_now_button\"><a href=\"shoppingcart.jsp\">Buy Now</a></div></li>\n" +
"            	<li>January 2015</li>\n" +
"                <li>Price: $45<div class=\"detail_button\"><a href=\"book-TamingTycoon.jsp\">Detail</a></div></li>\n" +
"                <li>ISBN: 9780263257267</li>\n" +
"                <li> <p>Rating: <img src=\"images/gold-star1.jpg\" alt=\"rating star\" width=\"15\" height=\"15\" />\n" +
"                        <img src=\"images/gold-star1.jpg\" alt=\"rating star\" width=\"15\" height=\"15\" />\n" +
"                        <img src=\"images/gold-star1.jpg\" alt=\"rating star\" width=\"15\" height=\"15\" />\n" +
"                        <img src=\"images/gold-star1.jpg\" alt=\"rating star\" width=\"15\" height=\"15\" />\n" +
"                       </p></li>\n" +
"            </ul>";
            }
            else
            {
            result+="<h2>"+"title : "+tempt+"</h2>";
            firsttime=3;
            }
        }
        
        if((firsttime!=2)&&(firsttime!=3))
        {
        result="<h1>Search Result of '"+name+"' in Politics"+"</h1>";
             result+="<h2>"+"No direct matches were found."+"</h2>";
              result+="<h2>"+"<a href='#'>Ask a clerk</font></a>"+"</h2>";
              result+="<h2>"+"<a href='#'>Make a Suggestion to Purchase</font></a>"+"</h2>";
        }
        //mdbc.close(mdbc.getMyStatement());
    }
    
    
}
