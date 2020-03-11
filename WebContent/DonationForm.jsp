<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="UserHeader.jsp"/>
 
 
 <div><img src="images/IMG_20190303_102025.jpg" width="100%" height="840"/></div>   
<div class="container" id="wrap">
	  <div class="row">
        <div class="col-md-3 col-md-offset-1">
            <form action="UserDonateController" method="post"  accept-charset="utf-8" class="form" role="form" style="color:black; margin-left:-80%; margin-right:50%; margin-top:-830px"><h3>FillUp Money Donation form</h3>
			
			<h3>Child Details</h3>
			<input type="text" name="ChildId"  class="form-control input-lg" placeholder="Enter Child Id" value="${sessionScope.childObj.childId}" />
			
			
		    <h3 >Personal Information  </h3>
		    <input type="text" name="Useremail" class="form-control input-lg" placeholder="Enter your Email" value="${sessionScope.user.emailId}" />
		    <h3>Amount For Donation</h3>
			<input type="number" name="amount" value="" class="form-control input-lg" placeholder="Enter the Amount"  />
			<h3>Cheque/Demand Draft  </h3>
			<input type="number" name="cheque" pattern="[1-9]{1}[0-9]{5}" maxlength="10" value="" class="form-control input-lg" placeholder="Enter the Cheque/DD No."  /><br/>
			<input type="text" name="bankname" value="" class="form-control input-lg" placeholder="Enter the Bank Name"  /><br/>
			<input type="text" name="branchname" value="" class="form-control input-lg" placeholder="Enter the Branch Name"  /><br/>
		    
			   
		     <input class="btn btn-lg btn-primary btn-block submit-btn" type="submit"/><br/>
			</form></div>
				
           
			
			
                 </div></div>
      