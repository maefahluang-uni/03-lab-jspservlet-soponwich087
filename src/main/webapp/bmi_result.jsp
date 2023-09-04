<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
   <head>
      <title>BMI Calculator</title>
   </head>
<body>
<img src="https://www.cdc.gov/healthyweight/images/assessing/bmi-adult-fb-600x315.jpg?_=07167">

<!-- Get the BMI and built attributes from the request -->


<!-- Show the BMI -->
<h2>Result is <%= request.getAttribute("BMI") %></h2>


<!-- Show the built -->
<h3>According to your BMI, you are considered <%= request.getAttribute("built") %></h3>
</body>
</html>
