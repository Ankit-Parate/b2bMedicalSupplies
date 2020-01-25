<%@page import="java.awt.Window"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html lang="en">

<head>

  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>SB Admin 2 - Register</title>

  <!-- Custom fonts for this template-->
  <link href="<c:url value="/resources/theme1//vendor/fontawesome-free/css/all.min.css" />" rel="stylesheet" type="text/css">
  <link href="<c:url value="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" />" rel="stylesheet">

  <!-- Custom styles for this template-->
  <link href="<c:url value="/resources/theme1/css/b2bCustom.css" />" rel="stylesheet">

</head>

<body class="bg-gradient-dark">

  <div class="container">

    <div class="card o-hidden border-0 shadow-lg my-5">
      <div class="card-body p-0">
        <!-- Nested Row within Card Body -->
        <div class="row justify-content-center">
          <!-- 
          <div class="col-lg-5 d-none d-lg-block bg-register-image"></div>
          -->
          <div class="col-lg-7">
            <div class="p-5">
              <div class="text-center">
                <h1 class="h4 text-gray-900 mb-4">REGISTRATION</h1>
              </div>
              <form action="registerPost" method="post">
                <div class="form-group row">
                <div class="col-sm-6 mb-3 mb-sm-0">
                    <div class="dropdown">
                    	<select name="tempType" class="btn btn-user btn-success btn-block dropdown-toggle "  id="tempType">
                    		<option value="none">User Type</option>
                    		<option value="pharmacy">Pharmacy</option>
                    		<option value="manufacturer">Manufacturer</option>
                    	</select>
					  <!-- 
					  <button type="button" class="btn btn-user btn-success btn-block dropdown-toggle" data-toggle="dropdown">
					    User Type
					  </button>
					  <div class="dropdown-menu">
					    <a class="dropdown-item" href="#">Pharmacy</a>
					    <a class="dropdown-item" href="#">Manufacturer</a>
					  </div>
					  -->
					</div>
                  </div>
                </div>
                <div class="form-group row">
                  <div class="col-sm-6 mb-3 mb-sm-0">
                    <input type="text" class="form-control form-control-user" name="tempName" id="tempName" placeholder="User Name">
                  </div>
                </div>
                <div class="form-group row">
                  <div class="col-sm-6 mb-3 mb-sm-0">
                    <input type="password" class="form-control form-control-user" name="tempPass" id="tempPass" placeholder="Password">
                  </div>
                  <div class="col-sm-6">
                    <input type="password" class="form-control form-control-user" id="repeatPassword" placeholder="Repeat Password">
                  </div>
                </div>
                <div class="form-group">
                  <input type="text" class="form-control form-control-user" name="tempAddr" id="tempAddr" placeholder="Address">
                </div>
                <div class="form-group">
                  <input type="number" class="form-control form-control-user" name="tempPhoneNo" id="tempPhoneNo" placeholder="Phone number">
                </div>
                <div class="form-group">
                  <input type="email" class="form-control form-control-user"  aria-describedby="emailHelp" name="tempMailId" id="tempMailId" placeholder="Email Address">
                </div>
                <div class="form-group">
                  <input type="button" class="btn btn-success btn-user btn-block" id="license" value="Upload License">
                </div>
                
                <input onclick="myFunction()" class="btn btn-primary btn-user btn-block" type="submit" value="Register">
                <script>
				function myFunction() {
				  alert("Your application has been submitted for approval");
				}
				</script>
                <!--
                 <a href="login.html" class="btn btn-primary btn-user btn-block">
                  Register Account
                </a>
                 -->
                <hr>
              </form>
              <hr>
              <!-- 
              <div class="text-center">
                <a class="small" href="forgot-password.html">Forgot Password?</a>
              </div>
               -->
              <div class="text-center">
                <a class="small" href="loginGet">Already have an account? Login</a>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>

  </div>

  <!-- Bootstrap core JavaScript-->
  <script src="<c:url value="/resources/theme1/vendor/jquery/jquery.min.js" />"></script>
  <script src="<c:url value="/resources/theme1//vendor/bootstrap/js/bootstrap.bundle.min.js" />"></script>

  <!-- Core plugin JavaScript-->
  <script src="<c:url value="/resources/theme1/vendor/jquery-easing/jquery.easing.min.js" />"></script>

  <!-- Custom scripts for all pages-->
  <script src="<c:url value="/resources/theme1/js/sb-admin-2.min.js" />"></script>

</body>

</html>
    