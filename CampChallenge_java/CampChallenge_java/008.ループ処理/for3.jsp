<%-- 
    Document   : for1
    Created on : 2018/05/11, 14:55:59
    Author     : keygr
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    int type = 0;
    for ( int i = 1; i <= 100; i++ ){
        type = type + i;
    }
    out.print(type);
    
%>
    
