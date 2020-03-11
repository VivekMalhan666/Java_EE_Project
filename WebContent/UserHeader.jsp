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
     
      
      </ul>
      
    
     <ul class="nav navbar-nav navbar-right">
    <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Welcome : ${sessionScope.user.firstName} ${sessionScope.user.lastName}<span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="UserViewProfile.jsp">View Profile</a></li>
          <li><a href="UserUpdateProfile.jsp">Update Profile</a></li>
          <li><a href="UserChangePassword.jsp">Change Password</a></li>
          <li><a href="UserViewAllChildren">Donate and sponsor</a></li>
           <li><a href="HomePage.jsp"><span class="glyphicon glyphicon-log-out"></span>Logout</a></li>
        </ul>
      </li>

    </ul>
  </div>
</nav>
