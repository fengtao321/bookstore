package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class readmore_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<title>Book Store Template, Free CSS Template, TemplateMo.com</title>\n");
      out.write("<meta name=\"keywords\" content=\"Book Store Template, Free CSS Template, CSS Website Layout, CSS, HTML, TemplateMo.com\" />\n");
      out.write("<meta name=\"description\" content=\"Book Store Template, Free CSS Template, Download CSS Website from TemplateMo.com\" />\n");
      out.write("<link href=\"CSS/templatemo_style_category.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<!--  Free CSS Templates from www.templatemo.com -->\n");
      out.write("<div id=\"templatemo_container\">\n");
      out.write("\t<div id=\"templatemo_menu\">\n");
      out.write("    <ul>\n");
      out.write("    <li>\n");
      out.write("        <a href=\"index.jsp\" class=\"current\">Home</a>\n");
      out.write("    </li>\n");
      out.write("        <li>\n");
      out.write("              ");
      org.mypackage.bookstore.NameHandler mybean = null;
      synchronized (session) {
        mybean = (org.mypackage.bookstore.NameHandler) _jspx_page_context.getAttribute("mybean", PageContext.SESSION_SCOPE);
        if (mybean == null){
          mybean = new org.mypackage.bookstore.NameHandler();
          _jspx_page_context.setAttribute("mybean", mybean, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\n");
      out.write("\n");
      out.write("                 ");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((org.mypackage.bookstore.NameHandler)_jspx_page_context.findAttribute("mybean")).getCartnum())));
      out.write("\n");
      out.write("       \n");
      out.write("    </li>\n");
      out.write("\n");
      out.write("    \n");
      out.write("</ul>\n");
      out.write("\n");
      out.write("            <div align=\"right\">  \n");
      out.write("                 <form name=\"Name Input Form\" action=\"response.jsp\">\n");
      out.write("                    <input type=\"text\" name=\"name\" size=\"35\" /> \n");
      out.write("                    <select name=\"selectItem\">\n");
      out.write("                         <option value=\"title\">Title</option>\n");
      out.write("                          <option value=\"keyword\">Keyword</option>\n");
      out.write("                            <option value=\"author\">Author</option>\n");
      out.write("                                <option value=\"description\">Description</option>\n");
      out.write("                                 <option value=\"price\">Price</option>\n");
      out.write("                     </select>\n");
      out.write("                    <input type=\"submit\" name=\"search\" value=\"Search\"></input>\n");
      out.write("            </form>\n");
      out.write("    </div>\n");
      out.write("    </div> <!-- end of menu -->\n");
      out.write("    \n");
      out.write("    <div id=\"templatemo_header\">\n");
      out.write("    \t<div id=\"templatemo_special_offers\">\n");
      out.write("        \t<ul>\n");
      out.write("                <li><a href=\"book-ConvenientBride.jsp\"><font size=\"1.5\">His Very Convenient Bride</font></a></li>\n");
      out.write("                <li><a href=\"book-MightierSword.jsp\"><font size=\"1.5\">Mightier Than the Sword</font></a></li>\n");
      out.write("                <li><a href=\"book-BestFriend.jsp\"><font size=\"1.5\">Best Friend to Wife and Mother?</font></a></li>\n");
      out.write("            </ul>\n");
      out.write("\t\t\t<a href=\"readmore.jsp\" style=\"margin-left: 50px;\">Read more...</a>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div id=\"templatemo_new_books\">\n");
      out.write("        \t<ul>\n");
      out.write("                <li><a href=\"book-ConvenientBride.jsp\"><font size=\"1.5\">His Very Convenient Bride</font></a></li>\n");
      out.write("                <li><a href=\"book-MightierSword.jsp\"><font size=\"1.5\">Mightier Than the Sword</font></a></li>\n");
      out.write("                <li><a href=\"book-BestFriend.jsp\"><font size=\"1.5\">Best Friend to Wife and Mother?</font></a></li>\n");
      out.write("            </ul>\n");
      out.write("\t\t\t<a href=\"readmore.jsp\" style=\"margin-left: 50px;\">Read more...</a>\n");
      out.write("        </div>\n");
      out.write("    </div> <!-- end of header -->\n");
      out.write("    \n");
      out.write("    <div id=\"templatemo_content\">\n");
      out.write("    \t\n");
      out.write("        <div id=\"templatemo_content_left\">\n");
      out.write("<div class=\"templatemo_content_left_section\">\n");
      out.write("                    <h1><a href=\"categories.jsp\">Categories</a></h1>\n");
      out.write("                    \n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"categories_politics.jsp\">Politics</a></li>\n");
      out.write("                        <li><a href=\"categories.jsp\">History</a></li>\n");
      out.write("                        <li><a href=\"#\">Fiction</a></li>\n");
      out.write("                        <li><a href=\"#\">Health</a></li>\n");
      out.write("                        <li><a href=\"#\">Science</a></li>\n");
      out.write("                        <li><a href=\"#\">Kids</a></li>\n");
      out.write("                        <li><a href=\"#\">Teens</a></li>\n");
      out.write("                    </ul>\n");
      out.write("            </div> <!-- end of menu -->\t\t            \n");
      out.write("            \n");
      out.write("            <div  class=\"templatemo_content_left_section\">                \n");
      out.write("             <h1>New Book</h1>\n");
      out.write("                    \n");
      out.write("                    <ul>\n");
      out.write("                         <li><a href=\"book-MightierSword.jsp\">Mightier Than the Sword</a></li>\n");
      out.write("                        <li><a href=\"book-ConvenientBride.jsp\">His Very Convenient Bride</a></li>\n");
      out.write("                        <li><a href=\"book-DatingEnemy.jsp\">Dating the Enemy</a></li>\n");
      out.write("                        <li><a href=\"book-TamingTycoon.jsp\">Taming the French Tycoon</a></li>\n");
      out.write("                        <li><a href=\"book-ScandalWedding.jsp \">The Scandal Behind the Wedding</a></li>\n");
      out.write("                        <li><a href=\"book-TheTheBaby.jsp \">The Heiress's Secret Baby </a></li>\n");
      out.write("                        <li><a href=\"book-BestFriend.jsp\">Best Friend to Wife and Mother?</a></li>\n");
      out.write("                    </ul>   \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div  class=\"templatemo_content_left_section\">                \n");
      out.write("             <h1>Books Coming Soon</h1>\n");
      out.write("                    \n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"#\">Monsters Meet on Court Street</a></li>\n");
      out.write("                        <li><a href=\"#\">Science: A Discovery in Comics</a></li>\n");
      out.write("                        <li><a href=\"#\">Newman </a></li>\n");
      out.write("                        <li><a href=\"#\">Romeo and Juliet</a></li>\n");
      out.write("                        <li><a href=\"#\">Captain Pixel </a></li>\n");
      out.write("                        <li><a href=\"#\">Persia Blues </a></li>\n");
      out.write("                        <li><a href=\"#\">Bubbles and Gondola</a></li>\n");
      out.write("                    </ul>   \n");
      out.write("            </div>\n");
      out.write("            <div class=\"templatemo_content_left_section\">\n");
      out.write("                    <h1><a href=\"index.jsp\">Home</a></h1>\n");
      out.write("                    <h1 id=\"cartdown\">\n");
      out.write("                ");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((org.mypackage.bookstore.NameHandler)_jspx_page_context.findAttribute("mybean")).getCartnum())));
      out.write("\n");
      out.write("                    </h1>\n");
      out.write("            </div>\n");
      out.write("        </div> <!-- end of content left -->\n");
      out.write("        \n");
      out.write("        <div id=\"templatemo_content_right\">\n");
      out.write("           <h1>The Most Popular books</h1>\n");
      out.write("           \n");
      out.write("              <div class=\"image_panel\"><a href=\"book-ConvenientBride.jsp\"><img src=\"images/templatemo_image_02.jpg\" alt=\"CSS Template\" width=\"75\" height=\"110\" /></a></div>\n");
      out.write("          <h2>His Very Convenient Bride</h2>\n");
      out.write("            <ul>\n");
      out.write("\t            <li>By Pembroke, Sophie <div class=\"buy_now_button\"><a href=\"shoppingcart.jsp\">Buy Now</a></div></li>\n");
      out.write("            \t<li>January 2015</li>\n");
      out.write("                <li>Price: $35<div class=\"detail_button\"><a href=\"book-ConvenientBride.jsp\">Detail</a></div></li>\n");
      out.write("                <li>ISBN: 9780263257274</li>\n");
      out.write("                   <p></p>\n");
      out.write("                <li> <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                        Rating: <img src=\"images/gold-star1.jpg\" alt=\"rating star\" width=\"15\" height=\"15\" />\n");
      out.write("                        <img src=\"images/gold-star1.jpg\" alt=\"rating star\" width=\"15\" height=\"15\" />\n");
      out.write("                        <img src=\"images/gold-star1.jpg\" alt=\"rating star\" width=\"15\" height=\"15\" />\n");
      out.write("                        <img src=\"images/gold-star1.jpg\" alt=\"rating star\" width=\"15\" height=\"15\" />\n");
      out.write("                        <img src=\"images/gold-star1.jpg\" alt=\"rating star\" width=\"15\" height=\"15\" /></p></li>\n");
      out.write("            </ul>\n");
      out.write("                   <p></p>\n");
      out.write("          <p></p> \n");
      out.write("          <p></p>\n");
      out.write("          <p></p>\n");
      out.write("          <p></p> \n");
      out.write("\n");
      out.write("          <div class=\"image_panel\"><a href=\"book-MightierSword.jsp\"><img src=\"images/templatemo_image_01.jpg\" alt=\"CSS Template\" width=\"75\" height=\"110\" /></a></div>\n");
      out.write("          <h2>Mightier Than the Sword</h2>\n");
      out.write("            <ul>\n");
      out.write("\t            <li>By Archer.Jeffrey <div class=\"buy_now_button\"><a href=\"shoppingcart.jsp\">Buy Now</a></div></li>\n");
      out.write("            \t<li>January 2015</li>\n");
      out.write("                <li>Price: $55<div class=\"detail_button\"><a href=\"book-MightierSword.jsp\">Detail</a></div></li>\n");
      out.write("                <li>ISBN: 9781250034519</li>\n");
      out.write("                <p></p>\n");
      out.write("                <li> <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                        Rating: <img src=\"images/gold-star1.jpg\" alt=\"rating star\" width=\"15\" height=\"15\" />\n");
      out.write("                        <img src=\"images/gold-star1.jpg\" alt=\"rating star\" width=\"15\" height=\"15\" />\n");
      out.write("                        <img src=\"images/gold-star1.jpg\" alt=\"rating star\" width=\"15\" height=\"15\" />\n");
      out.write("                        <img src=\"images/gold-star1.jpg\" alt=\"rating star\" width=\"15\" height=\"15\" />\n");
      out.write("                        <img src=\"images/gold-star1.jpg\" alt=\"rating star\" width=\"15\" height=\"15\" /></p></li>\n");
      out.write("            </ul>\n");
      out.write("          <p></p>\n");
      out.write("          <p></p> \n");
      out.write("          <p></p>\n");
      out.write("          <p></p>\n");
      out.write("          <p></p>\n");
      out.write("        <div class=\"image_panel\"><a href=\"book-BestFriend.jsp\"><img src=\"images/templatemo_image_07.jpg\" alt=\"CSS Template\" width=\"75\" height=\"110\" /></a></div>\n");
      out.write("          <h2>Best Friend to Wife and Mother?</h2>\n");
      out.write("            <ul>\n");
      out.write("\t            <li>By Anderson, Caroline <div class=\"buy_now_button\"><a href=\"shoppingcart.jsp\">Buy Now</a></div></li>\n");
      out.write("            \t<li>January 2015</li>\n");
      out.write("                <li>Price: $55<div class=\"detail_button\"><a href=\"book-BestFriend.jsp\">Detail</a></div></li>\n");
      out.write("                <li>ISBN: 9781250034519</li>\n");
      out.write("                <p></p>\n");
      out.write("                <li> <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                        Rating: <img src=\"images/gold-star1.jpg\" alt=\"rating star\" width=\"15\" height=\"15\" />\n");
      out.write("                        <img src=\"images/gold-star1.jpg\" alt=\"rating star\" width=\"15\" height=\"15\" />\n");
      out.write("                        <img src=\"images/gold-star1.jpg\" alt=\"rating star\" width=\"15\" height=\"15\" />\n");
      out.write("                        <img src=\"images/gold-star1.jpg\" alt=\"rating star\" width=\"15\" height=\"15\" />\n");
      out.write("                        <img src=\"images/gold-star1.jpg\" alt=\"rating star\" width=\"15\" height=\"15\" /></p></li>\n");
      out.write("            </ul>\n");
      out.write("          <p></p>\n");
      out.write("          <p></p> \n");
      out.write("          <p></p>\n");
      out.write("          <p></p>\n");
      out.write("          <p></p>\n");
      out.write("          \n");
      out.write("            <div class=\"image_panel\"><a href=\"book-TheTheBaby.jsp\"><img src=\"images/templatemo_image_06.jpg\" alt=\"CSS Template\" width=\"75\" height=\"110\" /></a></div>\n");
      out.write("          <h2>The Heiress's Secret Baby</h2>\n");
      out.write("            <ul>\n");
      out.write("\t            <li>By Pembroke, Sophie <div class=\"buy_now_button\"><a href=\"shoppingcart.jsp\">Buy Now</a></div></li>\n");
      out.write("            \t<li>January 2015</li>\n");
      out.write("                <li>Price: $35<div class=\"detail_button\"><a href=\"book-TheTheBaby.jsp\">Detail</a></div></li>\n");
      out.write("                <li>ISBN: 9780263257410</li>\n");
      out.write("                   <p></p>\n");
      out.write("                <li> <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                        Rating: <img src=\"images/gold-star1.jpg\" alt=\"rating star\" width=\"15\" height=\"15\" />\n");
      out.write("                        <img src=\"images/gold-star1.jpg\" alt=\"rating star\" width=\"15\" height=\"15\" />\n");
      out.write("                        <img src=\"images/gold-star1.jpg\" alt=\"rating star\" width=\"15\" height=\"15\" />\n");
      out.write("                        <img src=\"images/gold-star1.jpg\" alt=\"rating star\" width=\"15\" height=\"15\" />\n");
      out.write("                        <img src=\"images/gold-star1.jpg\" alt=\"rating star\" width=\"15\" height=\"15\" /></p></li>\n");
      out.write("            </ul>\n");
      out.write("          \n");
      out.write("         \n");
      out.write("             \n");
      out.write("       \n");
      out.write("            \n");
      out.write("        </div> <!-- end of content right -->\n");
      out.write("        \n");
      out.write("\n");
      out.write("    \n");
      out.write("    \t<div class=\"cleaner_with_height\">&nbsp;</div>\n");
      out.write("    </div> <!-- end of content -->\n");
      out.write("    \n");
      out.write("    <div id=\"templatemo_footer\">\n");
      out.write("            \n");
      out.write("\t </div> <!-- end of footer -->\n");
      out.write("<!--  Free CSS Template www.templatemo.com -->\n");
      out.write("</div> <!-- end of container -->\n");
      out.write("<div align=center>This template  downloaded form <a href='http://all-free-download.com/free-website-templates/'>free website templates</a></div></body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
