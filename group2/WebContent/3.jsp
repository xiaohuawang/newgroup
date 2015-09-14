<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>input form</title>
</head>
<body>

<div class="container">
  <h2>input form</h2>
  <form class="form-horizontal" role="form" action="Hc3" method="post">
   
  
    <div class="form-group">
      <label class="control-label col-sm-2" for="department">department:</label>
      <div class="col-sm-10">          
        <input type="text" class="form-control" id="department" placeholder="Enter department" name="department">
      </div>
      
    
    
    </div>
    <div class="form-group">        
      <div class="col-sm-offset-2 col-sm-10">
        <button type="submit" class="btn btn-default">Submit</button>
      </div>
    </div>
  </form>
</div>


<table>
<c:forEach var="item" items="${list}">
	<thread><tr><th>id</th><th>coursenum</th><th>name</th></tr></thread>
    <tr>
    	<td>${item.id}</td>
    	<td>${item.coursenum}</td>
    	<td>${item.name}</td>
    	
    </tr>
</c:forEach>
</table>








</body>
</html>