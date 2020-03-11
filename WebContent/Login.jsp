<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="navbar.jsp"/>


<div><img src="images/IMG_20190303_000154.jpg" width="100%" height="670"/></div>
<div class="container" id="wrap">
<%--
 <%
	Object msg=request.getAttribute("errorMsg");
   if(msg!=null){
	   %>
	   		<div class="alert alert-danger">
	   			Email or Password is incorrect...
	   		<div/>
<%
 } 
 %>	
  --%>

<c:if test="${not empty errorMsg}">
	<div class="alert alert-danger" style="Color:Red">
		${errorMsg}
	</div>
</c:if>  	
  <div class="row" style="margin-left:630px">
		
        <div class="col-md-3">
            <form action="login" method="post" accept-charset="utf-8" class="form" role="form" style="color:white; margin-top:50px; margin-top:-560px;margin-right:-220px"><h3>Login form</h3>
                  
			     <input type="text" name="email" value="" class="form-control input-lg" placeholder="Your Email" required /><br/>
			     <input type="password" name="pwd" value="" class="form-control input-lg" placeholder="Password" required /><br/>
			     
			    <br/>
				
				<input type="submit" class="btn btn-lg btn-primary btn-block" value="Login"/>
                    
					<!-- <a href="AdminHome.jsp" class="btn btn-lg btn-primary btn-block signup-btn" type="submit">
                        Login</a>-->
                        
                        <br/>
					<a href="User.jsp" class="btn btn-lg btn-primary btn-block signup-btn" type="submit">
                        Not a Member? Register Now</a> 	
            </form>          
		</div>
    </div>
</div>