<%-- 
    Document   : RegistrarClientes
    Created on : 14/04/2016, 21:22:14
    Author     : usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form name="Reg" method="post" action="Registrar">
        <center><h1>Insertar Clientes</h1></center><br>
        
        <font face="Comic Sans MS" size="4">
            ID: <input type="text" name="txtID" placeholder="Ingrese Id"><br>
            Cedula: <input type="text" name="txtCedula" placeholder="Ingrese la cedula"><br>
            Nombre: <input type="text" name="txtNombre" placeholder="Ingrese el nombre"><br>
            Telefono: <input type="text" name="txtTelefono" placeholder="Ingrese el telefono"><br>
            
            Sexo:<input type="radio" name="genero" value="M"> Masculino
            <input type="radio" name="genero" value="F"> Femenino
            <input type="radio" name="genero" value="O"> Otro<br>
            
            Edad: <input type="text" name="txtEdad" placeholder="Ingrese la edad"><br>
            

            <input type="Submit" value="Registrar">
        </form>
            <form name="Can" method="post" action="Cancelar.jsp">
            <input type="Submit" value="Cancelar"></form>
            
            <form name="Bus" method="post" action="BuscarClientes.jsp">
            <input type="Submit" value="Buscar"></form>

        </font>
        
    </body>
</html>
