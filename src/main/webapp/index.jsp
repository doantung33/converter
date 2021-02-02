<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2/2/2021
  Time: 1:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h2>Chuyển đổi tiền tệ</h2>
  <form method="post" action="converter.jsp">
    <label>Rate</label>
    <input type="text" name="rate" placeholder="RATE" value="22000"><br>
    <label>USD</label>
    <input type="text" name="usd" placeholder="USD" value="0"><br>
    <input type="submit" id="submit" id="value" value="Converter">
  </form>
  </body>
</html>
