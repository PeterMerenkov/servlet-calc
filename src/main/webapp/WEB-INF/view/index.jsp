<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Калькулятор</title>
    <style><%@include file="/WEB-INF/styles/index.css"%></style>
</head>
<body>
    <h3>Калькулятор:</h3>
    <form method="post">
        <table>
            <tr>
                <td rowspan="4"><input class="input-number" type="number" name="num1" placeholder="Число 1" required></td>
                <td><input class="btn" type="submit" name="operator" value="+"></td>
                <td rowspan="4"><input class="input-number" type="number" name="num2" placeholder="Число 2" required></td>
            </tr>
            <tr>
                <td><input class="btn" type="submit" name="operator" value="-"></td>
            </tr>
            <tr>
                <td><input class="btn" type="submit" name="operator" value="x"></td>
            </tr>
            <tr>
                <td><input class="btn" type="submit" name="operator" value="/"></td>
            </tr>
        </table>
    </form>
</body>
</html>
