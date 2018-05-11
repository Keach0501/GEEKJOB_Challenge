<%-- 
    Document   : for1
    Created on : 2018/05/11, 14:55:59
    Author     : keygr
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    int total = 8;
    for ( int i = 1; i <= 20; i++ ){
        total *= i;
    }
    out.print(total);
%>
    
