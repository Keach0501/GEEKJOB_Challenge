<%-- 
    Document   : query_string_output
    Created on : 2018/06/29, 16:50:18
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
        <%
        request.setCharacterEncoding("UTF-8");
        out.print("購入した商品の総額:" +request.getParameter("total") + "個"+ "<br>");
        out.print("購入した商品の数量:" +request.getParameter("count") + "円" + "<br>");
        out.print("商品種別:" +request.getParameter("type") + "<br>");
        int num = Integer.parseInt(request.getParameter("total"));
        int num2 = Integer.parseInt(request.getParameter("count"));
        out.print("商品単価:" + num/num2 + "円" + "<br>");
        if(num < 3000 ){
            out.println("ポイントはなし");
        }else if(num > 5000){
            out.println("ポイントは" + num/20 + "ポイント");
        }else{
            out.println("ポイントは" + num/25 + "ポイント");
        }
        %>
    </body>
</html>
