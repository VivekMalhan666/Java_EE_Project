<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="AdminHeader.jsp"/>

<br/>
<!-- Content -->
<div class="container">

	<c:if test="${not empty msg}">
		<div class="alert alert-success">
			${msg}
		</div>
	</c:if>
	<h1>List of All Rejected Volunteer</h1>
	<c:choose>
		<c:when test="${cList.size() eq 0}">
			No Volunteer Found...
		</c:when>
		<c:otherwise>
			<table class="table table-hover">
				
				<c:forEach items="${vList}" var="volunteerObj">
				<div class="col-md-4 column productbox">
				 <img src="images/${volunteerObj.photo}.jpg" style="height:100px;width:100px" class="img-responsive">
        <div class="name"><label>Name :</label>${volunteerObj.name}</div>
        <div class="address"><label>Address :</label>${volunteerObj.address}</div>
         <div class="City"><label>City :</label>${volunteerObj.city}</div>
          <div class="state"><label>State :</label>${volunteerObj.state}</div>
           <div class="mobileno"><label>Mobile No :</label>${volunteerObj.mobileNo}</div>
            <div class="gender"><label>Gender :</label>${volunteerObj.gender}</div>
             <div class="qualification"><label>Qualification :</label>${volunteerObj.qualification}</div>
              <div class="jobpost"><label>Job Post :</label>${volunteerObj.jobPost}</div>
               
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

.volunteerName {
    font-weight:bold;
	padding:5px 0 5px 0;
}

.volunteerAddress {
	border-top:1px solid #dadada;
	padding-top:5px;
}

.volunteerCity {
	font-weight:bold;
	font-size:1.4em;
}
 </style>
