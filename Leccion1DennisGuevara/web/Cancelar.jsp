<%-- 
    Document   : Cancelar
    Created on : 14/04/2016, 22:21:39
    Author     : usuario
--%>

<%@page import="java.sql.Connection"%>
<%@page import="Conexion.Conexion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Ha cancelado el guardado</h1>
        
        
        <%
        Conexion cc=new Conexion();
Connection cn=cc.conexion();
        %>
    </body>
</html>
