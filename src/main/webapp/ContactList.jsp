<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ page isELIgnored="false" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ContactList</title>
</head>
<body> 
 <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js?ver=1.8.3"></script>
<script>
function getfName(){
	alert('befor ajax');


$.ajax({

	url:"http://localhost.:8080/TestApp/jQlist",
	dataType:'json',
    data :{},
		   async : false,
    success: function(response, textStatus, jqXHR) {
		 //   console.log("reached here");
		    // data contains the result
		
		    alert('success'|| response||':');
			//    console.log(response);
		   },
	error: function(jqXHR, textStatus, errorThrown) {
		alert('fail jqXHR=' ||jqXHR ||'errorThrown='||errorThrown);
		   /// console.log(errorThrown);
		   },
    complete: function(){
	            // enable the inputs
			  
	        }

	});

};

</script>
<form:form   action="addContact.html" commandName="contact">
<form:input path="firstname" />
<form:input path="telephone" />
<!-- input name="fname" type="text" size="10"/--> 
<!-- onclick="getfName();"-->
<input type="submit" value="<spring:message code="label.addcontact"/>" />
</form:form>
<c:forEach var="contact" items="${contactList}">
<tr>
<td>${contact.firstname}</td></tr>
<tr><td>${contact.telephone}</td></tr>

</c:forEach>
</body>

</html>
