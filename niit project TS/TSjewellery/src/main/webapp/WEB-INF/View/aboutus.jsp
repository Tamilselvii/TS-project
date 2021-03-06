<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel = "stylesheet"
   type = "text/css"
   href = "abooutus.css" />
   <link rel = "stylesheet"
   type = "text/css"
   href = "aboutus.js" />
</head>
<body>
<script>
    function init() {
        window.addEventListener('scroll', function(e){
            var distanceY = window.pageYOffset || document.documentElement.scrollTop,
                shrinkOn = 300,
                header = document.querySelector("header");
            if (distanceY > shrinkOn) {
                classie.add(header,"smaller");
            } else {
                if (classie.has(header,"smaller")) {
                    classie.remove(header,"smaller");
                }
            }
        });
    }
    window.onload = init();
</script>
</head>



<body>

<div id="wrapper">

<header>
    <div class="container clearfix">
        <h1 id="logo">
            TSJewellery
        </h1>
        <nav>
            <li><a href="#home.jsp">Home</a></li>
              <li><a href="#login.jsp">Login</a></li>
              <li><a href="#registration.jsp">Registration</a></li>
              <li><a href="#product.jsp.jsp">Product</a></li>
              <li><a href="#aboutus.jsp">About us</a></li>
              <li><a href="#contactus.jsp">Contact us</a></li>
        </nav>
    </div>
</header><!-- /header -->

<div id="main">
    <div id="content">
        <section>
            <div class="container">
                <h1>About the Product TSJewellery group</h1>
        <p>My TSJewellery Mini Stores stock an exclusive collection of the fines affordable diamond jewellery. The craftsmanship that goes into the painstaking process of design until the perfect finish of each piece of jewellery is what makes us stand out from other jewellers. We have a wide array of traditional and modern designs of diamond jewellery within the range of Rs. 5000 to Rs. 15000. All diamonds in these products are IGI certified and all the gold used in these products is BIS certified. This assures you of the quality and guarantees buyback as well. </p>       
                
            </div>
        </section>
       
       
    </div>
</div><!-- #main -->

<div id="main">
    <div id="content">
        <section>
            <div class="container">
                <h1>History and Features</h1>
                <p>The group derives its origins from textile retailing and wholesaling and has experience of over 100 years in the trade. TSJewellery branched out into the field of jewellery retailing in the year 1993 by opening its first store in Thrissur.

The reason behind the TSJewellery group's foray into business itself is quite unique and makes it interesting to read. The ancestors of the current management come from a pious background that comprised of priests, saints and advisor to kings. Hailing from the Tanjavur district of Tamilnadu, these ancestors had migrated to Kerala.

The decision to start business was taken in response to the call of one of the senior relatives of the clan, who was a Dewan to the Maharaja of Kochi, who believed 'Enterprise and business was necessary to create job opportunities and to make India self dependent'. He also belived that 'business should be fair with a social objective and not just for self motives'. The group still adheres to the founding principles of its forefathers and this explains the group's firm grounding in fair business practices and ethics.
                </p>

                
            </div>
        </section>
       
       
    </div>
</div><!-- #main -->

  </body>
</html>