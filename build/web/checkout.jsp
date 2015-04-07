<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Book Store Template, Free CSS Template, CSS Website Layout</title>
<meta name="keywords" content="Book Store Template, Free CSS Template, CSS Website Layout, CSS, HTML" />
<meta name="description" content="Book Store Template, Free CSS Template, Download CSS Website" />
<link href="CSS/templatemo_style_category.css" rel="stylesheet" type="text/css" />
<script src="JS/cart.js"></script>
</head>
<body>
<!--  Free CSS Templates from www.templatemo.com -->
<div id="templatemo_container">
	
    
    <div id="templatemo_header">
    	
        
        

    </div> <!-- end of header -->
    
    <div id="templatemo_content">

    	
        <div id="templatemo_content_left">
            
        	
            <div class="templatemo_content_left_section">
                <h1>&nbsp;</h1>
                <p>&nbsp;</p>
                <p>&nbsp;</p>
                <a href="index.jsp" class="treeUnselected" >Home</a>
                <p>&nbsp;</p>
                 <hr>
                <p>&nbsp;</p>
                 <jsp:useBean id="mybean" scope="session" class="org.mypackage.bookstore.NameHandler" />
                 <jsp:getProperty name="mybean" property="cartnum" />
                <p>&nbsp;</p>
                <hr>
                <p>&nbsp;</p>
                <div class="leftNav">
    <div id="samplesToc">
        <div id="tree" style="top: 35px; left: 0px;" class="treeDiv">
          <div id="treeRoot" onselectstart="return false" ondragstart="return false">
            <div class="treeNode">
              <img src="images/treenodeplus.gif" onclick="expandCollapse(this.parentNode)" class="treeLinkImage">
              <span onclick="expandCollapse(this.parentNode)" class="category">Categories </span>
              <div class="treeSubnodesHidden">
                  
                  <div class="treeNode">
                       <img src="images/treenodeplus.gif" onclick="expandCollapse(this.parentNode)" class="treeLinkImage">
                       <span onclick="expandCollapse(this.parentNode)" class="treeUnselected"><a href="categories_politics.jsp">Politics</a> </span>
                       <div class="treeSubnodesHidden">
                           <div class="treeNode">
                              <a href="#" class="treeUnselected" onclick="clickAnchor(this)">Agrarian politics</a>
                        </div>
                        <div class="treeNode">
                              <a href="#" class="treeUnselected" onclick="clickAnchor(this)">Health policy</a>
                        </div>
                    </div>
                  </div>
                  
                <div class="treeNode">
                  <a href="categories.jsp">History</a>
                </div>
                <div class="treeNode" class="treeUnselected">
                  <a href="#" class="treeUnselected" onclick="clickAnchor(this)">Fiction</a>
                </div>
                <div class="treeNode">
                  <a href="#" class="treeUnselected" onclick="clickAnchor(this)">Health</a>
                </div>
                <div class="treeNode">
                  <a href="#" class="treeUnselected" onclick="clickAnchor(this)">Science</a>
                </div>
                <div class="treeNode">
                  <a href="#" class="treeUnselected" onclick="clickAnchor(this)">Kids</a>
                </div>
                <div class="treeNode">
                  <a href="#" class="treeUnselected" onclick="clickAnchor(this)">Teens</a>
                </div>
              </div>
            </div>
            <!--end block-->
            <div class="treeNode">
              <img src="images/treenodeplus.gif" onclick="expandCollapse(this.parentNode)" class="treeLinkImage">
              <span onclick="expandCollapse(this.parentNode)" class="category">New Book</span>
              <div class="treeSubnodesHidden">
                <div class="treeNode">
                  <a href="book-MightierSword.jsp" class="treeUnselected" >Mightier Than the Sword</a>
                </div>
                <div class="treeNode">
                  <a href="book-ConvenientBride.jsp" class="treeUnselected">His Very Convenient Bride</a>
                </div>
                <div class="treeNode">
                  <a href="book-DatingEnemy.jsp" class="treeUnselected" >Dating the Enemy</a>
                </div>
                <div class="treeNode">
                  <a href="book-TamingTycoon.jsp" class="treeUnselected" >Taming the French Tycoon</a>
                </div>
                <div class="treeNode">
                  <a href="book-ScandalWedding.jsp" class="treeUnselected" >The Scandal Behind the Wedding</a>
                </div>
                                  <div class="treeNode">
                  <a href="book-TheTheBaby.jsp" class="treeUnselected" >The Heiress's Secret Baby</a>
                </div>
                                  <div class="treeNode">
                  <a href="book-BestFriend.jsp" class="treeUnselected" >Best Friend to Wife and Mother?</a>
                </div>
              </div>
            </div>
            <!--end block-->
            
             <div class="treeNode">
              <img src="images/treenodeplus.gif" onclick="expandCollapse(this.parentNode)" class="treeLinkImage">
              <span onclick="expandCollapse(this.parentNode)" class="category">Books Coming Soon</span>
              <div class="treeSubnodesHidden">
                <div class="treeNode">
                  <a href="#" class="treeUnselected" >Monsters Meet on Court Street</a>
                </div>
                <div class="treeNode">
                  <a href="#" class="treeUnselected">Science: A Discovery in Comics</a>
                </div>
                <div class="treeNode">
                  <a href="#" class="treeUnselected" >Newman</a>
                </div>
                <div class="treeNode">
                  <a href="#" class="treeUnselected" >Romeo and Juliet</a>
                </div>
                <div class="treeNode">
                  <a href="#" class="treeUnselected" >Captain Pixel</a>
                </div>
                                  <div class="treeNode">
                  <a href="#" class="treeUnselected" >Persia Blues</a>
                </div>
                                  <div class="treeNode">
                  <a href="#" class="treeUnselected" >Bubbles and Gondola</a>
                </div>
              </div>
            </div>
            <!--end block-->
            
            
             <div class="treeNode">
              <img src="images/treenodeplus.gif" onclick="expandCollapse(this.parentNode)" class="treeLinkImage">
              <span onclick="expandCollapse(this.parentNode)" class="category">Books On Sale</span>
              <div class="treeSubnodesHidden">
                <div class="treeNode">
                  <a href="book-MightierSword.jsp" class="treeUnselected" >Mightier Than the Sword</a>
                </div>
                <div class="treeNode">
                  <a href="book-ConvenientBride.jsp" class="treeUnselected">His Very Convenient Bride</a>
                </div>
                <div class="treeNode">
                  <a href="book-DatingEnemy.jsp" class="treeUnselected" >Dating the Enemy</a>
                </div>
                <div class="treeNode">
                  <a href="book-TamingTycoon.jsp" class="treeUnselected" >Taming the French Tycoon</a>
                </div>
                <div class="treeNode">
                  <a href="book-ScandalWedding.jsp" class="treeUnselected" >The Scandal Behind the Wedding</a>
                </div>
                                  <div class="treeNode">
                  <a href="book-TheTheBaby.jsp" class="treeUnselected" >The Heiress's Secret Baby</a>
                </div>
                                  <div class="treeNode">
                  <a href="book-BestFriend.jsp" class="treeUnselected" >Best Friend to Wife and Mother?</a>
                </div>
              </div>
            </div>
            <!--end block-->
            
             <div class="treeNode">
              <img src="images/treenodeplus.gif" onclick="expandCollapse(this.parentNode)" class="treeLinkImage">
              <span onclick="expandCollapse(this.parentNode)" class="category">Latest Best Sellers</span>
              <div class="treeSubnodesHidden">
                <div class="treeNode">
                  <a href="book-MightierSword.jsp" class="treeUnselected" >Mightier Than the Sword</a>
                </div>
                <div class="treeNode">
                  <a href="book-ConvenientBride.jsp" class="treeUnselected">His Very Convenient Bride</a>
                </div>
                <div class="treeNode">
                  <a href="book-DatingEnemy.jsp" class="treeUnselected" >Dating the Enemy</a>
                </div>
                <div class="treeNode">
                  <a href="book-TamingTycoon.jsp" class="treeUnselected" >Taming the French Tycoon</a>
                </div>
                <div class="treeNode">
                  <a href="book-ScandalWedding.jsp" class="treeUnselected" >The Scandal Behind the Wedding</a>
                </div>
                                  <div class="treeNode">
                  <a href="book-TheTheBaby.jsp" class="treeUnselected" >The Heiress's Secret Baby</a>
                </div>
                                  <div class="treeNode">
                  <a href="book-BestFriend.jsp" class="treeUnselected" >Best Friend to Wife and Mother?</a>
                </div>
              </div>
            </div>
            <!--end block-->
            <div class="treeNode">
              <img src="images/treenodeplus.gif" onclick="expandCollapse(this.parentNode)" class="treeLinkImage">
              <span onclick="expandCollapse(this.parentNode)" class="category">Month's Top Picks</span>
              <div class="treeSubnodesHidden">
                <div class="treeNode">
                  <a href="book-MightierSword.jsp" class="treeUnselected" >Mightier Than the Sword</a>
                </div>
                <div class="treeNode">
                  <a href="book-ConvenientBride.jsp" class="treeUnselected">His Very Convenient Bride</a>
                </div>
                <div class="treeNode">
                  <a href="book-DatingEnemy.jsp" class="treeUnselected" >Dating the Enemy</a>
                </div>
                <div class="treeNode">
                  <a href="book-TamingTycoon.jsp" class="treeUnselected" >Taming the French Tycoon</a>
                </div>
                <div class="treeNode">
                  <a href="book-ScandalWedding.jsp" class="treeUnselected" >The Scandal Behind the Wedding</a>
                </div>
                                  <div class="treeNode">
                  <a href="book-TheTheBaby.jsp" class="treeUnselected" >The Heiress's Secret Baby</a>
                </div>
                                  <div class="treeNode">
                  <a href="book-BestFriend.jsp" class="treeUnselected" >Best Friend to Wife and Mother?</a>
                </div>
              </div>
            </div>
            <!--end block-->
            
          </div>
        </div>
    </div> <!-- end samplesToc -->
