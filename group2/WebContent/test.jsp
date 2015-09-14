<!DOCTYPE html>
<html lang="en">
<head>
  <title>input semester</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</head>


<body>

${message}

<div class="container">
  <h2>input form</h2>
  <form class="form-horizontal" role="form" action="Display" method="post">
   
  
    <div class="form-group">
      <label class="control-label col-sm-2" for="semester">semester:</label>
      <div class="col-sm-10">          
        <input type="text" class="form-control" id="semester" placeholder="Enter semester" name="semester">
      </div>
      
      <div class="form-group">
      <label class="control-label col-sm-2" for="instructor">instructor:</label>
      <div class="col-sm-10">          
        <input type="text" class="form-control" id="instructor" placeholder="Enter instructor name" name="instructor">
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