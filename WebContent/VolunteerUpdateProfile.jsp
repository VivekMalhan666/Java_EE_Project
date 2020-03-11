<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="VolunteerHeader.jsp"/>
<br/>
<div><img src="images/IMG_20190402_185610.jpg" width="100%" height="730"/></div>
<div class="container" id="wrap" >
	
	  <div class="row">
        <div class="col-md-3 col-md-offset-1">
            <form action="UpdateVolunteerController" method="post" enctype="multipart/form-data" accept-charset="utf-8" class="form" role="form" style="color:white; margin-left:-90%; margin-top:-705px"><h3>Update Your Profile</h3>
              		
                    <div class="row">
                        <div class="col-xs-6 col-md-6">
                            <input type="text" name="name" class="form-control input-lg"  value="${sessionScope.volunteer.name}" /></div>
                       
                    </div>
					<br/>
                    <input type="text" name="email" class="form-control input-lg"  value="${sessionScope.volunteer.emailId}" readonly="readonly"/><br/>
                    <input type="text" name="address" class="form-control input-lg" value="${sessionScope.volunteer.address}" /><br/>
                    
                        <div class="row">
                        <div class="col-xs-6 col-md-6">
                            <input type="text" name="City" class="form-control input-lg"  value="${sessionScope.volunteer.city}" /></div>
						<div class="col-xs-6 col-md-6">
                            <input  type="text" name="State"  class="form-control input-lg"  value="${sessionScope.volunteer.state}" /></div>
						</div> <br/>
					<input type="tel" pattern="[6-9]{1}[0-9]{9}" name="mobileno" class="form-control input-lg"  value="${sessionScope.volunteer.mobileNo}" />
					<br/>
					<input type="text" name="gender"  class="form-control input-lg" value="${sessionScope.volunteer.gender}"  /><br/>
					<input type="text" name="qualification"  class="form-control input-lg" value="${sessionScope.volunteer.qualification}"  /><br/>
					<input type="text" name="jobpost"  class="form-control input-lg" value="${sessionScope.volunteer.jobPost}"  /><br/>
                    <input type="file" name="photo"  class="form-control input-lg" value="${sessionScope.volunteer.photo}"  /><br/>
                    
					<input  class="btn btn-lg btn-primary btn-block signup-btn" type="submit" value="Update">
                        <br/>
					
            </form>          
          </div>
</div>            
</div> 


<br/><br/><br/>
