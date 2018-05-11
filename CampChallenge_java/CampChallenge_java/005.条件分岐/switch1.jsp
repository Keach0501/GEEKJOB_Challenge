<%-- 
    Document   : switch1
    Created on : 2018/05/11, 13:36:39
    Author     : keygr
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    int type = 1;
    switch (type) {
        case 1 :
            out.print("one");
            break;
        case 2 :
            out.print("two");
            break;
        case 3 :
            out.print("想定外");
            break;
    }
%>