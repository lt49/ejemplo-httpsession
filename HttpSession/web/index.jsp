<%-- 
    Document   : index
    Created on : 01/03/2015, 03:42:11 PM
    Author     : Luis alberto
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Login</h1>
        <form method="post" action="validar">
            <label>Usuario:</label>
            <label><input type="text" name="txtUsuario" placeholder="Ingrese Usuario" value=""></label><br>
            <label>Contraseña:</label>
            <label><input type="password" name="txtPassword" placeholder="Ingrese Contraseña" value=""></label><br>
            <input type="submit" name="login" value="Enviar">
        </form>
    </body>
</html>
