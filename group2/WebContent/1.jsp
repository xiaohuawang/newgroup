<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div class="container">
  <h2>input form</h2>
  <form class="form-horizontal" role="form" action="hc1" method="post">
   
  
    <div class="form-group">
      <label class="control-label col-sm-2" for="semester">semester:</label>
      <div class="col-sm-10">          
        <input type="text" class="form-control" id="semester" placeholder="Enter semester" name="semester">
      </div>
      
    
    
    </div>
    <div class="form-group">        
      <div class="col-sm-offset-2 col-sm-10">
        <button type="submit" class="btn btn-default">Submit</button>
      </div>
    </div>
  </form>
</div>



</body>
</html>