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
	<h1>List of All Children</h1>
	<c:choose>
		<c:when test="${cList.size() eq 0}">
			No Children Found...
		</c:when>
		<c:otherwise>
			<table class="table table-hover">
				
				<c:forEach items="${cList}" var="childObj">
				<div class="col-md-4 column productbox">
        <img src="images/${childObj.photo}.jpg" style="height:100px;width:100px" class="img-responsive">
        <div class="ChildName"><label>Name:</label>${childObj.childName}</div>
        <div class="age"><label>Age:</label>${childObj.age}</div>
         <div class="gender"><label>Gender:</label>${childObj.gender}</div>
          <div class="education"><label>Education:</label>${childObj.education}</div>
           <div class="bloodgroup"><label>Blood Group:</label>${childObj.bloodGroup}</div>
            <div class="medicalPresc"><label>Medical Prescription:</label>${childObj.medicalPresc}</div>
             <div class="identificationMark"><label>Identification Mark:</label>${childObj.identificationMark}</div>
              <div class="storyBehind"><label>Story Behind:</label>${childObj.storyBehind}</div>
               <div class="sponsored"><label>Sponsored:</label>${childObj.sponsored}</div>
        
         <c:if test="${childObj.sponsored eq 'yes'}">
				 	<a href="getSponsorerDetails?childId=${childObj.childId}">Get Sponsor Details</a>
				 </c:if>
      
        <a href="deleteChild?ChildId=${childObj.childId}" class="btn btn-primary"><i class="fa fa-trash " aria-hidden="true"></i>Delete</a>
		<a href="updateChild?ChildId=${childObj.childId}" class="btn btn-primary"><i class="fa fa-edit"  aria-hidden="true"></i>Update</a>
		
        
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

.childName {
    font-weight:bold;
	padding:5px 0 5px 0;
}

.childAge {
	border-top:1px solid #dadada;
	padding-top:5px;
}

.childGender {
	font-weight:bold;
	font-size:1.4em;
}
 </style>
