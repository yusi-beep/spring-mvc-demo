<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
	
<!DOCTYPE html>

<html>

<head>

	<title>Student Registration Form</title>

</head>

<body>

The student is confirmed: ${student.firstName} ${student.lastName}

<br><br>

Country: ${student.country}

<br><br>
Favorite Language: ${student.favoriteLanguage}

<br><br>

Operating Systems:
<ul>
	<c:forEach var="temp" items="${student.operatingSystems}">	
	
		<li> ${temp} </li>
	
	</c:forEach>

</ul>

</body>

</html>