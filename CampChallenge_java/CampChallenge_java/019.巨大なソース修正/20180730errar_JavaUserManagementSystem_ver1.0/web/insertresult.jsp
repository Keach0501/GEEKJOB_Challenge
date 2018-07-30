<%@page import="jums.JumsHelper" %>
<%@page import="jums.UserDataBeans" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JUMS登録結果画面</title>
    </head>
    <body>
        <h1>登録結果</h1><br>
        <%UserDataBeans UDB = (UserDataBeans)request.getAttribute("UDB");%>
        名前:<%= UDB.getname() %><br>
        生年月日:<%= UDB.getyear()+"年"+UDB.getmonth()+"月"+UDB.getday()+"日"%><br>
        種別:<%= UDB.gettype()%><br>
        電話番号:<%= UDB.gettell()%><br>
        自己紹介:<%= UDB.getcomment()%><br>
        以上の内容で登録しました。<br>
        <%=JumsHelper.getInstance().home()%>
    </body>
</html>
