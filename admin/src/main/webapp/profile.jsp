<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="currentUser" value="${currentUser}"/>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <h1>${currentUser.getUsername()}</h1>
</body>
</html>
