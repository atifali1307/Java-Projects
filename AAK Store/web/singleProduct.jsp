
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>All Products - AAK Store</title>
        <link rel="stylesheet" href="css/Frontstyle.css" type="text/css">
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@200;300;400;500;600;700&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/@fortawesome/fontawesome-free@5.15.3/css/fontawesome.min.css">
    </head>
    <body>
        
        <div class="container">
        <div class="navbar">
            <div class="logo">
                <img src="Images/MyLogo.jpg" width="60px" style="border-radius: 50%;">
            </div>
            <nav>
                <ul>
                    <li><a href="index.jsp">Home</a></li>
                    <li><a href="ProductDetails.jsp">Products</a></li>
                    <li><a href="aboutus.jsp">About</a></li>
                    <li><a href="contactus.jsp">Contact</a></li>
                    <li><a href="login.jsp">Account</a></li>
                </ul>
            </nav>
            <img src="Images/cart.png" width="30px" height="30px">
        </div>
                        
        </div>
        
        <!-----Single Product Details----->
        
        <div class="small-container single-product" style="margin-top: 20px;">
            <div class="row">
                <div class="col-2" style="padding: 20px;">
                    <img src="Images/gallery-1.jpg" width="100%" id="ProductImg" style="padding: 0px;">
                    
                    <div class="small-img-row" style="display: flex;justify-content: space-between;">
                        <div class="small-img-col" style="flex-basis: 24%; cursor: pointer;">
                            <img src="Images/gallery-1.jpg" width="100%" id="smallimg">
                        </div>
                        <div class="small-img-col" style="flex-basis: 24%; cursor: pointer;">
                            <img src="Images/gallery-2.jpg" width="100%" id="smallimg">
                        </div>
                        <div class="small-img-col" style="flex-basis: 24%; cursor: pointer;">
                            <img src="Images/gallery-3.jpg" width="100%" id="smallimg">
                        </div>
                        <div class="small-img-col" style="flex-basis: 24%; cursor: pointer;">
                            <img src="Images/gallery-4.jpg" width="100%" id="smallimg">
                        </div>
                    </div>
                    
                </div>
                <div class="col-2">
                    <p>Home / T-Shirt</p>
                    <h1>Red Printed T-Shirt by HRX</h1>
                    <h4 style="margin: 20px 0; font-size: 22px; font-weight: bold;">349.00</h4>
                    <select style="display: block; padding: 10px; margin-top: 20px;">
                        <option>Select Size</option>
                        <option>XXL</option>
                        <option>XL</option>
                        <option>Large</option>
                        <option>Medium</option>
                        <option>Small</option>
                    </select>
                    <input type="number" value="1" style="width: 50px; height: 40px; padding-left: 10px; font-size: 20px; margin-right: 10px; border: 1px solid #ff523b;">
                    <a href="login.jsp" class="btn">Add To Cart</a>
                </div>
            </div>
        </div>
        
        <div class="small-container">
            <div class="row row-2">
                <h2>Related Products</h2>
                <p>View More</p>
            </div>
        </div>
        
        <div class="small-container">                       
            <div class="row">
                <div class="col-4">
                    <img src="Images/product-9.jpg">
                    <h4>Red Printed T-Shirt</h4>
                    <div class="rating">
                        <i class="fa fa-star" aria-hidden="true"></i>
                        <i class="fa fa-star"></i>
                        <i class="fa fa-star"></i>
                        <i class="fa fa-star"></i>
                        <i class="fa fa-star-o"></i>
                    </div>
                    <p>Rs 349.00</p>
                </div>
                <div class="col-4">
                    <img src="Images/product-2.jpg">
                    <h4>Sports Black Shoes</h4>
                    <div class="rating">
                        <i class="fa fa-star" aria-hidden="true"></i>
                        <i class="fa fa-star"></i>
                        <i class="fa fa-star"></i>
                        <i class="fa fa-star-half-o"></i>
                        <i class="fa fa-star-o"></i>
                    </div>
                    <p>Rs 499.00</p>
                </div>
                <div class="col-4">
                    <img src="Images/product-3.jpg">
                    <h4>Grey Trouser</h4>
                    <div class="rating">
                        <i class="fa fa-star" aria-hidden="true"></i>
                        <i class="fa fa-star"></i>
                        <i class="fa fa-star"></i>
                        <i class="fa fa-star"></i>
                        <i class="fa fa-star-half-o"></i>
                    </div>
                    <p>Rs 459.00</p>
                </div>
                <div class="col-4">
                    <img src="Images/product-4.jpg">
                    <h4>Puma Plain T-Shirt</h4>
                    <div class="rating">
                        <i class="fa fa-star" aria-hidden="true"></i>
                        <i class="fa fa-star"></i>
                        <i class="fa fa-star"></i>
                        <i class="fa fa-star"></i>
                        <i class="fa fa-star-o"></i>
                    </div>
                    <p>Rs 399.00</p>
                </div>
            </div>
            
            
            
        </div>
        
        
        <!-----footer----->
        
        <div class="footer">
            <div class="container">
                <div class="row">
                    <div class="footer-col-1">
                        <h3>Download Our App</h3>
                        <p>Download App for Android and ios mobile phone.</p>
                        <div class="app-logo">
                            <img src="Images/play-store.png">
                            <img src="Images/app-store.png">
                        </div>
                    </div>
                    <div class="footer-col-2">
                        <img src="Images/FooterLogo.jpg" style="width: 100px;height: 100px;">
                        <p>Our Purpose Is to Substantially Make the Pleasure and Benefits of Sports Accessible to the Many.</p>
                    </div>
                    <div class="footer-col-3">
                        <h3>Useful Links</h3>
                        <ul>
                            <li>Coupons</li>
                            <li>Blog Post</li>
                            <li>Return Polcy</li>
                            <li>Join Affiliates</li>
                        </ul>
                    </div>
                    <div class="footer-col-4">
                        <h3>Follow us</h3>
                        <ul>
                            <li>Facebook</li>
                            <li>Twitter</li>
                            <li>Instagram</li>
                            <li>YouTube</li>
                        </ul>
                    </div>
                </div>
                <hr>
                <p class="copyright">Copyright 2021 - AAK Store</p>
            </div>
            
        </div>
        
        
        <script src="JS/bootstrap.js" type="text/javascript"></script>
        <script src="JS/jquery.js" type="text/javascript"></script>
        <script type="text/javascript">
              
            var ProductImg = document.getElementById("ProductImg");
       
            var SmallImg = document.getElementById("smallimg");
            SmallImg[0].onclick = function(){
                 
                ProductImg.src = SmallImg[0].src;
            }
             SmallImg[1].onclick = function(){
                 console.log(2);
                ProductImg.src = SmallImg[1].src;
            }
             SmallImg[2].onclick = function(){
                ProductImg.src = SmallImg[2].src;
            }
             SmallImg[3].onclick = function(){
                ProductImg.src = SmallImg[3].src;
            }
        </script>
    </body>
</html>
