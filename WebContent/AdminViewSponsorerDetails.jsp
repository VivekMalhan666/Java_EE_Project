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
	<h1>Details of Sponsor</h1>
	<c:choose>
		<c:when test="${cList.size() eq 0}">
			No Sponsor Found...
		</c:when>
		<c:otherwise>
			<table class="table table-hover">
				
				<div class="col-md-4 column productbox">
	     <div class="firstname"><label>First Name :</label>${user.firstName}</div>
         <div class="lastname"><label>Last Name :</label>${user.lastName}</div>
          <div class="email"><label>Email :</label>${user.emailId}</div>
        <div class="address"><label>Address :</label>${user.address}</div>
         <div class="mobileno"><label>Mobile No :</label>${user.mobileNo}</div>
            <div class="gender"><label>Gender :</label>${user.gender}</div>
            
            </div>
					
				
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

.firstName {
    font-weight:bold;
	padding:5px 0 5px 0;
}

.lastName {
	border-top:1px solid #dadada;
	padding-top:5px;
}

.emailId {
	font-weight:bold;
	font-size:1.4em;
}
 </style>
