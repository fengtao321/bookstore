<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Book Store Template, Free CSS Template, CSS Website Layout</title>
<meta name="keywords" content="Book Store Template, Free CSS Template, CSS Website Layout, CSS, HTML" />
<meta name="description" content="Book Store Template, Free CSS Template, Download CSS Website" />
<link href="CSS/templatemo_style_1.css" rel="stylesheet" type="text/css" />
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
            <h2>&nbsp;</h2>
             
            <h1>Mightier Than the Sword <span>(by Archer Jeffrey)</span></h1>
            <div class="image_panel" style="float:left" ><img src="images/templatemo_image_01.jpg" alt="CSS Template" width="130" height="200" /></div>

            <div style="position: relative" style="float:left">
            <ul style="float:left">
                <li><font size="2">Category: History</font></li>
            	<li><font size="2">January 2015</font></li>
                <li><font size="2">Price: 55</font></li>
                <li><font size="2">ISBN: 9781250034519</font></li>
                <li>&nbsp;<li>
                <li> <p>
                        Rating: <img src="images/gold-star1.jpg" alt="rating star" width="15" height="15" />
                        <img src="images/gold-star1.jpg" alt="rating star" width="15" height="15" />
                        <img src="images/gold-star1.jpg" alt="rating star" width="15" height="15" />
                        <img src="images/gold-star1.jpg" alt="rating star" width="15" height="15" />
                        <img src="images/gold-star1.jpg" alt="rating star" width="15" height="15" /></p></li>
                <li> 
                    <p>
                        Quantity:
                        <input type="submit" value=" - " name="minushs3" style="background-color: transparent; color: #cbc750" > 
                        <input type="text" name="Mightier Than the Sword" value="1" size="2" style="text-align: center; background-color: transparent; color: #cbc750 " >
                            <input type="submit" value="+" name="addhs3" style="background-color: transparent; color: #cbc750"/>
                    <div class="buy_now_button" style="float: left"><a href="book-BestFriend.jsp">Buy Now</a></div></li>
            </ul>
               </div>
            <p></p>
            <p>&nbsp;</p>
            <p>&nbsp;</p>
            <p>&nbsp;</p>
            <p>&nbsp;</p>
            <p>&nbsp;</p>
            <p>&nbsp;</p>
            <p>&nbsp;</p>
            <p>&nbsp;</p>
            <p>&nbsp;</p>
            <p>&nbsp;</p>
            
            <p style="background-color: #0f0403">Mightier than the Sword opens with an IRA bomb exploding during the MV Buckingham's maiden voyage across the Atlantic - but how many passengers lose their lives? When Harry Clifton visits his publisher in New York, he learns that he has been elected as the new president of English PEN, and immediately launches a campaign for the release of a fellow author, Anatoly Babakov, who's imprisoned in Siberia. Babakov's crime? Writing a book called Uncle Joe , a devastating insight into what it was like to work for Stalin. So determined is Harry to see Babakov released and the book published, that he puts his own life in danger. His wife Emma, chairman of Barrington Shipping, is facing the repercussions of the IRA attack on the Buckingham . Some board members feel she should resign, and Lady Virginia Fenwick will stop at nothing to cause Emma's downfall. Sir Giles Barrington is now a minister of the Crown, and looks set for even higher office, until an official trip to Berlin does not end as a diplomatic success. Once again, Giles's political career is thrown off balance by none other than his old adversary, Major Alex Fisher, who once again stands against him at the election. But who wins this time? In London, Harry and Emma's son, Sebastian, is quickly making a name for himself at Farthing's Bank in London, and has proposed to the beautiful young American, Samantha. But the despicable Adrian Sloane, a man interested only in his own advancement and the ruin of Sebastian, will stop at nothing to remove his rival. Jeffrey Archer's compelling Clifton Chronicles continue in this, his most accomplished novel to date. With all the trademark twists and turns that have made him one of the world's most popular authors, 
                the spellbinding story of the Clifton and the Barrington families continues.
            </p>
             <div class="cleaner_with_height">&nbsp;</div>
             <h1><font size="3">A suggestion of related books:</font></h1>
            <div class="image_panel2">
                <a href="book-DatingEnemy.jsp"><img src="images/templatemo_image_03.jpg" alt="The Scandal Behind the Wedding" width="100" height="120" /></a>
                           </div>
             <div class="image_panel2">
             <a href="book-ConvenientBride.jsp"><img src="images/templatemo_image_02.jpg" alt="CSS Template" width="100" height="120" /></a>
             </div>
             <div class="image_panel2">
        <a href="book-TamingTycoon.jsp"><img src="images/templatemo_image_04.jpg" alt="CSS Template" width="100" height="120" /></a></div>
             <p></p>
            <div class="image_panel2">
                <a href="book-DatingEnemy.jsp">Dating the Enemy</a>
                </div>
            <div class="image_panel2">
                <a href="book-ConvenientBride.jsp">His Very Convenient Bride </a><p>
                </div>  
             <div class="image_panel2">
                <a href="book-TamingTycoon.jsp">Taming the French Tycoon </a>
                </div> 

    
    	<div class="cleaner_with_height">&nbsp;</div>
    </div> <!-- end of content -->
    
    <div id="templatemo_footer">
        <p>�2015Raymond Bookstore </p><p>Privacy Policy   Terms of Service</p>
    <p>If you prefer, feel free to call us at 1-855-222-8581</p>
	       	</div> 
    <!-- end of footer -->
<!--  Free CSS Template www.templatemo.com -->
</div> <!-- end of container -->
</html>