<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.7.1/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>





<div class="container">
<a href="showAll" class="btn btn-primary ml-2">SHOW-ALL</a>
<h1> congratulations............</h1>
  <h2>Employee Details==</h2>
         
  <table class="table">
    <thead>
      <tr>
        <th>ID</th>
        <th>NAME</th>
        <th>Email</th>
        <th>Password</th>
        <th>Salary</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <td>${employeeEntity.employeeId}</td>
        <td>${employeeEntity.employeeName}</td>
        <td>${employeeEntity.email}</td>
        <td>${employeeEntity.password}</td>
        <td>${employeeEntity.salary}</td>
      </tr>
      
    </tbody>
  </table>
  
  
</div>

</body>
</html>