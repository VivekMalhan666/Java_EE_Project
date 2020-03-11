<jsp:include page="UserHeader.jsp"/>

<div><img src="images/IMG_20190303_000011.jpg" width="100%" height="670"/></div>

<div class="container" id="wrap">
 <div class="row">
		
        <div class="col-md-3">
            <form action="changePassword" method="post" accept-charset="utf-8" class="form" role="form" style="color:white; margin-top:50px; margin-top:-560px"><h3>Change Password Form</h3>
                  
			     
			     <input type="password" name="newpwd" value="" class="form-control input-lg" placeholder="New Password" required /><br/>
			     <input type="password" name="confirmpwd" value="" class="form-control input-lg" placeholder=" Confirm Password" required /><br/>
			     
			    <br/>
				
				<input type="submit" class="btn btn-lg btn-primary btn-block" value="Change Password"/>
				
				    </form>          
		</div>
    </div>
</div>
                    