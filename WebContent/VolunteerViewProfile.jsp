<jsp:include page="VolunteerHeader.jsp"/>

<div class="container table-responsive">  
  <h1>View Profile Form</h1>     
  <table class="table table-striped">
      <tr>
      	<td>Photo</td>
      	<td><img src="images/${sessionScope.volunteer.photo}.jpg" style="height:100px;width:100px" class="img-responsive"></td>
      </tr>
      <tr>
      	<td>Name </td>
      	<td>${sessionScope.volunteer.name}</td>
      </tr>
      <tr>
       <td>Email </td>
      	<td>${sessionScope.volunteer.emailId}</td>
      </tr>
      <tr>
      	<td>Address </td>
      	<td>${sessionScope.volunteer.address}</td>
      </tr>
       <tr>
      	<td>City </td>
      	<td>${sessionScope.volunteer.city}</td>
      </tr>
       <tr>
      	<td>State </td>
      	<td>${sessionScope.volunteer.state}</td>
      </tr>
       <tr>
      	<td>MobileNo </td>
      	<td>${sessionScope.volunteer.mobileNo}</td>
      </tr>
       <tr>
      	<td>Gender </td>
      	<td>${sessionScope.volunteer.gender}</td>
      </tr>
       <tr>
      	<td>Qualification </td>
      	<td>${sessionScope.volunteer.qualification}</td>
      </tr>
       <tr>
      	<td>Job Post </td>
      	<td>${sessionScope.volunteer.jobPost}</td>
      </tr>
      
      
  </table>
  </div>