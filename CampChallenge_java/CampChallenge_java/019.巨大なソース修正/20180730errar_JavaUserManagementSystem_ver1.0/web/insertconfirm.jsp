<%@page import="jums.UserDataBeans"%>
<%@page import="javax.servlet.http.HttpSession" %>
<%@page import="jums.JumsHelper" %>
<%
    HttpSession hs = request.getSession();
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JUMS登録確認画面</title>
    </head>
    <body>
    <%UserDataBeans UDB = (UserDataBeans)request.getAttribute("UDB");%>
    <% if(!UDB.getname().equals("")){ %>
        <h1>登録確認</h1>
        名前:<%= UDB.getname()%><br>
        生年月日:<%= UDB.getyear()+"年"+UDB.getmonth()+"月"+UDB.getday()+"日"%><br>
        種別:<%= UDB.gettype()%><br>
        電話番号:<%= UDB.gettell()%><br>
        自己紹介:<%= UDB.getcomment()%><br>
        上記の内容で登録します。よろしいですか？
        <form action="insertresult" method="POST">
            <input type="submit" name="yes" value="はい">
        </form>
    <% }else{ %>
        <h1>入力が不完全です</h1>
    <% } %>
        <form action="insert" method="POST">
            <input type="submit" name="no" value="登録画面に戻る">
        </form>
        <br>
        <%=JumsHelper.getInstance().home()%>
    </body>
</html>
