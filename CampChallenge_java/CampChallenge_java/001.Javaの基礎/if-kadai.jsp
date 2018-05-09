<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    int num = 3;
    
    if(num == 1){
        out.print("1です！");
    }else if(num == 2){
        out.print("プログラムキャンプ！");
    }else{
        out.print("その他です！");
    }
%>    
