<%-- 
    Document   : query_string_input
    Created on : 2018/06/29, 16:37:16
    Author     : keygr
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="./query_string_output.jsp" method="get">
            購入した商品の総額:<input type="text" name="total">
            <br>
            購入した商品の数量:<input type="text" name="count">
            <br>
            商品種別:<br>
            <input type="radio" name="type" value="雑貨" checked="checked">1:雑貨
            <input type="radio" name="type" value="生鮮食品">2:生鮮食品
            <input type="radio" name="type" value="その他">3:その他
            <br>
            <input type="hidden" name="each" value="num3">
            <input type="submit" name="Sub" value="送信">
        </form>
    </body>
</html>
