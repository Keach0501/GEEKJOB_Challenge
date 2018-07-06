<%-- 
    Document   : makefield
    Created on : 2018/07/05, 14:18:55
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
        
        <form action="./actfield.jsp" method="get">
            <%
            request.setCharacterEncoding("UTF-8");
            HttpSession sessiontag = request.getSession();
            String betext = (String)sessiontag.getAttribute("retext");
            String beradio = (String)sessiontag.getAttribute("reradio");
            String betextarea = (String)sessiontag.getAttribute("retextarea");
            if(betext == null){
                betext = "";
            }
            if(beradio == null){
                beradio = "";
            }
            if(betextarea == null){
                betextarea = "ここに趣味を書いてください";
            }
            %>
            
            名前 : 
            <input type="text" name="total" value=<%out.print(betext);%> >
            <br>
            性別 :
            <input type="radio" name="type" value="male" <%if(beradio.equals("male")){out.print("checked");}%>>男
            <input type="radio" name="type" value="female" <%if(beradio.equals("female")){out.print("checked");}%>>女
            <br>
            趣味 :<br> 
            <textarea name="hobby" rows="4" cols="40"><%out.print(betextarea);%></textarea>
            <br>
            <input type="submit" name="Sub" value="送信">
        </form>
    </body>
</html>
