<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:if test="${sessionScope.role eq 'admin'}">
<jsp:include page="AdminHeader.jsp"/>
</c:if>

<c:if test="${sessionScope.role eq 'Guest'}">
<jsp:include page="navbar.jsp"/>
</c:if>

<br/>
<!-- Content -->
<div class="container">

	<c:if test="${not empty msg}">
		<div class="alert alert-success">
			${msg}
		</div>
	</c:if>
	<h1>List of All Events</h1>
	<c:choose>
		<c:when test="${cList.size() eq 0}">
			No Event Found...
		</c:when>
		<c:otherwise>
			<table class="table table-hover">
				
				<c:forEach items="${eList}" var="eventObj">
				<div class="col-md-4 column productbox">
        <img src="images/${eventObj.photo}.jpg" style="height:200px;width:200px" class="img-responsive">
        <div class="eventname"><label>Event Name:</label>${eventObj.eventName}</div>
        <div class="chiefguestname"><label>ChiefGuest Name:</label>${eventObj.chiefGuestName}</div>
        <div class="chiefguestprofession"><label>ChiefGuest Profession:</label>${eventObj.chiefGuestProfession}</div>
        <div class="place"><label>Place:</label>${eventObj.place}</div>
         <div class="datetime"><label>Date and Time:</label>${eventObj.dateTime}</div>
           <div class="duration"><label>Duration:</label>${eventObj.duration}</div>
             <div class="eventdesc"><label>Event Description:</label>${eventObj.eventDesc}</div>
       
      
             <c:if test="${sessionScope.role eq 'admin'}">
              <a href="updateEvent?eventid=${eventObj.eventId}" class="btn btn-primary"><i class="fa fa-edit"  aria-hidden="true"></i>Update</a>
		     </c:if>
        
        </div>
        
        
        
					
				</c:forEach>
			</table>
		</c:otherwise>
	</c:choose>
 </div>
 
<br/><br/><br/>
 <style>
 	.productbox {
    background-color:#ffffff;
	padding:10px;
	margin-bottom:10px;
	-webkit-box-shadow: 0 8px 6px -6px  #999;
	   -moz-box-shadow: 0 8px 6px -6px  #999;
	        box-shadow: 0 8px 6px -6px #999;
}

.eventName {
    font-weight:bold;
	padding:5px 0 5px 0;
}

.eventPlace {
	border-top:1px solid #dadada;
	padding-top:5px;
}

.eventDate {
	font-weight:bold;
	font-size:1.4em;
}
 </style>
