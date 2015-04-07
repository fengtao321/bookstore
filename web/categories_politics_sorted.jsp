<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Book Store Template, Free CSS Template, CSS Website Layout</title>
<meta name="keywords" content="Book Store Template, Free CSS Template, CSS Website Layout, CSS, HTML" />
<meta name="description" content="Book Store Template, Free CSS Template, Download CSS Website" />
<link href="
CSS/templatemo_style_category.css"  rel="stylesheet" type="text/css" />
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
            <p>&nbsp;            </p>
            <p>&nbsp;            </p>
     
            
            <div class="sort_button" ><a href="categories_politics_sorted.jsp" >sorted by popularity</a></div>

                               <h1>Politics</h1>
            <div class="image_panel"><a href="book-BestFriend.jsp"><img src="images/templatemo_image_07.jpg" alt="CSS Template" width="85" height="130" /></a></div>
          <h2><a href="book-BestFriend.jsp">Best Friend to Wife and Mother?</a></h2>
            <ul>
	            <li>By Anderson, Caroline <div class="buy_now_button"><a href="book-BestFriend.jsp">Buy Now</a></div></li>
            	<li>January 2015</li>
                <li>Price: $55<div class="detail_button"><a href="book-BestFriend.jsp">Detail</a></div></li>
                <li>ISBN: 9781250034519</li>
                <li> Rating: <img src="images/gold-star1.jpg" alt="rating star" width="15" height="15" />
                        <img src="images/gold-star1.jpg" alt="rating star" width="15" height="15" />
                        <img src="images/gold-star1.jpg" alt="rating star" width="15" height="15" />
                        <img src="images/gold-star1.jpg" alt="rating star" width="15" height="15" />
                        <img src="images/gold-star1.jpg" alt="rating star" width="15" height="15" /></li>
            </ul>
          <p></p>
          <p></p> 
          <p></p>
          <p></p>
          <p></p>
          
            <div class="image_panel"><a href="book-TheTheBaby.jsp"><img src="images/templatemo_image_06.jpg" alt="CSS Template" width="85" height="130" /></a></div>
          <h2><a href="book-TheTheBaby.jsp">The Heiress's Secret Baby</a></h2>
            <ul>
	            <li>By Pembroke, Sophie <div class="buy_now_button"><a href="shoppingcart.jsp">Buy Now</a></div></li>
            	<li>January 2015</li>
                <li>Price: $35<div class="detail_button"><a href="book-TheTheBaby.jsp">Detail</a></div></li>
                <li>ISBN: 9780263257410</li>
                   <p></p>
                <li> <p>
                        Rating: <img src="images/gold-star1.jpg" alt="rating star" width="15" height="15" />
                        <img src="images/gold-star1.jpg" alt="rating star" width="15" height="15" />
                        <img src="images/gold-star1.jpg" alt="rating star" width="15" height="15" />
                        <img src="images/gold-star1.jpg" alt="rating star" width="15" height="15" />
                        <img src="images/gold-star1.jpg" alt="rating star" width="15" height="15" /></p></li>
            </ul>
                   <p></p>
          <p></p> 
          <p></p>
          <p></p>
          <p></p>
          <div class="image_panel"><a href="book-TheGoodDog.jsp"><img src="images/templatemo_image_08.jpg" alt="CSS Template" width="85" height="130" /></a></div>
          <h2><a href="book-TheGoodDog.jsp">The Good Dog</a></h2>
            <ul>
	            <li>By avid DiBenedetto <div class="buy_now_button"><a href="shoppingcart.jsp">Buy Now</a></div></li>
            	<li>January 2015</li>
                <li>Price: $45<div class="detail_button"><a href="book-TheGoodDog.jsp">Detail</a></div></li>
                <li>ISBN: 9780062242358</li>
                <li> <p>
                        Rating: <img src="images/gold-star1.jpg" alt="rating star" width="15" height="15" />
                        <img src="images/gold-star1.jpg" alt="rating star" width="15" height="15" />
                        <img src="images/gold-star1.jpg" alt="rating star" width="15" height="15" />
                        <img src="images/gold-star1.jpg" alt="rating star" width="15" height="15" />
                       </p></li>
            </ul>
                        
                    <p></p>
          <p></p> 
          <p></p>
          <p></p>
          <p></p>
<div class="image_panel"><a href="book-ScandalWedding.jsp"><img src="images/templatemo_image_05.jpg" alt="CSS Template" width="85" height="130" /></a></div>
          <h2><a href="book-ScandalWedding.jsp">The Scandal Behind the Wedding</a></h2>
            <ul>
	            <li>By Frances. Bella <div class="buy_now_button"><a href="shoppingcart.jsp">Buy Now</a></div></li>
            	<li>January 2015</li>
                <li>Price: $65<div class="detail_button"><a href="book-ScandalWedding.jsp">Detail</a></div></li>
                <li>ISBN:  9780263257243</li>
                               <p></p>
                <li> <p>Rating: <img src="images/gold-star1.jpg" alt="rating star" width="15" height="15" />
                        <img src="images/gold-star1.jpg" alt="rating star" width="15" height="15" />
                        <img src="images/gold-star1.jpg" alt="rating star" width="15" height="15" />
                        <img src="images/gold-star1.jpg" alt="rating star" width="15" height="15" />
                        </p></li>
            </ul>
           
            
            
            
           
            

        </div> <!-- end of content right -->
    
    	<div class="cleaner_with_height">&nbsp;</div>
    </div> <!-- end of content -->
    
    <div id="templatemo_footer">
        <p>©2015Raymond Bookstore </p><p>Privacy Policy   Terms of Service</p>
    <p>If you prefer, feel free to call us at 1-855-222-8581</p>
	       	</div> 
    <!-- end of footer -->
<!--  Free CSS Template www.templatemo.com -->
</div> <!-- end of container -->
</html>