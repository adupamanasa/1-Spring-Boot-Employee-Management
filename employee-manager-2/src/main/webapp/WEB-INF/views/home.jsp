<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Manage Employee</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
  <link type="text/css" href="/css/bootstrap-theme.css" rel="stylesheet" />
  
  
</head>
<body>

<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="">Employee Management</a>
    </div>
    <ul class="nav navbar-nav">
      <li class=""><a href="/welcome/employees/pages">Employee List</a></li>
      <li class=""><a href="/welcome/employees/add">Add Employee</a></li>
      <li class=""><a href="javascript:document.getElementById('logout').submit()">Logout</a></li>
    </ul>
    <c:url value="/logout" var="logout" />
<form id="logout" action="${logout}" method="post" >
  <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
</form>
<c:if test="${pageContext.request.userPrincipal.name != null}">
</c:if>
  </div>
</nav>
<script type="application/javascript" src="js/jquery.js"></script>
<script type="application/javascript" src="js/bootstrap.js"></script>

</body>
</html>

