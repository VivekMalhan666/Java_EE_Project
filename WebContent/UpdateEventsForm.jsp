<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="AdminHeader.jsp"/>
<br/>

<div><img src="images/IMG_20190402_190336.jpg" width="100%" height="860"/></div>
<!-- Content -->
<div class="container" id="wrap" >
	
	  <div class="row">
          <div class="col-md-3 col-md-offset-1">
            <form action="updateEventProcess" method="post" enctype="multipart/form-data" accept-charset="utf-8" class="form" role="form" style="color:white;margin-left:-70%; margin-top:-870px"><h3>Update Details Of An Event</h3>
          <br/>
          <div class="col-xs-8 col-md-8"> 
          
              <input type="number" name="eventid" class="form-control input-lg"  value="${requestScope.eventObj.eventId}" readonly="readonly" /> <br/>
              <input type="text" name="eventname" class="form-control input-lg"  value="${requestScope.eventObj.eventName}"  /> <br/>
              <input type="text" name="place"  class="form-control input-lg"  value="${requestScope.eventObj.place}"  /><br/>
		      <input type="datetime-local" name="datetime"  class="form-control input-lg" value="${requestScope.eventObj.dateTime}"   /><br/>
              <input type="text" name="duration"  class="form-control input-lg" value="${requestScope.eventObj.duration}" /><br/>
	          <input type="text" name="chiefguestname"  class="form-control input-lg" value="${requestScope.eventObj.chiefGuestName}"  /><br/>
		      <input type="text" name="chiefguestprofession"  class="form-control input-lg" value="${requestScope.eventObj.chiefGuestProfession}"  /><br/>
		      <input type="text" name="eventdesc" class="form-control input-lg" value="${requestScope.eventObj.eventDesc}" /><br/>
		      <input type="file" name="photo"  class="form-control input-lg" value="${requestScope.eventObj.photo}"  /><br/>
		      <input  class="btn btn-lg btn-primary btn-block signup-btn" type="submit" value="Update Event"><br/>
         </div> 
           </form>
        
        </div>
</div></div>

<br/><br/><br/>

          