<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="AdminHeader.jsp"/>
<br/>

<div><img src="images/IMG_20190402_190336.jpg" width="100%" height="860"/></div>
<!-- Content -->
<div class="container" id="wrap" >
	
	  <div class="row">
          <div class="col-md-3 col-md-offset-1">
            <form action="updateChildProcess" method="post" enctype="multipart/form-data" accept-charset="utf-8" class="form" role="form" style="color:white;margin-left:-70%; margin-top:-870px"><h3>Update Details Of A Child</h3>
          <br/>
          <div class="col-xs-8 col-md-8"> 
          
              <input type="number" name="ChildId" class="form-control input-lg"  value="${requestScope.childObj.childId}" readonly="readonly" /> <br/>
              <input type="text" name="ChildName" class="form-control input-lg"  value="${requestScope.childObj.childName}"  /> <br/>
              <input type="number" name="age"  class="form-control input-lg"  value="${requestScope.childObj.age}"  /><br/>
		      <input type="text" name="gender"  class="form-control input-lg" value="${requestScope.childObj.gender}"   /><br/>
              <input type="text" name="education"  class="form-control input-lg" value="${requestScope.childObj.education}" /><br/>
	          <input type="text" name="bloodgroup"  class="form-control input-lg" value="${requestScope.childObj.bloodGroup}"  /><br/>
		      <input type="text" name="medicalPresc"  class="form-control input-lg" value="${requestScope.childObj.medicalPresc}"  /><br/>
		      <input type="text" name="identificationMark" class="form-control input-lg" value="${requestScope.childObj.identificationMark}" /><br/>
		      <input type="text" name="storyBehind"  class="form-control input-lg" value="${requestScope.childObj.storyBehind}"  /><br/>
		      <input type="text" name="sponsored"  class="form-control input-lg" value="${requestScope.childObj.sponsored}"  /><br/>
		      <input type="file" name="photo"  class="form-control input-lg" value="${requestScope.childObj.photo}"  /><br/>
		      <input  class="btn btn-lg btn-primary btn-block signup-btn" type="submit" value="Update Child"><br/>
         </div> 
           </form>
        
        </div>
</div></div>

<br/><br/><br/>

          