</div> <!-- end leftNav -->

            </div> <!-- end of menu -->	

        </div> <!-- end of content left -->
        
        <div id="templatemo_content_right">
            <form name="Name Input Form" action="response.jsp" style="float: right; background-color: transparent">
                    <input type="text" name="name" size="35" /> 
                    <select name="selectItem" style="background-color: transparent;color: #cbc750; font-weight: bold; border-color:#dfdedd ">
                         <option value="title">Title</option>
                          <option value="keyword">Keyword</option>
                            <option value="author">Author</option>
                                <option value="description">Description</option>
                                 <option value="price">Price</option>
                     </select>
                    <input type="submit" name="search" value="Search" style="background-color: transparent;color: #cbc750; font-weight: bold "></input>
            </form>
   
            
              <h1>&nbsp;</h1>
          <h1>Checkout <div style="float:right">2 Item(s) with Total Amount: $100 </div></h1>
          
          <table border="1" align="left" width="650" rules="rows" ">
             
             <tbody>
                 <tr>
                     <td align="right">
                        <img src="images/1.jpg"alt="CSS Template" width="30" height="30" />
                        </td>
                     <td style="font-size: 15px; font-weight: bold; color: #e6e154;">
                         General Information
                         </td>
                     <td style="font-size: 13px; " width="100px" >
                         <p>&nbsp;</p>
                         <p>First Name: </p>
                         <p style="color: transparent">First Name: </p>
                         <p>&nbsp;</p>
                         
                         <p>Last Name: <p>
                                 <p>&nbsp;</p>
                         <p>Email Address: </p>
                  
                     </td>
                     <td>
                         <p>&nbsp;</p>
                         <p> <input type="text" name="firstname" value="" style="width: 230px"/> </p>
                         <p>&nbsp;</p>
                        <p> <input type="text" name="firstname" value="" style="width: 230px"/> </p>
                        <p name="emailprompt">&nbsp;</p>
                         <p> 
                             <form>
                             <input  type="email" name="email"  style="width: 230px"/>
                             </form>
                             
                         </p>
                         </td>
                 </tr>
                    <tr>
                     <td align="right">
                        <img src="images/2.jpg"alt="CSS Template" width="30" height="30" />
                        </td>
                     <td style="font-size: 15px; font-weight: bold; color: #e6e154;">
                         Delivery Address
                         </td>
                     <td style="font-size: 13px;" width="130px">
                        
                         <p style="color: transparent">Address 1: </p>
                         <p>Address 1: </p>
                         <p style="color: transparent">Address 1: </p>
                         <p style="color: transparent">Address 2: </p>
                         <p>Address 2: </p>
                         
                         <p style="color: transparent">Other information: <p>
                                 <p>Other information: <p>

                  
                     </td>
                     <td>
                         <p>&nbsp;</p>
                         <p> <input type="text" name="firstname" value="" style="width: 230px"/> </p>
                         <p>&nbsp;</p>
                         
                        <p> <input type="text" name="firstname" value="" style="width: 230px"/> </p>
                        <p>&nbsp;</p>
                         <p> <input type="text" name="firstname" value="" style="width: 230px"/></p>
                         </td>
                 </tr>
                 
                 <tr>
                     <td align="right">
                        <img src="images/3.jpg"alt="CSS Template" width="30" height="30" />
                        </td>
                     <td style="font-size: 15px; font-weight: bold; color: #e6e154;">
                         Shipping Options
                         </td>
                     <td style="font-size: 13px;" width="130px">
                         <p>&nbsp;</p>
                         <p>DHL  &nbsp;&nbsp;&nbsp;&nbsp;<img src="images/DHL.jpg"alt="CSS Template" width="30" height="30" /></p>
                         <p>&nbsp;</p>
                         <p>UPS &nbsp;&nbsp;&nbsp;&nbsp;<img src="images/UPS.jpg"alt="CSS Template" width="30" height="30" /></p>
                         <p>&nbsp;</p>
                         <p>EMS &nbsp;&nbsp;&nbsp;&nbsp;<img src="images/EMS.jpg"alt="CSS Template" width="30" height="30" /><p>
                                 <p>&nbsp;</p>
                                 <p>FEDEX &nbsp;<img src="images/FED.jpg"alt="CSS Template" width="30" height="30" /></p>

                  
                     </td>
                     <td>
                         <p>&nbsp;</p>
                         <p><input type="radio" name="shippping" value="" checked="checked" /> &nbsp;&nbsp;3-5 workdays  &nbsp;&nbsp;&nbsp;</p>
                        <p>&nbsp;</p>
                        <p>&nbsp;</p>
                         <p> <input type="radio" name="shippping" value=""  />&nbsp;&nbsp;3-5 workdays  &nbsp;&nbsp;&nbsp; </p>
                        <p>&nbsp;</p>
                   
                         <p> <input type="radio" name="shippping" value="" /> &nbsp;&nbsp;7-10 workdays  &nbsp;</p>
                         <p>&nbsp;</p>
                         <p>&nbsp;</p>
                         <p> <input type="radio" name="shippping" value=""  />&nbsp;&nbsp; 3-5 workdays  &nbsp;</p>
                         </td>
                 </tr>
                 <tr>
                     <td align="right">
                        <img src="images/4.jpg"alt="CSS Template" width="30" height="30" />
                        </td>
                     <td style="font-size: 15px; font-weight: bold; color: #e6e154;">
                         Total Price
                         </td>
                     <td style="font-size: 13px;" width="170px">
                         <p style="color: transparent">Cardholder's first name:</p>

                         <p>Cardholder's first name:</p>
                         <p>&nbsp;</p>
                         <p style="color: transparent">Cardholder's last name:</p>
                                <p>Cardholder's last name:</p>
