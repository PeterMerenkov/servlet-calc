<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style><%@include file="/WEB-INF/styles/result.css"%></style>
</head>
<body>
    <div>
        <h3>Результат:</h3>
        ${requestScope.num1} ${requestScope.operator} ${requestScope.num2} = ${requestScope.result}
    </div>
</body>
</html>
