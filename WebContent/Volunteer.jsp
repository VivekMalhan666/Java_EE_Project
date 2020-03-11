<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="navbar.jsp"/>


<div><img src="images/IMG-20190302-WA0055.jpg" width="100%" height="800"/></div>


	<div class="container" id="wrap" >
	
	  <div class="row">
        <div class="col-md-3 col-md-offset-1">
            <form action="VolunteerRegisterController" method="post" enctype="multipart/form-data" accept-charset="utf-8" class="form" role="form" style="color:black;margin-left:-90%; margin-top:-800px"><h3>SignUp form</h3>
              		
                    <div class="row">
                        <div class="col-xs-12 col-md-12">
                            <input type="text" name="name" value="" class="form-control input-lg" placeholder="Name"required  /></div>
                       
                    </div>
					<br/>
                    <input type="text" name="email" value="" class="form-control input-lg" placeholder="Your Email" required /><br/>
                     <input type="password" name="password" value="" class="form-control input-lg" placeholder="Password" required /><br/>
					<input type="text" name="address" value="" class="form-control input-lg" placeholder=" Enter your Address"required  /><br/>
                    
                     
					<div class="row">
                        <div class="col-xs-6 col-md-6">
                            <input type="text" name="City" value="" class="form-control input-lg" placeholder="City"  /></div>
						<div class="col-xs-6 col-md-6">
                            <input  type="text" name="State" value="" class="form-control input-lg" placeholder="State"  /></div>
						</div> <br/>
					<input type="tel" pattern="[6-9]{1}[0-9]{9}" maxlength="10" name="mobileno" value="" class="form-control input-lg" placeholder="Enter your Mobile no."required  />
					<br/>
					
					 <label  style="color:white">Gender : </label>                   
					 <label style="color:white" class="radio-inline">
                        <input  type="radio" name="gender" value="M" id=male /> Male
                    </label>
                    <label style="color:white" class="radio-inline">
                        <input  type="radio" name="gender" value="F" id=female /> Female
                        </label>
                    <label style="color:white" class="radio-inline">
                        <input  type="radio" name="gender" value="O" id=others /> others
                    </label>
                    <br/>
                    
               <label  style="color:white">Qualification : </label>                   
					 <label style="color:white" class="radio-inline">
                        <input  type="radio" name="qualification" value="Graduate" id=graduate />Graduate
                    </label>
                    <label style="color:white" class="radio-inline">
                        <input  type="radio" name="qualification" value="PostGraduate" id=postgraduate />PostGraduate
                        </label>
                    <br/>
                    <div class="row">
                        <div class="col-xs-12 col-md-12">
                            <input type="text" name="jobpost" value="" class="form-control input-lg" placeholder="Job Post"  /></div><br/>
                    </div><br/>
                    <input type="file" name="photo" value="" class="form-control input-lg" placeholder="Image"  /><br/>
					<input  class="btn btn-lg btn-primary btn-block signup-btn" type="submit" value="Sign Up">
                        <br/>
					<a href="Login.jsp" class="btn btn-lg btn-primary btn-block signup-btn" type="submit">
                        Already Registered Member?/Login Now</a>	
            </form>          
          </div>
</div>            
</div>
<br/><br/><br/>
<jsp:include page="Footer.jsp"/>	
