<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Employee Management</title>
    <style type="text/css"> 
 		.tg  {border-collapse:collapse;border-spacing:0;border-color:#ccc;} 
 		.tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#fff;} 
 		.tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#f0f0f0;}
 		.tg .tg-4eph{background-color:#f9f9f9} 
	</style> 
	<link type="text/css" href="/css/bootstrap.css" rel="stylesheet" />
</head>
<jsp:include page="../home.jsp"/>
<body>
<!-- &nbsp;<a href="/welcome/employees/add" class="btn btn-info"><span class="glyphicon glyphicon-plus"></span>Add Employee</a> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; -->
<form action="/welcome/employees/find" method="get"> 
    <br>&nbsp;<button type="submit" class="btn btn-info">Find Employee <span class="glyphicon glyphicon-search"></span> </button>
    <input name="empNo" placeholder="Employee No." />
</form>

<h2>Employee List</h2>

<c:if test="${!empty listemp}">
	<table class="table table-sm">
	<thead class="thead-inverse">
	<tr>
		<th width="70">EmpNo</th>
        <th width="120">First Name</th>
        <th width="120">Last Name</th>
        <th width="60"> Gender</th>
		<th width="120">Birth Date</th>
        <th width="120">Hire Date</th>
		<th width="60">Edit</th>
        <th width="60">Delete</th>
	</tr>
	</thead>
	<c:forEach items="${listemp}" var="employee">
		<tr>
		   <td>${employee.empNo}</td>
            <td>${employee.firstName}</td>
			<td>${employee.lastName}</td>
            <td>${employee.gender}</td>
            <td>${employee.birthDate}</td>
			<td>${employee.hireDate}</td>
  <td><a href="/welcome/employees/edit/${employee.empNo}" class="btn btn-warning"><span class="glyphicon glyphicon-edit"></span> Edit</a></td>
  <td><a href="/welcome/employees/delete/${employee.empNo}" class="btn btn-danger"><span class="glyphicon glyphicon-trash"></span>Delete</a> </td>
		</tr>
	</c:forEach>
	</table>
</c:if>
<script type="application/javascript" src="js/jquery.js"></script>
    <script type="application/javascript" src="js/bootstrap.js"></script>
</body>
</html>
