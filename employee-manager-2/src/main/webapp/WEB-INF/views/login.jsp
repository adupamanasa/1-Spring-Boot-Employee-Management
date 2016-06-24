<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
  <link type="text/css" href="/css/bootstrap-theme.css" rel="stylesheet" />
  <body onload='document.loginForm.username.focus();'>
<!--   Bootstrap -->
  <div class = "container">
	<div class="wrapper">
	<img src="<c:url value="/images/home.jpg"/>"/>
      <form name='login' action="<c:url value='/login' />" method='POST'><br>
	    <h4 class="form-signin-heading text-muted">Welcome to Employee Manager! Please Sign In</h4><br>
         <input type="text" class="form-control" name="username" placeholder="Username" required="" autofocus="" /><br>
	     
         
	     <input type="password" class="form-control" name="password" placeholder="Password" required=""/><br>  	
         <button class="btn btn-lg btn-primary btn-block"  name="submit" value="Login" type="submit">Login</button> 
		</div>
		  <br><c:if test="${not empty error}"><div class ="alert alert-danger" >${error}</div></c:if>
	      <br><c:if test="${not empty message}"><div class = "alert alert-warning">${message}</div></c:if>
		  <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
	   </form>
    </div>
   </div>
<script type="application/javascript" src="js/jquery.js"></script>
<script type="application/javascript" src="js/bootstrap.js"></script>
</body>
</html>