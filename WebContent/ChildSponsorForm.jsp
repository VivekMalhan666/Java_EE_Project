<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="UserHeader.jsp"/>
 
 
 <div><img src="images/IMG_20190404_152234.jpg" width="100%" height="1080"/></div>   
<div class="container" id="wrap">
	  <div class="row">
        <div class="col-md-3 col-md-offset-1">
            <form action="UserSponsorController" method="post"  accept-charset="utf-8" class="form" role="form" style="color:black; margin-left:-50%; margin-right:-10%; margin-top:-1060px"><h3>FillUp Child Sponsor form</h3>
		   <h3>Child Details</h3>
			<input type="text" name="ChildId" class="form-control input-lg" placeholder="Enter Child id" value="${sessionScope.childObj.childId}" readonly />
			 <h3>Sponsor Type</h3>
		    
		    <select class="form-control" name="sponsortype">
		    <option value="0">--Select Sponsor Type--></option>
		    <option value="1">1 Year</option>
		    <option value="2">2 Year</option>
		    <option value="3">3 Year</option>
		    <option value="4">5 Year</option>
		    </select>
		    <h3 >Personal Information  </h3>
		     <input type="text" name="Useremail" class="form-control input-lg" placeholder="Enter your Email" value="${sessionScope.user.emailId}" readonly />
		     <h3>Cheque/Demand Draft  </h3>
		    <input type="number" name="amount" value="" class="form-control input-lg" placeholder="Enter the Amount"  /><br/>
            <input type="number" pattern="[1-9]{1}[0-9]{5}" maxlength="6" name="cheque" value="" class="form-control input-lg" placeholder="Enter the Cheque/DD No."  /><br/>
		    <input type="text" name="bankname" value="" class="form-control input-lg" placeholder="Enter the Bank Name"  /><br/>
			<input type="text" name="branchname" value="" class="form-control input-lg" placeholder="Enter the Branch Name"  /><br/>
			    
		    <input class="btn btn-lg btn-primary btn-block submit-btn" type="submit"/><br/>
							</form>
				 </div>
                 </div></div>
      