package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Book Store Template, Free CSS Template, CSS Website Layout</title>\n");
      out.write("<meta name=\"keywords\" content=\"Book Store Template, Free CSS Template, CSS Website Layout, CSS, HTML\" />\n");
      out.write("<meta name=\"description\" content=\"Book Store Template, Free CSS Template, Download CSS Website\" />\n");
      out.write("<link href=\"CSS/templatemo_style_1.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<script src=\"JS/cart.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<!--  Free CSS Templates from www.templatemo.com -->\n");
      out.write("<div id=\"templatemo_container\">\n");
      out.write("\t\n");
      out.write("    \n");
      out.write("    <div id=\"templatemo_header\">\n");
      out.write("    \t\n");
      out.write("        \n");
      out.write("        \n");
      out.write("\n");
      out.write("    </div> <!-- end of header -->\n");
      out.write("    \n");
      out.write("    <div id=\"templatemo_content\">\n");
      out.write("\n");
      out.write("    \t\n");
      out.write("        <div id=\"templatemo_content_left\">\n");
      out.write("            \n");
      out.write("        \t\n");
      out.write("            <div class=\"templatemo_content_left_section\">\n");
      out.write("                <h1>&nbsp;</h1>\n");
      out.write("                <p>&nbsp;</p>\n");
      out.write("                <p>&nbsp;</p>\n");
      out.write("                <a href=\"index.jsp\" class=\"treeUnselected\" >Home</a>\n");
      out.write("                <p>&nbsp;</p>\n");
      out.write("                 <hr>\n");
      out.write("                <p>&nbsp;</p>\n");
      out.write("                 ");
      org.mypackage.bookstore.NameHandler mybean = null;
      synchronized (session) {
        mybean = (org.mypackage.bookstore.NameHandler) _jspx_page_context.getAttribute("mybean", PageContext.SESSION_SCOPE);
        if (mybean == null){
          mybean = new org.mypackage.bookstore.NameHandler();
          _jspx_page_context.setAttribute("mybean", mybean, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\n");
      out.write("                 ");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((org.mypackage.bookstore.NameHandler)_jspx_page_context.findAttribute("mybean")).getCartnum())));
      out.write("\n");
      out.write("                <p>&nbsp;</p>\n");
      out.write("                <hr>\n");
      out.write("                <p>&nbsp;</p>\n");
      out.write("                <div class=\"leftNav\">\n");
      out.write("    <div id=\"samplesToc\">\n");
      out.write("        <div id=\"tree\" style=\"top: 35px; left: 0px;\" class=\"treeDiv\">\n");
      out.write("          <div id=\"treeRoot\" onselectstart=\"return false\" ondragstart=\"return false\">\n");
      out.write("            <div class=\"treeNode\">\n");
      out.write("              <img src=\"images/treenodeplus.gif\" onclick=\"expandCollapse(this.parentNode)\" class=\"treeLinkImage\">\n");
      out.write("              <span onclick=\"expandCollapse(this.parentNode)\" class=\"category\">Categories </span>\n");
      out.write("              <div class=\"treeSubnodesHidden\">\n");
      out.write("                  \n");
      out.write("                  <div class=\"treeNode\">\n");
      out.write("                       <img src=\"images/treenodeplus.gif\" onclick=\"expandCollapse(this.parentNode)\" class=\"treeLinkImage\">\n");
      out.write("                       <span onclick=\"expandCollapse(this.parentNode)\" class=\"treeUnselected\"><a href=\"categories_politics.jsp\">Politics</a> </span>\n");
      out.write("                       <div class=\"treeSubnodesHidden\">\n");
      out.write("                           <div class=\"treeNode\">\n");
      out.write("                              <a href=\"#\" class=\"treeUnselected\" onclick=\"clickAnchor(this)\">Agrarian politics</a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"treeNode\">\n");
      out.write("                              <a href=\"#\" class=\"treeUnselected\" onclick=\"clickAnchor(this)\">Health policy</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                  \n");
      out.write("                <div class=\"treeNode\">\n");
      out.write("                  <a href=\"categories.jsp\">History</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"treeNode\" class=\"treeUnselected\">\n");
      out.write("                  <a href=\"#\" class=\"treeUnselected\" onclick=\"clickAnchor(this)\">Fiction</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"treeNode\">\n");
      out.write("                  <a href=\"#\" class=\"treeUnselected\" onclick=\"clickAnchor(this)\">Health</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"treeNode\">\n");
      out.write("                  <a href=\"#\" class=\"treeUnselected\" onclick=\"clickAnchor(this)\">Science</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"treeNode\">\n");
      out.write("                  <a href=\"#\" class=\"treeUnselected\" onclick=\"clickAnchor(this)\">Kids</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"treeNode\">\n");
      out.write("                  <a href=\"#\" class=\"treeUnselected\" onclick=\"clickAnchor(this)\">Teens</a>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <!--end block-->\n");
      out.write("            <div class=\"treeNode\">\n");
      out.write("              <img src=\"images/treenodeplus.gif\" onclick=\"expandCollapse(this.parentNode)\" class=\"treeLinkImage\">\n");
      out.write("              <span onclick=\"expandCollapse(this.parentNode)\" class=\"category\">New Book</span>\n");
      out.write("              <div class=\"treeSubnodesHidden\">\n");
      out.write("                <div class=\"treeNode\">\n");
      out.write("                  <a href=\"book-MightierSword.jsp\" class=\"treeUnselected\" >Mightier Than the Sword</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"treeNode\">\n");
      out.write("                  <a href=\"book-ConvenientBride.jsp\" class=\"treeUnselected\">His Very Convenient Bride</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"treeNode\">\n");
      out.write("                  <a href=\"book-DatingEnemy.jsp\" class=\"treeUnselected\" >Dating the Enemy</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"treeNode\">\n");
      out.write("                  <a href=\"book-TamingTycoon.jsp\" class=\"treeUnselected\" >Taming the French Tycoon</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"treeNode\">\n");
      out.write("                  <a href=\"book-ScandalWedding.jsp\" class=\"treeUnselected\" >The Scandal Behind the Wedding</a>\n");
      out.write("                </div>\n");
      out.write("                                  <div class=\"treeNode\">\n");
      out.write("                  <a href=\"book-TheTheBaby.jsp\" class=\"treeUnselected\" >The Heiress's Secret Baby</a>\n");
      out.write("                </div>\n");
      out.write("                                  <div class=\"treeNode\">\n");
      out.write("                  <a href=\"book-BestFriend.jsp\" class=\"treeUnselected\" >Best Friend to Wife and Mother?</a>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <!--end block-->\n");
      out.write("            \n");
      out.write("             <div class=\"treeNode\">\n");
      out.write("              <img src=\"images/treenodeplus.gif\" onclick=\"expandCollapse(this.parentNode)\" class=\"treeLinkImage\">\n");
      out.write("              <span onclick=\"expandCollapse(this.parentNode)\" class=\"category\">Books Coming Soon</span>\n");
      out.write("              <div class=\"treeSubnodesHidden\">\n");
      out.write("                <div class=\"treeNode\">\n");
      out.write("                  <a href=\"#\" class=\"treeUnselected\" >Monsters Meet on Court Street</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"treeNode\">\n");
      out.write("                  <a href=\"#\" class=\"treeUnselected\">Science: A Discovery in Comics</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"treeNode\">\n");
      out.write("                  <a href=\"#\" class=\"treeUnselected\" >Newman</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"treeNode\">\n");
      out.write("                  <a href=\"#\" class=\"treeUnselected\" >Romeo and Juliet</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"treeNode\">\n");
      out.write("                  <a href=\"#\" class=\"treeUnselected\" >Captain Pixel</a>\n");
      out.write("                </div>\n");
      out.write("                                  <div class=\"treeNode\">\n");
      out.write("                  <a href=\"#\" class=\"treeUnselected\" >Persia Blues</a>\n");
      out.write("                </div>\n");
      out.write("                                  <div class=\"treeNode\">\n");
      out.write("                  <a href=\"#\" class=\"treeUnselected\" >Bubbles and Gondola</a>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <!--end block-->\n");
      out.write("            \n");
      out.write("            \n");
      out.write("             <div class=\"treeNode\">\n");
      out.write("              <img src=\"images/treenodeplus.gif\" onclick=\"expandCollapse(this.parentNode)\" class=\"treeLinkImage\">\n");
      out.write("              <span onclick=\"expandCollapse(this.parentNode)\" class=\"category\">Books On Sale</span>\n");
      out.write("              <div class=\"treeSubnodesHidden\">\n");
      out.write("                <div class=\"treeNode\">\n");
      out.write("                  <a href=\"book-MightierSword.jsp\" class=\"treeUnselected\" >Mightier Than the Sword</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"treeNode\">\n");
      out.write("                  <a href=\"book-ConvenientBride.jsp\" class=\"treeUnselected\">His Very Convenient Bride</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"treeNode\">\n");
      out.write("                  <a href=\"book-DatingEnemy.jsp\" class=\"treeUnselected\" >Dating the Enemy</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"treeNode\">\n");
      out.write("                  <a href=\"book-TamingTycoon.jsp\" class=\"treeUnselected\" >Taming the French Tycoon</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"treeNode\">\n");
      out.write("                  <a href=\"book-ScandalWedding.jsp\" class=\"treeUnselected\" >The Scandal Behind the Wedding</a>\n");
      out.write("                </div>\n");
      out.write("                                  <div class=\"treeNode\">\n");
      out.write("                  <a href=\"book-TheTheBaby.jsp\" class=\"treeUnselected\" >The Heiress's Secret Baby</a>\n");
      out.write("                </div>\n");
      out.write("                                  <div class=\"treeNode\">\n");
      out.write("                  <a href=\"book-BestFriend.jsp\" class=\"treeUnselected\" >Best Friend to Wife and Mother?</a>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <!--end block-->\n");
      out.write("            \n");
      out.write("             <div class=\"treeNode\">\n");
      out.write("              <img src=\"images/treenodeplus.gif\" onclick=\"expandCollapse(this.parentNode)\" class=\"treeLinkImage\">\n");
      out.write("              <span onclick=\"expandCollapse(this.parentNode)\" class=\"category\">Latest Best Sellers</span>\n");
      out.write("              <div class=\"treeSubnodesHidden\">\n");
      out.write("                <div class=\"treeNode\">\n");
      out.write("                  <a href=\"book-MightierSword.jsp\" class=\"treeUnselected\" >Mightier Than the Sword</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"treeNode\">\n");
      out.write("                  <a href=\"book-ConvenientBride.jsp\" class=\"treeUnselected\">His Very Convenient Bride</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"treeNode\">\n");
      out.write("                  <a href=\"book-DatingEnemy.jsp\" class=\"treeUnselected\" >Dating the Enemy</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"treeNode\">\n");
      out.write("                  <a href=\"book-TamingTycoon.jsp\" class=\"treeUnselected\" >Taming the French Tycoon</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"treeNode\">\n");
      out.write("                  <a href=\"book-ScandalWedding.jsp\" class=\"treeUnselected\" >The Scandal Behind the Wedding</a>\n");
      out.write("                </div>\n");
      out.write("                                  <div class=\"treeNode\">\n");
      out.write("                  <a href=\"book-TheTheBaby.jsp\" class=\"treeUnselected\" >The Heiress's Secret Baby</a>\n");
      out.write("                </div>\n");
      out.write("                                  <div class=\"treeNode\">\n");
      out.write("                  <a href=\"book-BestFriend.jsp\" class=\"treeUnselected\" >Best Friend to Wife and Mother?</a>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <!--end block-->\n");
      out.write("            <div class=\"treeNode\">\n");
      out.write("              <img src=\"images/treenodeplus.gif\" onclick=\"expandCollapse(this.parentNode)\" class=\"treeLinkImage\">\n");
      out.write("              <span onclick=\"expandCollapse(this.parentNode)\" class=\"category\">Month's Top Picks</span>\n");
      out.write("              <div class=\"treeSubnodesHidden\">\n");
      out.write("                <div class=\"treeNode\">\n");
      out.write("                  <a href=\"book-MightierSword.jsp\" class=\"treeUnselected\" >Mightier Than the Sword</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"treeNode\">\n");
      out.write("                  <a href=\"book-ConvenientBride.jsp\" class=\"treeUnselected\">His Very Convenient Bride</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"treeNode\">\n");
      out.write("                  <a href=\"book-DatingEnemy.jsp\" class=\"treeUnselected\" >Dating the Enemy</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"treeNode\">\n");
      out.write("                  <a href=\"book-TamingTycoon.jsp\" class=\"treeUnselected\" >Taming the French Tycoon</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"treeNode\">\n");
      out.write("                  <a href=\"book-ScandalWedding.jsp\" class=\"treeUnselected\" >The Scandal Behind the Wedding</a>\n");
      out.write("                </div>\n");
      out.write("                                  <div class=\"treeNode\">\n");
      out.write("                  <a href=\"book-TheTheBaby.jsp\" class=\"treeUnselected\" >The Heiress's Secret Baby</a>\n");
      out.write("                </div>\n");
      out.write("                                  <div class=\"treeNode\">\n");
      out.write("                  <a href=\"book-BestFriend.jsp\" class=\"treeUnselected\" >Best Friend to Wife and Mother?</a>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <!--end block-->\n");
      out.write("            \n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("    </div> <!-- end samplesToc -->\n");
      out.write("</div> <!-- end leftNav -->\n");
      out.write("\n");
      out.write("            </div> <!-- end of menu -->\t\t            \n");
      out.write("            \n");
      out.write("           \n");
      out.write("\n");
      out.write("        </div> <!-- end of content left -->\n");
      out.write("        \n");
      out.write("        <div id=\"templatemo_content_right\">\n");
      out.write("            \n");
      out.write("            <form name=\"Name Input Form\" action=\"response.jsp\" style=\"float: right; background-color: transparent\">\n");
      out.write("                    <input type=\"text\" name=\"name\" size=\"35\" /> \n");
      out.write("                    <select name=\"selectItem\" style=\"background-color: transparent;color: #cbc750; font-weight: bold; border-color:#dfdedd \">\n");
      out.write("                         <option value=\"title\">Title</option>\n");
      out.write("                          <option value=\"keyword\">Keyword</option>\n");
      out.write("                            <option value=\"author\">Author</option>\n");
      out.write("                                <option value=\"description\">Description</option>\n");
      out.write("                                 <option value=\"price\">Price</option>\n");
      out.write("                     </select>\n");
      out.write("                    <input type=\"submit\" name=\"search\" value=\"Search\" style=\"background-color: transparent;color: #cbc750; font-weight: bold \"></input>\n");
      out.write("            </form>\n");
      out.write("            <h2>&nbsp;</h2>\n");
      out.write("           \n");
      out.write("        \t<div class=\"templatemo_product_box\">\n");
      out.write("                    \n");
      out.write("            \t<h1><a href=\"book-MightierSword.jsp \">Mightier Than the Sword  <span>(by Archer Jeffrey)</span></a></h1>\n");
      out.write("   \t      <a href=\"book-MightierSword.jsp \"><img src=\"images/templatemo_image_01.jpg\" height=\"150\" width=\"100\" alt=\"image\" /></a>\n");
      out.write("                <div class=\"product_info\">\n");
      out.write("                    <p>&nbsp;</p>\n");
      out.write("                  <h3>$55</h3>\n");
      out.write("                  <div class=\"buy_now_button\" >\n");
      out.write("                      <form action=\"MyServlet\" method=\"post\">\n");
      out.write("                       <a href=\"#\">\n");
      out.write("                          <input onmouseover=\"this.style.background='#0f0403';\" onmouseout=\"this.style.background='transparent';\" type=\"submit\" name=\"Mightier Than the Sword\"  style=\"font-size:11px; font-weight: bold;background-color:transparent;border-color: transparent;color:#ffffff;height: 30px; width: 100px; \" value=\"Buy Now\"/>\n");
      out.write("                      </a>\n");
      out.write("                      </form>\n");
      out.write("                  </div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"detail_button\"><a href=\"book-MightierSword.jsp \">Detail</a></div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"cleaner\">&nbsp;</div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <div class=\"templatemo_product_box\">\n");
      out.write("            \t<h1><a href=\"book-ConvenientBride.jsp\">His Very Convenient Bride  <span>(by Pembroke Sophie)</span></a></h1>\n");
      out.write("       \t    <a href=\"book-ConvenientBride.jsp\"><img src=\"images/templatemo_image_02.jpg\" height=\"150\" width=\"100\" alt=\"image\" /></a>\n");
      out.write("                <div class=\"product_info\">\n");
      out.write("                \t<p>&nbsp;</p>\n");
      out.write("                    <h3>$35</h3>\n");
      out.write("                     <div class=\"buy_now_button\" >\n");
      out.write("                      <form action=\"MyServlet\" method=\"post\">\n");
      out.write("                      <a href=\"#\">\n");
      out.write("                         <input onmouseover=\"this.style.background='#0f0403';\" onmouseout=\"this.style.background='transparent';\" type=\"submit\" name=\"His Very Convenient Bride\" style=\"font-size:11px; font-weight: bold;background-color:transparent;border-color: transparent;color:#ffffff; height: 30px; width: 100px;\" value=\"Buy Now\"/>\n");
      out.write("                          \n");
      out.write("                      </a>\n");
      out.write("                      </form>\n");
      out.write("                    \n");
      out.write("                  </div>\n");
      out.write("                    <div class=\"detail_button\"><a href=\"book-ConvenientBride.jsp\">Detail</a></div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"cleaner\">&nbsp;</div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"cleaner_with_height\">&nbsp;</div>\n");
      out.write("            \n");
      out.write("            <div class=\"templatemo_product_box\">\n");
      out.write("            \t<h1><a href=\"book-DatingEnemy.jsp\">Dating the Enemy <span>(by Page Amber)</span></a></h1>\n");
      out.write("   \t      <a href=\"book-DatingEnemy.jsp\"><img src=\"images/templatemo_image_03.jpg\" height=\"150\" width=\"100\" alt=\"image\" /></a>\n");
      out.write("                <div class=\"product_info\">\n");
      out.write("                \t<p>&nbsp;</p>\n");
      out.write("                    <h3>$65</h3>\n");
      out.write("                     <div class=\"buy_now_button\"  >\n");
      out.write("                      <form action=\"MyServlet\" method=\"post\">\n");
      out.write("                      <a href=\"#\">\n");
      out.write("                          \n");
      out.write("                          <input onmouseover=\"this.style.background='#0f0403';\" onmouseout=\"this.style.background='transparent';\" type=\"submit\" name=\"Dating the Enemy\"   style=\"font-size:11px; font-weight: bold;background-color:transparent;border-color: transparent;color:#ffffff;height: 30px; width: 100px; \" value=\"Buy Now\" />\n");
      out.write("                          \n");
      out.write("                      </a>\n");
      out.write("                      </form>\n");
      out.write("                  </div>\n");
      out.write("                    <div class=\"detail_button\"><a href=\"book-DatingEnemy.jsp\">Detail</a></div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"cleaner\">&nbsp;</div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("           \n");
      out.write("            \n");
      out.write("            <div class=\"templatemo_product_box\">\n");
      out.write("            \t<h1><a href=\"book-TamingTycoon.jsp\">Taming the French Tycoon<span>(by Winters Rebecca)</span></a></h1>\n");
      out.write("            \t<a href=\"book-TamingTycoon.jsp\"><img src=\"images/templatemo_image_04.jpg\" height=\"150\" width=\"100\" alt=\"image\" /></a>\n");
      out.write("                <div class=\"product_info\">\n");
      out.write("                \t<p>&nbsp;</p>\n");
      out.write("                    <h3>$45</h3>\n");
      out.write("                    <div >\n");
      out.write("                        <div class=\"buy_now_button\" >\n");
      out.write("                      <form action=\"MyServlet\" method=\"post\">\n");
      out.write("                      <a href=\"#\">\n");
      out.write("                          \n");
      out.write("                          <input onmouseover=\"this.style.background='#0f0403';\" onmouseout=\"this.style.background='transparent';\" type=\"submit\" name=\"Taming the French Tycoon\"  style=\"font-size:11px; font-weight: bold;background-color:transparent;border-color: transparent;color:#ffffff; height: 30px; width: 100px;\" value=\"Buy Now\"/>\n");
      out.write("                          \n");
      out.write("                      </a>\n");
      out.write("                      </form>\n");
      out.write("                  </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"detail_button\"><a href=\"book-TamingTycoon.jsp\">Detail</a></div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"cleaner\">&nbsp;</div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <div class=\"cleaner_with_height\">&nbsp;</div>\n");
      out.write("<div class=\"cleaner_with_height\">&nbsp;</div>\n");
      out.write("<div class=\"cleaner_with_height\">&nbsp;</div>\n");
      out.write("<h2 style=\"text-align: center; font-size: 12px\">Page&nbsp;&nbsp; <strong><u> 1 </u><strong> <a href=\"#\">2</a> <a href=\"#\">3</a> ... <a href=\"#\">6</a> </h2>\n");
      out.write("\n");
      out.write("            <a href=\"index.jsp\"><img src=\"images/templatemo_ads.jpg\" alt=\"ads\" height=\"130\" width=\"670\"/></a>\n");
      out.write("        </div> <!-- end of content right -->\n");
      out.write("    \n");
      out.write("    \t<div class=\"cleaner_with_height\">&nbsp;</div>\n");
      out.write("    </div> <!-- end of content -->\n");
      out.write("    \n");
      out.write("    <div id=\"templatemo_footer\">\n");
      out.write("        <p>©2015Raymond Bookstore </p><p>Privacy Policy   Terms of Service</p>\n");
      out.write("    <p>If you prefer, feel free to call us at 1-855-222-8581</p>\n");
      out.write("\t       \t</div> \n");
      out.write("    <!-- end of footer -->\n");
      out.write("<!--  Free CSS Template www.templatemo.com -->\n");
      out.write("</div> <!-- end of container -->\n");
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