<%--
  Created by IntelliJ IDEA.
  User: This MC
  Date: 24/06/2024
  Time: 6:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Caculator</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/CaculatorServlet" method="post">
    <label for="firstOperand">First Operand</label>
    <input type="number" name="firstOperand" id="firstOperand"/><br>
    <label>Operator</label>
    <select id="operator" name="operator">
        <option value="add">Additional</option>
        <option value="minus">Minus</option>
        <option value="multi">Multi</option>
        <option value="div">Division</option>
        <option value="percent">Percent</option>
    </select><br>
    <label for="secondOperand">Second Operand</label>
    <input type="number" name="secondOperand" id="secondOperand"/><br>
    <input type="submit" value="Calculate"/>
</form>
</body>
</html>
