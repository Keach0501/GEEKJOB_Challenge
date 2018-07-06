<%-- 
    Document   : actfield
    Created on : 2018/07/05, 14:56:50
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
        out.print("送信を完了しました。");
        HttpSession sessiontag = request.getSession();
        sessiontag.setAttribute("retext", request.getParameter("total"));
        sessiontag.setAttribute("reradio", request.getParameter("type"));
        sessiontag.setAttribute("retextarea", request.getParameter("hobby"));
        %>
        <form action="./makefield.jsp" method="get">
            <input type="submit" name="back" value="戻る">
        </form>
    </body>
</html>