<p style="color: transparent">Credit card number:<p>
        <p>Credit card number:<p>
                                 <p style="color: transparent">Credit card type:</p>

                                  <p style="color: transparent">Credit card type:</p>
                                  <p>Credit card type:</p>
                                  
                                  <p>&nbsp;</p>
                                   <p style="color: transparent">Secuity Code(CSC):</p>
                                    <p>Expiration date:</p>
                                    <p style="color: transparent">Secuity Code(CSC):</p>
                                      <p>Secuity Code(CSC):</p>

                  
                     </td>
                     <td>
                         <p>&nbsp;</p>
                            <p> <input type="text" name="firstname" value="" style="width: 230px"/>  </p>
                            <p>&nbsp;</p>
                         <p><input type="text" name="firstname" value="" style="width: 230px"/> </p>
                         <p>&nbsp;</p>
                         <p><input type="text" name="firstname" value="" style="width: 230px"/> <p>
                                 <p>&nbsp;</p>
                                 <p>
                                     <input type="radio" name="cardtype" value="" checked="checked" />
                                     <img src="images/visa.jpg"alt="CSS Template" width="50" height="30" />
                                     &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                     <input type="radio" name="cardtype" value=""  />
                                     <img src="images/mastercard.jpg"alt="CSS Template" width="50" height="30" />
                                 </p>
                                <p>&nbsp;</p>
                                 <p>
                                     <select name="month" disabled="disabled" style="color: #FFFFFF">
                                         <option>01</option>
                                         <option>02</option>
                                         <option>03</option>
                                         <option>04</option>
                                         <option>05</option>
                                         <option>06</option>
                                         <option>07</option>
                                         <option>08</option>
                                         <option>09</option>
                                         <option>10</option>
                                         <option>11</option>
                                         <option>12</option>
                                     </select>
                                     <select name="year" disabled="disabled" style="color: #FFFFFF">
                                         <option>2015</option>
                                         <option>2016</option>
                                         <option>2017</option>
                                         <option>2018</option>
                                         <option>2019</option>
                                         <option>2020</option>
                                         <option>2021</option>
                                         <option>2022</option>
                                         <option>2023</option>
                                         <option>2024</option>
                                         <option>2025</option>
                                         <option>2026</option>
                                     </select>
                                 </p>
                                 <p>&nbsp;</p>
                                 <p><input type="text" name="secuitycode" value="" /><a href="http://en.wikipedia.org/wiki/Card_security_code">What's CSC?</p>
                         </td>
                 </tr>
                 
             </tbody>
         </table>
         <p>&nbsp;</p>
         <p>&nbsp;</p>

         
         <form action="checkout.jsp">
          <input type="submit" rhef="#" value="Save" style="width: 100px; height: 40px; float: right; font-weight: bold;background-color: #7f003f; border-color: #7f003f; color: #FFFFFF; font-size: 15px" name="Continue Shopping" />
         </form> 
         <div style="width: 100px">

          <form action="index.jsp">
          <input type="submit" rhef="#" value="Cancel" style="width: 100px; height: 40px; float: right; font-weight: bold;background-color: #9F8727; border-color: #9F8727; color: #FFFFFF; font-size: 15px" name="Continue Shopping" />
         </form> 
         
             
       
            
        </div> <!-- end of content right -->
        

    
    	<div class="cleaner_with_height">&nbsp;</div>
    </div> <!-- end of content -->
    
    <div id="templatemo_footer">
            
	 </div> <!-- end of footer -->
<!--  Free CSS Template www.templatemo.com -->
</div> <!-- end of container -->
<div align=center>This template  downloaded form <a href='http://all-free-download.com/free-website-templates/'>free website templates</a></div></body>
</html>