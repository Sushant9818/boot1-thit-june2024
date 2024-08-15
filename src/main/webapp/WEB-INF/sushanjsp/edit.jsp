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
  <h2>Edit form</h2>
  <form action="updateEmployee" method="post">
   <div class="form-group">
      <label>EmployeeId:</label>
      <input type="number" class="form-control"  name="employeeId" value="${employeeEntity.employeeId}" readonly >
    </div> 
    <div class="form-group">
      <label>EmployeeName:</label>
      <input type="text" class="form-control"  name="employeeName"  value="${employeeEntity.employeeName} ">
    </div>
    <div class="form-group">
      <label>Email:</label>
      <input type="email" class="form-control"  name="email"  value="${employeeEntity.email} ">
    </div>
    <div class="form-group">
      <label>Password:</label>
      <input type="password" class="form-control"  name="password"  value="${employeeEntity.password}">
    </div>
    <div class="form-group">
      <label>Salary:</label>
      <input type="number" class="form-control"  name="salary"  value="${employeeEntity.salary}">
    </div>
    
    <button type="submit" class="btn btn-default">Update</button>
  </form>
</div>

</body>
</html>