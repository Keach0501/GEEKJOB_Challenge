<%-- 
    Document   : ArrayList1
    Created on : 2018/05/11, 14:07:18
    Author     : keygr
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "java.util.ArrayList" %>
<%
    ArrayList<String> data = new ArrayList<String>();
    
    data.add("10");
    data.add("100");
    data.add("soeda");
    data.add("hayashi");
    data.add("-20");
    data.add("118");
    data.add("END");
    
    out.print(data);
    
%>
        