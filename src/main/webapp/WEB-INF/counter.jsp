<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Demo JSP</title>
    </head>
<body>
	<h1>
	You have visited 
	<c:set var="count" value="count" />
	<c:out value="${sessionScope[count]}"/> times!
	</h1>
	<a href="/counter?reset=true">Reset</a><br>
	<a href="/">Back to home</a>
</body>
</html>