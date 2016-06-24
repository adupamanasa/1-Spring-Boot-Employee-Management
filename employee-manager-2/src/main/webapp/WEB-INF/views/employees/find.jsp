<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>EM-Find Employee</title>
    <link type="text/css" href="/css/bootstrap.css" rel="stylesheet" />
</head>
<jsp:include page="../home.jsp"/>
<body>
<h2>Employee information</h2>
<a href="/welcome/employees/find/${employee.empNo}"></a>
<table class="table table-bordered">
  <tr>
        <th width="70">EmpNo</th>
        <th width="120">First Name</th>
        <th width="120">Last Name</th>
        <th width="60"> Gender</th>
		<th width="120">Birth Date</th>
        <th width="120">Hire Date</th>
		<th width="60">Edit</th>
  </tr>
  <tr>
        <td>${employee.empNo}</td>
        <td>${employee.firstName}</td>
        <td>${employee.lastName}</td>
        <td>${employee.gender}</td>
        <td>${employee.birthDate}</td>
        <td>${employee.hireDate}</td>
        <td><a href="/welcome/employees/edit/${employee.empNo}" class="btn btn-warning"><span class="glyphicon glyphicon-edit"></span> Edit</a></td>
 </tr>
  </table>

<script type="application/javascript" src="js/jquery.js"></script>
<script type="application/javascript" src="js/bootstrap.js"></script>


</body>
</html>