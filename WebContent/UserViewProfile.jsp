<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="UserHeader.jsp"/>
<br/>
<!-- Content -->

<div class="container table-responsive">

<c:if test="${not empty msg}">
		<div class="alert alert-success">
			${msg}
		</div>
	</c:if>
	
	
  
  <h1>View Profile Form</h1>     
  <table class="table table-striped">
      <tr>
      	<td>FirstName </td>
      	<td>${sessionScope.user.firstName}</td>
      </tr>
      <tr>
      	<td>LastName </td>
      	<td>${sessionScope.user.lastName}</td>
      </tr>
      <tr>
      	<td>Email </td>
      	<td>${sessionScope.user.emailId}</td>
      </tr>
      <tr>
      	<td>Address </td>
      	<td>${sessionScope.user.address}</td>
      </tr>
       <tr>
      	<td>PinCode </td>
      	<td>${sessionScope.user.pinCode}</td>
      </tr>
       <tr>
      	<td>City </td>
      	<td>${sessionScope.user.city}</td>
      </tr>
       <tr>
      	<td>State </td>
      	<td>${sessionScope.user.state}</td>
      </tr>
       <tr>
      	<td>MobileNo </td>
      	<td>${sessionScope.user.mobileNo}</td>
      </tr>
       <tr>
      	<td>Gender </td>
      	<td>${sessionScope.user.gender}</td>
      </tr>
  </table>
  
  </div>