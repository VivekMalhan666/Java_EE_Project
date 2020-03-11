
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="UserHeader.jsp"/>
<br/>
<div><img src="images/IMG_20190402_185717.jpg" width="100%" height="660"/></div>
<div class="container" id="wrap" >
	
	  <div class="row">
        <div class="col-md-3 col-md-offset-1">
            <form action="UpdateUserController" method="post" accept-charset="utf-8" class="form" role="form" style="color:white; margin-left:-90%; margin-top:-667px"><h3>Update Your Profile</h3>
              		
                    <div class="row">
                        <div class="col-xs-6 col-md-6">
                            <input type="text" name="firstname" class="form-control input-lg"  value="${sessionScope.user.firstName}" /></div>
                        <div class="col-xs-6 col-md-6">
                             <input type="text" name="lastname"  class="form-control input-lg"  value="${sessionScope.user.lastName}" /></div>
                    </div>
					<br/>
                    <input type="text" name="email" class="form-control input-lg"  value="${sessionScope.user.emailId}" readonly="readonly"/><br/>
                    <input type="text" name="address" class="form-control input-lg" value="${sessionScope.user.address}" /><br/>
                    
                        <div class="row">
                        <div class="col-xs-6 col-md-6">
                              <input type="number" pattern="[0-9]{1}[0-9]{6}" name="PinCode" class="form-control input-lg"  value="${sessionScope.user.pinCode}" /></div>
                      <div class="col-xs-6 col-md-6">
                            <input type="text" name="City" class="form-control input-lg"  value="${sessionScope.user.city}" /></div>
						<div class="col-xs-6 col-md-6"><br/>
                            <input  type="text" name="State"  class="form-control input-lg"  value="${sessionScope.user.state}" /></div>
						</div> <br/>
					<input type="tel" pattern="[6-9]{1}[0-9]{9}" name="mobileno" class="form-control input-lg"  value="${sessionScope.user.mobileNo}" />
					<br/>
					<input type="text" name="gender"  class="form-control input-lg" value="${sessionScope.user.gender}"  /><br/>
					
              
                    
					<input  class="btn btn-lg btn-primary btn-block signup-btn" type="submit" value="Update">
                        <br/>
					
            </form>          
          </div>
</div>            
</div> 


<br/><br/><br/>
<jsp:include page="Footer.jsp"/>	
