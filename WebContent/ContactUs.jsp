
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <title>Orphanage Website</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
 <link rel="stylesheet" href="css//feedback.css"/> 
 

 </head>
 
<body style="background-color:white;">
 <jsp:include page="navbar.jsp"/>
   
   <div class="img1"> 
    <img src="images/imagess.jpg" width=100% height="100px" style="margin-top:10px;margin-left:1px;"/><br>  
</div>	<br>

<div class="img2"> 
    <img src="images/img6.jpg" width=18% height="60px" style="margin-top:4%;margin-left:29px;"/><br>  
</div>	<br>

<div class="img3"> 
    <img src="images/105-1051179.jpg" width=25% height="100px" style="margin-top:-7%;margin-left:19px;"/><br>  
</div>	<br>

<div class="img4"> 
    <img src="images/IMG_20190520_125155.jpg" width=30% height="380px" style="margin-top:20%;margin-left:20px;"/><br>  
</div>	<br>
  
<c:if test="${not empty errorMsg}">
	<div class="alert alert-danger">
		${errorMsg}
	</div>
</c:if> 

<c:if test="${not empty msg}">
	<div class="alert alert-danger">
		${msg}
	</div>
</c:if> 	

   

<div class="container" id="wrap">
 <div class="container" >
    <h4 style="margin-left:-13%; margin-top:-76%;font-weight:italic;color:brown"><font size="6">For any queries: 
	</h4><br><br><br><br><br>
	</div>
<div class="print_icon" style="margin-left:-14%;margin-top:-61% ">
<a href="#" class="btn btn-success btn-lg" style="color:white;">
   <span class="glyphicon glyphicon-phone" style="color:white;width:110px"></span>(+91)9569523240<br/>
   <span class="glyphicon glyphicon-phone" style="color:white;width:110px"></span>(+91)7888834025   
  </a></div>
<br/><br/><br/>
<div class="print_icon" style="margin-top:-110px;margin-left:-27%">
<a href="#" class="btn btn-success btn-lg" style=" margin-left:150px;color:white">
    <span class="glyphicon glyphicon-envelope" style="color:white;;width:60px" ></span>gsilsonepat@gmail.com
     
  </a>
</div><br><br>

	<div class="print_icon" style="margin-top:-70px;margin-left:-25%">
<a href="#" class="btn btn-success btn-lg" style=" margin-left:120px;color:white">
    <span class="glyphicon glyphicon-map-marker" style="color:white;width:30px" ></span>G-SIL-GLOBAL SOCIAL INTEREST LEAGUE <br>
     opp-Central Bank,<br>Atlas Road,Subhash Chowk,<br>Sonepat,Haryana,India.
  </a>
</div></div><br><br>
<div class="container">
	<h1 style="text-align:center;margin-top:-940px;font-family:Algerian"><u>G-SIL-GLOBAL SOCIAL INTEREST LEAGUE</u></h1>
	<p style="text-align:center;font-size:62%">An Orphanage is a residential institution devoted to the care</br> of orphans-children whose biological parents are deceased</br> or otherwise unable or unwilling to take care of them.</br>
The problem of orphan is acute due to urbanization and industrialization.</br>

<strong>The orphanage is also referred to as NGO </br>i.e NON GOVERNMENTAL ORGANIZATION.</strong></br>

The Orphanage provides a platform to the NGOs working for the needy people,</br> as well as the kind hearted people having concern for humanity,</br> trying to help the society by their donations in any form both in cash or kind.</br></br> 
When an NGO needs some fund to rise to help the people</br> from a selected location, all they need is</br> the proper donation. What we provide is a room for</br> an NGO or Orphanage</br> and a donor to shake hands under a roof. </br>
	</p>
	<div class="img5"> 
    <img src="images/IMG_20190520_125403.jpg" width=50% height="380px" style="margin-left:310px;"/><br>  
</div>	<br>
</div>
 <div class="col-md-6" >

  <div class="form" style=" margin-right:-750px; margin-top:-900px; background-color:orange;width:360px ">
    
    <form class="login-form"  action="feedback" method="post" >
	  <label style="text-align:left"><h2>Suggestion/feedback Form:</h2></label>
<label><h4>We value your suggestions. Please select any one of the three options below, describe your query or suggestion and send it to us. We will reply as soon as possible.</h4> </label><br>
	  <label><h4>Your Name</h4></label>
      <input type="text"  name="name" value="" placeholder="User Name" required >
	  <label><h4>Mobile Number</h4></label>
	  <input type="tel" pattern="[6-9]{1}[0-9]{9}" maxlength="10" id="phone" name="mobileno" value="" placeholder="Mobile No" required>
      
	   <label><h4>Email</h4></label><br>
	   <input type="text" name="email" oninvalid="this.setCustomValidity('Email is a must')" value="" placeholder="Email ID" required>
	   
	   <label><h4>Suggestion/Feedback</h4></label>
	  <input type="text" id="feedback" name="feedback" value="" placeholder="Suggestion/feedback"/>
	 
     <button>Submit</button>
    </form>
  </div></div>
	 
<style>
.login-page {
  width: 360px;
  padding: 0% 0 0;
  margin: auto;
}
.form {
  position: relative;
  z-index: 1;
  background: #FFFFFF;
  max-width: 360px;
  margin: 0 auto 50px;
  padding: 30px;
  text-align: 
  box-shadow: 0 0 20px 0 rgba(0, 0, 0, 0.2), 0 5px 5px 0 rgba(0, 0, 0, 0.24);
}
.form1{
  position: relative;
  z-index: 1;
  background: #FFFFFF;
  max-width: 500px;
  margin: 0 auto 50px;
  padding: 30px;
  text-align: 
  box-shadow: 0 0 20px 0 rgba(0, 0, 0, 0.2), 0 5px 5px 0 rgba(0, 0, 0, 0.24);
}

#address        {
                 padding: 20px;   	
}
.form input {
  font-family: "Roboto", sans-serif;
  outline: 0;
  background: #f2f2f2;
  width: 100%;
  border: 0;
  margin: 0 0 15px;
  padding: 8px;
  box-sizing: border-box;
  font-size: 14px;
}
.form button {
  font-family: "Roboto", sans-serif;
  text-transform: uppercase;
  outline: 0;
  background: blue;
  width: 100%;
  border: 0;
  padding: 15px;
  color: #FFFFFF;
  font-size: 14px;
  cursor: pointer;
}
.form button:hover,.form button:active,.form button:focus {
  background: #43A047;
}
.form .message {
  margin: 15px 0 0;
  color: #b3b3b3;
  font-size: 12px;
}
.form .message a {
  color: blue;
  text-decoration: none;
}
body {
 background-image: url("");
 background-repeat: no-repeat;
 background-position: center;
 background-size: cover; 
}


</style>


