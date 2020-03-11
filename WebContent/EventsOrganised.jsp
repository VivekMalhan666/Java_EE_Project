<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="AdminHeader.jsp"/>
<br/>
<div><img src="images/Gifting_donations.jpg" width="100%" height="800"/></div>
<!-- Content -->
<div class="container" id="wrap" >
	
	  <div class="row">
          <div class="col-md-3 col-md-offset-1">
            <form action="eventOrganise" method="post" enctype="multipart/form-data"  accept-charset="utf-8" class="form" role="form" style="color:black;margin-left:-90%; margin-top:-800px"><h3>Add Details Of An Event</h3>
          <br/>
          <div class="col-xs-8 col-md-8">
               <input type="text" name="eventname" value="" class="form-control input-lg" placeholder="Enter Event Name "required  /> <br/>
              <input type="text" name="place" value="" class="form-control input-lg" placeholder="Place" required /><br/>
		      <input type="datetime-local" name="datetime" value="" class="form-control input-lg" placeholder="Time of Event"required  /><br/>
	          <input type="text" name="duration" value="" class="form-control input-lg" placeholder="Duration"required  /><br/>
		      <input type="text" name="chiefguestname" value="" class="form-control input-lg" placeholder="Name of ChiefGuest"  /><br/>
		      <input type="text" name="chiefguestprofession" value="" class="form-control input-lg" placeholder="Profession of ChiefGuest"  /><br/>
		      <input type="text" name="eventdesc" value="" class="form-control input-lg" placeholder="Event Description"  /><br/>
		      <input type="file" name="photo" value="" class="form-control input-lg" placeholder="Image"  /><br/>
		     
		      <input  class="btn btn-lg btn-primary btn-block signup-btn" type="submit" value="Add event"><br/>
       </div> </form>
        
        </div>
</div></div>

<br/><br/><br/>

