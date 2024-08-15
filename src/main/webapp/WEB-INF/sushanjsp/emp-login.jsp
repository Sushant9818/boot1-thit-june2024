<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
${loginMsg}
  <h2>Welcome to Login</h2>
  <form action="login" method="post">
    <div class="form-group">
      <label >Email:</label>
      <input type="email" class="form-control"   name="email">
    </div>
    <div class="form-group">
      <label >Password:</label>
      <input type="password" class="form-control"  name="password">
    </div>
   
    <button type="submit" class="btn btn-default">Login</button>
  </form>
</div>

</body>
</html>