<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
   <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link type="text/css" href="/css/bootstrap.css" rel="stylesheet" />
</head>
<body>

<h2>&nbsp;&nbsp;Employee Information</h2>
<form:form method="POST" action="/welcome/employees/save" modelAttribute="employee" commandName="employee">
   <table class="table table-bordered">
    <tr>
        <td><form:label path="empNo">Employee No. </form:label></td>
        <td><form:input path="empNo" /></td>
    </tr>
    <tr>
        <td><form:label path="firstName">First Name</form:label></td>
        <td><form:input path="firstName" /></td>
    </tr>
    <tr>
        <td><form:label path="lastName">Last Name</form:label></td>
        <td><form:input path="lastName" /></td>
    </tr>
        <tr>
        <td><form:label path="gender">Gender</form:label></td>
        <td><form:input path="gender" /></td>
    </tr>
        <tr>
        <td><form:label path="birthDate">Birth Date</form:label></td>
        <td><form:input path="birthDate" /></td>
    </tr>
        <tr>
        <td><form:label path="hireDate">Hire Date</form:label></td>
        <td><form:input path="hireDate" /></td>
    </tr>
   </table>
<!--         <td colspan="2"><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; -->
            <input type="submit" value="Add Employee" class="btn btn-success"/>
<a href="/welcome/employees/add" class="btn btn-info">Reset</a>
</form:form>

<script type="application/javascript" src="js/jquery.js"></script>
<script type="application/javascript" src="js/bootstrap.js"></script>
</body>
</html>