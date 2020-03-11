<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ORPHANAGE WEBSITE</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
  
</head>
<body>

<nav class="navbar navbar-inverse" style="margin-bottom:0px">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">SAVE LIFE</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="HomePage.jsp">Home</a></li>
     
       <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Events <span class="caret"></span></a>
        <ul class="dropdown-menu">
           <li><a href="EventsOrganised.jsp">Add Events</a></li>
           <li><a href="AdminViewAllEvents">View All Events</a></li> 
          
        </ul>
      
   
    <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Children <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="AddChild.jsp">Add Child</a></li>
          <li><a href="AdminViewAllChildren">View All Children </a></li>
          
         </ul>
      </li>
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Volunteer <span class="caret"></span></a>
        <ul class="dropdown-menu">
         <li><a href="AdminViewAllVolunteer">View All Volunteer </a></li>
         <li><a href="AdminViewActiveVolunteer">View Active Volunteer </a></li>
         <li><a href="AdminViewRejectVolunteer">View Rejected Volunteer </a></li>
         </ul>
      </li>
      
      </ul>
      <ul class="nav navbar-nav navbar-right">
    <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Welcome : ${sessionScope.user.firstName} ${sessionScope.user.lastName}<span class="caret"></span></a>
        <ul class="dropdown-menu">
          
          <li><a href="UserChangePassword.jsp">Change Password</a></li>
          <li><a href="HomePage.jsp"><span class="glyphicon glyphicon-log-out"></span>Logout</a></li>
        </ul>
      </li>

    </ul>
  </div>
</nav>

</body>
</html>