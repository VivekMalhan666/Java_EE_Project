
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>



<c:if test="${sessionScope.role eq 'user'}">
<jsp:include page="UserHeader.jsp"/>
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
        <div class="ChildName"><label>Name :</label>${childObj.childName}</div>
        <div class="age"><label>Age :</label>${childObj.age}</div>
         <div class="gender"><label>Gender :</label>${childObj.gender}</div>
          <div class="education"><label>Education :</label>${childObj.education}</div>
           <div class="bloodgroup"><label>Blood Group :</label>${childObj.bloodGroup}</div>
            <div class="medicalPresc"><label>Medical Prescription :</label>${childObj.medicalPresc}</div>
             <div class="identificationMark"><label>Identification Mark :</label>${childObj.identificationMark}</div>
              <div class="storyBehind"><label>Story Behind :</label>${childObj.storyBehind}</div>
               <div class="sponsored"><label>Sponsored :</label>${childObj.sponsored}</div>
				 
				 
				 
				 
				 <a href="Sponsor?ChildId=${childObj.childId}" class="btn btn-primary"><span class="glyphicon glyphicon-user"></span>  sponsor</a>
				  
				  <a href="Donate?ChildId=${childObj.childId}" class="btn btn-primary"><span class="glyphicon glyphicon-heart"></span>  Donate</a>					
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
