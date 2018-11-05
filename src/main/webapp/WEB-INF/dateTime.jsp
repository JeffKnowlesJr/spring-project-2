<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title><c:out value="${app}"/></title>
        <link rel="stylesheet" type="text/css" href="css/<c:out value="${app}"/>Style.css">
        <link rel="stylesheet" type="text/css" href="css/Style.css">
		<script type="text/javascript" src="js/<c:out value="${app}"/>App.js"></script>
    </head>
<body>
	<h1>
		<c:set var = "now" value = "<%= new java.util.Date()%>" />
		<c:choose>
	    	<c:when test="${app=='date'}">
			<fmt:formatDate pattern = "EEEE, 'the' d 'of' MMMM, yyyy" 
	         value = "${now}" />
	    	</c:when>    
	    	<c:otherwise>
	       		<fmt:formatDate type = "time" timeStyle = "SHORT"
	         value = "${now}" />
	    	</c:otherwise>
		</c:choose>
	</h1>
</body>
</html>