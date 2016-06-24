<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
    <link type="text/css" href="/css/bootstrap.css" rel="stylesheet" />
</head>
<body>
<h2>Employee information</h2>
<form action="/welcome/employees/find/${employee.empNo}">
<table class="table table-bordered">
  <tr>
        <th>Employee No.</th>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Gender</th>
        <th>Birth Date</th>
        <th>Hire Date</th>
  </tr>
  <tr>
        <td>"${employee.empNo}"</td>
        <td>"${employee.firstName}"</td>
        <td>"${employee.lastName}"</td>
        <td>"${employee.gender}"</td>
        <td>"${employee.birthDate}"</td>
        <td>"${employee.hireDate}"</td>
 </tr>
  </table>
</form>
<a href="/welcome/employees" class="btn btn-success">Back</a>

<script type="application/javascript" src="js/jquery.js"></script>
<script type="application/javascript" src="js/bootstrap.js"></script>


</body>
</html>