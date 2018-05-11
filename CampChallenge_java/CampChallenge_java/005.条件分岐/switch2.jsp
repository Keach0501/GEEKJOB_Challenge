<%-- 
    Document   : switch2
    Created on : 2018/05/11, 13:44:34
    Author     : keygr
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    char x = 'B';
    switch(x){
    case 'A':
    out.print("英語");
    break;
    
    case 'あ':
    out.print("日本語");
    break;
    
}
%>