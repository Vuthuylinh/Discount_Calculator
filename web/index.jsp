<%--
  Created by IntelliJ IDEA.
  User: Linh Vu
  Date: 8/27/2019
  Time: 2:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Discount Calculator </title>
    <link rel="stylesheet" type="text/css" href="css/Style.css">
</head>
<body>
<div id="Discount">
    <h1> Product Discount Calculator </h1>
    <form action="/calculate discount" method="post">
        <div id="data" >
            <label> Product Description:</label>
            <input type="text" name="product description" id="product" placeholder="Enter a product:"></br>
            <label> List Price: </label>
            <input type="text" name="price"> $  </br>
            <label> Discount percent </label>
            <input type="text" name="discount percent">(%) </br>
        </div>
        <div id="button">
            <label> &nbsp; </label>
            <input type="submit" name="submit" value="Discount Calculator">

        </div>
    </form>
</div>
</body>
</html>
