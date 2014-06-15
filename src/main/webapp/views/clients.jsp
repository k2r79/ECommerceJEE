<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<body>
	<h1>Liste des clients</h1>
    <ul>
        <c:forEach var="client" items="${clients}">
            <li>${client}</li>
        </c:forEach>
    </ul>
</body>
</html>