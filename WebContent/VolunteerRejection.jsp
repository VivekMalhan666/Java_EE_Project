<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="AdminHeader.jsp"/>
<br/>
<div><img src="images/IMG_20190302_235912.jpg" width="100%" height="800"/></div>
<!-- Content -->
<div class="container" id="wrap" >
	
	  <div class="row">
          <div class="col-md-3 col-md-offset-1">
            <form action="RejectedVolunteerController" method="get"  accept-charset="utf-8" class="form" role="form" style="color:white;margin-left:-90%; margin-top:-800px"><h3>Job Rejection Form</h3>
          <br/>
          <div class="col-xs-8 col-md-8">
               <input type="text" name="emailid"  class="form-control input-lg" placeholder="Email Id " value="${param.vemail}" /> <br/>
              <input type="text" name="reason" value="" class="form-control input-lg" placeholder="Enter Reason for Job Rejection" required /><br/>
               <input  class="btn btn-lg btn-primary btn-block signup-btn" type="submit" value="Reject"><br/>
       </div> </form>
        
        </div>
</div></div>

<br/><br/><br/>
              