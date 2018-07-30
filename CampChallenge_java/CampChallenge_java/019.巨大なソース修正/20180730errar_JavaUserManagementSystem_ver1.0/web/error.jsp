<%@page import="jums.UserDataBeans"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="jums.JumsHelper" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>error</title>
    </head>
    <body>
        エラーが発生しました。以下の項目を確認してください。<br>
        <%=request.getAttribute("error")%>
        <br>
        <%UserDataBeans UDB = (UserDataBeans)request.getAttribute("UDB");%>
        <%if(UDB.getname().equals("")){%>
        名前欄が記入されていません。<br>
        <%}else if (UDB.getyear().equals("")) {%>
        誕生日の年が選択されていません。<br>
        <%}else if (UDB.getmonth().equals("")) {%>
        誕生日の月が選択されていません。<br>
        <%}else if (UDB.getday().equals("")) {%>
        誕生日の日が選択されていません。<br>
        <%}else if (UDB.gettell().equals("")) {%>
        電話番号が記入されていません。<br>
        <%}else if (UDB.getcomment().equals("")) {%>
        自己紹介が記入されていません。<br>
        <%=JumsHelper.getInstance().home()%>
    </body>
</html>
