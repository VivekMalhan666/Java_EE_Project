<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="AdminHeader.jsp"/>
<br/>
<div><img src="images/IMG_20190302_235912.jpg" width="100%" height="800"/></div>
<!-- Content -->
<div class="container" id="wrap" >
	
	  <div class="row">
          <div class="col-md-3 col-md-offset-1">
            <form action="AddChild" method="post" enctype="multipart/form-data" accept-charset="utf-8" class="form" role="form" style="color:white;margin-left:-90%; margin-top:-800px"><h3>Add Details Of A Child</h3>
          <br/>
          <div class="col-xs-8 col-md-8">
               <input type="text" name="ChildName" value="" class="form-control input-lg" placeholder="Enter The Name "required  /> <br/>
              <input type="number" name="age" value="" class="form-control input-lg" placeholder="Age" required /><br/>
		      <input type="text" name="gender" value="" class="form-control input-lg" placeholder="Gender"required  /><br/>
              <input type="text" name="education" value="" class="form-control input-lg" placeholder="Education Of Child"required  /><br/>
	          <input type="text" name="bloodgroup" value="" class="form-control input-lg" placeholder="Blood Group"required  /><br/>
		      <input type="text" name="medicalPresc" value="" class="form-control input-lg" placeholder="Medical Prescription(if any)"  /><br/>
		      <input type="text" name="identificationMark" value="" class="form-control input-lg" placeholder="Identification Mark(if any)"  /><br/>
		      <input type="text" name="storyBehind" value="" class="form-control input-lg" placeholder="Story Behind"  /><br/>
		      <!-- <input type="text" name="sponsored" value="" class="form-control input-lg" placeholder="Sponsored(Yes/No)"  /><br/>
               --> <input type="file" name="photo" value="" class="form-control input-lg" placeholder="Image"  /><br/>
		     
		      <input  class="btn btn-lg btn-primary btn-block signup-btn" type="submit" value="Add Child"><br/>
       </div> </form>
        
        </div>
</div></div>

<br/><br/><br/>

